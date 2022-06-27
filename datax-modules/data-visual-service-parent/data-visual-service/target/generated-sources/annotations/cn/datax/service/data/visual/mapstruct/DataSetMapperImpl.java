package cn.datax.service.data.visual.mapstruct;

import cn.datax.service.data.visual.api.dto.DataSetDto;
import cn.datax.service.data.visual.api.entity.DataSetEntity;
import cn.datax.service.data.visual.api.vo.DataSetVo;
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
public class DataSetMapperImpl implements DataSetMapper {

    @Override
    public DataSetDto toDTO(DataSetEntity e) {
        if ( e == null ) {
            return null;
        }

        DataSetDto dataSetDto = new DataSetDto();

        dataSetDto.setId( e.getId() );
        dataSetDto.setSourceId( e.getSourceId() );
        dataSetDto.setSetName( e.getSetName() );
        dataSetDto.setSetSql( e.getSetSql() );
        dataSetDto.setSchemaConfig( e.getSchemaConfig() );
        dataSetDto.setStatus( e.getStatus() );
        dataSetDto.setRemark( e.getRemark() );

        return dataSetDto;
    }

    @Override
    public List<DataSetDto> toDTO(List<DataSetEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<DataSetDto> list = new ArrayList<DataSetDto>( es.size() );
        for ( DataSetEntity dataSetEntity : es ) {
            list.add( toDTO( dataSetEntity ) );
        }

        return list;
    }

    @Override
    public DataSetVo toVO(DataSetEntity e) {
        if ( e == null ) {
            return null;
        }

        DataSetVo dataSetVo = new DataSetVo();

        dataSetVo.setId( e.getId() );
        dataSetVo.setStatus( e.getStatus() );
        dataSetVo.setCreateTime( e.getCreateTime() );
        dataSetVo.setRemark( e.getRemark() );
        dataSetVo.setSourceId( e.getSourceId() );
        dataSetVo.setSetName( e.getSetName() );
        dataSetVo.setSetSql( e.getSetSql() );
        dataSetVo.setSchemaConfig( e.getSchemaConfig() );

        return dataSetVo;
    }

    @Override
    public List<DataSetVo> toVO(List<DataSetEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<DataSetVo> list = new ArrayList<DataSetVo>( es.size() );
        for ( DataSetEntity dataSetEntity : es ) {
            list.add( toVO( dataSetEntity ) );
        }

        return list;
    }

    @Override
    public DataSetEntity toEntity(DataSetDto d) {
        if ( d == null ) {
            return null;
        }

        DataSetEntity dataSetEntity = new DataSetEntity();

        dataSetEntity.setId( d.getId() );
        dataSetEntity.setStatus( d.getStatus() );
        dataSetEntity.setRemark( d.getRemark() );
        dataSetEntity.setSourceId( d.getSourceId() );
        dataSetEntity.setSetName( d.getSetName() );
        dataSetEntity.setSetSql( d.getSetSql() );
        dataSetEntity.setSchemaConfig( d.getSchemaConfig() );

        return dataSetEntity;
    }

    @Override
    public List<DataSetEntity> toEntity(List<DataSetDto> ds) {
        if ( ds == null ) {
            return null;
        }

        List<DataSetEntity> list = new ArrayList<DataSetEntity>( ds.size() );
        for ( DataSetDto dataSetDto : ds ) {
            list.add( toEntity( dataSetDto ) );
        }

        return list;
    }
}
