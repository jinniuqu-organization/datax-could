package cn.datax.service.data.visual.mapstruct;

import cn.datax.service.data.visual.api.dto.BoardDto;
import cn.datax.service.data.visual.api.entity.BoardEntity;
import cn.datax.service.data.visual.api.entity.ChartEntity;
import cn.datax.service.data.visual.api.vo.BoardVo;
import cn.datax.service.data.visual.api.vo.ChartVo;
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
public class BoardMapperImpl implements BoardMapper {

    @Override
    public BoardDto toDTO(BoardEntity e) {
        if ( e == null ) {
            return null;
        }

        BoardDto boardDto = new BoardDto();

        boardDto.setId( e.getId() );
        boardDto.setBoardName( e.getBoardName() );
        boardDto.setBoardThumbnail( e.getBoardThumbnail() );
        boardDto.setBoardConfig( e.getBoardConfig() );

        return boardDto;
    }

    @Override
    public List<BoardDto> toDTO(List<BoardEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<BoardDto> list = new ArrayList<BoardDto>( es.size() );
        for ( BoardEntity boardEntity : es ) {
            list.add( toDTO( boardEntity ) );
        }

        return list;
    }

    @Override
    public BoardVo toVO(BoardEntity e) {
        if ( e == null ) {
            return null;
        }

        BoardVo boardVo = new BoardVo();

        boardVo.setId( e.getId() );
        boardVo.setStatus( e.getStatus() );
        boardVo.setCreateTime( e.getCreateTime() );
        boardVo.setRemark( e.getRemark() );
        boardVo.setBoardName( e.getBoardName() );
        boardVo.setBoardThumbnail( e.getBoardThumbnail() );
        boardVo.setBoardConfig( e.getBoardConfig() );
        boardVo.setCharts( chartEntityListToChartVoList( e.getCharts() ) );

        return boardVo;
    }

    @Override
    public List<BoardVo> toVO(List<BoardEntity> es) {
        if ( es == null ) {
            return null;
        }

        List<BoardVo> list = new ArrayList<BoardVo>( es.size() );
        for ( BoardEntity boardEntity : es ) {
            list.add( toVO( boardEntity ) );
        }

        return list;
    }

    @Override
    public BoardEntity toEntity(BoardDto d) {
        if ( d == null ) {
            return null;
        }

        BoardEntity boardEntity = new BoardEntity();

        boardEntity.setId( d.getId() );
        boardEntity.setBoardName( d.getBoardName() );
        boardEntity.setBoardThumbnail( d.getBoardThumbnail() );
        boardEntity.setBoardConfig( d.getBoardConfig() );

        return boardEntity;
    }

    @Override
    public List<BoardEntity> toEntity(List<BoardDto> ds) {
        if ( ds == null ) {
            return null;
        }

        List<BoardEntity> list = new ArrayList<BoardEntity>( ds.size() );
        for ( BoardDto boardDto : ds ) {
            list.add( toEntity( boardDto ) );
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
