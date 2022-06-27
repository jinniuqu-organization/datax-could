package cn.datax.service.data.quality.mapstruct;

import cn.datax.service.data.quality.api.entity.ScheduleLogEntity;
import cn.datax.service.data.quality.api.vo.ScheduleLogVo;
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
public class ScheduleLogMapperImpl implements ScheduleLogMapper {

    @Override
    public ScheduleLogVo toVO(ScheduleLogEntity e) {
        if ( e == null ) {
            return null;
        }

        ScheduleLogVo scheduleLogVo = new ScheduleLogVo();

        scheduleLogVo.setId( e.getId() );
        scheduleLogVo.setStatus( e.getStatus() );
        scheduleLogVo.setExecuteJobId( e.getExecuteJobId() );
        scheduleLogVo.setExecuteRuleId( e.getExecuteRuleId() );
        scheduleLogVo.setExecuteDate( e.getExecuteDate() );
        scheduleLogVo.setExecuteResult( e.getExecuteResult() );
        scheduleLogVo.setExecuteBatch( e.getExecuteBatch() );
        scheduleLogVo.setExecuteJobName( e.getExecuteJobName() );
        scheduleLogVo.setExecuteRuleName( e.getExecuteRuleName() );
        scheduleLogVo.setExecuteRuleTypeName( e.getExecuteRuleTypeName() );

        return scheduleLogVo;
    }

    @Override
    public List<ScheduleLogVo> toVO(List<ScheduleLogEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<ScheduleLogVo> list = new ArrayList<ScheduleLogVo>( es.size() );
        for ( ScheduleLogEntity scheduleLogEntity : es ) {
            list.add( toVO( scheduleLogEntity ) );
        }

        return list;
    }
}
