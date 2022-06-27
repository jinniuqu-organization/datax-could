package cn.datax.service.data.visual.mapstruct;

import cn.datax.service.data.visual.api.dto.ChartDto;
import cn.datax.service.data.visual.api.entity.ChartEntity;
import cn.datax.service.data.visual.api.vo.ChartVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-14T10:49:59+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_60 (Oracle Corporation)"
)
@Component
public class ChartMapperImpl implements ChartMapper {

    @Override
    public ChartDto toDTO(ChartEntity e) {
        if ( e == null ) {
            return null;
        }

        ChartDto chartDto = new ChartDto();

        chartDto.setId( e.getId() );
        chartDto.setChartName( e.getChartName() );
        chartDto.setChartThumbnail( e.getChartThumbnail() );
        chartDto.setChartConfig( e.getChartConfig() );

        return chartDto;
    }

    @Override
    public List<ChartDto> toDTO(List<ChartEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<ChartDto> list = new ArrayList<ChartDto>( es.size() );
        for ( ChartEntity chartEntity : es ) {
            list.add( toDTO( chartEntity ) );
        }

        return list;
    }

    @Override
    public ChartVo toVO(ChartEntity e) {
        if ( e == null ) {
            return null;
        }

        ChartVo chartVo = new ChartVo();

        chartVo.setId( e.getId() );
        chartVo.setStatus( e.getStatus() );
        chartVo.setCreateTime( e.getCreateTime() );
        chartVo.setRemark( e.getRemark() );
        chartVo.setChartName( e.getChartName() );
        chartVo.setChartThumbnail( e.getChartThumbnail() );
        chartVo.setChartConfig( e.getChartConfig() );

        return chartVo;
    }

    @Override
    public List<ChartVo> toVO(List<ChartEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<ChartVo> list = new ArrayList<ChartVo>( es.size() );
        for ( ChartEntity chartEntity : es ) {
            list.add( toVO( chartEntity ) );
        }

        return list;
    }

    @Override
    public ChartEntity toEntity(ChartDto d) {
        if ( d == null ) {
            return null;
        }

        ChartEntity chartEntity = new ChartEntity();

        chartEntity.setId( d.getId() );
        chartEntity.setChartName( d.getChartName() );
        chartEntity.setChartThumbnail( d.getChartThumbnail() );
        chartEntity.setChartConfig( d.getChartConfig() );

        return chartEntity;
    }

    @Override
    public List<ChartEntity> toEntity(List<ChartDto> ds) {
        if ( ds == null ) {
            return null;
        }

        List<ChartEntity> list = new ArrayList<ChartEntity>( ds.size() );
        for ( ChartDto chartDto : ds ) {
            list.add( toEntity( chartDto ) );
        }

        return list;
    }
}
