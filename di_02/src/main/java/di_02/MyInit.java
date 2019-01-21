package di_02;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class MyInit {
	
	@PostConstruct
	public void after_init(){
		System.out.println("*** 초기화 끝. 서버 시작  ***");
	}
	
	@PreDestroy
	public void before_end(){
		System.out.println("*** 서버  종료  ***");
	}
	
	
	
}
