package shrutiC.assignment41;

import java.util.ArrayList;
import java.util.List;

public class Program3 {

	public static List<Employee> sortEmployee(List<Employee> listEmp) {
		List<Employee> filteredList = new ArrayList<>();
		for (Employee emp : listEmp) {
			if (emp.empSalary > 75000 && emp.age < 30)
				filteredList.add(emp);
		}
		return filteredList;
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee("Shruti", "Kaustubh", "Jagtap", 25, 1165514, 03, "BT", 80000);
		Employee emp2 = new Employee("Kaustubh", "Subhash", "Jagtap", 30, 112147, 1011, "KPC", 25000);
		Employee emp3 = new Employee("Pradnya", "Avinash", "Chavan", 24, 151574, 2025, "HR", 15000);

		List<Employee> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);

		System.out.println("Employees with salary more than 75000 and age less that 30 are : ");

		List<Employee> salList = Program3.sortEmployee(list);
		for (Employee employee : salList)
			System.out.println(employee + "\n");

	}

}
