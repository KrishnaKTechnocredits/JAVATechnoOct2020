package nagendra.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

/*
Program 2: 
Return a list of employee whose salary is less than 30000.
Hint : List<Employee> filterEmployeeBySalary(List<Employee> listOfEmployee){}
*/
public class EmployeeMinimumSalary {
	
	public static List<Employee> filterEmployeeBySalary(List<Employee> employeeInfo) {
		List<Employee> listOfEmployee = new ArrayList<Employee>();
		for (int index = 0; index < employeeInfo.size(); index++) {
			if (employeeInfo.get(index).getSalary() < 30000) {
				listOfEmployee.add(employeeInfo.get(index));
			}
		}
		return listOfEmployee;
	}

	public static void main(String[] args) {
		
		ArrayList<Employee> employeeInfo = new ArrayList<Employee>();
		Employee e1 = new Employee("Ishant", "Nagpal", 27, 650, 41, "Nordics", 2000);
		Employee e2 = new Employee("Sujay", "Sawant", 25, 750, 81, "USA", 1000000);
		Employee e3 = new Employee("Chandan", "Samant", 34, 850, 88, "Mumbai", 5000);
		employeeInfo.add(e1);
		employeeInfo.add(e2);
		employeeInfo.add(e3);
		List<Employee> employeeOutput = EmployeeMinimumSalary.filterEmployeeBySalary(employeeInfo);
		System.out.println("Emplyees with salary is less than 30000 \n"+employeeOutput);

	}
}
