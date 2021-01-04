package sadhana;

/*Assignment_41 

Program 1: 
Print all the details of employee having minimum salary.
-> Employee class fields : firstName, lastName, surnName, age, empId, empDeptId, empDeptName.
-> override toString method in Employee class.  */


import java.util.ArrayList;
import java.util.List;

public class Employee_Assignment_41 {

	String firstName;
	String lastName;
	int age;
	int empId;
	int empDeptId;
	int salary;
	String empDeptName;

	public Employee_Assignment_41(String firstName, String lastName, int age, int empId, int empDeptId, int salary, String empDeptName) {
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

	public static void getMaxSalary(List<Employee_Assignment_41> list) {
		int max=0;
		for(int index=0;index<list.size();index++) {
			if(list.get(index).salary > list.get(max).salary)
				max=index;
		}
		System.out.println(list.get(max));
	}

	public static void main(String[] args) {
		Employee_Assignment_41 emp1 = new Employee_Assignment_41("Ramashish", "Kumar", 35, 51734572, 101,40000, "BMS");
		Employee_Assignment_41 emp2 = new Employee_Assignment_41("Ashok", "Sharma", 38, 53275683, 190,80000, "IT");
		Employee_Assignment_41 emp3 = new Employee_Assignment_41("Aarti", "Palnitkar", 37, 51738632, 104,60000, "Operations Department");		
		List<Employee_Assignment_41> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		System.out.println("Employee details with Maximum salary:");
		Employee_Assignment_41.getMaxSalary(list);
	}
}
