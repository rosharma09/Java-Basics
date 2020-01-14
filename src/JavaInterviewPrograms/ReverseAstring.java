package JavaInterviewPrograms;

import java.util.Scanner;

public class ReverseAstring {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to be reversed :");
		String stringToBereversed = scan.nextLine();
		
		ReverseStringUsingCharArray(stringToBereversed);
		ReverseStringUsingStringBuffer(stringToBereversed);
		ReverseStringUsingReccursiveMethod(stringToBereversed);
	}

	// Method to reveser a string using string buffer
	static String ReverseStringUsingStringBuffer(String str) {
		
		StringBuffer strBuff = new StringBuffer(str);
		return strBuff.reverse().toString();
	}
	
	// Method to reverse a string using iterative method
	static void ReverseStringUsingCharArray(String str) {
		char [] charArray = str.toCharArray();
		for(int i = str.length()-1 ; i>=0 ; i--) {
			System.out.print(charArray[i]);
		}
	}
	
	// method to reverse a string using recurrsive method 
	
	static String ReverseStringUsingReccursiveMethod(String str) {
		if(str == null || str.length()>=1) {
			return str;
		}
		return ReverseStringUsingReccursiveMethod(str.substring(1))+str.charAt(0);
	}
}