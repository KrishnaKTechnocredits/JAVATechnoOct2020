package vaibhav.assignment41;
/*
 * Program 2: 
Return a list of employee whose salary is less than 30000.
Hint : List<Employee> filterEmployeeBySalary(List<Employee> listOfEmployee){}

 */

import java.util.ArrayList;

public class ClientEmployeeP2 {
	
	static ArrayList<Employee>employeeArrayList1 = new ArrayList <Employee>();
	
	public static ArrayList<Employee> filterEmployeeBySalary(ArrayList<Employee> listOfEmployee){		
		
		for (int index = 0 ; index < listOfEmployee.size() ; index++) {
			if(listOfEmployee.get(index).getSalary() < 30000) {
				employeeArrayList1.add(listOfEmployee.get(index));
			}			
		}		
		return employeeArrayList1;		
	}

	public static void main(String[] args) {		

		Employee employee = new Employee("Vaibhav", "Jagtap", 29000, 31, 23, 10, "Electronics");
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
		
		ArrayList employeeArrayList2 = ClientEmployeeP2.filterEmployeeBySalary(employeeArrayList);
		System.out.println(employeeArrayList2);

	}

}
