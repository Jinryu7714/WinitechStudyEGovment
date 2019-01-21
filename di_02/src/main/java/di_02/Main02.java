package di_02;

import java.io.Closeable;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class Main02 {
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		BeanFactory context = new FileSystemXmlApplicationContext("app_anno.xml");
		
		MyCalc mc = context.getBean("myCalc",MyCalc.class);
		
		int r = mc.plus(3,4); 
		System.out.println( r );
//		
//		MyCalc mc2 = context.getBean(MyCalc.class);
//		System.out.println("mc="+mc);
//		System.out.println("mc2="+mc2);
		
	}
}
