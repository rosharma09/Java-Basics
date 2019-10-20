package JavaProgrammingQuestions;

import java.util.Scanner;

public class Factorial {

	static int num;

	public static void main(String[] args) {

		// 5! = 5*4*3*2*1 = 120

		// There are two ways in which we can calculate the factorial of a number
		// 1. Using recurrsive method
		// 2. Using non recurrsive method -- using FOR loop

		System.out.println("***Program to find the factorial***");
		System.out.println("1. Find factorial using non recurrsive method");
		System.out.println("2. Find factorial using recurrsive method");
		System.out.println("Please enter your choice");
		Scanner scan = new Scanner(System.in);
		Scanner scanMain = new Scanner(System.in);
		int choice = scanMain.nextInt();

		switch (choice) {
		case 1:
			choice = 1;
			EnterNumberFunction(choice);
			int res = NonRecurrsiveFact(num);
			System.out.print(num + "!=");
			System.out.println(res);
			break;

		case 2:
			choice = 2;
			EnterNumberFunction(choice);
			int res1= RecurrsiveFact(num);
			System.out.print(num + "!=");
			System.out.println(res1);
			break;
		default:
			System.out.println("Please enter a valid option");
			break;
		}

	}

	public static void EnterNumberFunction(int choice) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number");
		num = scan.nextInt();
	}

	public static int NonRecurrsiveFact(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {

			fact = fact * i;
		}
		return fact;
	}
	
	// recurrsive function : a function calling itself 
	
	public static int RecurrsiveFact(int number) {
		if(number == 0){
			return 1;
		}
		else {
			return (number * RecurrsiveFact(number-1));
		}
	}
}
