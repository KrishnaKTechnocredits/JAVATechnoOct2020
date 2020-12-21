package nagendra.CollectionFramework;

import java.util.ArrayList;

/*
Program 1: 
Print all the details of employee having minimum salary.
-> Employee class fields : firstName, lastName, surnName, age, empId, empDeptId, empDeptName,salary,
-> override toString method in Employee class. 

*/


public class EmployeeInformation {

	public static Employee getEmployeeWithMaxSalary(ArrayList<Employee> employeeInfo) {
		int minimumSalary = employeeInfo.get(0).getSalary();
		int minSalaryIndex = 0;
		for (int index = 0; index < employeeInfo.size(); index++) {
			if (employeeInfo.get(index).getSalary() < minimumSalary) {
				minimumSalary = employeeInfo.get(index).getSalary();
				minSalaryIndex = index;
			}
		}
		return employeeInfo.get(minSalaryIndex);
	}

	public static void main(String[] args) {
		ArrayList<Employee> employeeInfo = new ArrayList<Employee>();
		Employee e1 = new Employee("Gilles", "Egron", 27, 650, 41, "Nordics", 2000);
		Employee e2 = new Employee("Praveen", "Maddineni", 25, 750, 81, "USA", 1000000);
		Employee e3 = new Employee("Nancy", "Paloncy", 34, 850, 88, "Mumbai", 5000);
		employeeInfo.add(e1);
		employeeInfo.add(e2);
		employeeInfo.add(e3);
		Employee employee = getEmployeeWithMaxSalary(employeeInfo);
		System.out.println("Emplyees  having minimum salary. \n"+employee);
	}
}
