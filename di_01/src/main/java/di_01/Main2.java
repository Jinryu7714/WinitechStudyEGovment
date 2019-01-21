package di_01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		BeanFactory context = new FileSystemXmlApplicationContext("app.xml");
		
//		HelloService hs = (HelloService)context.getBean("hs");
//		HelloService hs = context.getBean("hs", HelloService.class);
		IHelloSVC hs = context.getBean(IHelloSVC.class);

		String say = hs.sayHello("김석진");
		
		System.out.println( say ); // Hello 김석진
	}

}
