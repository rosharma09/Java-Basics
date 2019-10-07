package JAVA_TRAINING;

public class Loops {

	public static void main(String[] args) {
		
		//loops : iterate the same thing again and again untill some condition is satisfied.
		
		// print first 10 positive integers
		
		// 1. while loop
		
		int i = 1; // intialization
		while(i<=10) // condition
		{
			System.out.println(i);
			i=i+1; // incremental
		}
	
		// to print the table of 2
	
		int x,y;
		x=1;
		y=13;
		
		while(x<=10) {
			System.out.println(y+"*"+x+"="+x*y);
			x=x+1;
		}
		
		// disadvantage of while loop : if the incremental/decremental statement is not given , then while loop will execute for infinite times.
		
		//2. for loop : intialisation , condition and incremental/decremental statement is all specified in the same line seperated by ;
	
		
		for(int j =1 ; j <= 100 ; j++ )
		{
			System.out.println("The value of j is :" +  j);
		}
		
		// print the numbers in reverse order
		
		for (int c = 10 ; c>=-10 ;c--) {
			System.out.print(c);
		}

}
}
