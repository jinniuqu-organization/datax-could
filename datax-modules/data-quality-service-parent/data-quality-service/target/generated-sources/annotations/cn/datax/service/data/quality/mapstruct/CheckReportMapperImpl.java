package cn.datax.service.data.quality.mapstruct;

import cn.datax.service.data.quality.api.entity.CheckReportEntity;
import cn.datax.service.data.quality.api.vo.CheckReportVo;
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
public class CheckReportMapperImpl implements CheckReportMapper {

    @Override
    public CheckReportVo toVO(CheckReportEntity e) {
        if ( e == null ) {
            return null;
        }

        CheckReportVo checkReportVo = new CheckReportVo();

        checkReportVo.setId( e.getId() );
        checkReportVo.setCheckRuleId( e.getCheckRuleId() );
        checkReportVo.setCheckDate( e.getCheckDate() );
        checkReportVo.setCheckResult( e.getCheckResult() );
        checkReportVo.setCheckTotalCount( e.getCheckTotalCount() );
        checkReportVo.setCheckErrorCount( e.getCheckErrorCount() );
        checkReportVo.setRuleName( e.getRuleName() );
        checkReportVo.setRuleType( e.getRuleType() );
        checkReportVo.setRuleSource( e.getRuleSource() );
        checkReportVo.setRuleTable( e.getRuleTable() );
        checkReportVo.setRuleColumn( e.getRuleColumn() );

        return checkReportVo;
    }

    @Override
    public List<CheckReportVo> toVO(List<CheckReportEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<CheckReportVo> list = new ArrayList<CheckReportVo>( es.size() );
        for ( CheckReportEntity checkReportEntity : es ) {
            list.add( toVO( checkReportEntity ) );
        }

        return list;
    }
}
