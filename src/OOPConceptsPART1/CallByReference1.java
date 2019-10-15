package OOPConceptsPART1;

public class CallByReference1 {
	
	int p , q;

	public static void main(String[] args) {
		CallByReference1 o = new CallByReference1();
		o.p=10;
		o.q=20;
		o.swap(o);
		
	}

	public void swap (CallByReference1 t) {
		int temp;
		temp = t.p;
		t.p=t.q;
		t.q=temp;
		System.out.println(t.p);
		System.out.println(t.q);
	}
}
