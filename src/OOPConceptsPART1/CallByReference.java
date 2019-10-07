package OOPConceptsPART1;

public class CallByReference {

	public static void main(String[] args) {
		
		CallByReference o = new CallByReference();
		int res = o.mul(o); // calling method by object reference variable of the class
		System.out.println(res);

		
	}
	
	public int mul(CallByReference c) {
		int a = 100;
		int b = 12;
		return a+b;
	}

}
