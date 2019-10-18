package JavaProgrammingQuestions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumber {
	
	// 2 is the lowest prime number 
	// 3 is the primer number 
	
	static int num;

	public static void main(String[] args) {
		
		while(true) {
			@SuppressWarnings("resource") // to suppress the warnings in the code we can use @suppressWarnings
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the number : ");
			try {
				 num = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Please enter a number");
				e.printStackTrace();
				System.exit(0);
			}
			
			Boolean res = PrimeNumberValidation(num);
			System.out.println(res);
			
			if(res == true) {
				System.out.println("Number entered is Prime ");
			}

			else {
				System.out.println("Number entered is Not a Prime");
			}
		}
	}
	
	public static boolean PrimeNumberValidation(int x) {
		if(x <= 1) {
			return false;
		}
		
		for(int i = 2 ; i < x ; i++) {
			if(x % 2 == 0) {
				return false;
			}	
		}
		return true;
	}

}
