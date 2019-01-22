package jdbc_01;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new FileSystemXmlApplicationContext("app.xml");

		JdbcTemplate tpl = context.getBean(JdbcTemplate.class);
		
		String sql = "INSERT INTO board(title,writer,content,regdate)";
		sql += "VALUES(?,?,?,now())";
		tpl.update(sql , "insert test", "유저2", "insert 테스트" );
		System.out.println("End");
	}
}
