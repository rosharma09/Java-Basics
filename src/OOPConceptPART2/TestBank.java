package OOPConceptPART2;

public class TestBank {

	public static void main(String[] args) {
		
		//USBank ub = new USBank(); // we cannot create the object of USBank[Interface]
		
		//USBank.min_bal=200; // the variable is final, and the value cannot be changed
		
		HDFCBank b = new HDFCBank(); 
		b.credit();
		b.debit();
		b.transaction();
		b.HDFChouseloan();
		b.HDFCstudyload();
		
		// Dynamic polymorphism : Child class object can be refernced by parent interface reference variable
		
		USBank u = new HDFCBank(); // the child class object is referenced by parent class interface variable
		u.credit();
		u.debit();
		u.transaction();
		//u.HDFChouseloan();  we cannot use the methods of the child class, we can call only overidden methods
		
		// If a class is implementing any interface, then it is mandatory to define or override all the methods of the interface.
		
		System.out.println(USBank.min_bal);
		
		b.MutaulFunds();
	}

}
