package ExceptionHandling;

public class ThrowKeywordStackTrace {

	public static void main(String[] args) throws ArithmeticException{
		ThrowKeywordStackTrace obj = new ThrowKeywordStackTrace();
		obj.A(); // calling function

		try {
			System.out.println("TEST1 " + "\n" +"Test 2 ");
		}catch (Exception e) {
			System.out.println("Exception caught");
		}
	}

	public void A() throws ArithmeticException {
		B(); // called function
	}

	public void B() throws ArithmeticException {
		try {
			C(); // called function
		} catch (ArithmeticException e) {
			System.out.println("Exception caught");
			System.out.println("Number cannot be divided by zero");
		}
	}

	public void C() throws ArithmeticException {
		int i = 100;
		i = i / 0; // exeception
		System.out.println("TEST");
	}

}
