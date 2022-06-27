package cn.datax.service.data.masterdata.mapstruct;

import cn.datax.service.data.masterdata.api.dto.ModelColumnDto;
import cn.datax.service.data.masterdata.api.dto.ModelDto;
import cn.datax.service.data.masterdata.api.entity.ModelColumnEntity;
import cn.datax.service.data.masterdata.api.entity.ModelEntity;
import cn.datax.service.data.masterdata.api.vo.ModelColumnVo;
import cn.datax.service.data.masterdata.api.vo.ModelVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-13T22:19:56+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_60 (Oracle Corporation)"
)
@Component
public class ModelMapstructImpl implements ModelMapstruct {

    @Override
    public ModelDto toDTO(ModelEntity e) {
        if ( e == null ) {
            return null;
        }

        ModelDto modelDto = new ModelDto();

        modelDto.setId( e.getId() );
        modelDto.setModelName( e.getModelName() );
        modelDto.setModelLogicTable( e.getModelLogicTable() );
        modelDto.setModelColumns( modelColumnEntityListToModelColumnDtoList( e.getModelColumns() ) );
        modelDto.setStatus( e.getStatus() );
        modelDto.setRemark( e.getRemark() );

        return modelDto;
    }

    @Override
    public List<ModelDto> toDTO(List<ModelEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<ModelDto> list = new ArrayList<ModelDto>( es.size() );
        for ( ModelEntity modelEntity : es ) {
            list.add( toDTO( modelEntity ) );
        }

        return list;
    }

    @Override
    public ModelVo toVO(ModelEntity e) {
        if ( e == null ) {
            return null;
        }

        ModelVo modelVo = new ModelVo();

        modelVo.setId( e.getId() );
        modelVo.setStatus( e.getStatus() );
        modelVo.setCreateTime( e.getCreateTime() );
        modelVo.setModelName( e.getModelName() );
        modelVo.setModelLogicTable( e.getModelLogicTable() );
        modelVo.setModelPhysicalTable( e.getModelPhysicalTable() );
        modelVo.setIsSync( e.getIsSync() );
        modelVo.setFlowStatus( e.getFlowStatus() );
        modelVo.setProcessInstanceId( e.getProcessInstanceId() );
        modelVo.setModelColumns( modelColumnEntityListToModelColumnVoList( e.getModelColumns() ) );

        return modelVo;
    }

    @Override
    public List<ModelVo> toVO(List<ModelEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<ModelVo> list = new ArrayList<ModelVo>( es.size() );
        for ( ModelEntity modelEntity : es ) {
            list.add( toVO( modelEntity ) );
        }

        return list;
    }

    @Override
    public ModelEntity toEntity(ModelDto d) {
        if ( d == null ) {
            return null;
        }

        ModelEntity modelEntity = new ModelEntity();

        modelEntity.setId( d.getId() );
        modelEntity.setStatus( d.getStatus() );
        modelEntity.setRemark( d.getRemark() );
        modelEntity.setModelName( d.getModelName() );
        modelEntity.setModelLogicTable( d.getModelLogicTable() );
        modelEntity.setModelColumns( modelColumnDtoListToModelColumnEntityList( d.getModelColumns() ) );

        return modelEntity;
    }

    @Override
    public List<ModelEntity> toEntity(List<ModelDto> ds) {
        if ( ds == null ) {
            return null;
        }

        List<ModelEntity> list = new ArrayList<ModelEntity>( ds.size() );
        for ( ModelDto modelDto : ds ) {
            list.add( toEntity( modelDto ) );
        }

        return list;
    }

    protected ModelColumnDto modelColumnEntityToModelColumnDto(ModelColumnEntity modelColumnEntity) {
        if ( modelColumnEntity == null ) {
            return null;
        }

        ModelColumnDto modelColumnDto = new ModelColumnDto();

        modelColumnDto.setId( modelColumnEntity.getId() );
        modelColumnDto.setColumnName( modelColumnEntity.getColumnName() );
        modelColumnDto.setColumnComment( modelColumnEntity.getColumnComment() );
        modelColumnDto.setColumnType( modelColumnEntity.getColumnType() );
        modelColumnDto.setColumnLength( modelColumnEntity.getColumnLength() );
        modelColumnDto.setColumnScale( modelColumnEntity.getColumnScale() );
        modelColumnDto.setDefaultValue( modelColumnEntity.getDefaultValue() );
        modelColumnDto.setIsSystem( modelColumnEntity.getIsSystem() );
        modelColumnDto.setIsPk( modelColumnEntity.getIsPk() );
        modelColumnDto.setIsRequired( modelColumnEntity.getIsRequired() );
        modelColumnDto.setIsInsert( modelColumnEntity.getIsInsert() );
        modelColumnDto.setIsEdit( modelColumnEntity.getIsEdit() );
        modelColumnDto.setIsDetail( modelColumnEntity.getIsDetail() );
        modelColumnDto.setIsList( modelColumnEntity.getIsList() );
        modelColumnDto.setIsQuery( modelColumnEntity.getIsQuery() );
        modelColumnDto.setQueryType( modelColumnEntity.getQueryType() );
        modelColumnDto.setHtmlType( modelColumnEntity.getHtmlType() );
        modelColumnDto.setSort( modelColumnEntity.getSort() );
        modelColumnDto.setIsBindDict( modelColumnEntity.getIsBindDict() );
        modelColumnDto.setBindDictTypeId( modelColumnEntity.getBindDictTypeId() );
        modelColumnDto.setBindDictColumn( modelColumnEntity.getBindDictColumn() );

        return modelColumnDto;
    }

