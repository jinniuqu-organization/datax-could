package cn.datax.service.data.visual.mapstruct;

import cn.datax.service.data.visual.api.dto.ScreenDto;
import cn.datax.service.data.visual.api.entity.ChartEntity;
import cn.datax.service.data.visual.api.entity.ScreenEntity;
import cn.datax.service.data.visual.api.vo.ChartVo;
import cn.datax.service.data.visual.api.vo.ScreenVo;
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
public class ScreenMapperImpl implements ScreenMapper {

    @Override
    public ScreenDto toDTO(ScreenEntity e) {
        if ( e == null ) {
            return null;
        }

        ScreenDto screenDto = new ScreenDto();

        screenDto.setId( e.getId() );
        screenDto.setScreenName( e.getScreenName() );
        screenDto.setScreenThumbnail( e.getScreenThumbnail() );
        screenDto.setScreenConfig( e.getScreenConfig() );

        return screenDto;
    }

    @Override
    public List<ScreenDto> toDTO(List<ScreenEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<ScreenDto> list = new ArrayList<ScreenDto>( es.size() );
        for ( ScreenEntity screenEntity : es ) {
            list.add( toDTO( screenEntity ) );
        }

        return list;
    }

    @Override
    public ScreenVo toVO(ScreenEntity e) {
        if ( e == null ) {
            return null;
        }

        ScreenVo screenVo = new ScreenVo();

        screenVo.setId( e.getId() );
        screenVo.setStatus( e.getStatus() );
        screenVo.setCreateTime( e.getCreateTime() );
        screenVo.setRemark( e.getRemark() );
        screenVo.setScreenName( e.getScreenName() );
        screenVo.setScreenThumbnail( e.getScreenThumbnail() );
        screenVo.setScreenConfig( e.getScreenConfig() );
        screenVo.setCharts( chartEntityListToChartVoList( e.getCharts() ) );

        return screenVo;
    }

    @Override
    public List<ScreenVo> toVO(List<ScreenEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<ScreenVo> list = new ArrayList<ScreenVo>( es.size() );
        for ( ScreenEntity screenEntity : es ) {
            list.add( toVO( screenEntity ) );
        }

        return list;
    }

    @Override
    public ScreenEntity toEntity(ScreenDto d) {
        if ( d == null ) {
            return null;
        }

        ScreenEntity screenEntity = new ScreenEntity();

        screenEntity.setId( d.getId() );
        screenEntity.setScreenName( d.getScreenName() );
        screenEntity.setScreenThumbnail( d.getScreenThumbnail() );
        screenEntity.setScreenConfig( d.getScreenConfig() );

        return screenEntity;
    }

    @Override
    public List<ScreenEntity> toEntity(List<ScreenDto> ds) {
        if ( ds == null ) {
            return null;
        }

        List<ScreenEntity> list = new ArrayList<ScreenEntity>( ds.size() );
        for ( ScreenDto screenDto : ds ) {
            list.add( toEntity( screenDto ) );
        }

        return list;
    }

    protected ChartVo chartEntityToChartVo(ChartEntity chartEntity) {
        if ( chartEntity == null ) {
            return null;
        }

        ChartVo chartVo = new ChartVo();

        chartVo.setId( chartEntity.getId() );
        chartVo.setStatus( chartEntity.getStatus() );
        chartVo.setCreateTime( chartEntity.getCreateTime() );
        chartVo.setRemark( chartEntity.getRemark() );
        chartVo.setChartName( chartEntity.getChartName() );
        chartVo.setChartThumbnail( chartEntity.getChartThumbnail() );
        chartVo.setChartConfig( chartEntity.getChartConfig() );

        return chartVo;
    }

    protected List<ChartVo> chartEntityListToChartVoList(List<ChartEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<ChartVo> list1 = new ArrayList<ChartVo>( list.size() );
        for ( ChartEntity chartEntity : list ) {
            list1.add( chartEntityToChartVo( chartEntity ) );
        }

        return list1;
    }
}
