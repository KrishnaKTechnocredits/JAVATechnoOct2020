package vaibhav.assignment41;

/**
 * Program 3: 
return a list of employee name whose age is less than 30 and salary is greater than 75000.
Hint : List<String> filterEmployeeByAgeAndSalary(List<Employee> listOfEmployee, double salary, int age){}

 */

import java.util.ArrayList;

public class ClientEmployeeP3 {
	
	public static ArrayList<String> filterEmployeeByAgeAndSalary(ArrayList<Employee> listOfEmployee, double salary, int age){
		ArrayList<String> employeeUpdated = new ArrayList<String>();
		for(int index = 0 ; index < listOfEmployee.size();index++ ){
			if (listOfEmployee.get(index).getAge() < age && listOfEmployee.get(index).getSalary() > salary) 
				employeeUpdated.add(String.valueOf(listOfEmployee.get(index)));			
		}
		return employeeUpdated;
	}

	public static void main(String[] args) {
		Employee employee = new Employee("Vaibhav", "Jagtap", 29000, 31, 23, 10, "Electronics");
		Employee employee1 = new Employee("Rohan", "Mahadik", 140000, 28, 22, 11, "IT");
		Employee employee2= new Employee("Vishakha", "Borse", 5000, 31, 21, 12, "Floor Admin");
		Employee employee3 = new Employee("Maulik", "Kanani", 80000, 32, 20, 14, "Electronics");
		Employee employee4 = new Employee("Neha", "Arora", 15000, 43, 13, 15, "Make up Artist");
		
		ArrayList<Employee>employeeArrayList = new ArrayList <Employee>();
		employeeArrayList.add(employee);		
		employeeArrayList.add(employee1);
		employeeArrayList.add(employee2);
		employeeArrayList.add(employee3);
		employeeArrayList.add(employee4);
		
		ArrayList temp=ClientEmployeeP3.filterEmployeeByAgeAndSalary(employeeArrayList, 25000.00,35);
		System.out.println(temp);
	}

}
