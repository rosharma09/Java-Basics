package AbstractConcept;

public class TestBank {

	public static void main(String[] args) {
		
		HDFCBank obj1 = new HDFCBank();
		obj1.transferAmount();
		obj1.DepositAmount();
		obj1.WithdrawAmount();
		
		
		// dynamic polymorphism : creating an object of child class referenced by reference variable of parent class
		Bank b = new HDFCBank();
		b.transferAmount();
		b.fund(); // we cannot access the method of child class using the reference variable of the parent class
	}

}
