package deepak.assignment41;

import java.util.ArrayList;

public class DisplaySalaryLessThanActual {
	String firstName, middleName, lastName, empDeptName;
	int empId, empDeptId, age;
	int Salary;

	DisplaySalaryLessThanActual(String firstName, String middleName, String lastName, String empDeptName, int empId,
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

	public static ArrayList<DisplaySalaryLessThanActual> findSalaryLess(
			ArrayList<DisplaySalaryLessThanActual> arrayList) {
		ArrayList<DisplaySalaryLessThanActual> list = new ArrayList<DisplaySalaryLessThanActual>();
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).Salary < 30000) {
				list.add(arrayList.get(i));
			}
		}
		return list;
	}

	public static void main(String[] args) {
		ArrayList<DisplaySalaryLessThanActual> empDetails = new ArrayList<DisplaySalaryLessThanActual>();
		DisplaySalaryLessThanActual emp1 = new DisplaySalaryLessThanActual("Amit", "Suresh", "Aphale", "Testing",
				1026, 101, 25, 25000);
		DisplaySalaryLessThanActual emp2 = new DisplaySalaryLessThanActual("Deepak", "Kisan", "Latad", "Testing", 1026,
				102, 26, 31000);
		DisplaySalaryLessThanActual emp3 = new DisplaySalaryLessThanActual("Aditya", "Harish", "Thakare", "Testing",
				1026, 103, 24, 32000);
		empDetails.add(emp1);
		empDetails.add(emp2);
		empDetails.add(emp3);
		System.out.println(DisplaySalaryLessThanActual.findSalaryLess(empDetails));
	}
}