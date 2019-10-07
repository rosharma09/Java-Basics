package SingletonDesign;

public class ImplementSingletonClass {

	private static ImplementSingletonClass SingletonInstance = null;

	public String str;

	private ImplementSingletonClass() {

		str = "HELLO WORLD";
	}

	public static void main(String[] args) {

		ImplementSingletonClass a = ImplementSingletonClass.SingletonMethod();
		System.out.println((a.str).toLowerCase());

		ImplementSingletonClass b = ImplementSingletonClass.SingletonMethod();
		System.out.println(b.str);
		
	}

	public static ImplementSingletonClass SingletonMethod() {
		if (SingletonInstance == null) {
			SingletonInstance = new ImplementSingletonClass();
		}
		return SingletonInstance;
	}

}
