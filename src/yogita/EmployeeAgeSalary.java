/*
 Program 3: 
return a list of employee name whose age is less than 30 and salary is greater than 75000.
Hint : List<String> filterEmployeeByAgeAndSalary(List<Employee> listOfEmployee, double salary, int age){}

*/

package yogita;

import java.util.ArrayList;

public class EmployeeAgeSalary {

	String firstName, lastName;
	int age;
	double salary;

	EmployeeAgeSalary(String firstName, String lastName, int age, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}

	public String toString() {
		return "\nName Of Employee:" + firstName + " " + lastName + "\nAge:" + age + "\nSalary:" + salary;
	}

	public static ArrayList<EmployeeAgeSalary> filterEmployeeByAgeAndSalary(ArrayList<EmployeeAgeSalary> arrayList) {
		ArrayList<EmployeeAgeSalary> list = new ArrayList<EmployeeAgeSalary>();
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).age < 30 && arrayList.get(i).salary > 75000) {
				list.add(arrayList.get(i));
			}
		}
		return list;
	}

	public static void main(String[] args) {

		ArrayList<EmployeeAgeSalary> empDetails = new ArrayList<EmployeeAgeSalary>();
		EmployeeAgeSalary emp1 = new EmployeeAgeSalary("Yogita", "Pawale", 26, 90000);
		EmployeeAgeSalary emp2 = new EmployeeAgeSalary("Pooja", "Pekhale", 25, 80000);
		EmployeeAgeSalary emp3 = new EmployeeAgeSalary("Kajol", "patil", 28, 28000);
		EmployeeAgeSalary emp4 = new EmployeeAgeSalary("Asmita", "Kulkarni", 30, 25000);
		empDetails.add(emp1);
		empDetails.add(emp2);
		empDetails.add(emp3);
		empDetails.add(emp4);

		System.out.println(EmployeeAgeSalary.filterEmployeeByAgeAndSalary(empDetails));
	}
}
