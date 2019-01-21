package di_02;



public class Main03 {
	
	
	
	public static void main(String[] args) throws Exception{
		String clsname = "di_02.MyCalc";
		Class cls = Class.forName(clsname);
	
		//Class =  Reflection API . 객체나 클래스의 구조를 제공하는 API
		Object obj =cls.newInstance();
		MyCalc mc = (MyCalc)obj;
		int r = mc.plus(5, 6);
		System.out.println(r);
		
	}
}
