/*Program 1:
Print all the details of employee having minimum salary.
-> Employee class fields : firstName, lastName, surnName, age, empId, empDeptId, empDeptName.
-> override toString method in Employee class.
*/
package ankita.assignment.collection;

import java.util.ArrayList;

import ankita.assignment.collection.Employee1;

public class EmployeeMinSalary {

	static void printInfo(ArrayList<Employee1> arrList) {
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
	}

	static public Employee1 getMaxSalaryEmployee(ArrayList<Employee1> arrList) {
		int maxSalIndex = 0;
		System.out.print("\nEmployee with Min sal :");
		for (int i = 0; i < arrList.size(); i++) {
			if (arrList.get(i).getSalary() < arrList.get(maxSalIndex).salary) {
				maxSalIndex = i;
			}
		}
		return arrList.get(maxSalIndex);

	}

	public static void main(String[] args) {
		ArrayList<Employee1> arrList = new ArrayList<Employee1>();
		Employee1 e1 = new Employee1("Ankita", "Mukund", "D", "aa", 26, 101, 50, 50000);
		Employee1 e2 = new Employee1("Rahul", "Ravi", "M", "bb", 27, 102, 51, 75000);
		Employee1 e3 = new Employee1("Suvela", "Sameer", "K", "aa", 26, 103, 55, 60000);
		Employee1 e4 = new Employee1("Arush", "Roohit", "T", "bb", 28, 110, 50, 70000);

		arrList.add(e1);
		arrList.add(e2);
		arrList.add(e3);
		arrList.add(e4);
		printInfo(arrList);
		Employee1 e5 = getMaxSalaryEmployee(arrList);
		System.out.println(e5);
	}
}
