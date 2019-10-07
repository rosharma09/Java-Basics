package Java_collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		
		// ArrayList is a dynamic array
		
		int i[]  = new int[3]; // this is a static array 
		i[0]=100;
		i[1]=100;
		i[2]=100;
		
		
		// Disadvantage : the size is fixed , to resolve this we use dynamic array . We use array list 
		
		// we can store any number of values
		// maintains insertion order, 0 , 1 , 2 , ... so on
		// it is not synchorinised ,  therefore it is slower compared to other collections [Not thread safe]
		// It allows random access to fetch any element, because it store the values based on indexes
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(30);
		ar.add(40);
		
		System.out.println(ar.size());
		
		ar.remove(0);
		
		System.out.println(ar.size());
		ar.add(20);
		ar.add(1000);
		
		// to print all the values of the arraylist, we use for loop, since the values are stored based on indexes
		
		for (int i1=0 ; i1<ar.size() ; i1++) {
			
			System.out.println(ar.get(i1)); // we use get() method to fetch the value 
		}
		
		// non - generics vs generics : basically to restrict the kind of values that are stored in the arraylist.
		
		// Non-generics : We have not defined the data type that is not stored in the array list, so we can store any sort of data type in the array list 
		// generic : we add the data type
		
		// generic : 
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(1000);
		
		// non - generic
		
		ArrayList a2 = new ArrayList();
		
		// In case we are not sure what kind of value is passed to the arraylist we use e as the parameter
		
		Employee e1 = new Employee("ROHAN",10,1000,"QA");
		
		Employee e2 = new Employee("MOHAN",11,1001,"QA");
		
		Employee e3 = new Employee("SOHAN",10,1002,"QA");
		
		
		ArrayList<Employee> array = new ArrayList<Employee>(); // this will store values of type employee , basically employee objects
		
		// To store the objects in the array list 
		
		array.add(e1);
		array.add(e2);
		array.add(e3);
		
		// Important for the interview point of view
		// Iterator : to traverse through the array
	
		Iterator<Employee> it = array.iterator();
		
		while(it.hasNext()){
			System.out.println("*********");
			Employee emp = it.next(); //  method used to extract the next value
			System.out.println(emp.ename);
			System.out.println(emp.eno);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
	
		
		Student s1 = new Student("RAKESH","SCI",10,24);
		Student s2 = new Student("RAMESH","XXX",10,23);
		Student s3 = new Student("LOKESH","COM",10,24);
		Student s4 = new Student("MUKESH","ART",10,25);
		
		ArrayList<Student> stud = new ArrayList<Student>();
		
		stud.add(s1);
		stud.add(s2);
		stud.add(s3);
		stud.add(s4);
		
		// to display the contents of the array list , we make use of iterarot class : 
		
		Iterator<Student> it1 = stud.iterator();
		
		while(it1.hasNext()) {
			
			System.out.println("*$*$*$*$*$*");
			Student stud1 = it1.next();	
			System.out.println(stud1.name);
			System.out.println(stud1.stream);
			System.out.println(stud1.age);
			System.out.println(stud1.rollNo);
			
		}
		
		// use of add all method in arrayList : 
		
		ArrayList<String> s5 = new ArrayList<String>();
		s5.add("TEST");
		s5.add("TOOLS");
		s5.add("QTP");
		
		System.out.println("ArrayList elements for s5:");

		for (int i5 = 0 ; i5<s5.size() ; i5++ ) {
			
			System.out.println(s5.get(i5));
		}
		
		ArrayList<String> s6 = new ArrayList<String>();
		s6.add("DEV");
		s6.add("TOOL");
		s6.add("JAVA");
		
		System.out.println("ArrayList elements for s6:");

		for (int i6 = 0 ; i6<s6.size() ; i6++ ) {
			
			System.out.println(s6.get(i6));
		}
		
		
		// now in case we need to add the data of one array list into another , then we can make use of addall method.
		
		s5.addAll(s6);
		
		System.out.println("ArrayList elements for s5 after addition odf s6 elements");

		
		for (int i5 = 0 ; i5<s5.size() ; i5++ ) {
			
			System.out.println(s5.get(i5));
		}
		
		// we can use remove all method to remove the objects of another arraylist 
		
		s5.removeAll(s6);
		
		System.out.println("ArrayList elements for s5 after removal of s6 elements");

		
		for (int i5 = 0 ; i5<s5.size() ; i5++ ) {
			
			System.out.println(s5.get(i5));
		}
		
		ArrayList<String> s7 = new ArrayList<String>();
		s7.add("TEST");
		s7.add("TOOLS");
		s7.add("QTP");
		
		System.out.println("ArrayList elements for s7:");

		for (int i7 = 0 ; i7<s7.size() ; i7++ ) {
			
			System.out.println(s7.get(i7));
		}
		
		ArrayList<String> s8 = new ArrayList<String>();
		s8.add("DEV");
		s8.add("TOOLS");
		s8.add("JAVA");
		
		System.out.println("ArrayList elements for s8:");

		for (int i8 = 0 ; i8<s8.size() ; i8++ ) {
			
			System.out.println(s8.get(i8));
		}
			
		// to retain all the valeus that are common between two array lists, we make use of the retainall() method
		
		s7.retainAll(s8);
		
		System.out.println("ArrayList elements common in S7 and S8:");

		for (int i7 = 0 ; i7<s7.size() ; i7++ ) {
			
			System.out.println(s7.get(i7));
		}
		
	}
	
}
