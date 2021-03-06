/*Assignment-41 
Program 2: 
Return a list of employee whose salary is less than 30000.
Hint : List<Employee> filterEmployeeBySalary(List<Employee> listOfEmployee){}*/
package shrutiS.assignment41;

import java.util.ArrayList;

public class ClientEmployeeP2 {
	static ArrayList<Employee> employeeArrayList1 = new ArrayList<Employee>();

	public static ArrayList<Employee> filterEmployeeBySalary(ArrayList<Employee> listOfEmployee) {

		for (int index = 0; index < listOfEmployee.size(); index++) {
			if (listOfEmployee.get(index).getSalary() < 30000) {
				employeeArrayList1.add(listOfEmployee.get(index));
			}
		}
		return employeeArrayList1;
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
		ArrayList employeeArrayList2 = ClientEmployeeP2.filterEmployeeBySalary(employeeArrayList);
		System.out.println(employeeArrayList2);
	}
}
