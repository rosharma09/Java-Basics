package OOPConceptsPART1;

public class CallByValue {
	
	int a , b ;

	public static void main(String[] args) {
		CallByValue o = new CallByValue();
		int res = o.mul(10, 20);
		System.out.println(res);
	}
	
	public int mul(int x , int y) {
		int z= x*y;
		return z;
	}

}
