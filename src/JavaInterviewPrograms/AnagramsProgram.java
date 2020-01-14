package JavaInterviewPrograms;

import java.util.Arrays;

public class AnagramsProgram {

	public static void main(String[] args) {

		isAnagram("Mother In Law", "Hitler Woman");

		isAnagram("keEp", "peeK");

		isAnagram("SiLeNt CAT", "LisTen AcT");

		isAnagram("Debit Card", "Bad Credit");

		isAnagram("School MASTER", "The ClassROOM");

		isAnagram("DORMITORY", "Dirty Room");

		isAnagram("ASTRONOMERS", "NO MORE STARS");

		isAnagram("Toss", "Shot");

		isAnagram("joy", "enjoy");

	}

	public static void isAnagram(String s1, String s2) {
		// The first step is to remove all the spaces from the string

		String copyOfS1 = s1.replaceAll("\\s", "");
		String copyOfS2 = s2.replaceAll("\\s", "");

		// intailly setting the status as true

		boolean status = true;

		if (copyOfS1.length() != copyOfS2.length()) {
			status = false;
		}

		else {

			// changing the case of characters of both array and storing them in a character
			// array

			char[] charArrayS1 = copyOfS1.toLowerCase().toCharArray();
			char[] charArrayS2 = copyOfS2.toLowerCase().toCharArray();

			Arrays.sort(charArrayS1);
			Arrays.sort(charArrayS2);

			// to check whether these two arrays are equal or not

			status = Arrays.equals(charArrayS1, charArrayS2);

		}

		if (status) {
			System.out.println("The two strings are anagrams");
		}

		else {
			System.out.println("The two strings are not anagrams");
		}
	}

}
