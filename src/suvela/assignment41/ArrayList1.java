
/*Program 1: 
Print all the details of employee having minimum salary.
-> Employee class fields : firstName, lastName, surnName, age, empId, empDeptId, empDeptName,salary.
-> override toString method in Employee class. */
package suvela.assignment41;

import java.util.ArrayList;
import suvela.assignment41.Employee;

public class ArrayList1 {
	public Employee printInfo(ArrayList<Employee> empList) {
		int minSalaryIndex = 0;
		for (int index = 0; index < empList.size(); index++) {
			Employee e = empList.get(index);
			if (e.getSalary() < empList.get(minSalaryIndex).Salary) {
				minSalaryIndex = index;
			}
		}
		return empList.get(minSalaryIndex);
	}

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<>();
		Employee e1 = new Employee("Suvela", "Khaladkar", "ABC", 24, 1090, 1111, 40000);
		Employee e2 = new Employee("Ankita", "Dahiwelkar", "ABC", 26, 1091, 11188, 50000);
		Employee e3 = new Employee("Aishwarya", "Sathe", "PQR", 25, 1067, 1541, 60000);

		empList.add(e1);
		empList.add(e2);
		empList.add(e3);

		Employee i = new ArrayList1().printInfo(empList);
		System.out.println(i);
	}

}

