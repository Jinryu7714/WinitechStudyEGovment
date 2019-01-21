package di_01;

public class Main01 {

	public static void main(String[] args) {
		IHelloSVC hs = new HelloService();
		
		String say = hs.sayHello("김석진");
		
		System.out.println( say ); // Hello 김석진
	}

}
