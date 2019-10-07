package OOPConceptsPART1;

public class Functions {

	// Main method is the starting point of execution
	public static void main(String[] args) {
		
		// In order to call the non static method of any class we need to use the object of the class 
		
		Functions f = new Functions(); // New object is created and f is the object reference variable for the object 
		
		// After creating the object , copy of all the NON-STATIC methods will be given to the object 
		//NOTE : the static method is not given to the object 
		
		// Interview Ques : why main method is void?
		// The main method return type is void since we do not return any value from the main function
		
		// calling TEST1 function
		f.TEST1();
		
		// calling TEST2 function
		int S1=f.TEST2();
		System.out.println(S1);
		
		// calling TEST3 function
		String S2=f.TEST3();
		System.out.println(S2);
		
		//calling the division method
		
		int res = f.DIV(100, 9);
		System.out.println("The result of division operation is : " +res);
		
	}

		// Non-static function/Methods
		
		// Type of functions
		/*
		 * 1. No input No output
		 * 2. No input some output
		 * 3. Some input No output
		 */
	
		//1. No input no output : return type is void(No output)
		
		public void TEST1() {
			
			System.out.println("This is a test function");
			
		}

		//2 . no input some output : return type is int 
		
		public int TEST2() {
			
			System.out.println("This is a test function");
			int a=10;
			int b=20;
			int c=a+b;
			return c;  // To get the output from the function we need to use the return keyword
			
		}
		
		public String TEST3() {
			System.out.println("This is a test function");
			String S = "SELENIUM";
			return S;
		}
		
		//3. Some input some output
		// int x,y are the inputs to the function
		
		public int DIV(int x , int y) {
			System.out.println("This is a division method");
			int d=x/y;
			return d;
		}
}
