package brijesh.assignment41;

import java.util.ArrayList;
import java.util.List;

/*
Return a list of employee whose salary is less than 30000.
Hint : List<Employee> filterEmployeeBySalary(List<Employee> listOfEmployee){}
*/

public class Program2 {
	
	public static List<Employee> filterEmployeeBySalary(List<Employee> listOfEmployee) {
		List<Employee> filteredList= new ArrayList<>();
		for(Employee object : listOfEmployee) {
			if(object.salary<30000)
				filteredList.add(object);
		}
		return filteredList;
	}
	
	public static void main(String[] args) {
		Employee employee1 = new Employee("Rakesh", "Malhotra", 30, 123, 1586,5000, "Department1");
		Employee employee2 = new Employee("Vignesh", "Kamath", 31, 121, 1587,8000, "Department2");
		Employee employee3 = new Employee("Vikash", "Rakholiya", 28, 124, 1586,200000, "Department1");
		Employee employee4 = new Employee("Vimal", "Dhaduk", 34, 125, 1587,400000, "Department2");
		List<Employee> list = new ArrayList<>();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		System.out.println("Employees with salary less than 30000");
		List<Employee> filteredList = Program2.filterEmployeeBySalary(list);
		for(Employee employee: filteredList)
			System.out.println(employee+"\n");
	}
}
