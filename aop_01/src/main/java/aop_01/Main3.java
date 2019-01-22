package aop_01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		BeanFactory context = new FileSystemXmlApplicationContext("app_anno.xml");
		
//		IHelloSVC hs = context.getBean(IHelloSVC.class);
		HelloServiceKo hs = context.getBean(HelloServiceKo.class); 
		//  타겟 클래스가 인터페이스를 호출할 경우 implements 를  할경우 위에 클래스를 불러야 한다.

		String say = hs.sayHello("김석진");
		
		System.out.println( say ); // Hello 김석진
		
		String hsName = hs.getClass().getName();
		
		System.out.println( "hsName" + hsName);
	}

}
