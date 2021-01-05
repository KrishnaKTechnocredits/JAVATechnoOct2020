package sadhana;

/*Program 3: 
return a list of employee name whose age is less than 30 and salary is greater than 75000.
Hint : List<String> filterEmployeeByAgeAndSalary(List<Employee> listOfEmployee, double salary, int age)*/
import java.util.ArrayList;
import java.util.List;

public class Program3_Assignment_41 {
	String firstName;
	String lastName;
	int age;
	int empId;
	int empDeptId;
	int salary;
	String empDeptName;

	public static List<Employee_Assignment_41> filterEmpByAgeAndSalary(List<Employee_Assignment_41> listOfEmployee,
			int salary, int age) {
		List<Employee_Assignment_41> newfilteredList = new ArrayList<>();
		for (Employee_Assignment_41 object : listOfEmployee) {
			if (object.salary > salary && object.age < 30)
				newfilteredList.add(object);
		}
		return newfilteredList;
	}

	public static void main(String[] args) {
		Employee_Assignment_41 emp1 = new Employee_Assignment_41("Janaki", "Patil", 24, 106, 23567, 7000, "BMS");
		Employee_Assignment_41 emp2 = new Employee_Assignment_41("Saurabh", "Pawar", 34, 113, 23453, 80000, "Admmin");
		Employee_Assignment_41 emp3 = new Employee_Assignment_41("Arun", "Hambarde", 30, 126, 26578, 300000,
				"Networking");
		List<Employee_Assignment_41> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);

		System.out.println("Employees with salary more than 75000 & age below 30");
		List<Employee_Assignment_41> newfilteredList = Program3_Assignment_41.filterEmpByAgeAndSalary(list, 75000, 30);
		for (Employee_Assignment_41 emp : newfilteredList)
			System.out.println(emp + "\n");
	}

}