package AbstractConcept;

public abstract class Bank {

	// abstract class : can have abs method and non abs mehtod 
	
	// when we need to define a class we need to use abstract keyword

	// Rule : when we define a class as abstract then we need to define atleast one
	// method that is abstract in nature

	// What is abstract method : Method only having the method declaration and no
	// method body , i.e. prototype method
	
	// through abstract class we are achiving partail abstraction
	
	// ABSTRACTION : hiding the implementation of the method 

	// we can have n number of abstract methods or normal methods

	// Non-Abstract method
	
	// we cannot create the objects of abstract classes 
	
	int amt = 100;
	final int rate = 10;
	static int loanrate = 5;
	public void WithdrawAmount() {
		System.out.println("Please enter the choice :");
	}

	// Abstract method
	public abstract void transferAmount();

	// Non-Abstract method
	public void DepositAmount() {
		System.out.println("Please deposit the amount");
	}

}
