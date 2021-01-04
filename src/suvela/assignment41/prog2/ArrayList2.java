/*Program 2: 
Return a list of employee whose salary is less than 30000.
Hint : List<Employee> filterEmployeeBySalary(List<Employee> listOfEmployee){}*/
package suvela.assignment41.prog2;
import java.util.ArrayList;

import suvela.assignment41.Employee;

public class ArrayList2 {
 
	public ArrayList<Employee> filterByEmployeeBySalary(ArrayList<Employee> list){
		ArrayList<Employee> empList= new ArrayList<>();
		for(int index=0;index<list.size();index++) {
			Employee e= list.get(index);
			if(e.getSalary() < 30000) 
				empList.add(list.get(index));	
		}
		return empList;
	}
	
	public static void main(String[] args) {
		ArrayList<Employee> empList= new ArrayList<>();
		Employee e1 = new Employee("Suvela", "Khaladkar", "ABC", 24, 1090, 1111, 20000);
		Employee e2 = new Employee("Ankita", "Dahiwelkar", "ABC", 26, 1091, 11188, 5000);
		Employee e3 = new Employee("Aishwarya", "Sathe", "PQR", 25, 1067, 1541, 60000);

		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		ArrayList<Employee> emp=new ArrayList2().filterByEmployeeBySalary(empList);
		System.out.println(emp);
	}
}
