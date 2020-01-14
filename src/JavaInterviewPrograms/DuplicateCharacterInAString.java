package JavaInterviewPrograms;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacterInAString {

	public static void main(String[] args) {
		
		duplicateCharacter("ROHANSHARMA");

	}

	public static void duplicateCharacter(String inputString) {
		// we will create a HashMap containing character as key and its occurance as value

		HashMap<Character, Integer> charCount = new HashMap<>();

		// covert the given array into character array
		
		char [] charArray = inputString.toCharArray();
		
		for (char c : charArray) {
			
			if(charCount.containsKey(c)) {
				// if the charCount contains the key then increment the value of the occurance 
				charCount.put(c, charCount.get(c)+1);
			}
			else {
				// if char is not present in charCount hashmap , then put the character in the hash map with value as 1
				charCount.put(c, 1);
			}
		}
		
		// getting a set containing all the characters in the string 
		Set<Character> charInString = charCount.keySet();
		
		System.out.println("Duplicate characters in the give string - " +inputString);
		
		// iterating throught the set 'charInString'
		
		for (Character ch : charInString) {
			if(charCount.get(ch) > 1) {
				System.out.println(ch+":"+charCount.get(ch));
			}
		}
		
	}

}
