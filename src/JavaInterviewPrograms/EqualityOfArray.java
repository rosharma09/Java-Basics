package JavaInterviewPrograms;

import java.util.Arrays;

public class EqualityOfArray {

	public static void main(String[] args) {

		int[] array1 = new int[] { 1, 2, 3, 4 };
		int[] array2 = new int[] { 1, 4, 3, 2 };

		// in case the two arrays have the values but at different positions then we can
		// use Arrays.sort() method to sort the array first and then check if the arrays
		// are equal or not

		Arrays.sort(array1);
		Arrays.sort(array2);

		Boolean isEqual = true;

		// compare the length

		if (array1.length == array2.length) {
			for (int i = 0; i < array1.length; i++) {
				if (array1[i] != array2[i]) {
					isEqual = false;
				}
			}
		}

		else {
			isEqual = false;
		}

		if (isEqual) {
			System.out.println("The two arrays are equal");
		} else {
			System.out.println("The two arrays are not equal");
		}

		// we can also use the Arrays.equals() method to compare the two arrays

		char array3[] = new char[] { 'a' , 'b' , 'd' , 'f'};
		char array4[] = new char[] { 'p' , 'b' , 'd' , 'f'};
		
		System.out.println("Array equal : " +Arrays.equals(array3, array4));
	}

}
