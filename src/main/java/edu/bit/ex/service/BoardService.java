package edu.bit.ex.service;

import java.util.List;

import edu.bit.ex.vo.BoardVO;

public interface BoardService {
	
	public void writeBoard(BoardVO board);
	public void writeReply(BoardVO board);

	public BoardVO get(int bno);
	public int modify(BoardVO board);
	
	public List<BoardVO> getList();
	public int remove(int bId);

}
