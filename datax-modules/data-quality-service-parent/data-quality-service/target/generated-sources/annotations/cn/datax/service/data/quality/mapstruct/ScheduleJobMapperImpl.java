package cn.datax.service.data.quality.mapstruct;

import cn.datax.service.data.quality.api.entity.ScheduleJobEntity;
import cn.datax.service.data.quality.api.vo.ScheduleJobVo;
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
public class ScheduleJobMapperImpl implements ScheduleJobMapper {

    @Override
    public ScheduleJobVo toVO(ScheduleJobEntity e) {
        if ( e == null ) {
            return null;
        }

        ScheduleJobVo scheduleJobVo = new ScheduleJobVo();

        scheduleJobVo.setId( e.getId() );
        scheduleJobVo.setStatus( e.getStatus() );
        scheduleJobVo.setJobName( e.getJobName() );
        scheduleJobVo.setBeanName( e.getBeanName() );
        scheduleJobVo.setMethodName( e.getMethodName() );
        scheduleJobVo.setMethodParams( e.getMethodParams() );
        scheduleJobVo.setCronExpression( e.getCronExpression() );

        return scheduleJobVo;
    }

    @Override
    public List<ScheduleJobVo> toVO(List<ScheduleJobEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<ScheduleJobVo> list = new ArrayList<ScheduleJobVo>( es.size() );
        for ( ScheduleJobEntity scheduleJobEntity : es ) {
            list.add( toVO( scheduleJobEntity ) );
        }

        return list;
    }
}
