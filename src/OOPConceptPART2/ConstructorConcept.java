package OOPConceptPART2;

import java.awt.Container;

public class ConstructorConcept {

	// Constructor : Is a class entity to define some class features while creating
	// the object
	// constructor properties :
	// 1. Looks like a function, but it is not a function
	// 2. constructor cannot return any value
	// 3. name should be same as the class name

	// creating constructor

	// type of constructors :
	// 1. default constructor

	public ConstructorConcept() {
		System.out.println("This is a default constructor");
	}

	// 2. parameterised constructor

	public ConstructorConcept(int a) {
		System.out.println("This is a parameterised constructor");
		System.out.println("The value passed to constructor is : " + a);
	}

	// 3. parameterised constructor with two arguments

	public ConstructorConcept(int x, int y) {
		System.out.println("contructor with two parameters");
		System.out.println("The vales passed to call the constructor are : " + x + " and " + y);
	}

	// Q : can we over load a constructor
	// A : constructor can be overloaded, just like a method

	public static void main(String[] args) {

		// as soon as we create an object of the class, the constructor are called
		ConstructorConcept c1 = new ConstructorConcept();
		ConstructorConcept c2 = new ConstructorConcept(10);
		ConstructorConcept c3 = new ConstructorConcept(10, 20);

		// in case of a non static method, we need to create an object of the class, and
		// use the reference variable to call the method

		// A hidden constructor is always there that is the default constructor, so the
		// same is called when we try to create an object of the classss
		// in case we want parameterized constructor. Then we need to explicitly create
		// the constructor.

	}

}
