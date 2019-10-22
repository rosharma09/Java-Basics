package JavaProgrammingQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInAString {

	// java is the best programming language please learn java as it is important

	public static void main(String[] args) {
		
		findDuplicateWords("java is is the best the best programming language please learn java as it is important");

	}

	public static void findDuplicateWords(String inputString) {

		// step 1 : is to split the given string, we are going to use the split method

		String splitArray[] = inputString.split(" ");

		// step 2 : create a hash map

		Map<String, Integer> wordCount = new HashMap<String, Integer>();

		// To check the occurance of each word

		for (String word : splitArray) {
			// if word is present in the array
			if (wordCount.containsKey(word)) {
				wordCount.put(word.toLowerCase(), wordCount.get(word) + 1);
			}

			else {
				wordCount.put(word, 1);
			}
		}
		
		//extracting the occurance of all the words
		
		Set<String> WordsInString = wordCount.keySet();
		
		// loop through all the words in word count 
		
		for(String word : WordsInString) {
			if(wordCount.get(word)>1) {
				System.out.println(word + " : " + wordCount.get(word));
			}
		}
	}

}
