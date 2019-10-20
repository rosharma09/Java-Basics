package JavaProgrammingQuestions;

import java.util.Scanner;

public class ArmstrongNumber {

	// Armstrong number : the sum of cube of each digit is equal to the number

	// 153 :
	// 1*1*1 = 1
	// 5*5*5 = 125
	// 3*3*3 = 27
	// 1 + 125 + 27 = 153

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number");
		int number = scan.nextInt();
		IsArmstrongNumber(number);

	}

	public static void IsArmstrongNumber(int NumberEntered) {

		int cube = 0, r, t;
		t = NumberEntered;

		while (NumberEntered > 0) {
			r = NumberEntered % 10;
			NumberEntered = NumberEntered / 10;
			cube = cube + (r * r * r);
		}

		if (cube == t) {
			System.out.println("The number entered is an armstrong number");
		} else {
			System.out.println("The number enetred is not an armstrong number");
		}
	}

}
