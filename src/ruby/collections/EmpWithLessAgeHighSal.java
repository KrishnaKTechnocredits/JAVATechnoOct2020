package ruby.collections;

import java.util.ArrayList;
import java.util.List;

/*Program 3:
return a list of employee name whose age is less than 30 and salary is greater than 75000.
Hint : List<String> filterEmployeeByAgeAndSalary(List<Employee> listOfEmployee, double salary, int age){}*/

public class EmpWithLessAgeHighSal {
    
	public static List <String> filterEmployeeByAgeAndSalary(List<Employee> listOfEmployee, double salary, int age){
		ArrayList<String> empNameList = new ArrayList<String>();
		for(int index=0;index<listOfEmployee.size();index++) {
		 if(listOfEmployee.get(index).getSalary() > salary && listOfEmployee.get(index).getAge() < age ) {
			 empNameList.add(listOfEmployee.get(index).getFirstName());
		 }
		}
		return empNameList;
	}
		
	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
			
		Employee e1= new Employee("Ruby", "Khan", 89000, 36, 1, 001, "Test");
		Employee e2= new Employee("Pooja", "Sharma", 90000, 36, 4, 001, "Test");
		Employee e3= new Employee("Sophia", "Mon", 80000, 24, 3, 004, "Dev");
		Employee e4= new Employee("Nikita", "Mon", 90000, 29, 2, 004, "Dev");
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		
		double salary = 75000;
		int age = 30;
		
		List<String> listOfEmpName = new ArrayList<String>();
		listOfEmpName = EmpWithLessAgeHighSal.filterEmployeeByAgeAndSalary(empList, salary, age);
		System.out.println(listOfEmpName);
		
		
		
	}

}
