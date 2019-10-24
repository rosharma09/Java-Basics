package JavaProgrammingQuestions;

public class CallByRefExample {
	
	String name;
	int age;
	
	
	public CallByRefExample(String name , int age) {
		
		this.name=name;
		this.age=age;
	}

	public static void main(String[] args) {

		// Call by reference example
		CallByRefExample obj = new CallByRefExample("Rohan",23);
		System.out.println(obj.name);
		System.out.println(obj.age);

	}

}
