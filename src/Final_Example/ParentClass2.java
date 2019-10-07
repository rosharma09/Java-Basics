package Final_Example;

public class ParentClass2 {

	public final void  add() { 
		
		// we can make the method as final, so that we cannot override the method of the parent class
	
		
		int a = 10;
		int b =20;
	    int c = 100;
		
		for(int x = 0 ; x < 100 ; x++ ) {
			int res=a+b+c;
			c=res;
			System.out.println(res);
		}
	}
}