    protected List<ModelColumnDto> modelColumnEntityListToModelColumnDtoList(List<ModelColumnEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<ModelColumnDto> list1 = new ArrayList<ModelColumnDto>( list.size() );
        for ( ModelColumnEntity modelColumnEntity : list ) {
            list1.add( modelColumnEntityToModelColumnDto( modelColumnEntity ) );
        }

        return list1;
    }

    protected ModelColumnVo modelColumnEntityToModelColumnVo(ModelColumnEntity modelColumnEntity) {
        if ( modelColumnEntity == null ) {
            return null;
        }

        ModelColumnVo modelColumnVo = new ModelColumnVo();

        modelColumnVo.setId( modelColumnEntity.getId() );
        modelColumnVo.setStatus( modelColumnEntity.getStatus() );
        modelColumnVo.setCreateTime( modelColumnEntity.getCreateTime() );
        modelColumnVo.setModelId( modelColumnEntity.getModelId() );
        modelColumnVo.setColumnName( modelColumnEntity.getColumnName() );
        modelColumnVo.setColumnComment( modelColumnEntity.getColumnComment() );
        modelColumnVo.setColumnType( modelColumnEntity.getColumnType() );
        modelColumnVo.setColumnLength( modelColumnEntity.getColumnLength() );
        modelColumnVo.setColumnScale( modelColumnEntity.getColumnScale() );
        modelColumnVo.setDefaultValue( modelColumnEntity.getDefaultValue() );
        modelColumnVo.setIsSystem( modelColumnEntity.getIsSystem() );
        modelColumnVo.setIsPk( modelColumnEntity.getIsPk() );
        modelColumnVo.setIsRequired( modelColumnEntity.getIsRequired() );
        modelColumnVo.setIsInsert( modelColumnEntity.getIsInsert() );
        modelColumnVo.setIsEdit( modelColumnEntity.getIsEdit() );
        modelColumnVo.setIsDetail( modelColumnEntity.getIsDetail() );
        modelColumnVo.setIsList( modelColumnEntity.getIsList() );
        modelColumnVo.setIsQuery( modelColumnEntity.getIsQuery() );
        modelColumnVo.setQueryType( modelColumnEntity.getQueryType() );
        modelColumnVo.setIsBindDict( modelColumnEntity.getIsBindDict() );
        modelColumnVo.setBindDictTypeId( modelColumnEntity.getBindDictTypeId() );
        modelColumnVo.setBindDictColumn( modelColumnEntity.getBindDictColumn() );
        modelColumnVo.setHtmlType( modelColumnEntity.getHtmlType() );
        modelColumnVo.setSort( modelColumnEntity.getSort() );

        return modelColumnVo;
    }

    protected List<ModelColumnVo> modelColumnEntityListToModelColumnVoList(List<ModelColumnEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<ModelColumnVo> list1 = new ArrayList<ModelColumnVo>( list.size() );
        for ( ModelColumnEntity modelColumnEntity : list ) {
            list1.add( modelColumnEntityToModelColumnVo( modelColumnEntity ) );
        }

        return list1;
    }

    protected ModelColumnEntity modelColumnDtoToModelColumnEntity(ModelColumnDto modelColumnDto) {
        if ( modelColumnDto == null ) {
            return null;
        }

        ModelColumnEntity modelColumnEntity = new ModelColumnEntity();

        modelColumnEntity.setId( modelColumnDto.getId() );
        modelColumnEntity.setColumnName( modelColumnDto.getColumnName() );
        modelColumnEntity.setColumnComment( modelColumnDto.getColumnComment() );
        modelColumnEntity.setColumnType( modelColumnDto.getColumnType() );
        modelColumnEntity.setColumnLength( modelColumnDto.getColumnLength() );
        modelColumnEntity.setColumnScale( modelColumnDto.getColumnScale() );
        modelColumnEntity.setDefaultValue( modelColumnDto.getDefaultValue() );
        modelColumnEntity.setIsSystem( modelColumnDto.getIsSystem() );
        modelColumnEntity.setIsPk( modelColumnDto.getIsPk() );
        modelColumnEntity.setIsRequired( modelColumnDto.getIsRequired() );
        modelColumnEntity.setIsInsert( modelColumnDto.getIsInsert() );
        modelColumnEntity.setIsEdit( modelColumnDto.getIsEdit() );
        modelColumnEntity.setIsDetail( modelColumnDto.getIsDetail() );
        modelColumnEntity.setIsList( modelColumnDto.getIsList() );
        modelColumnEntity.setIsQuery( modelColumnDto.getIsQuery() );
        modelColumnEntity.setQueryType( modelColumnDto.getQueryType() );
        modelColumnEntity.setIsBindDict( modelColumnDto.getIsBindDict() );
        modelColumnEntity.setBindDictTypeId( modelColumnDto.getBindDictTypeId() );
        modelColumnEntity.setBindDictColumn( modelColumnDto.getBindDictColumn() );
        modelColumnEntity.setHtmlType( modelColumnDto.getHtmlType() );
        modelColumnEntity.setSort( modelColumnDto.getSort() );

        return modelColumnEntity;
    }

    protected List<ModelColumnEntity> modelColumnDtoListToModelColumnEntityList(List<ModelColumnDto> list) {
        if ( list == null ) {
            return null;
        }

        List<ModelColumnEntity> list1 = new ArrayList<ModelColumnEntity>( list.size() );
        for ( ModelColumnDto modelColumnDto : list ) {
            list1.add( modelColumnDtoToModelColumnEntity( modelColumnDto ) );
        }

        return list1;
    }
}
