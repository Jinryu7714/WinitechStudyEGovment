package aop_01.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	
	@Before("execution(* sayHello(..))")
	public void before(JoinPoint jp){
		
		String objName = jp.getTarget().getClass().getName();
		
		String name = jp.getSignature().getName();
		
		System.out.println(objName + "."+name+"	메서드 호출전 ");
		
		Object[] args = jp.getArgs();
		
		System.out.println("인자갯수 :" + args.length);
		System.out.println("인자값 :" + (args.length>0 ? args[0] : "없음"));
		
		
	}
	
	@After("execution(* sayHello(..))")
	public void after(){
		System.out.println("메서드 종료");
	}
	@AfterReturning(value = "execution(* sayHello(..))", returning = "r")
	public void after_return(String r){
		System.out.println("메서드 반환값 " + r);
	}
	@Around("execution(* sayHello(..))")
	public String around(ProceedingJoinPoint pjp)throws Throwable{
		long startMillis = System.currentTimeMillis();
		long startNano = System.nanoTime();
		String ret = (String)pjp.proceed();
		long endMillis = System.currentTimeMillis();
		long endNano = System.nanoTime();
		System.out.println("걸린시간: " + (endMillis - startMillis) + "ms");
		System.out.println("걸린시간: " + (endNano - startNano) + "ns");
		
		return ret;
		
	}
}
//
//public class MyAspect {
//	
//	public void before(JoinPoint jp){
//		
//		String objName = jp.getTarget().getClass().getName();
//		
//		String name = jp.getSignature().getName();
//		
//		System.out.println(objName + "."+name+"	메서드 호출전 ");
//		
//		Object[] args = jp.getArgs();
//		
//		System.out.println("인자갯수 :" + args.length);
//		System.out.println("인자값 :" + (args.length>0 ? args[0] : "없음"));
//		
//		
//	}
//	
//	public void after(){
//		System.out.println("메서드 종료");
//	}
//	
//	public void after_return(String r){
//		System.out.println("메서드 반환값 " + r);
//	}
//	
//	public String around(ProceedingJoinPoint pjp)throws Throwable{
//		long startMillis = System.currentTimeMillis();
//		long startNano = System.nanoTime();
//		String ret = (String)pjp.proceed();
//		long endMillis = System.currentTimeMillis();
//		long endNano = System.nanoTime();
//		System.out.println("걸린시간: " + (endMillis - startMillis) + "ms");
//		System.out.println("걸린시간: " + (endNano - startNano) + "ns");
//		
//		return ret;
//		
//	}
//}
