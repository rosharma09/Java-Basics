package OOPConceptPART2;

public class ConstructorWithThisKeyword {

	// These are class variables, i.e global variables
	String name;
	int age;

	// create a constructor of class

	public ConstructorWithThisKeyword(String name, int age) {

		// when we call the methof the value of local variables are intialized, not the
		// global variables
		// so in case when we need to intialize the value of the global variables we
		// need to make use of 'this' keyword
		System.out.println("The name of the employee is :" + name);
		System.out.println("The age of the employee is :" + age);
	}

	public static void main(String[] args) {

		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("ROHAN", 24);
		System.out.println("The name of the employee is :" + obj.name);
		System.out.println("The age of the employee is :" + obj.age);

	}

}
