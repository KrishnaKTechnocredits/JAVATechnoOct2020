package technoCredits.collectionDemo;

import java.util.HashMap;

public class HashMapEqualHashCode {

	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Vaibhav",100000);
		Employee e2 = new Employee(2,"Nandini",150000);
		Employee e3 = new Employee(3,"Maulik",30000);
		Employee e4 = new Employee(1,"Vaibhav",100000);
		
		HashMap<Employee,Integer> hm = new HashMap<Employee,Integer>();
		hm.put(e1, 10101); //1
		hm.put(e2, 10102); //2
		hm.put(e3, 10103); //3
		hm.put(e4, 10104); // 1
		hm.put(e2, 10105); // 2
		
		System.out.println(hm.size());
		System.out.println(hm);
	}
}
