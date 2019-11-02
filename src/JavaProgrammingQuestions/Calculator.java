package JavaProgrammingQuestions;

import java.util.Scanner;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Calculator implements SampleCalculator {

	// global variable

	static int res;
	static int num1, num2, choice;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("###Sample Calculator###");

		System.out.println("1. ADD");
		System.out.println("2. SUBSTRACT");
		System.out.println("3. MULTIPLY");
		System.out.println("4. DIVIDE");

		System.out.println("Please enter your choice");
		try {
			choice = scan.nextInt();
		} catch (Throwable e) {
			System.out.println("Please enter a valid value from the above options !! \n");
		}

		switch (choice) {
		case 1:
			choice = 1;

			System.out.println("Please enter 1st Number : ");
			num1 = scan.nextInt();
			
			System.out.println("Please enter 2nd Number : ");
			num2 = scan.nextInt();
			
			AddressHelper.

			break;

		default:
			break;
		}

	}

	// 1. Method to add two variables
	public void add(int a, int b) {
		res = a + b;
		System.out.println(res);
	}

	// 2. Mehtod to substract two variables
	public void substract(int a, int b) {

		res = a - b;
		System.out.println(res);

	}

	// 3. Mehtod to multiple two variables
	public void multiply(int a, int b) {
		res = a * b;
		System.out.println(res);
	}

	// 4. Mehtod to divide two variables
	public void division(int a, int b) {
		res = a / b;
		System.out.println(res);
	}

}
