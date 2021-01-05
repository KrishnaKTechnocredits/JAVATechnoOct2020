package sadhana;

/*Program 2: 
Return a list of employee whose salary is less than 30000.
Hint : List<Employee> filterEmployeeBySalary(List<Employee> listOfEmployee)*/

import java.util.ArrayList;
import java.util.List;

public class Program2_Assignment_41 {

	public static List<Employee_Assignment_41> filterEmpBySalary(List<Employee_Assignment_41> listOfEmployee) {
			List<Employee_Assignment_41> newList= new ArrayList<>();
			for(Employee_Assignment_41 object : listOfEmployee) {
				if(object.salary<30000)
					newList.add(object);
			}
			return newList;
		}

	public static void main(String[] args) {
		Employee_Assignment_41 emp1 = new Employee_Assignment_41("Janaki", "Patil", 24, 106, 23567,7000, "BMS");
		Employee_Assignment_41 emp2 = new Employee_Assignment_41("Saurabh", "Pawar", 34, 113, 23453,10000, "Admmin");
		Employee_Assignment_41 emp3 = new Employee_Assignment_41("Arun", "Hambarde", 30, 126, 26578,300000, "Networking");
		
		List<Employee_Assignment_41> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		System.out.println("Employees with salary less than 30000");
		List<Employee_Assignment_41> newList = Program2_Assignment_41.filterEmpBySalary(list);
		for(Employee_Assignment_41 employee: newList)
				System.out.println(employee+"\n");
		}

}
