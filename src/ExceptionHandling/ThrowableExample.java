package ExceptionHandling;

public class ThrowableExample {

	public static void main(String[] args) throws ArithmeticException {

		ThrowableExample o = new ThrowableExample();
		o.Test();

	}

	public void Test() throws ArithmeticException {
		A();
	}

	public void A() throws ArithmeticException {
		try {
			System.out.println(10 / 0);
		} catch (Throwable t) {
			System.out.println("Exception caught");
			System.out.println("Line after exception");
		}
	}
}
