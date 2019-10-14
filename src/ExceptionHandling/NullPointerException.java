package ExceptionHandling;

public class NullPointerException {

	// global variable

	String Test = "TestString";

	public static void main(String[] args) {

		NullPointerException o ;

		try {
			System.out.println(o.Test);
		} catch (Exception e) {
		System.out.println("Object reference variable pointing to NULL");
		}
	}

}
