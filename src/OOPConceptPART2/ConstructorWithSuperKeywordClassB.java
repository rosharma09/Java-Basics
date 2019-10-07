package OOPConceptPART2;

public class ConstructorWithSuperKeywordClassB extends ConstructorWithSuperKeywordClassA {

	public ConstructorWithSuperKeywordClassB(int x, int y) {
		// The main use of super keyword is to call the constructor of the parent class
		// super is the first statement in the body of child constructor
		// we cannot have multiple super keyword in child constructor

		super(x, y, 10); // supper keyword is used to call the constructor of the parent class, by
							// default it will call the default constructor of the parent class
		System.out.println("Child class constructor");

	}

	public static void main(String args[]) {

		// By default the constructor of the pasrent class (default constructor) will be
		// called in case of inheritance
		// in case when we have a parameterized constructor in parent class

		ConstructorWithSuperKeywordClassB objB = new ConstructorWithSuperKeywordClassB(10, 20);
	}

}
