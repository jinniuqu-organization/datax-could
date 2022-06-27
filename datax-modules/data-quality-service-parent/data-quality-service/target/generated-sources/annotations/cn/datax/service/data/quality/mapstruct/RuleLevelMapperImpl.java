package cn.datax.service.data.quality.mapstruct;

import cn.datax.service.data.quality.api.entity.RuleLevelEntity;
import cn.datax.service.data.quality.api.vo.RuleLevelVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-14T10:44:19+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_60 (Oracle Corporation)"
)
@Component
public class RuleLevelMapperImpl implements RuleLevelMapper {

    @Override
    public RuleLevelVo toVO(RuleLevelEntity e) {
        if ( e == null ) {
            return null;
        }

        RuleLevelVo ruleLevelVo = new RuleLevelVo();

        ruleLevelVo.setId( e.getId() );
        ruleLevelVo.setCode( e.getCode() );
        ruleLevelVo.setName( e.getName() );

        return ruleLevelVo;
    }

    @Override
    public List<RuleLevelVo> toVO(List<RuleLevelEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<RuleLevelVo> list = new ArrayList<RuleLevelVo>( es.size() );
        for ( RuleLevelEntity ruleLevelEntity : es ) {
            list.add( toVO( ruleLevelEntity ) );
        }

        return list;
    }
}
