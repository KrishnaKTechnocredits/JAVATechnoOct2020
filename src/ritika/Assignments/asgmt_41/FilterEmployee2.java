package ritika.Assignments.asgmt_41;

/*Assignment-41 : 19th Dec'2020

Program 1:
Print all the details of employee having minimum salary.
-> Employee class fields : firstName, lastName, surnName, age, empId, empDeptId, empDeptName, salary.
-> override toString method in Employee class.

Program 2:
Return a list of employee whose salary is less than 30000.
Hint : List<Employee> filterEmployeeBySalary(List<Employee> listOfEmployee){}

Program 3:
return a list of employee name whose age is less than 30 and salary is greater than 75000.
Hint : List<String> filterEmployeeByAgeAndSalary(List<Employee> listOfEmployee, double salary, int age){}
*/
import java.util.ArrayList;
import java.util.List;

public class FilterEmployee2 {

	public List<String> filterEmployeeByAgeAndSalary(ArrayList<Employee> employeeDetails) {
		System.out.println("List of Employees with age less than 30 and salary more than 75000 are: ");
		List<String> listOfEmployee = new ArrayList<String>();

		for (int index = 0; index < employeeDetails.size(); index++) {
			if (employeeDetails.get(index).getAge() < 30 && employeeDetails.get(index).getSalary() > 75000)
				listOfEmployee.add(employeeDetails.get(index).getName());
		}
		return listOfEmployee;
	}
	
	public static void main(String[] args) {
		ArrayList<Employee> employeeDetails = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		emp1.setEmployeeDetails();
		Employee emp2 = new Employee();
		emp2.setEmployeeDetails();
		Employee emp3 = new Employee();
		emp3.setEmployeeDetails();

		employeeDetails.add(emp1);
		employeeDetails.add(emp2);
		employeeDetails.add(emp3);
		
		FilterEmployee2 filter2 = new FilterEmployee2();
		System.out.println(filter2.filterEmployeeByAgeAndSalary(employeeDetails));
	}
}
