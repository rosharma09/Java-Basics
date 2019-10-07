package OOPConceptPART2;

public interface USBank {
	
	// In interfaces we have only method declaration, and no method body is present (Only create the prototype)
	
	int min_bal = 100; // we can declare variables and these are by default static in nature, and the value cannot be changed , it is constant in nature
	
	// No static method are allowed in interfaces - it is part of OOP , and objects cannot hold static methods
	// No main method in interfaces
	//Interfaces are abstract in nature - we cannot create object of interfaces
	
	public void debit();
	
	public void credit() ;
	
	public void transaction();
	
}
