package JavaInterviewPrograms;

import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String inputstr = scan.nextLine();

		System.out.println("Input String : " + inputstr);
		String outptStr1 = removeWhiteSpaceUsingInBuiltMethod(inputstr);
		System.out.println(outptStr1);

		System.out.println("Input String : " + inputstr);
		String OutptStr2 = removeWhiteSpaceWithoutUsingInBuiltMethod(inputstr);
		System.out.println(OutptStr2);
	}

	static String removeWhiteSpaceUsingInBuiltMethod(String str) {
		String outputStr = str.replaceAll("\\s+", "");
		return outputStr;
	}

	static String removeWhiteSpaceWithoutUsingInBuiltMethod(String str) {
		char[] inputArray = str.toCharArray();

		String stringWithoutSpace = "";

		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] != ' ' && inputArray[i] != '\t') {
				stringWithoutSpace = stringWithoutSpace + inputArray[i];
			}

		}

		return stringWithoutSpace;
	}
}
