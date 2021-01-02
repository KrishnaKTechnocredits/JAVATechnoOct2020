package technoCredits.collectionDemo;

import java.util.HashSet;

public class HashSetEqualHashCode {

	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Vaibhav",100000);
		Employee e2 = new Employee(2,"Nandini",150000);
		Employee e3 = new Employee(3,"Maulik",30000);
		Employee e4 = new Employee(1,"Vaibhav",100000);
		Employee e5 = new Employee(1,"Vaibhav",100000);
		Employee e6 = new Employee(1,"Vaibhav",100000);
		System.out.println(e1.hashCode());
		System.out.println(e4.hashCode());
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Maulik");
		hs.add("Maulik");
		
		HashSet<Employee> setOfEmployees = new HashSet<Employee>();
		setOfEmployees.add(e1);
		setOfEmployees.add(e2);
		setOfEmployees.add(e3);
		setOfEmployees.add(e4);
		setOfEmployees.add(e5);
		setOfEmployees.add(e6);
		
		System.out.println(setOfEmployees.size()); // 4
	}
}
