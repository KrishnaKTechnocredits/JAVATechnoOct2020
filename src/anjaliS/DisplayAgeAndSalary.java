package anjaliS;

import java.util.ArrayList;

public class DisplayAgeAndSalary {
	String firstName, middleName, lastName, empDeptName;
	int empId, empDeptId, age;
	int Salary;

	DisplayAgeAndSalary(String firstName, String middleName, String lastName, String empDeptName, int empId,
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

	public static ArrayList<DisplayAgeAndSalary> findSalaryAndAge(ArrayList<DisplayAgeAndSalary> arrayList) {
		ArrayList<DisplayAgeAndSalary> list = new ArrayList<DisplayAgeAndSalary>();
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).age < 30 && arrayList.get(i).Salary > 75000) {
				list.add(arrayList.get(i));
			}
		}
		return list;
	}

	public static void main(String[] args) {
		ArrayList<DisplayAgeAndSalary> empDetails = new ArrayList<DisplayAgeAndSalary>();
		DisplayAgeAndSalary emp1 = new DisplayAgeAndSalary("Anjali", "Dewesh", "Shukla", "Testing", 1026, 101, 25,
				25000);
		DisplayAgeAndSalary emp2 = new DisplayAgeAndSalary("Shweta", "Abhay", "Parmar", "Testing", 1026, 102, 26,
				76000);
		DisplayAgeAndSalary emp3 = new DisplayAgeAndSalary("Vinayak", "Shirish", "Vyas", "Testing", 1026, 103, 24,
				32000);
		empDetails.add(emp1);
		empDetails.add(emp2);
		empDetails.add(emp3);
		System.out.println(DisplayAgeAndSalary.findSalaryAndAge(empDetails));
	}
}
