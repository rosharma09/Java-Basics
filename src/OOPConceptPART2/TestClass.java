package OOPConceptPART2;

public class TestClass {

	public TestClass(int a) {
		System.out.println("parameterized Constructor");
	}

	public static void main(String[] args) {

		TestClass obj1 = new TestClass();

		// we will get an error that the constructor value is undifined
		// java is strict, when it comes to explicitly creating a constructor as to why
		// create when we are not using it

	}

}
