package jdbc_01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import jdbc_01.vo.BoardVO;

public class Main03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new FileSystemXmlApplicationContext("app.xml");

		JdbcTemplate tpl = context.getBean(JdbcTemplate.class);
		
// Scala 형식으로 추출 ( 1개의 데이터만 추출)
		String sql = "select count(*) from board";
		int count = tpl.queryForObject(sql , Integer.class);
		System.out.println("저장 갯수 :" + count);
		sql = "select * from board where no=100";
//		sql = "select * from board where no=200"; // queryForObject는 결과를 한개만 반환 함.
//		sql = "select * from board where no>100";
		RowMapper<BoardVO> rowMapper = new BeanPropertyRowMapper<BoardVO>(BoardVO.class);
		BoardVO boardVO = tpl.queryForObject(sql, rowMapper);
		
		System.out.println("게시물 추출 :" + boardVO.toString());
		System.out.println("제목 :" + boardVO.getTitle());
//
	}

}
