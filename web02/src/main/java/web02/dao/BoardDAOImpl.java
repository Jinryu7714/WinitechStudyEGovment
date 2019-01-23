package web02.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import web02.vo.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insert(BoardVO vo) {
		String sql = "INSERT INTO board(title,writer,content,regdate)";
		sql += "VALUES(?,?,?,now())";
		jdbcTemplate.update(sql , vo.getTitle(), vo.getWriter(), vo.getContent());
	}

	public List<BoardVO> boardlist() {
		String sql = "SELECT * FROM board order by no desc";
		RowMapper<BoardVO> rowMapper = new BeanPropertyRowMapper<>(BoardVO.class);
		List<BoardVO> list = jdbcTemplate.query(sql, rowMapper);
		return list;
	}

	@Override
	public BoardVO boardJoin(Integer vo) {
//		String sql = "SELECT * FROM board where no = ?";
		
		return null;
	}

	
	
}
