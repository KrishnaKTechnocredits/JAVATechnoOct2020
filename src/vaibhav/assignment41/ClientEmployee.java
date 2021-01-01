package vaibhav.assignment41;
import java.util.*;

/**
 * Program 1: 
Print all the details of employee having minimum salary.
-> Employee class fields : firstName, lastName, surnName, age, empId, empDeptId, empDeptName.
-> override toString method in Employee class. 

 * @author vaibhav
 *
 */

public class ClientEmployee {
	
	private static Employee getMinimumSalary(ArrayList<Employee> employeeArrayList) {
		
		int minSalaryIndex = 0;
		for(int index = 0 ; index < employeeArrayList.size();index++) {
			if(employeeArrayList.get(index).getSalary() < employeeArrayList.get(minSalaryIndex).getSalary()) {
				minSalaryIndex = index ;
			}			
		}
		return employeeArrayList.get(minSalaryIndex);
	}

	public static void main(String[] args) {
		Employee employee = new Employee("Vaibhav", "Jagtap", 30000, 31, 23, 10, "Electronics");
		Employee employee1 = new Employee("Rohan", "Mahadik", 40000, 31, 22, 11, "IT");
		Employee employee2= new Employee("Vishakha", "Borse", 5000, 31, 21, 12, "Floor Admin");
		Employee employee3 = new Employee("Maulik", "Kanani", 80000, 31, 20, 14, "Electronics");
		Employee employee4 = new Employee("Neha", "Arora", 15000, 43, 13, 15, "Make up Artist");
		
		ArrayList<Employee>employeeArrayList = new ArrayList <Employee>();
		employeeArrayList.add(employee);		
		employeeArrayList.add(employee1);
		employeeArrayList.add(employee2);
		employeeArrayList.add(employee3);
		employeeArrayList.add(employee4);
		
		System.out.println(ClientEmployee.getMinimumSalary(employeeArrayList));
	}
}
