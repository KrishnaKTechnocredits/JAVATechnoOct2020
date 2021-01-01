//Program 3: return a list of employee name whose age is less than 30 and salary is greater than 75000.
//Hint : List<String> filterEmployeeByAgeAndSalary(List<Employee> listOfEmployee, double salary, int age){}

package priya;

import java.util.ArrayList;

public class EmployeeLessAgeAndSalary {

	String firstName, lastName;
	int age;
	double salary;

	EmployeeLessAgeAndSalary(String firstName, String lastName, int age, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}

	public String toString() {
		return "\nName Of Employee:" + firstName + " " + lastName + "\nAge:" + age + "\nSalary:" + salary;
	}

	public static ArrayList<EmployeeLessAgeAndSalary> filterEmployeeByAgeAndSalary(ArrayList<EmployeeLessAgeAndSalary> arrayList) {
		ArrayList<EmployeeLessAgeAndSalary> list = new ArrayList<EmployeeLessAgeAndSalary>();
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).age < 30 && arrayList.get(i).salary > 75000) {
				list.add(arrayList.get(i));
			}
		}
		return list;
	}

	public static void main(String[] args) {

		ArrayList<EmployeeLessAgeAndSalary> empDetails = new ArrayList<EmployeeLessAgeAndSalary>();
		EmployeeLessAgeAndSalary emp1 = new EmployeeLessAgeAndSalary("Priya", "More", 30, 75000);
		EmployeeLessAgeAndSalary emp2 = new EmployeeLessAgeAndSalary("Sonal", "Inamdar", 25, 80000);
		EmployeeLessAgeAndSalary emp3 = new EmployeeLessAgeAndSalary("Ekta", "Dhar", 28, 25000);
		EmployeeLessAgeAndSalary emp4 = new EmployeeLessAgeAndSalary("Neha", "Lade", 24, 90000);
		empDetails.add(emp1);
		empDetails.add(emp2);
		empDetails.add(emp3);
		empDetails.add(emp4);

		System.out.println(EmployeeLessAgeAndSalary.filterEmployeeByAgeAndSalary(empDetails));
	}
}
