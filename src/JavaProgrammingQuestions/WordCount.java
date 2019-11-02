package JavaProgrammingQuestions;

import java.io.File;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class WordCount {

	public static String str, wordToBeCounted;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the string");
		try {
			str = scan.nextLine();
		} catch (Throwable e) {
			System.out.println("Please enter a string");
		}

		System.out.println("Please enter the word for which you want the count value to be displayed");
		try {
			wordToBeCounted = scan.nextLine();
		} catch (Throwable e) {
			System.out.println("Please enter a word");
		}
		
		count(str, wordToBeCounted);

	}

	public static void count(String S1 , String S2) {

		int counter = 0;
		String splitArray[] = S1.split(" ");
				
		for(String word : splitArray) {
			if(word.equals(wordToBeCounted)) {
				counter=counter+1;
			}
			else 
				break;
		}
		System.out.println("Occurance of the entered word is in the given sentance: " +counter);

	}

}
