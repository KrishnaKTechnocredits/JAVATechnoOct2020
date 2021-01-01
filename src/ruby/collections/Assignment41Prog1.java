package ruby.collections;

import java.util.ArrayList;
import java.util.List;

/*Assignment-41 : 19th Dec'2020

Program 1:
Print all the details of employee having minimum salary.
-> Employee class fields : firstName, lastName, surnName, age, empId, empDeptId, empDeptName.
-> override toString method in Employee class.*/

public class Assignment41Prog1 {

	int printEmpWithSalary(ArrayList<Employee> empList) {
		int minIndex = 0;
		for (int index = 0; index < empList.size(); index++) {
			Employee emp = empList.get(index);
			if (emp.getSalary() < empList.get(minIndex).getSalary()) {
				minIndex = index;
			}
		}
		return minIndex;
	}


	public static void main(String[] args) {
		ArrayList<Employee> employeeList = new ArrayList<Employee>();

		Employee emp1 = new Employee("Ruby", "Khan", 20000, 35, 1, 002, "Testing");
		Employee emp2 = new Employee("Nasir", "Khan", 45000, 37, 4, 002, "Testing");
		Employee emp3 = new Employee("tina", "Khan", 60000, 35, 5, 001, "Dev");
		Employee emp4 = new Employee("tim", "Khan", 65000, 32, 3, 001, "Dev");

		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);

		Assignment41Prog1 assign = new Assignment41Prog1();
		int index = assign.printEmpWithSalary(employeeList);
		Employee employee = employeeList.get(index);
		System.out.println(employee);

	}

}
