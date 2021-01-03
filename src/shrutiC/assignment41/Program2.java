package shrutiC.assignment41;

import java.util.ArrayList;
import java.util.List;

/*Return a list of employee whose salary is less than 30000. 
 * Hint : List<Employee> filterEmployeeBySalary(List<Employee> listOfEmployee){} */

public class Program2 {

	public static List<Employee> sortEmployee(List<Employee> listEmp) {
		List<Employee> filteredList = new ArrayList<>();
		for (Employee emp : listEmp) {
			if (emp.empSalary < 30000)
				filteredList.add(emp);
		}
		return filteredList;
	}

	public static void main(String[] args) {

		Employee emp1 = new Employee("Shruti", "Kaustubh", "Jagtap", 25, 1165514, 03, "BT", 40000);
		Employee emp2 = new Employee("Kaustubh", "Subhash", "Jagtap", 30, 112147, 1011, "KPC", 25000);
		Employee emp3 = new Employee("Pradnya", "Avinash", "Chavan", 24, 151574, 2025, "HR", 15000);

		List<Employee> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);

		System.out.println("Employees with salary less than 30000 are : ");

		List<Employee> salList = Program2.sortEmployee(list);
		for (Employee employee : salList)
			System.out.println(employee+"\n");

	}

}
