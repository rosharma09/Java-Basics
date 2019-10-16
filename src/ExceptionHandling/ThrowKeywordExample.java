package ExceptionHandling;

public class ThrowKeywordExample {

	public static void main(String[] args) throws Exception  {
		
		// Throw : to explicitly throw an exception, we make use of throw keyword
		
		System.out.println("Sample program to throw an exception");
		
		//throw new Exception("An unkownn exception occurred");
		
		// Not a good practise to handle throw with throws keyword, better to use try catch block
		
		String exec_flag="N";
		
		if (exec_flag.equals("N")) {
			try {
				throw new Exception("Executable flag is set to N");
			} catch (Throwable e) {
				System.out.println("Executable flag is set to N");
			}
		}
	}

}
