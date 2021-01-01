package ruby.collections;

import java.util.ArrayList;

/*Program 2:
Return a list of employee whose salary is less than 30000.
Hint : List<Employee> filterEmployeeBySalary(List<Employee> listOfEmployee){}*/

public class EmployeeWithLesSalary {
	
	ArrayList<Employee> filterEmployeeBySalary(ArrayList<Employee> listOfEmployee){
		ArrayList<Employee> empWithlessSalary = new ArrayList<Employee>();
		for(int index=0;index<listOfEmployee.size();index++) {
			if(listOfEmployee.get(index).getSalary() < 30000) {
				empWithlessSalary.add(listOfEmployee.get(index));
			}
		}
		return empWithlessSalary;
	}

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		Employee emp1 = new Employee("Ruby", "Khan", 10000, 35, 1, 002, "Testing");
		Employee emp2 = new Employee("Ruby", "Khan", 20000, 35, 1, 002, "Testing");
		Employee emp3 = new Employee("Nasir", "Khan", 45000, 37, 4, 002, "Testing");
		Employee emp4 = new Employee("tina", "Khan", 60000, 35, 5, 001, "Dev");
		Employee emp5 = new Employee("tim", "Khan", 65000, 32, 3, 001, "Dev");
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		EmployeeWithLesSalary eWithLessSalary = new EmployeeWithLesSalary();
		System.out.println(eWithLessSalary.filterEmployeeBySalary(empList));
	}

}
