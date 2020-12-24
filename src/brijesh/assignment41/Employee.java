package brijesh.assignment41;

import java.util.ArrayList;
import java.util.List;


/*
Print all the details of employee having minimum salary.
-> Employee class fields : firstName, lastName, surnName, age, empId, empDeptId, empDeptName.
-> override toString method in Employee class. 

*/

public class Employee {
	
	String firstName;
	String lastName;
	int age;
	int empId;
	int empDeptId;
	int salary;
	String empDeptName;
	
	public Employee(String firstName, String lastName, int age, int empId, int empDeptId, int salary, String empDeptName) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
		this.empId=empId;
		this.empDeptId=empDeptId;
		this.salary=salary;
		this.empDeptName=empDeptName;
	}
	
	@Override
	public String toString() {
		return "First Name: "+firstName+"\nLastName: "+lastName+"\nAge: "+age+"\nEmpId: "+empId+"\nEmpDeptId: "+empDeptId+"\nSalary: "+salary+"\nEmpDeptName: "+empDeptName;
	}
	
	public static void findMaxSalary(List<Employee> list) {
		int maxIndex=0;
		for(int index=0;index<list.size();index++) {
			if(list.get(index).salary > list.get(maxIndex).salary)
				maxIndex=index;
		}
		System.out.println(list.get(maxIndex));
	}
	
	public static void main(String[] args) {
		Employee employee1 = new Employee("Rakesh", "Malhotra", 30, 123, 1586,500000, "Department1");
		Employee employee2 = new Employee("Vignesh", "Kamath", 31, 121, 1587,800000, "Department2");
		Employee employee3 = new Employee("Vikash", "Rakholiya", 28, 124, 1586,200000, "Department1");
		Employee employee4 = new Employee("Vimal", "Dhaduk", 34, 125, 1587,400000, "Department2");
		List<Employee> list = new ArrayList<>();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		Employee.findMaxSalary(list);
	}
}
