package di_02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main01 {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		BeanFactory context = new FileSystemXmlApplicationContext("app.xml");
		
		MyCalc mc = context.getBean(MyCalc.class);
		
		int r = mc.plus(3,4); 
		System.out.println( r );
		
		MyCalc mc2 = context.getBean(MyCalc.class);
		System.out.println("mc="+mc);
		System.out.println("mc2="+mc2);
	}
}
