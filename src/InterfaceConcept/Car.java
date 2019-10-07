package InterfaceConcept;

public interface Car {
	
	// Always define abstract method 
	// No method body required , i.e. only method declaration required 
	// we are achieving 100% abstraction
	//we cannot create the object of interfaces
	// no need to write abstract class 
	// in interface we can define only final and static variables in interface
	
	int speed = 100; // in case when we define it as this , then the same is considered as final and the value cannot be changed 
	public void start();	
	public void stop();
	public void Break();

}
