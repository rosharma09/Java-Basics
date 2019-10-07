package JAVA_TRAINING;

public class Array2D {

	private static final String NULL = null;

	public static void main(String[] args) {
		
		// 2D array concept - used to store the values in rows and columns format
		// we have rows and columns are available
		// indexes are (0,0), (0,1) and so on 
		
		String X[][] = new String[4][5];
		System.out.println("The number of rows in the 2D array are : " +X.length);  //length() method will return the number of rows in the 2D array 
		
		// To get the number of columns in the 2D array we use
		
		System.out.println("The number of columns in the 2D array are : " +X[0].length);
		
		// Intialise the value of the 2D array
		
		X[0][0]="ROHAN";
		X[0][1]="SHARMA";
		X[0][2]="WHAT ARE YOU DOING";
		
		for(int row=0 ; row<X.length;row++)
		{
			for(int col = 0 ; col< X[row].length;col++)
			{
				if (X[row][col] != NULL)
				System.out.println(X[row][col]);
			}
		}
		
		// NOTE : row = array[].length() , col = array[0].length()
		
		// we can write the arrays in different way as well
		
		int [][]a = new int[2][2];
		
		String A[][] = new String[2][2];
		A[0][0]="TEST";
		
		System.out.println("The number of rows in array is : " +A[0].length);
	}

}
