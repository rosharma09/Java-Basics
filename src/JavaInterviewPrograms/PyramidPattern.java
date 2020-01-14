package JavaInterviewPrograms;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many rows you want in your pyramid ?");
		
		int numRows = scan.nextInt();
		
		// Intializing the row count as 1 
		
		int rowCount = 1;
		
		System.out.println("Here is the pyramid");
		
		// logic to print the pyramid : 
		
		for (int i = numRows ; i > 0 ; i--) {
			// printing i spaces at the begining of each row
			for (int j =1 ;  j<=1 ; j++) {
				System.out.println(" ");
			}
			
			// printing rowCount value row count times at each row 
			
		}
	}

}
