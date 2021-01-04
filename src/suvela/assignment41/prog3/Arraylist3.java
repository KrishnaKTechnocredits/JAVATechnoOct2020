/*Program 3: 
return a list of employee name whose age is less than 30 and salary is greater than 75000.
Hint : List<String> filterEmployeeByAgeAndSalary(List<Employee> listOfEmployee, double salary, int age){}*/
package suvela.assignment41.prog3;

import java.util.ArrayList;

import suvela.assignment41.Employee;

public class Arraylist3 {

	public ArrayList<Employee> filterEmployeeByAgeAndSalary(ArrayList<Employee> list, double salary, int age) {
		ArrayList<Employee> empList = new ArrayList<>();
		for (int index = 0; index < list.size(); index++) {
			Employee e = list.get(index);
			if (e.getSalary() > salary && e.getage() < age)
				empList.add(list.get(index));
		}
		return empList;
	}

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<>();
		Employee e1 = new Employee("Suvela", "Khaladkar", "ABC", 24, 1090, 1111, 20000);
		Employee e2 = new Employee("Ankita", "Dahiwelkar", "ABC", 26, 1091, 11188, 5000);
		Employee e3 = new Employee("Aishwarya", "Sathe", "PQR", 25, 1067, 1541, 80000);

		empList.add(e1);
		empList.add(e2);
		empList.add(e3);

		ArrayList<Employee> emp = new Arraylist3().filterEmployeeByAgeAndSalary(empList, 75000, 30);
		System.out.println(emp);
	}

}
