package Final_Example;

public final class ParentClass {
	
	// This is the parent class, that can be inherited by the child class.
	
	// parent class method 
	
	// In order to prevent inheritance, we can make use of the final keyword.
	
	// Uses of final keyword
	// 1. To prevent inheritance , use final keyword before class keyword
	// 2. To prevent method overridding , use final keyword before the parent class method name
	// 3. To keep the value of variable constant during runtime
	
	
	public void start() {
		System.out.println("This is the method of parent class");
	}

}
