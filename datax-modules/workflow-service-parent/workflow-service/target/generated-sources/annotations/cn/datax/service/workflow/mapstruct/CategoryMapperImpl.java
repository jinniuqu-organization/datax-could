package cn.datax.service.workflow.mapstruct;

import cn.datax.service.workflow.api.dto.CategoryDto;
import cn.datax.service.workflow.api.entity.CategoryEntity;
import cn.datax.service.workflow.api.vo.CategoryVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-13T22:18:31+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_60 (Oracle Corporation)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryDto toDTO(CategoryEntity e) {
        if ( e == null ) {
            return null;
        }

        CategoryDto categoryDto = new CategoryDto();

        categoryDto.setId( e.getId() );
        categoryDto.setName( e.getName() );

        return categoryDto;
    }

    @Override
    public List<CategoryDto> toDTO(List<CategoryEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<CategoryDto> list = new ArrayList<CategoryDto>( es.size() );
        for ( CategoryEntity categoryEntity : es ) {
            list.add( toDTO( categoryEntity ) );
        }

        return list;
    }

    @Override
    public CategoryVo toVO(CategoryEntity e) {
        if ( e == null ) {
            return null;
        }

        CategoryVo categoryVo = new CategoryVo();

        categoryVo.setId( e.getId() );
        categoryVo.setStatus( e.getStatus() );
        categoryVo.setCreateTime( e.getCreateTime() );
        categoryVo.setName( e.getName() );

        return categoryVo;
    }

    @Override
    public List<CategoryVo> toVO(List<CategoryEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<CategoryVo> list = new ArrayList<CategoryVo>( es.size() );
        for ( CategoryEntity categoryEntity : es ) {
            list.add( toVO( categoryEntity ) );
        }

        return list;
    }

    @Override
    public CategoryEntity toEntity(CategoryDto d) {
        if ( d == null ) {
            return null;
        }

        CategoryEntity categoryEntity = new CategoryEntity();

        categoryEntity.setId( d.getId() );
        categoryEntity.setName( d.getName() );

        return categoryEntity;
    }

    @Override
    public List<CategoryEntity> toEntity(List<CategoryDto> ds) {
        if ( ds == null ) {
            return null;
        }

        List<CategoryEntity> list = new ArrayList<CategoryEntity>( ds.size() );
        for ( CategoryDto categoryDto : ds ) {
            list.add( toEntity( categoryDto ) );
        }

        return list;
    }
}
