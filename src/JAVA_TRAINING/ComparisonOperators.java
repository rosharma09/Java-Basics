package JAVA_TRAINING;

public class ComparisonOperators {

	public static void main(String[] args) {
		
		int a = 2000;
		int b = 2000;
		
		if(a<b)
		{
		System.out.println("a is smaller than b");
		}
		else if(a>b)
		{
			System.out.println("a is greater than b");
		}
		
		else if (a==b){
			System.out.println("a and b are equal");
		}
		
		//Comparison operators 
		// < , > , <= , >= , == , != 

		// Write a logic to find the highest number among three given numbers
		
		int x,y,z;
		x=1000;
		y=1000;
		z=1000;
		
		if(x>y & x>z) {
			System.out.println("x is the greatest");
		}
		
		if(y>x & y>z) {
			System.out.println("y is the greatest");
		}
		
		else if(z>x & z>y) {
			System.out.println("z is the greatest");
		}
		
		else {
			System.out.println("All are equal");
		}
			
		
		

}
}
