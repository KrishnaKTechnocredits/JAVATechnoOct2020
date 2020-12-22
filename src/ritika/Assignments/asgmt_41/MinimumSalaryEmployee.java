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

public class MinimumSalaryEmployee {

	public void findEmployeeWithMinSalary(ArrayList<Employee> employeeDetails) {
		int minSalary = employeeDetails.get(0).getSalary();
		int index = 0;
		for (int i=1; i<employeeDetails.size();i++) {
			int temp = employeeDetails.get(i).getSalary();
			if (temp<minSalary) {
				minSalary = temp;
				index = i;
			}
		}
		System.out.println("Details of Employee with minimum salary are: ");
		Employee employee = employeeDetails.get(index);
		employee.printEmployeeDetails();
	}
	
	public static void main(String[] args) {
		ArrayList<Employee> employeeDetails = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		emp1.setEmployeeDetails();
		Employee emp2 = new Employee();
		emp2.setEmployeeDetails();
		Employee emp3 = new Employee();
		emp3.setEmployeeDetails();
		Employee emp4 = new Employee();
		emp4.setEmployeeDetails();
		
		employeeDetails.add(emp1);
		employeeDetails.add(emp2);
		employeeDetails.add(emp3);
		employeeDetails.add(emp4);
	
		MinimumSalaryEmployee minSalary = new MinimumSalaryEmployee();
		minSalary.findEmployeeWithMinSalary(employeeDetails);
	} 
}
