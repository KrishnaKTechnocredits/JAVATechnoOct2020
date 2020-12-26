package anjaliS;

import java.util.ArrayList;

public class displayMinimumSalary {
	String firstName, middleName, lastName, empDeptName;
	int empId, empDeptId, age;
	int Salary;

	displayMinimumSalary(String firstName, String middleName, String lastName, String empDeptName, int empId,
			int empDeptId, int age, int Salary) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.empDeptId = empDeptId;
		this.empId = empId;
		this.age = age;
		this.Salary = Salary;
		this.empDeptName = empDeptName;
	}

	public String toString() {
		System.out.println("Employee Details");
		return "Employee name is :" + firstName + " " + lastName + "\nDepartment name is:" + empDeptName
				+ "\nEmployee Age is:" + age + "\nEmpId is:" + empId + "\nDeptId is:" + empDeptId
				+ "\nEmployee Salary is:" + Salary;
	}

	static displayMinimumSalary findMinSalary(ArrayList<displayMinimumSalary> empDetails) {
		int minimumSalary = empDetails.get(0).Salary;
		int minIndex = 0;
		for (int i = 0; i < empDetails.size(); i++) {
			if (empDetails.get(i).Salary < minimumSalary) {
				minimumSalary = empDetails.get(i).Salary;
				minIndex = i;
			}
		}
		return empDetails.get(minIndex);
	}

	public static void main(String[] args) {
		ArrayList<displayMinimumSalary> empDetails = new ArrayList<displayMinimumSalary>();
		displayMinimumSalary emp1 = new displayMinimumSalary("Anjali", "Dewesh", "Shukla", "Testing", 1026, 101, 25,
				25000);
		displayMinimumSalary emp2 = new displayMinimumSalary("Shweta", "Abhay", "Parmar", "Testing", 1026, 102, 26,
				30000);
		displayMinimumSalary emp3 = new displayMinimumSalary("Vinayak", "Shirish", "Vyas", "Testing", 1026, 103, 24,
				22000);
		empDetails.add(emp1);
		empDetails.add(emp2);
		empDetails.add(emp3);

		System.out.println(displayMinimumSalary.findMinSalary(empDetails));
	}

}
