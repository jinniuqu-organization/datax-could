package cn.datax.service.data.masterdata.mapstruct;

import cn.datax.service.data.masterdata.api.dto.ModelColumnDto;
import cn.datax.service.data.masterdata.api.entity.ModelColumnEntity;
import cn.datax.service.data.masterdata.api.vo.ModelColumnVo;
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
public class ModelColumnMapstructImpl implements ModelColumnMapstruct {

    @Override
    public ModelColumnDto toDTO(ModelColumnEntity e) {
        if ( e == null ) {
            return null;
        }

        ModelColumnDto modelColumnDto = new ModelColumnDto();

        modelColumnDto.setId( e.getId() );
        modelColumnDto.setColumnName( e.getColumnName() );
        modelColumnDto.setColumnComment( e.getColumnComment() );
        modelColumnDto.setColumnType( e.getColumnType() );
        modelColumnDto.setColumnLength( e.getColumnLength() );
        modelColumnDto.setColumnScale( e.getColumnScale() );
        modelColumnDto.setDefaultValue( e.getDefaultValue() );
        modelColumnDto.setIsSystem( e.getIsSystem() );
        modelColumnDto.setIsPk( e.getIsPk() );
        modelColumnDto.setIsRequired( e.getIsRequired() );
        modelColumnDto.setIsInsert( e.getIsInsert() );
        modelColumnDto.setIsEdit( e.getIsEdit() );
        modelColumnDto.setIsDetail( e.getIsDetail() );
        modelColumnDto.setIsList( e.getIsList() );
        modelColumnDto.setIsQuery( e.getIsQuery() );
        modelColumnDto.setQueryType( e.getQueryType() );
        modelColumnDto.setHtmlType( e.getHtmlType() );
        modelColumnDto.setSort( e.getSort() );
        modelColumnDto.setIsBindDict( e.getIsBindDict() );
        modelColumnDto.setBindDictTypeId( e.getBindDictTypeId() );
        modelColumnDto.setBindDictColumn( e.getBindDictColumn() );

        return modelColumnDto;
    }

    @Override
    public List<ModelColumnDto> toDTO(List<ModelColumnEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<ModelColumnDto> list = new ArrayList<ModelColumnDto>( es.size() );
        for ( ModelColumnEntity modelColumnEntity : es ) {
            list.add( toDTO( modelColumnEntity ) );
        }

        return list;
    }

    @Override
    public ModelColumnVo toVO(ModelColumnEntity e) {
        if ( e == null ) {
            return null;
        }

        ModelColumnVo modelColumnVo = new ModelColumnVo();

        modelColumnVo.setId( e.getId() );
        modelColumnVo.setStatus( e.getStatus() );
        modelColumnVo.setCreateTime( e.getCreateTime() );
        modelColumnVo.setModelId( e.getModelId() );
        modelColumnVo.setColumnName( e.getColumnName() );
        modelColumnVo.setColumnComment( e.getColumnComment() );
        modelColumnVo.setColumnType( e.getColumnType() );
        modelColumnVo.setColumnLength( e.getColumnLength() );
        modelColumnVo.setColumnScale( e.getColumnScale() );
        modelColumnVo.setDefaultValue( e.getDefaultValue() );
        modelColumnVo.setIsSystem( e.getIsSystem() );
        modelColumnVo.setIsPk( e.getIsPk() );
        modelColumnVo.setIsRequired( e.getIsRequired() );
        modelColumnVo.setIsInsert( e.getIsInsert() );
        modelColumnVo.setIsEdit( e.getIsEdit() );
        modelColumnVo.setIsDetail( e.getIsDetail() );
        modelColumnVo.setIsList( e.getIsList() );
        modelColumnVo.setIsQuery( e.getIsQuery() );
        modelColumnVo.setQueryType( e.getQueryType() );
        modelColumnVo.setIsBindDict( e.getIsBindDict() );
        modelColumnVo.setBindDictTypeId( e.getBindDictTypeId() );
        modelColumnVo.setBindDictColumn( e.getBindDictColumn() );
        modelColumnVo.setHtmlType( e.getHtmlType() );
        modelColumnVo.setSort( e.getSort() );

        return modelColumnVo;
    }

    @Override
    public List<ModelColumnVo> toVO(List<ModelColumnEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<ModelColumnVo> list = new ArrayList<ModelColumnVo>( es.size() );
        for ( ModelColumnEntity modelColumnEntity : es ) {
            list.add( toVO( modelColumnEntity ) );
        }

        return list;
    }

    @Override
    public ModelColumnEntity toEntity(ModelColumnDto d) {
        if ( d == null ) {
            return null;
        }

        ModelColumnEntity modelColumnEntity = new ModelColumnEntity();

        modelColumnEntity.setId( d.getId() );
        modelColumnEntity.setColumnName( d.getColumnName() );
        modelColumnEntity.setColumnComment( d.getColumnComment() );
        modelColumnEntity.setColumnType( d.getColumnType() );
        modelColumnEntity.setColumnLength( d.getColumnLength() );
        modelColumnEntity.setColumnScale( d.getColumnScale() );
        modelColumnEntity.setDefaultValue( d.getDefaultValue() );
        modelColumnEntity.setIsSystem( d.getIsSystem() );
        modelColumnEntity.setIsPk( d.getIsPk() );
        modelColumnEntity.setIsRequired( d.getIsRequired() );
        modelColumnEntity.setIsInsert( d.getIsInsert() );
        modelColumnEntity.setIsEdit( d.getIsEdit() );
        modelColumnEntity.setIsDetail( d.getIsDetail() );
        modelColumnEntity.setIsList( d.getIsList() );
        modelColumnEntity.setIsQuery( d.getIsQuery() );
        modelColumnEntity.setQueryType( d.getQueryType() );
        modelColumnEntity.setIsBindDict( d.getIsBindDict() );
        modelColumnEntity.setBindDictTypeId( d.getBindDictTypeId() );
        modelColumnEntity.setBindDictColumn( d.getBindDictColumn() );
        modelColumnEntity.setHtmlType( d.getHtmlType() );
        modelColumnEntity.setSort( d.getSort() );

        return modelColumnEntity;
    }

    @Override
    public List<ModelColumnEntity> toEntity(List<ModelColumnDto> ds) {
        if ( ds == null ) {
            return null;
        }

        List<ModelColumnEntity> list = new ArrayList<ModelColumnEntity>( ds.size() );
        for ( ModelColumnDto modelColumnDto : ds ) {
            list.add( toEntity( modelColumnDto ) );
        }

        return list;
    }
}
