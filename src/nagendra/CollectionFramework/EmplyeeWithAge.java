package nagendra.CollectionFramework;


import java.util.ArrayList;
import java.util.List;
/*
Program 3: 
return a list of employee name whose age is less than 30 and salary is greater than 75000.
Hint : List<String> filterEmployeeByAgeAndSalary(List<Employee> listOfEmployee, double salary, int age){}
*/


public class EmplyeeWithAge {

	static List<String> filterEmployeeByAgeAndSalary(List<Employee> employeeInfo, double salary, int age) {
		List<String> output = new ArrayList<String>();
		for (int index = 0; index < employeeInfo.size(); index++) {
			if (employeeInfo.get(index).getAge() < age && employeeInfo.get(index).getSalary() > salary) {
				output.add(employeeInfo.get(index).getFirstName());
			}
		}
		return output;
	}

	public static void main(String[] args) {
		ArrayList<Employee> employeeInfo = new ArrayList<Employee>();
		Employee e1 = new Employee("Ganesh", "Sharma", 27, 650, 41, "Nordics", 2000);
		Employee e2 = new Employee("Rahul", "Gupta", 25, 750, 81, "USA", 1000000);
		Employee e3 = new Employee("John", "Wright", 34, 850, 88, "Mumbai", 5000);
		employeeInfo.add(e1);
		employeeInfo.add(e2);
		employeeInfo.add(e3);

		List<String> output = EmplyeeWithAge.filterEmployeeByAgeAndSalary(employeeInfo, 75000, 30);
		System.out.println("Emplyees whoes age is less than 30 and salary is greater than 75000. \n"+output);
	}
}
