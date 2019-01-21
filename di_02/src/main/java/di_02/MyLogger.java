package di_02;

import org.springframework.stereotype.Component;

//@Component
public class MyLogger implements ILogger {

	/* (non-Javadoc)
	 * @see di_02.ILogger#log(java.lang.String)
	 */
	@Override
	public void log(String string) {
		System.out.println("MyLogger : " + string);		
	}
	
}
