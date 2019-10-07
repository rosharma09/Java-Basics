package OOPConceptPART2;

public class ConstructorWithThisKeyword2 {

	String name;
	String dept;
	int age;

	public ConstructorWithThisKeyword2(String name, String dept, int age) {
		System.out.println("This is a parameterized constructor");

		System.out.println("Employee name :" + name);
		System.out.println("Dept :" + dept);
		System.out.println("age :" + age);
		System.out.println("\n");

		// in case when we want to initialize the global variables using the local
		// variables we make use of this keyword inside the constructor to tell the
		// complier that
		// we are refering to the global variable

		// this.global_variable = local_variable;

		this.name = name;
		this.dept = dept;
		this.age = age;

		// here the complier will think that we are refering to the local variable
		// itself, to avoid such confusion we can use different names for the class
		// variables and
		// the argument name passed for the constructor

		name = name;
		dept = dept;
		age = age;
	}

	public static void main(String[] args) {

		ConstructorWithThisKeyword2 c1 = new ConstructorWithThisKeyword2("ROHAN SHARMA", "PSO", 24);

		System.out.println("*** the values of global variables***");
		System.out.println("Employee name :" + c1.name);
		System.out.println("Dept :" + c1.dept);
		System.out.println("age :" + c1.age);

		System.out.println("\n");

		ConstructorWithThisKeyword2 c2 = new ConstructorWithThisKeyword2("PRASAD SHARMA", "RND", 27);

		System.out.println("*** the values of global variables***");
		System.out.println("Employee name :" + c2.name);
		System.out.println("Dept :" + c2.dept);
		System.out.println("age :" + c2.age);
	}

}
