package OOPConceptPART2;

public class HDFCBank implements USBank , BrazilBank{ // we need to implement the USbank
	
	// we can have child class implementing multiple interfaces 
	
	// if any class is implementing any interface, we need to define the methods of the interface
	
	public void credit() {
		System.out.println("This the credit functionality");
	}

	public void debit() {
		System.out.println("This is debit functionality");
	}
	
	public void transaction() {
		System.out.println("Transaction facility");
	}
	
	public void MutaulFunds() { // overidding from BrazilBank
		System.out.println("This is mutaul fund");
	}
	
	public void HDFCstudyload() {
		System.out.println("Load provided from studies");
	}
	
	public void HDFChouseloan() {
		System.out.println("House loan");
	}
	
	// What is the difference between Is a relationship and has a relationship
	
	// Is-a-relationship : here we are talking about class and interface relationship [Implements]
	// Has-a-relationship : here we are talking about class and class relationship [Extends]
	
	
}

