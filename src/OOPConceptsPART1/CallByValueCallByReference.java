package OOPConceptsPART1;

public class CallByValueCallByReference {
	
	int p , q;  // non static global variables

	public static void main(String[] args) {

		int x=100;
		int y=200;
		// How to achieve call by value and call by reference in JAVA
		// In C language we make use of pointers to achieve call by reference
		
		// Call by value
		CallByValueCallByReference obj1 = new CallByValueCallByReference();
		
		obj1.p=11;
		obj1.q=22;
		
		int res = obj1.testSum(x, y); // we are calling the method by passing value while calling, this is called call by value or pass by value.
		System.out.println(res);
		
		// call the method swap
		
		System.out.println("Before swapping the values");
		System.out.println(obj1.p);
		System.out.println(obj1.q);
		
		obj1.swap(obj1);
		
		System.out.println("After swapping the values");
		System.out.println(obj1.p);
		System.out.println(obj1.q);
		
	}
	
	public int testSum(int a , int b) {
		a=12;
		b=13;
		int c =a+b;
		return c;
		
	}
	
	//CallByValueCallByReference t , where t is the reference variable of class CallByValueCallByReference.
	public void swap(CallByValueCallByReference t) {
		
		int temp;
		temp = t.p;
		t.p=t.q;
		t.q=temp;
		
	}

}
