
package technoCredits.collectionDemo;

import java.util.Scanner;

public class TestEmployeeSet {

	public static void main(String[] args) {
		/*TreeSet<Employee> ts = new TreeSet<Employee>();
		10
		ts.add(new Employee(1, "Brijesh", 130000));
		ts.add(new Employee(2, "Maulik", 30000));
		
		System.out.println(ts.size());*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		
		System.out.println("Enter name : ");
		String name = sc.nextLine();
		name = sc.nextLine();
		System.out.println(num + " : " + name);
		
	}
}
