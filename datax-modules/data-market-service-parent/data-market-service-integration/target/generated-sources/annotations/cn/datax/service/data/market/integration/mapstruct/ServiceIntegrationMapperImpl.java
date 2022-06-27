package cn.datax.service.data.market.integration.mapstruct;

import cn.datax.service.data.market.api.dto.ServiceIntegrationDto;
import cn.datax.service.data.market.api.entity.ServiceIntegrationEntity;
import cn.datax.service.data.market.api.vo.ServiceIntegrationVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-14T10:47:36+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_60 (Oracle Corporation)"
)
@Component
public class ServiceIntegrationMapperImpl implements ServiceIntegrationMapper {

    @Override
    public ServiceIntegrationDto toDTO(ServiceIntegrationEntity e) {
        if ( e == null ) {
            return null;
        }

        ServiceIntegrationDto serviceIntegrationDto = new ServiceIntegrationDto();

        serviceIntegrationDto.setId( e.getId() );
        serviceIntegrationDto.setServiceName( e.getServiceName() );
        serviceIntegrationDto.setServiceType( e.getServiceType() );
        serviceIntegrationDto.setHttpService( e.getHttpService() );
        serviceIntegrationDto.setWebService( e.getWebService() );
        serviceIntegrationDto.setStatus( e.getStatus() );
        serviceIntegrationDto.setRemark( e.getRemark() );

        return serviceIntegrationDto;
    }

    @Override
    public List<ServiceIntegrationDto> toDTO(List<ServiceIntegrationEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<ServiceIntegrationDto> list = new ArrayList<ServiceIntegrationDto>( es.size() );
        for ( ServiceIntegrationEntity serviceIntegrationEntity : es ) {
            list.add( toDTO( serviceIntegrationEntity ) );
        }

        return list;
    }

    @Override
    public ServiceIntegrationVo toVO(ServiceIntegrationEntity e) {
        if ( e == null ) {
            return null;
        }

        ServiceIntegrationVo serviceIntegrationVo = new ServiceIntegrationVo();

        serviceIntegrationVo.setId( e.getId() );
        serviceIntegrationVo.setStatus( e.getStatus() );
        serviceIntegrationVo.setCreateTime( e.getCreateTime() );
        serviceIntegrationVo.setServiceNo( e.getServiceNo() );
        serviceIntegrationVo.setServiceName( e.getServiceName() );
        serviceIntegrationVo.setServiceType( e.getServiceType() );
        serviceIntegrationVo.setHttpService( e.getHttpService() );
        serviceIntegrationVo.setWebService( e.getWebService() );

        return serviceIntegrationVo;
    }

    @Override
    public List<ServiceIntegrationVo> toVO(List<ServiceIntegrationEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<ServiceIntegrationVo> list = new ArrayList<ServiceIntegrationVo>( es.size() );
        for ( ServiceIntegrationEntity serviceIntegrationEntity : es ) {
            list.add( toVO( serviceIntegrationEntity ) );
        }

        return list;
    }

    @Override
    public ServiceIntegrationEntity toEntity(ServiceIntegrationDto d) {
        if ( d == null ) {
            return null;
        }

        ServiceIntegrationEntity serviceIntegrationEntity = new ServiceIntegrationEntity();

        serviceIntegrationEntity.setId( d.getId() );
        serviceIntegrationEntity.setStatus( d.getStatus() );
        serviceIntegrationEntity.setRemark( d.getRemark() );
        serviceIntegrationEntity.setServiceName( d.getServiceName() );
        serviceIntegrationEntity.setServiceType( d.getServiceType() );
        serviceIntegrationEntity.setHttpService( d.getHttpService() );
        serviceIntegrationEntity.setWebService( d.getWebService() );

        return serviceIntegrationEntity;
    }

    @Override
    public List<ServiceIntegrationEntity> toEntity(List<ServiceIntegrationDto> ds) {
        if ( ds == null ) {
            return null;
        }

        List<ServiceIntegrationEntity> list = new ArrayList<ServiceIntegrationEntity>( ds.size() );
        for ( ServiceIntegrationDto serviceIntegrationDto : ds ) {
            list.add( toEntity( serviceIntegrationDto ) );
        }

        return list;
    }
}
