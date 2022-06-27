package cn.datax.service.data.standard.mapstruct;

import cn.datax.service.data.standard.api.dto.TypeDto;
import cn.datax.service.data.standard.api.entity.TypeEntity;
import cn.datax.service.data.standard.api.vo.TypeVo;
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
public class TypeMapperImpl implements TypeMapper {

    @Override
    public TypeDto toDTO(TypeEntity e) {
        if ( e == null ) {
            return null;
        }

        TypeDto typeDto = new TypeDto();

        typeDto.setId( e.getId() );
        typeDto.setGbTypeCode( e.getGbTypeCode() );
        typeDto.setGbTypeName( e.getGbTypeName() );

        return typeDto;
    }

    @Override
    public List<TypeDto> toDTO(List<TypeEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<TypeDto> list = new ArrayList<TypeDto>( es.size() );
        for ( TypeEntity typeEntity : es ) {
            list.add( toDTO( typeEntity ) );
        }

        return list;
    }

    @Override
    public TypeVo toVO(TypeEntity e) {
        if ( e == null ) {
            return null;
        }

        TypeVo typeVo = new TypeVo();

        typeVo.setId( e.getId() );
        typeVo.setStatus( e.getStatus() );
        typeVo.setCreateTime( e.getCreateTime() );
        typeVo.setRemark( e.getRemark() );
        typeVo.setGbTypeCode( e.getGbTypeCode() );
        typeVo.setGbTypeName( e.getGbTypeName() );

        return typeVo;
    }

    @Override
    public List<TypeVo> toVO(List<TypeEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<TypeVo> list = new ArrayList<TypeVo>( es.size() );
        for ( TypeEntity typeEntity : es ) {
            list.add( toVO( typeEntity ) );
        }

        return list;
    }

    @Override
    public TypeEntity toEntity(TypeDto d) {
        if ( d == null ) {
            return null;
        }

        TypeEntity typeEntity = new TypeEntity();

        typeEntity.setId( d.getId() );
        typeEntity.setGbTypeCode( d.getGbTypeCode() );
        typeEntity.setGbTypeName( d.getGbTypeName() );

        return typeEntity;
    }

    @Override
    public List<TypeEntity> toEntity(List<TypeDto> ds) {
        if ( ds == null ) {
            return null;
        }

        List<TypeEntity> list = new ArrayList<TypeEntity>( ds.size() );
        for ( TypeDto typeDto : ds ) {
            list.add( toEntity( typeDto ) );
        }

        return list;
    }
}
