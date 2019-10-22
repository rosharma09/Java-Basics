package JavaProgrammingQuestions;

import java.util.Scanner;

public class ArmstrongNumberConceptPractice {
	
	static int num;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		try {
			num = scan.nextInt();
		} catch (Throwable e) {
			System.out.println("Please enter a valid number");
		}
		
		boolean res = IsArmstrongNumber(num);
		
		if(res == true) {
			System.out.println("The number  "+num+" is armstrong");
		}
		else {
		System.out.println("The number  "+num+" is not armstrong");
		}
	}

	public static boolean IsArmstrongNumber(int number) {
		int r;
		int sum = 0;
		int t = number;

		while (number > 0) {
			r = number % 10;
			sum = sum + (r * r * r);
			number = number / 10;
		}
		if (sum == t) {
			return true;
		} else
			return false;
	}
}
