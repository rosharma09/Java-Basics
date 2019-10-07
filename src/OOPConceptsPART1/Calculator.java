package OOPConceptsPART1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		int res=c.add(10, 20);
		System.out.println(res);
		
		int res1=c.sub(10, 20);
		System.out.println(res1);
		
		int res11=c.mul(10, 20);
		System.out.println(res11);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("MINI CAL");
		System.out.println("Enter a number : ");
		int n = scan.nextInt();
		System.out.println(n);
	}
	
	public int add(int a, int b) {
		System.out.println("the sum of the two numbers are : ");
		int c=a+b;
		return c; 
	}

	public int sub(int a , int b) {
		System.out.println("The difference of the two numbers are :");
		int c = a-b;
		return c;
	}
	
	public int mul(int a , int b) {
		System.out.println("The product of two number is : ");
		int c = a*b;
		return c;
	}
}
