package InterfaceConcept;

public class TestCar {

	public static void main(String[] args) {

		HondaCar h = new HondaCar();
		h.start();
		h.stop();
		h.Break();
		h.ABS();

		// child class object can be referred by parent interface variable

		Car c = new HondaCar(); // This is know as dynamic polymorphism , top casting

		c.start();
		c.stop();
		c.Break();

		// Q : when to go for ABSTRACT and INTERFACE
		// A : We can make use of abstract class, in case when we need to achieve
		// partail abstraction[In case when we need to have abstract and non-abstract methods]
		// In case we want to achieve 100% abstraction , then we should go for
		// interfaces
	}

}
