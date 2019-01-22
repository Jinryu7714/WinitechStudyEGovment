package aop_01;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceKo {
//	public class HelloServiceKo implements IHelloSVC {
	
	public String sayHello(String string) {

		return "안녕하세요. " + string;
	}

}
