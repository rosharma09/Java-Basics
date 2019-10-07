package OOPConceptsPART1;

public class Car {

	// create variables  : GLOBAL VARIABLES
	
	String mod;
	String wheel;
	
	public static void main(String[] args) {
		
		// creating an object of the class
		
		// new keyword is used to create the object 
		
		// NOTE : obj1 is not the object, it is just a object reference name 
		//SYNTAX : ClassName ObjectName = new ClassName();
		
		// ClassName() is the object 
		// ObjectName is the reference variable
		
		Car obj1 = new Car();
		Car obj2 = new Car();
		Car obj3 = new Car();
		
		obj1.mod="BMW-Series1";
		obj1.wheel="4";
		
		obj2.mod="HONDA-CITY";
		obj2.wheel="4";
		
		obj3.mod="HYUNDAI-i20";
		obj3.wheel="4";
		
		
		System.out.println("The values of object before the object referencing");
		
		System.out.println(obj1.mod); 
		System.out.println(obj1.wheel);
		
		System.out.println(obj2.mod); 
		System.out.println(obj2.wheel);
		
		System.out.println(obj3.mod); 
		System.out.println(obj3.wheel);
		
		
		
		System.out.println("The value of object after the object referencing");
		
		obj1=obj2;
		obj2=obj3;
		obj3=obj1;
		
		// Values of object after the object referencing
		
		System.out.println(obj1.mod); 
		System.out.println(obj1.wheel);
		
		System.out.println(obj2.mod); 
		System.out.println(obj2.wheel);
		
		System.out.println(obj3.mod); 
		System.out.println(obj3.wheel);
		
	}

}
