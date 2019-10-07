package SingletonDesign;

public class Singleton {

	// In OOPs concept, a singleton class is the class that can have only one object
	// or instance of a class at a time

	// how to design singleton class
	// 1. Make sure the constructor of the class is private
	// 2. We need to write static method which is public and also having return type
	// of object of this singleton class. The same is known is Lazy intialisation

	private static Singleton Singleton_instance = null;

	public String str;

	private Singleton() {
		str = "This is a singleton class";
	}

	public static void main(String[] args) {

		Singleton x = Singleton.getInsatnceMethod();
		Singleton y = Singleton.getInsatnceMethod();
		Singleton z = Singleton.getInsatnceMethod();

		System.out.println(x.str);
		System.out.println((x.str).toUpperCase());

		System.out.println(y.str);
		System.out.println((y.str).toUpperCase());

		System.out.println(z.str);
		System.out.println((z.str).toUpperCase());

		z.str = (z.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

	}

	public static Singleton getInsatnceMethod() {
		if (Singleton_instance == null) {
			Singleton_instance = new Singleton();
		}
		return Singleton_instance;

	}

}
