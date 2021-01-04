package nandini.Assignment_41;

import java.util.ArrayList;
import java.util.List;

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
		int max=0;
		for(int index=0;index<list.size();index++) {
			if(list.get(index).salary > list.get(max).salary)
				max=index;
		}
		System.out.println(list.get(max));
	}
	
	public static void main(String[] args) {
		Employee employee1 = new Employee("Apoorva", "Kapoor", 30, 423, 1586,570000, "IT Department");
		Employee employee2 = new Employee("Ankit", "Dubey", 31, 111, 1587,870000, "Admin Department");
		Employee employee3 = new Employee("Akash", "Srivastava", 28, 178, 1586,300000, "Operations Department");
		Employee employee4 = new Employee("Priya", "Rawat", 34, 245, 1587,45000, "Network Department");
		List<Employee> list = new ArrayList<>();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		System.out.println("Employee details with Maximum salary:");
		Employee.findMaxSalary(list);
	}
}
