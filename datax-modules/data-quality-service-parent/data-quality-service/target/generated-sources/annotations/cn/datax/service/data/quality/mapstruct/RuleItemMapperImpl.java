package cn.datax.service.data.quality.mapstruct;

import cn.datax.service.data.quality.api.entity.RuleItemEntity;
import cn.datax.service.data.quality.api.vo.RuleItemVo;
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
public class RuleItemMapperImpl implements RuleItemMapper {

    @Override
    public RuleItemVo toVO(RuleItemEntity e) {
        if ( e == null ) {
            return null;
        }

        RuleItemVo ruleItemVo = new RuleItemVo();

        ruleItemVo.setId( e.getId() );
        ruleItemVo.setRuleTypeId( e.getRuleTypeId() );
        ruleItemVo.setItemCode( e.getItemCode() );
        ruleItemVo.setItemExplain( e.getItemExplain() );

        return ruleItemVo;
    }

    @Override
    public List<RuleItemVo> toVO(List<RuleItemEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<RuleItemVo> list = new ArrayList<RuleItemVo>( es.size() );
        for ( RuleItemEntity ruleItemEntity : es ) {
            list.add( toVO( ruleItemEntity ) );
        }

        return list;
    }
}
