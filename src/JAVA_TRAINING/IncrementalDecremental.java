package JAVA_TRAINING;

public class IncrementalDecremental {

	public static void main(String[] args) {
		
		// post incremental
		
		int i=10;
		System.out.println(i);
		int j=i++;
		System.out.println(j);
		
		System.out.println(i);
		System.out.println(j);
		
		//pre incremental
		
		int a=20;
		System.out.println(a);
		int b=++a;
		System.out.println(b);
		
		// post decrement
		
		int c=100;
		int d=c--;
		System.out.println(c);
		System.out.println(d);
		
		// pre decrement
		
		int e=21;
		int f=--e;
		System.out.println(e);
		System.out.println(f);
		
	}

}
