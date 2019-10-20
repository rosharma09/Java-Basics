package JavaProgrammingQuestions;

import java.util.Scanner;

public class PalindromeCheck {

	// Palindrome number : 151 , 656

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("NUMBER : ");
		int num = scan.nextInt();
		CheckPalindrome(num);

	}

	public static void CheckPalindrome(int x) {

		int r = 0;
		int sum = 0;
		int t;

		t = x; // give the value to temp variable t

		while (x > 0) {
			r = x % 10; // get the remaineder
			sum = (sum*10) + r;
			x = x / 10;
		}
		
		if (t == sum) {
			System.out.println("The number is a palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}

	}

}
