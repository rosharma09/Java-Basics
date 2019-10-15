package ExceptionHandling;

public class ThrowableExample {

	public static void main(String[] args) throws ArithmeticException {
		
		// Keywords : try-catch , throws , throwable , throw

		// THrowable is the super class of error and exception in JAVA lang
		// we use throwable in case to handle any error or exception, its a good
		// practise to use throwable
		// there are many exception classes in java [NullPoiter
		// exception,arrayOutOfBound]
		
		// IMP : object is the super class of all the classes

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
