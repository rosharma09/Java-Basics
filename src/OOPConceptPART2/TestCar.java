package OOPConceptPART2;

public class TestCar {

	public static void main(String[] args) {

		// This is called compile/static polymorphism : since at the time of complilation , the compiler will decide which method to select
		
		//POLYMORPHISM : creating a number of methods with the same name.
		
		BMW b = new BMW();
		b.start(); // this will call the start method of the child class
		
		// METHOD OVERIDDING : When same method is present in parent class as well as parent class having same name and same list of arguments.
		
		// METHOD OVERLOADING ; when we have fnctions with same name defined in a class, but with different argument lists.
		
		b.stop(); // will first check in BMW class that stop method is present or not, inherited from parent class
		
		b.refuel();
		
		b.antitheft();
		
		b.engine();
		
		System.out.println("************************");
		
		Car c = new Car(); // when you create an object of the parent class, you can only access the objects of the parent class, 
		//we cannot access the objects of the child class.
		
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		
		//c.antitheft();  Parent class object cannot access the methods of the child class
		
		
		// Dynamic polymorphism/Run-time polymorphism : when the child class object is referenced by the reference variable of the parent class, it is called dynamic polymorphism.
		
		Car c1 = new BMW(); // Top casting : The referemce variable of parent class refering to child class object
		c1.start();
		c1.stop();
		c1.refuel();
		
		// Only the overriden methods and parent class methods can be called using the object of child class referenced by parent class reference variable.
		// we cannot access the methods of the child class.
		
		//Dowm casting : we are creating an obkject of parent class referenced by a reference variable of child  class, which is not allowed. you will get an error during the run time
		
		//BMW b1 = new Car(); this will throw an error, we need to caste it 
		
		//BMW b1 = (BMW)new Car(); // we just need to change the caste
		
		//when we execute the code we get the below error message(run time error), that we cannot cast the object of child class
		
		//java.lang.ClassCastException: OOPConceptPART2.Car cannot be cast to OOPConceptPART2.BMW
		//at OOPConceptPART2.TestCar.main(TestCar.java:50)
		
		
	}

}
