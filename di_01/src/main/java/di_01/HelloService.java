package di_01;

public class HelloService implements IHelloSVC {

	/* (non-Javadoc)
	 * @see di_01.IHelloSVC#sayHello(java.lang.String)
	 */
	@Override
	public String sayHello(String string) {

		return "Hello " + string;
	}

}
