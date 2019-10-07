package JAVA_TRAINING;

public class StringConcat {

	public static void main(String[] args) {
		
		// + is a string concatination operator
		
		int a =100;
		int b=200;
		
		String x="HELLO";
		String y="WORLD";
		
		System.out.println(x+y);
		System.out.println(a+b);
		
		System.out.println(a+b+x+y);
		System.out.println(a+x+b+y);
		
		System.out.println("HEY IM ROHAN" + "WHAT ARE YOU DOING" + (a+b));
		
		double c= 100.1001;
		System.out.println(x+c);
		
		int x1 = 100;
		int x2= 200;
		
		int ans=x1+x2;
		System.out.println("The value of a+b is : "+ans);
		
		System.out.println("the value of a and b is :" +a+ " and " +b);
		
		// Difference between println and print 
		// println - line new
		//Print - same line
		
		
		System.out.println("THIS IS AN EXAMPLE"); // print on a new line on the console
		System.out.print("To understand println and print"); // just print on the console
		
		
		
	
	}

}
