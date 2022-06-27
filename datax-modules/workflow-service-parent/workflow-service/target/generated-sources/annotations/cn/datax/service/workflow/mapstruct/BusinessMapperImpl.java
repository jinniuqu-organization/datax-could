package cn.datax.service.workflow.mapstruct;

import cn.datax.service.workflow.api.dto.BusinessDto;
import cn.datax.service.workflow.api.entity.BusinessEntity;
import cn.datax.service.workflow.api.vo.BusinessVo;
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
public class BusinessMapperImpl implements BusinessMapper {

    @Override
    public BusinessDto toDTO(BusinessEntity e) {
        if ( e == null ) {
            return null;
        }

        BusinessDto businessDto = new BusinessDto();

        businessDto.setId( e.getId() );
        businessDto.setBusinessCode( e.getBusinessCode() );
        businessDto.setBusinessName( e.getBusinessName() );
        businessDto.setBusinessComponent( e.getBusinessComponent() );
        businessDto.setBusinessAuditGroup( e.getBusinessAuditGroup() );
        businessDto.setProcessDefinitionId( e.getProcessDefinitionId() );
        businessDto.setBusinessTempalte( e.getBusinessTempalte() );
        businessDto.setStatus( e.getStatus() );
        businessDto.setRemark( e.getRemark() );

        return businessDto;
    }

    @Override
    public List<BusinessDto> toDTO(List<BusinessEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<BusinessDto> list = new ArrayList<BusinessDto>( es.size() );
        for ( BusinessEntity businessEntity : es ) {
            list.add( toDTO( businessEntity ) );
        }

        return list;
    }

    @Override
    public BusinessVo toVO(BusinessEntity e) {
        if ( e == null ) {
            return null;
        }

        BusinessVo businessVo = new BusinessVo();

        businessVo.setId( e.getId() );
        businessVo.setStatus( e.getStatus() );
        businessVo.setCreateTime( e.getCreateTime() );
        businessVo.setBusinessCode( e.getBusinessCode() );
        businessVo.setBusinessName( e.getBusinessName() );
        businessVo.setBusinessComponent( e.getBusinessComponent() );
        businessVo.setBusinessAuditGroup( e.getBusinessAuditGroup() );
        businessVo.setProcessDefinitionId( e.getProcessDefinitionId() );
        businessVo.setBusinessTempalte( e.getBusinessTempalte() );

        return businessVo;
    }

    @Override
    public List<BusinessVo> toVO(List<BusinessEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<BusinessVo> list = new ArrayList<BusinessVo>( es.size() );
        for ( BusinessEntity businessEntity : es ) {
            list.add( toVO( businessEntity ) );
        }

        return list;
    }

    @Override
    public BusinessEntity toEntity(BusinessDto d) {
        if ( d == null ) {
            return null;
        }

        BusinessEntity businessEntity = new BusinessEntity();

        businessEntity.setId( d.getId() );
        businessEntity.setStatus( d.getStatus() );
        businessEntity.setRemark( d.getRemark() );
        businessEntity.setBusinessCode( d.getBusinessCode() );
        businessEntity.setBusinessName( d.getBusinessName() );
        businessEntity.setBusinessComponent( d.getBusinessComponent() );
        businessEntity.setBusinessAuditGroup( d.getBusinessAuditGroup() );
        businessEntity.setProcessDefinitionId( d.getProcessDefinitionId() );
        businessEntity.setBusinessTempalte( d.getBusinessTempalte() );

        return businessEntity;
    }

    @Override
    public List<BusinessEntity> toEntity(List<BusinessDto> ds) {
        if ( ds == null ) {
            return null;
        }

        List<BusinessEntity> list = new ArrayList<BusinessEntity>( ds.size() );
        for ( BusinessDto businessDto : ds ) {
            list.add( toEntity( businessDto ) );
        }

        return list;
    }
}
