/*Program 3: 
return a list of employee name whose age is less than 30 and salary is greater than 75000.
Hint : List<String> filterEmployeeByAgeAndSalary(List<Employee> listOfEmployee, double salary, int age){}
*/
package poojap;

import java.util.ArrayList;
import java.util.List;

public class Assignment41 {

	static List<EmployeeDetails> filterEmployeeBySalary(List<EmployeeDetails> listOfEmployee, int salary, int age) {
		List<EmployeeDetails> filterlist = new ArrayList<EmployeeDetails>();
		for (EmployeeDetails emp : listOfEmployee) {
			if (emp.salary > salary && emp.age < 30) {
				filterlist.add(emp);
			}
		}
		return filterlist;
	}

	public static void main(String[] args) {
		EmployeeDetails emp1 = new EmployeeDetails("Pooja", "Pekhale", "Testing", 28, 10561, 101, 76000);
		EmployeeDetails emp2 = new EmployeeDetails("Yogita", "Pawale", "Testing", 40, 10560, 105, 78000);
		EmployeeDetails emp3 = new EmployeeDetails("Madhuri", "Rajole", "Testing", 31, 10561, 101, 25000);
		List<EmployeeDetails> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		System.out.println("Employee with Salary Greater Than 75000 and Age less Than 30: ");
		List<EmployeeDetails> filteredList = Assignment41.filterEmployeeBySalary(list, 75000, 30);
		for (EmployeeDetails employee2 : filteredList) {
			System.out.println(employee2);
		}
	}
}
