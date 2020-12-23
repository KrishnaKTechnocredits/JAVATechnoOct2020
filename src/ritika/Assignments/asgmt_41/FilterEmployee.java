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

public class FilterEmployee {

	public static void findEmployeeWithMinSalary(ArrayList<Employee> employeeDetails) {
		int minSalary = employeeDetails.get(0).getSalary();
		int index = 0;
		for (int i = 1; i < employeeDetails.size(); i++) {
			int temp = employeeDetails.get(i).getSalary();
			if (temp < minSalary) {
				minSalary = temp;
				index = i;
			}
		}
		System.out.println("Details of Employee with minimum salary are: ");
		Employee employee = employeeDetails.get(index);
		System.out.println(employee);
	}

	public static List<String> filterEmployeeBySalary(List<Employee> employeeDetails) {
		System.out.println("List of Employees with salary less than 30000 are: ");
		List<String> listOfEmployee = new ArrayList<String>();
		for (int index = 0; index < employeeDetails.size(); index++) {
			if (employeeDetails.get(index).getSalary() < 30000)
				listOfEmployee.add(employeeDetails.get(index).getName());
		}
		return listOfEmployee;
	}

	public static List<String> filterEmployeeByAgeAndSalary(List<Employee> employeeDetails) {
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
		Employee emp1 = new Employee("Ritika", "Gandhi", "DP01", 1111, 12345, 27000, 25);
		Employee emp2 = new Employee("Maulik", "Kanani", "DP02", 2222, 54321, 80000, 29);
		Employee emp3 = new Employee("Arun", "Rao", "DP03", 3333, 78960, 85000, 35);
		Employee emp4 = new Employee("Priya", "Tiwari", "DP04", 4444, 67890, 78000, 27);
		Employee emp5 = new Employee("Pankaj", "Sharma", "DP04", 4444, 45632, 22000, 22);

		employeeDetails.add(emp1);
		employeeDetails.add(emp2);
		employeeDetails.add(emp3);
		employeeDetails.add(emp4);
		employeeDetails.add(emp5);

		findEmployeeWithMinSalary(employeeDetails);
		System.out.println(filterEmployeeBySalary(employeeDetails));
		System.out.println(filterEmployeeByAgeAndSalary(employeeDetails));
	}
}
