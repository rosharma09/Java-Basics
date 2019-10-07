package OOPConceptsPART1;

import java.util.Scanner;

public class WrapperClass {

	public static void main(String[] args) {
		
		// data type conversion
		
		
		// Convert string to int
		String x = "100";
		System.out.println(x+20);
		
		int j = Integer.parseInt(x);
		System.out.println(j+20);
		
		//Convert string to double
		
		String y = "12.1234";
		Double i =Double.parseDouble(y);
		System.out.println(i);
		
		// we do not have any chaaracter parsing in wrapper class
		
		String res = "True";
		Boolean res1 = Boolean.parseBoolean(res);
		System.out.println(res1);
		
		// conversion from int to string
		
		int q = 200;
		System.out.println(q+100);
		String s = String.valueOf(q); // to convert the int data type value into string
		System.out.println(200+s);
		
		/*
		String u = "100A";
		int a = Integer.parseInt(u); // exception thrown since the format is not proper, it should be a proper integer to convert string to int
		System.out.println(a); 
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the age : ");
		String age = scan.nextLine();
		
		System.out.println(age+100);
		
		int age1 = Integer.parseInt(age);
		System.out.println(age1+100);
		
		
	}

}
