package web02.dao;

import java.util.List;

import web02.vo.BoardVO;

public interface BoardDAO {
	public void insert(BoardVO vo);
	
	public List<BoardVO> boardlist();
	
	public BoardVO boardJoin(Integer no);
}
