package prasad.collections;

/*Program 3: 
return a list of employee name whose age is less than 30 and salary is greater than 75000.
Hint : List<String> filterEmployeeByAgeAndSalary(List<Employee> listOfEmployee, double salary, int age){}*/

import java.util.ArrayList;

public class EmployeewithageandSal {
	
	static ArrayList<Employee> findEmp(ArrayList<Employee> list){
		ArrayList<Employee> output = new ArrayList<Employee>();
		for(int index=0;index<list.size();index++) {
			Employee employee = list.get(index);
			if(employee.getSalary()>75000 && employee.getAge()<30) {
				output.add(employee);
			}
		}
			
		return output;
	}
	
	public static void main(String[]arg) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		Employee employee1 = new Employee("Tim","Cook",24,44857,4486,"CBO",76000);
		empList.add(employee1);
		Employee employee2 = new Employee("John","Snow",21,44858,4486,"CBO",87000);
		empList.add(employee2);
		Employee employee3 = new Employee("Winny","Snow",21,44859,4487,"C&M",74000);
		empList.add(employee3);
		Employee employee4 = new Employee("Larry","Page",31,44860,4487,"C&M",100000);
		empList.add(employee4);
		Employee employee5 = new Employee("Jerry","Willimson",24,44861,4487,"C&M",95000);
		empList.add(employee5);
		
		ArrayList<Employee> output = findEmp(empList);
		System.out.println("Printing employee names with age less than 30 and salary greater than 75000");
		for(int index=0;index<output.size();index++) {
			Employee employee = output.get(index);
			String name = employee.displayEmpName();
			System.out.println(name);
		}
	}
}
