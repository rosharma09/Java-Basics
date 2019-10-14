package ExceptionHandling;

public class testClassB extends TestClassA{
	
	int a = 100;
	
	@Override
	public void Test() {
		super();
		System.out.println("This is child class test method");
		System.out.println(a/0);
	}
}
