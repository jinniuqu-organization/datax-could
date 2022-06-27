package cn.datax.service.data.market.integration.mapstruct;

import cn.datax.service.data.market.api.dto.ServiceLogDto;
import cn.datax.service.data.market.api.entity.ServiceLogEntity;
import cn.datax.service.data.market.api.vo.ServiceLogVo;
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
public class ServiceLogMapperImpl implements ServiceLogMapper {

    @Override
    public ServiceLogDto toDTO(ServiceLogEntity e) {
        if ( e == null ) {
            return null;
        }

        ServiceLogDto serviceLogDto = new ServiceLogDto();

        serviceLogDto.setId( e.getId() );
        serviceLogDto.setServiceId( e.getServiceId() );
        serviceLogDto.setCallerId( e.getCallerId() );
        serviceLogDto.setCallerIp( e.getCallerIp() );
        serviceLogDto.setCallerDate( e.getCallerDate() );
        serviceLogDto.setCallerHeader( e.getCallerHeader() );
        serviceLogDto.setCallerParam( e.getCallerParam() );
        serviceLogDto.setCallerSoap( e.getCallerSoap() );
        serviceLogDto.setTime( e.getTime() );
        serviceLogDto.setMsg( e.getMsg() );
        serviceLogDto.setStatus( e.getStatus() );

        return serviceLogDto;
    }

    @Override
    public List<ServiceLogDto> toDTO(List<ServiceLogEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<ServiceLogDto> list = new ArrayList<ServiceLogDto>( es.size() );
        for ( ServiceLogEntity serviceLogEntity : es ) {
            list.add( toDTO( serviceLogEntity ) );
        }

        return list;
    }

    @Override
    public ServiceLogVo toVO(ServiceLogEntity e) {
        if ( e == null ) {
            return null;
        }

        ServiceLogVo serviceLogVo = new ServiceLogVo();

        serviceLogVo.setId( e.getId() );
        serviceLogVo.setStatus( e.getStatus() );
        serviceLogVo.setServiceId( e.getServiceId() );
        serviceLogVo.setServiceName( e.getServiceName() );
        serviceLogVo.setCallerId( e.getCallerId() );
        serviceLogVo.setCallerIp( e.getCallerIp() );
        serviceLogVo.setCallerDate( e.getCallerDate() );
        serviceLogVo.setCallerHeader( e.getCallerHeader() );
        serviceLogVo.setCallerParam( e.getCallerParam() );
        serviceLogVo.setCallerSoap( e.getCallerSoap() );
        serviceLogVo.setTime( e.getTime() );
        serviceLogVo.setMsg( e.getMsg() );

        return serviceLogVo;
    }

    @Override
    public List<ServiceLogVo> toVO(List<ServiceLogEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<ServiceLogVo> list = new ArrayList<ServiceLogVo>( es.size() );
        for ( ServiceLogEntity serviceLogEntity : es ) {
            list.add( toVO( serviceLogEntity ) );
        }

        return list;
    }

    @Override
    public ServiceLogEntity toEntity(ServiceLogDto d) {
        if ( d == null ) {
            return null;
        }

        ServiceLogEntity serviceLogEntity = new ServiceLogEntity();

        serviceLogEntity.setId( d.getId() );
        serviceLogEntity.setServiceId( d.getServiceId() );
        serviceLogEntity.setCallerId( d.getCallerId() );
        serviceLogEntity.setCallerIp( d.getCallerIp() );
        serviceLogEntity.setCallerDate( d.getCallerDate() );
        serviceLogEntity.setCallerHeader( d.getCallerHeader() );
        serviceLogEntity.setCallerParam( d.getCallerParam() );
        serviceLogEntity.setCallerSoap( d.getCallerSoap() );
        serviceLogEntity.setTime( d.getTime() );
        serviceLogEntity.setMsg( d.getMsg() );
        serviceLogEntity.setStatus( d.getStatus() );

        return serviceLogEntity;
    }

    @Override
    public List<ServiceLogEntity> toEntity(List<ServiceLogDto> ds) {
        if ( ds == null ) {
            return null;
        }

        List<ServiceLogEntity> list = new ArrayList<ServiceLogEntity>( ds.size() );
        for ( ServiceLogDto serviceLogDto : ds ) {
            list.add( toEntity( serviceLogDto ) );
        }

        return list;
    }
}
