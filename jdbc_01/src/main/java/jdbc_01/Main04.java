package jdbc_01;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import jdbc_01.vo.BoardVO;


public class Main04 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new FileSystemXmlApplicationContext("app.xml");

		JdbcTemplate tpl = context.getBean(JdbcTemplate.class);
		
// Vector 형식으로 추출 ( 여러개의 칼럼을 가져옴)
		String sql = "select no from board";
		
		List<Integer> list = tpl.queryForList(sql, Integer.class);
		for (Integer i : list) {
			System.out.println("No = " + i);
		}
		sql = "select title from board";
		 
		
		List<String> list2 = tpl.queryForList(sql, String.class);
		for (String t : list2) {
			System.out.println("Title = " + t);
		}
		
		sql = "select * from Board Order By no desc";
		RowMapper<BoardVO> rowMapper = new BeanPropertyRowMapper<>(BoardVO.class);
//		RowMapper<BoardVO> rowMapper = new RowMapper<BoardVO>() {
//			@Override
//			public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
//				BoardVO vo = new BoardVO();
//				vo.setContent(rs.getString("content"));
//				vo.setWriter(rs.getString("writer"));
//				vo.setTitle(rs.getString("title"));
//				vo.setNo(rs.getInt("no"));
//				vo.setRegdate(rs.getDate("regdate"));
//				return vo;
//			}
//		};
		List<BoardVO> list3 = tpl.query(sql, rowMapper);
		for (BoardVO boardVO : list3) {
			System.out.println("게시물"+boardVO);
		}
		
	}
}
