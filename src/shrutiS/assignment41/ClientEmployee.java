/*Assignment-41 
Program 1: 
Print all the details of employee having minimum salary.
-> Employee class fields : firstName, lastName, surnName, age, empId, empDeptId, empDeptName.
-> override toString method in Employee class. */
package shrutiS.assignment41;

import java.util.ArrayList;

public class ClientEmployee {

	private static Employee getMinimumSalary(ArrayList<Employee> employeeArrayList) {

		int minSalaryIndex = 0;
		for (int index = 0; index < employeeArrayList.size(); index++) {
			if (employeeArrayList.get(index).getSalary() < employeeArrayList.get(minSalaryIndex).getSalary()) {
				minSalaryIndex = index;
			}
		}
		return employeeArrayList.get(minSalaryIndex);
	}

	public static void main(String[] args) {
		Employee employee = new Employee("Shruti", "Sattigeri", 30000, 31, 23, 10, "Electronics");
		Employee employee1 = new Employee("Shikha", "Mishra", 40000, 31, 22, 11, "IT");
		Employee employee2 = new Employee("Swati", "Kadu", 5000, 31, 21, 12, "Floor Admin");
		Employee employee3 = new Employee("Anjali", "Garg", 80000, 31, 20, 14, "testing");

		ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();
		employeeArrayList.add(employee);
		employeeArrayList.add(employee1);
		employeeArrayList.add(employee2);
		employeeArrayList.add(employee3);

		System.out.println(ClientEmployee.getMinimumSalary(employeeArrayList));
	}
}
