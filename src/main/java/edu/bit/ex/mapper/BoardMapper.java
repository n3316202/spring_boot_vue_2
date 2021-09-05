package edu.bit.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.bit.ex.vo.BoardVO;

@Mapper
public interface BoardMapper {

	public List<BoardVO> getList();
	
	public BoardVO read(int bno);
	
	public void updateShape(BoardVO boardVO);
		
	public void insertReply(BoardVO boardVO);
	
	public void insertBoard(BoardVO boardVO);

	public int delete(int bId);
	
	public int updateBoard(BoardVO boardVO);
	

}