package jdbc_01;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new FileSystemXmlApplicationContext("app.xml");
		
		DataSource ds = context.getBean("mysql-ds", DataSource.class);
		
		Connection conn = ds.getConnection();
			
		System.out.println("DB 연결!");
	}

}
