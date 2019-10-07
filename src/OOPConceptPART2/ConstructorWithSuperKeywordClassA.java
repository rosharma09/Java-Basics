package OOPConceptPART2;

public class ConstructorWithSuperKeywordClassA {

	public ConstructorWithSuperKeywordClassA() {
		System.out.println("Parent class constructor with no arguments");
	}

	public ConstructorWithSuperKeywordClassA(int a, int b, int c) {
		System.out.println("Parent class parameterized constructor with three arguments");
		System.out.println("The value of a : " + a);
		System.out.println("The value of b : " + b);
	}

}
