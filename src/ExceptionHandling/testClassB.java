package ExceptionHandling;

public class testClassB extends TestClassA{
	
	int a = 100;
	
	@Override
	public void Test() {
		System.out.println("This is child class test method");
		try {
			System.out.println(a/0);
		} catch (ArithmeticException e) {
			System.out.println("Number cannot be divided by ZERO");
		}
		System.out.println("Line after the exception");
	}
}
