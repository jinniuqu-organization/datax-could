package cn.datax.service.data.standard.mapstruct;

import cn.datax.service.data.standard.api.dto.ContrastDictDto;
import cn.datax.service.data.standard.api.entity.ContrastDictEntity;
import cn.datax.service.data.standard.api.vo.ContrastDictVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-14T10:43:06+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_60 (Oracle Corporation)"
)
@Component
public class ContrastDictMapperImpl implements ContrastDictMapper {

    @Override
    public ContrastDictDto toDTO(ContrastDictEntity e) {
        if ( e == null ) {
            return null;
        }

        ContrastDictDto contrastDictDto = new ContrastDictDto();

        contrastDictDto.setId( e.getId() );
        contrastDictDto.setContrastId( e.getContrastId() );
        contrastDictDto.setColCode( e.getColCode() );
        contrastDictDto.setColName( e.getColName() );
        contrastDictDto.setStatus( e.getStatus() );
        contrastDictDto.setRemark( e.getRemark() );

        return contrastDictDto;
    }

    @Override
    public List<ContrastDictDto> toDTO(List<ContrastDictEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<ContrastDictDto> list = new ArrayList<ContrastDictDto>( es.size() );
        for ( ContrastDictEntity contrastDictEntity : es ) {
            list.add( toDTO( contrastDictEntity ) );
        }

        return list;
    }

    @Override
    public ContrastDictVo toVO(ContrastDictEntity e) {
        if ( e == null ) {
            return null;
        }

        ContrastDictVo contrastDictVo = new ContrastDictVo();

        contrastDictVo.setId( e.getId() );
        contrastDictVo.setStatus( e.getStatus() );
        contrastDictVo.setCreateTime( e.getCreateTime() );
        contrastDictVo.setRemark( e.getRemark() );
        contrastDictVo.setContrastId( e.getContrastId() );
        contrastDictVo.setColCode( e.getColCode() );
        contrastDictVo.setColName( e.getColName() );
        contrastDictVo.setContrastGbId( e.getContrastGbId() );
        contrastDictVo.setContrastGbCode( e.getContrastGbCode() );
        contrastDictVo.setContrastGbName( e.getContrastGbName() );
        contrastDictVo.setSourceName( e.getSourceName() );
        contrastDictVo.setTableName( e.getTableName() );
        contrastDictVo.setColumnName( e.getColumnName() );
        contrastDictVo.setGbTypeCode( e.getGbTypeCode() );
        contrastDictVo.setGbTypeName( e.getGbTypeName() );

        return contrastDictVo;
    }

    @Override
    public List<ContrastDictVo> toVO(List<ContrastDictEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<ContrastDictVo> list = new ArrayList<ContrastDictVo>( es.size() );
        for ( ContrastDictEntity contrastDictEntity : es ) {
            list.add( toVO( contrastDictEntity ) );
        }

        return list;
    }

    @Override
    public ContrastDictEntity toEntity(ContrastDictDto d) {
        if ( d == null ) {
            return null;
        }

        ContrastDictEntity contrastDictEntity = new ContrastDictEntity();

        contrastDictEntity.setId( d.getId() );
        contrastDictEntity.setStatus( d.getStatus() );
        contrastDictEntity.setRemark( d.getRemark() );
        contrastDictEntity.setContrastId( d.getContrastId() );
        contrastDictEntity.setColCode( d.getColCode() );
        contrastDictEntity.setColName( d.getColName() );

        return contrastDictEntity;
    }

    @Override
    public List<ContrastDictEntity> toEntity(List<ContrastDictDto> ds) {
        if ( ds == null ) {
            return null;
        }

        List<ContrastDictEntity> list = new ArrayList<ContrastDictEntity>( ds.size() );
        for ( ContrastDictDto contrastDictDto : ds ) {
            list.add( toEntity( contrastDictDto ) );
        }

        return list;
    }
}
