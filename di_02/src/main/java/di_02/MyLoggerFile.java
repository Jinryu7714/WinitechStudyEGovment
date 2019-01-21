package di_02;

import org.springframework.stereotype.Component;

@Component
public class MyLoggerFile implements ILogger{

	public void log(String string) {
		System.out.println("MyLoggerFile : " + string);		
	}
	
}
