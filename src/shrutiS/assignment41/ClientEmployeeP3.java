/*Assignment-41 
Program 3: 
return a list of employee name whose age is less than 30 and salary is greater than 75000.
Hint : List<String> filterEmployeeByAgeAndSalary(List<Employee> listOfEmployee, double salary, int age){}*/
package shrutiS.assignment41;

import java.util.ArrayList;

public class ClientEmployeeP3 {

	public static ArrayList<String> filterEmployeeByAgeAndSalary(ArrayList<Employee> listOfEmployee, double salary,
			int age) {
		ArrayList<String> employeeUpdated = new ArrayList<String>();
		for (int index = 0; index < listOfEmployee.size(); index++) {
			if (listOfEmployee.get(index).getAge() < age && listOfEmployee.get(index).getSalary() > salary)
				employeeUpdated.add(String.valueOf(listOfEmployee.get(index)));
		}
		return employeeUpdated;
	}

	public static void main(String[] args) {
		Employee employee = new Employee("Shruti", "Sattigeri", 30000, 31, 23, 10, "Electronics");
		Employee employee1 = new Employee("Shikha", "Mishra", 40000, 31, 22, 11, "IT");
		Employee employee2 = new Employee("Swati", "Kadu", 5000, 31, 21, 12, "Floor Admin");
		Employee employee3 = new Employee("Anjali", "Garg", 80000, 31, 20, 14, "testing");
		ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();
		employeeArrayList.add(employee);
		employeeArrayList.add(employee1);
		employeeArrayList.add(employee2);
		employeeArrayList.add(employee3);

		ArrayList temp = ClientEmployeeP3.filterEmployeeByAgeAndSalary(employeeArrayList, 25000.00, 35);
		System.out.println(temp);
	}
}
