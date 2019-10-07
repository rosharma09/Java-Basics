package JAVA_TRAINING;

import java.util.Scanner;

public class ArrayConcept {

	private static final int length = 0;

	public static void main(String[] args) {
		
		
		// 1D arrays - have only rows 
		// Array : it is a derived data type used to store similar data types
		int i = 20;
		
		int a[] = new int[4]; // to declare a static array of type int and can store upto 4 values.
		
		 a[0]=10;
		 a[1]=10;
		 a[2]=10;
		 a[3]=10;
		// a[4]=10; // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4 , when the size of array defined is less.
		 
		 System.out.println(a[0]);
		
		 //if size of array is 4 , then the max index of array is n-1.
		 
		 int j[]=new int[10];
		 j[1]=1000;
		 j[1]=2000;
		 
		 System.out.println(j[1]);
		 
		 
		 // To get the length of the array , we can use the length function. variable_name.length.
		 
		 System.out.println(a.length);
		 System.out.println(j.length);
		 
		 
		 // to display all the elements of the array , we can make use of the for loop
		 
		 for (int b=0 ; b < a.length-1 ; b++ )
			 
		 {
			 System.out.println(a[b]);
		 }
		 
		 double d[] = new double[5];
		 d[0]=10.12;
		 d[1]=40.442;
		 d[2]=120.143;
		 d[3]=110.12;
		 d[4]=150.12;
		 
		 for(int e=0; e<d.length-1 ; e++) {
			 System.out.println(d[e]);
		 }
		 
		 
		 char t[]=new char[2];
		 
		 t[0]='a';
		 t[1]='r';
		 
		 System.out.println(t[0]);
		 
		String[] S2 = new String[2];
		S2[0]="Rohan";
		S2[1]="Sharma";
		
		System.out.println(S2[0]);
		System.out.println(S2[1]);
		
		// Imp notes 
		//Advantages of array
		//1 . Can be used to store different values of similar data type in using the same variable
		
		// Disadvantages
		// 1. Size of the array is fixed - we use collections to overcome the disadvantage of fixed array size (arraylist, hash table , dynamic array)
		// 2. Can be used to store only similar data type - we use object array to overcome the disadvantage of storing similar datatype
		
		// Object array concept : This is used to store values that are of different data type
		
		Object obj[] = new Object[5]; // declaration of an object array oooooooo
		obj[1]=1;  // intailisation of obect array
		obj[2]="Rohan";
		obj[3]=19.19;
		obj[4]='A';
		
		for(int k = 0; k<obj.length;k++)
		{
			System.out.println(obj[k]);
		}
		
		
	
	}

}
