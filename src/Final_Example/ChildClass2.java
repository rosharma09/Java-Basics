package Final_Example;

public class ChildClass2 extends ParentClass2{
	
		@Override
		public void add() {
			// the above method with name add cannot be overrided are the parent class method add is final 
			System.out.println("This is the add method of the child class");
		}
}
