package priyanka.Assignment41;
	
	import java.util.ArrayList;
	import java.util.List;

	/*
	return a list of employee name whose age is less than 30 and salary is greater than 75000.
	Hint : List<String> filterEmployeeByAgeAndSalary(List<Employee> listOfEmployee, double salary, int age){}
	*/

	public class Program3 {
		
		String firstName;
		String lastName;
		int age;
		int empId;
		int empDeptId;
		int salary;
		String empDeptName;
		
		public static List<Employee> filterEmployeeByAgeAndSalary(List<Employee> listOfEmployee, int salary, int age) {
			List<Employee> filteredList= new ArrayList<>();
			for(Employee object : listOfEmployee) {
				if(object.salary>salary && object.age<30)
					filteredList.add(object);
			}
			return filteredList;
		}
		
		public static void main(String[] args) {
			Employee employee1 = new Employee("Rakesh", "Mohan", 30, 123, 1586,5000, "Department1");
			Employee employee2 = new Employee("Vignesh", "Kamath", 25, 121, 1587,8000, "Department2");
			Employee employee3 = new Employee("Vikas", "Patil", 28, 124, 1586,400000, "Department1");
			Employee employee4 = new Employee("Vimal", "shinde", 34, 125, 1587,600000, "Department2");
			List<Employee> list = new ArrayList<>();
			list.add(employee1);
			list.add(employee2);
			list.add(employee3);
			list.add(employee4);
			System.out.println("Employees with salary more than 75000 & age below 30");
			List<Employee> filteredList = Program3.filterEmployeeByAgeAndSalary(list,75000,30);
			for(Employee e2: filteredList)
				System.out.println(e2+"\n");
		}
	}

