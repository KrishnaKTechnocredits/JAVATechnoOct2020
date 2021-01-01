//Program 2: Return a list of employee whose salary is less than 30000.
//Hint : List<Employee> filterEmployeeBySalary(List<Employee> listOfEmployee){}

package priya;

import java.util.ArrayList;

public class EmployeeLessSalary {

	String firstName, lastName;
	int age, empId;
	double salary;

	EmployeeLessSalary(String firstName, String lastName, int age, int empId, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.empId = empId;
		this.salary = salary;
	}

	public String toString() {
		return "Name Of Employee:" + firstName + " " + lastName + "\nAge:" + age + "\nEmp_ID:" + empId + "\nSalary:"
				+ salary;
	}

	public static ArrayList<EmployeeLessSalary> filterEmployeeBySalary(ArrayList<EmployeeLessSalary> arrayList) {
		ArrayList<EmployeeLessSalary> list = new ArrayList<EmployeeLessSalary>();
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).salary < 30000) {
				list.add(arrayList.get(i));
			}
		}
		return list;
	}
	public static void main(String[] args) {
		ArrayList<EmployeeLessSalary> empDetails = new ArrayList<EmployeeLessSalary>();
		EmployeeLessSalary emp1 = new EmployeeLessSalary("Priya", "More", 35, 210145, 75000);
		EmployeeLessSalary emp2 = new EmployeeLessSalary("Sonal", "Inamdar", 36, 210144, 60000);
		EmployeeLessSalary emp3 = new EmployeeLessSalary("Ekta", "Dhar", 28, 210390, 55000);
		EmployeeLessSalary emp4 = new EmployeeLessSalary("Neha", "Lade", 30, 210498, 25000);
		empDetails.add(emp1);
		empDetails.add(emp2);
		empDetails.add(emp3);
		empDetails.add(emp4);

		System.out.println(EmployeeLessSalary.filterEmployeeBySalary(empDetails));
	}
}
