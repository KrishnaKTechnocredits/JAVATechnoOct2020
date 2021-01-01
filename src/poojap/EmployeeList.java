/*Program 2: 
Return a list of employee whose salary is less than 30000.
Hint : List<Employee> filterEmployeeBySalary(List<Employee> listOfEmployee){}
*/
package poojap;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

	static List<EmployeeDetails> filterEmployeeBySalary(List<EmployeeDetails> listOfEmployee) {
		List<EmployeeDetails> filterlist = new ArrayList<EmployeeDetails>();
		for (EmployeeDetails emp : listOfEmployee) {
			if (emp.salary < 30000) {
				filterlist.add(emp);
			}
		}
		return filterlist;
	}

	public static void main(String[] args) {
		EmployeeDetails emp1 = new EmployeeDetails("Pooja", "Pekhale", "testing", 26, 10561, 101, 30000);
		EmployeeDetails emp2 = new EmployeeDetails("Yogita", "Pawale", "testing", 40, 10560, 105, 28000);
		EmployeeDetails emp3 = new EmployeeDetails("Madhuri", "Rajole", "testing", 31, 10561, 101, 25000);
		List<EmployeeDetails> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		System.out.println("Employee with Salary Less Than 30000 Is : ");
		List<EmployeeDetails> filteredList = EmployeeList.filterEmployeeBySalary(list);
		for (EmployeeDetails employee : filteredList) {
			System.out.println(employee);
		}
	}
}
