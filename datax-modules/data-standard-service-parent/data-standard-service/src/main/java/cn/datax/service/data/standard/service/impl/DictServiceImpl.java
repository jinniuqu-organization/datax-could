package cn.datax.service.data.standard.service.impl;

import cn.datax.common.core.RedisConstant;
import cn.datax.common.redis.service.RedisService;
import cn.datax.service.data.standard.api.entity.DictEntity;
import cn.datax.service.data.standard.api.dto.DictDto;
import cn.datax.service.data.standard.service.DictService;
import cn.datax.service.data.standard.mapstruct.DictMapper;
import cn.datax.service.data.standard.dao.DictDao;
import cn.datax.common.base.BaseServiceImpl;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <p>
 * 数据标准字典表 服务实现类
 * </p>
 *
 * @author yuwei
 * @since 2020-08-26
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class DictServiceImpl extends BaseServiceImpl<DictDao, DictEntity> implements DictService {

    @Autowired
    private DictDao dictDao;

    @Autowired
    private DictMapper dictMapper;

    @Autowired
    private RedisService redisService;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public DictEntity saveDict(DictDto dictDto) {
        DictEntity dict = dictMapper.toEntity(dictDto);
        dictDao.insert(dict);
        return dict;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public DictEntity updateDict(DictDto dictDto) {
        DictEntity dict = dictMapper.toEntity(dictDto);
        dictDao.updateById(dict);
        return dict;
    }

    @Override
    public DictEntity getDictById(String id) {
        DictEntity dictEntity = super.getById(id);
        return dictEntity;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteDictById(String id) {
        dictDao.deleteById(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteDictBatch(List<String> ids) {
        dictDao.deleteBatchIds(ids);
    }

    @Override
    public void refreshDict() {
        String dictKey = RedisConstant.STANDARD_DICT_KEY;
        Boolean hasDictKey = redisService.hasKey(dictKey);
        if (hasDictKey) {
            redisService.del(dictKey);
        }
        List<DictEntity> dictEntityList = dictDao.selectList(Wrappers.emptyWrapper());
        Map<String, List<DictEntity>> dictListMap = dictEntityList.stream().collect(Collectors.groupingBy(DictEntity::getTypeId));
        redisTemplate.opsForHash().putAll(dictKey, dictListMap);
    }
}
