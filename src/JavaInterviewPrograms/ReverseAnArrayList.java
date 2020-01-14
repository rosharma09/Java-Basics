package JavaInterviewPrograms;

import java.util.ArrayList;

public class ReverseAnArrayList {

	public static void main(String[] args) {
		
		String inputString = "This is just a sample program to illustrate the reversal of a string";
		String[] list = inputString.split(" ");
		String[] listReverse = new String[list.length];
		
		for (int i = list.length-1 ; i >=0 ; i--) {
			for (int j = 0 ; j<inputString.length() ; j++) {
				listReverse[j] = list[i];
				}
			}
		
		System.out.println("Reversed string : ");
		for (int k = 0 ; k< listReverse.length; k++) {
			System.out.print(listReverse[k]+"");
		}
		}
	}

