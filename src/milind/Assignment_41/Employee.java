package milind.Assignment_41;

import java.util.ArrayList;

public class Employee {
	
	String firstName, lastName, surName, deptName;
	double salary;
	int age, empId, deptId;
	
	public Employee(String firstName, String lastName, String surName, String deptName, double salary, int age, int empId, int deptId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.surName = surName;
		this.deptName = deptName;
		this.salary = salary;
		this.age = age;
		this.empId = empId;
		this.deptId = deptId;
	}
	
	@Override
	public String toString() {
		return "First name : " + firstName + "\n" + 
				"Last name : " + lastName + "\n" +
				"surname : " + surName + "\n" +
				"Employee Id : " + empId + "\n" +
				"Age : " + age + "\n" +
				"Salary : " + salary + "\n" +
				"Department name : " + deptName + "\n" + 
				"Department Id : " + deptId;
	}
	
	public Employee getMinSalary(ArrayList<Employee> arrayList) {
		double minSalary = arrayList.get(0).salary;
		int minIndex = 0;
		for(int index = 0; index < arrayList.size(); index++) {
			if(minSalary > arrayList.get(index).salary) {
				minSalary = arrayList.get(index).salary;
				minIndex = index;
			}
		}
		return arrayList.get(minIndex);
	}

}
