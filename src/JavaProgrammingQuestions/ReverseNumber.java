package JavaProgrammingQuestions;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number : ");
		int num = scan.nextInt();
		NumberRevserse(num);
	}

	public static void NumberRevserse(int Number) {
		int r;
		int sum = 0;
		int t = Number;
		String str = "THIS IS JUST A PROGRAM TO REVERESE THE NUMBER";

		while (Number > 0) {
			r = Number % 10;
			sum = (sum * 10) + r;
			Number = Number / 10;
		}

		System.out.println("Reversed number is :" + sum);
		System.out.println(str.toUpperCase());
		
	}

}
