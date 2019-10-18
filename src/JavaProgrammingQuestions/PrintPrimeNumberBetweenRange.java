package JavaProgrammingQuestions;

import java.util.Scanner;

public class PrintPrimeNumberBetweenRange {
	
	static int From , To ;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("***Enter the Range***\n");
		System.out.println("From : ");
		From = scan.nextInt();
		System.out.println("To :");
		To = scan.nextInt();
		PrintPrimeNumbers(From, To);
	}
	
	public static void PrintPrimeNumbers(int x , int y) {
		for (int i = x ; i <= y ; i++) {
			
			if(i==1) {
				System.out.println();
			}
			
			if(PrimeNumberValidation(i)) {
				System.out.print(i+" ");
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
