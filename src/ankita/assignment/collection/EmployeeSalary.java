/*Program 2:
Return a list of employee whose salary is less than 30000.
Hint : List<Employee> filterEmployeeBySalary(List<Employee> listOfEmployee){}
*/
package ankita.assignment.collection;

import java.util.ArrayList;

public class EmployeeSalary {

	public static ArrayList<Employee1> filterEmployeeBySalary(ArrayList<Employee1> arrList) {
		ArrayList<Employee1> arrList1 = new ArrayList<Employee1>();
		for (int i = 0; i < arrList.size(); i++) {
			if (arrList.get(i).getSalary() < 30000)
				arrList1.add(arrList.get(i));
		}
		return arrList1;
	}

	public static void main(String[] args) {
		ArrayList<Employee1> arrList = new ArrayList<Employee1>();
		Employee1 e1 = new Employee1("Ankita", "Mukund", "D", "aa", 26, 101, 50, 50000);
		Employee1 e2 = new Employee1("Rahul", "Ravi", "M", "bb", 27, 102, 51, 25000);
		Employee1 e3 = new Employee1("Suvela", "Sameer", "K", "aa", 26, 103, 55, 29000);
		Employee1 e4 = new Employee1("Arush", "Roohit", "T", "bb", 28, 110, 50, 70000);

		arrList.add(e1);
		arrList.add(e2);
		arrList.add(e3);
		arrList.add(e4);

		ArrayList<Employee1> aL1 = filterEmployeeBySalary(arrList);
		for (int i = 0; i < aL1.size(); i++) {
			System.out.println(aL1.get(i));
		}
	}
}
