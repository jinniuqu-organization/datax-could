package cn.datax.service.data.quality.mapstruct;

import cn.datax.service.data.quality.api.entity.RuleTypeEntity;
import cn.datax.service.data.quality.api.vo.RuleTypeVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-14T10:44:20+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_60 (Oracle Corporation)"
)
@Component
public class RuleTypeMapperImpl implements RuleTypeMapper {

    @Override
    public RuleTypeVo toVO(RuleTypeEntity e) {
        if ( e == null ) {
            return null;
        }

        RuleTypeVo ruleTypeVo = new RuleTypeVo();

        ruleTypeVo.setId( e.getId() );
        ruleTypeVo.setName( e.getName() );
        ruleTypeVo.setCode( e.getCode() );

        return ruleTypeVo;
    }

    @Override
    public List<RuleTypeVo> toVO(List<RuleTypeEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<RuleTypeVo> list = new ArrayList<RuleTypeVo>( es.size() );
        for ( RuleTypeEntity ruleTypeEntity : es ) {
            list.add( toVO( ruleTypeEntity ) );
        }

        return list;
    }
}
