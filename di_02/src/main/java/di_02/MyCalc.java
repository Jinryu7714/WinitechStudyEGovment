package di_02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyCalc {
	@Autowired
	ILogger logger ;
	
	public void setLogger(ILogger logger) {
		this.logger = logger;
	}
	
	public int plus(int i, int j){
//		logger.log("plus : " +i + "," + j);
		return i + j;
	}
	
}
