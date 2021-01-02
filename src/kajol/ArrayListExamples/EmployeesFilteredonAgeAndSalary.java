/*Program 3: 
return a list of employee name whose age is less than 30 and salary is greater than 75000.
Hint : List<String> filterEmployeeByAgeAndSalary(List<Employee> listOfEmployee, double salary, int age){}*/

package kajol.ArrayListExamples;

import java.util.ArrayList;
import java.util.List;

public class EmployeesFilteredonAgeAndSalary {
	String name;;
	int age;
	double salary;
	
	public EmployeesFilteredonAgeAndSalary(String name,int age,double salary) {
		this.name=name;
		this.salary=salary;
		this.age=age;
	}
	static List<String> filterEmployeeByAgeAndSalary(List<EmployeesFilteredonAgeAndSalary> listOfEmployee, double salary, int age){
		List<String> list=new ArrayList<>();
		for(EmployeesFilteredonAgeAndSalary e:listOfEmployee) {
			if(e.salary>salary && e.age<30)
				list.add(e.name);
		}	
		return list;
	}

	public static void main(String[] args) {
		EmployeesFilteredonAgeAndSalary employee1= new EmployeesFilteredonAgeAndSalary("ABC", 25, 76000);
		EmployeesFilteredonAgeAndSalary employee2= new EmployeesFilteredonAgeAndSalary("XYZ", 26, 86000);
		EmployeesFilteredonAgeAndSalary employee3= new EmployeesFilteredonAgeAndSalary("PQR", 25, 72000);
		List<EmployeesFilteredonAgeAndSalary> list = new ArrayList<>();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		System.out.println("List of Name of  Employees with age  less than 30yrs and Salary greater than 75000 : ");
		List<String> AgeSalaryList= EmployeesFilteredonAgeAndSalary.filterEmployeeByAgeAndSalary(list,75000,30);
		System.out.println(AgeSalaryList);	
	}
}
