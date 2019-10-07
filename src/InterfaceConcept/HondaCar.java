package InterfaceConcept;

public class HondaCar implements Car {

	@Override
	public void start() {
		System.out.println("This is the start method body");
	}

	@Override
	public void stop() {
		System.out.println("This is the stop method body");
	}

	@Override
	public void Break() {
		System.out.println("This is the break method body");
	}
	
	public void ABS() {
		System.out.println("This is the ABS feature of Honda car");
	}
}
