package ExceptionHandling;

public class ExceptionHandlingConcept {

	int a = 10;
	static ExceptionHandlingConcept obj;

	public static void main(String[] args) {

		// int i = 9/0;
		// System.out.println(i); // Uncaught exception, since eclipse is not showing
		// this error and we get the error only in case when we excute the program

		// caught exception : Immediately it will give that this will throw an exception

		// Thread.sleep(10); this is an example of caught exception

		// System.out.println(obj.a);

		// Types of exception handling

		// 1. Try-catch block

		try {

			int i = 100 / 0;
			System.out.println(i);

		} catch (ArithmeticException e) {
			System.out.println("Number cannot be divided by ZERO"); // The purpose of handling the exception is to
																	// prevent the program from termination
			
			e.printStackTrace(); // to display the exception that is encountered 
		}
		
		System.out.println("this is the line after the try catch block");
		

		try {
			int test = 100/0;
			System.out.println(test);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());	
		}
	}

}
