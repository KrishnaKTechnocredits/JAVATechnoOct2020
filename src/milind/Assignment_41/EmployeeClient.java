package milind.Assignment_41;

import java.util.ArrayList;

public class EmployeeClient extends Employee{

	public EmployeeClient(String firstName, String lastName, String surName, String deptName, double salary, int age,
			int empId, int deptId) {
		super(firstName, lastName, surName, deptName, salary, age, empId, deptId);
	}
	
	public static void main(String[] args) {
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		EmployeeClient employeeClient = new EmployeeClient("Milind", "Chavahn", "Chavhan", "Testing", 100000, 30, 101, 1001);
		EmployeeClient employeeClient1 = new EmployeeClient("Bhairavi", "Chavahn", "Patil", "Testing job", 60000, 28, 102, 1002);
		EmployeeClient employeeClient2 = new EmployeeClient("Puru", "Chavahn", "patil", "Revenue", 70000, 32, 103, 1003);
		EmployeeClient employeeClient3 = new EmployeeClient("Rahul", "Patil", "Jadhav", "QA", 10000, 35, 104, 1004);
		arrayList.add(employeeClient);
		arrayList.add(employeeClient1);
		arrayList.add(employeeClient2);
		arrayList.add(employeeClient3);
		System.out.println(employeeClient.getMinSalary(arrayList));
	}
	
	

}
