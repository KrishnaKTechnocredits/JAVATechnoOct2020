package nandini.Assignment_41;

import java.util.ArrayList;
import java.util.List;

public class Program3 {
	String firstName;
	String lastName;
	int age;
	int empId;
	int empDeptId;
	int salary;
	String empDeptName;
	
	public static List<Employee> filterEmpByAgeAndSalary(List<Employee> listOfEmployee, int salary, int age) {
		List<Employee> newfilteredList= new ArrayList<>();
		for(Employee object : listOfEmployee) {
			if(object.salary>salary && object.age<30)
				newfilteredList.add(object);
		}
		return newfilteredList;
	}
	
	public static void main(String[] args) {
		Employee employee1 = new Employee("Ashish", "Verma", 32, 123, 2586,7000, "Admin Department");
		Employee employee2 = new Employee("Manisha", "Singh", 31, 121, 3587,10000, "Marketing Department");
		Employee employee3 = new Employee("Prince", "Tiwari", 28, 134, 4586,300000, "Sales Department");
		Employee employee4 = new Employee("Yash", "Bhan", 34, 125, 5587,400000, "IT Department");
		List<Employee> list = new ArrayList<>();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		System.out.println("Employees with salary more than 75000 & age below 30");
		List<Employee> newfilteredList = Program3.filterEmpByAgeAndSalary(list,75000,30);
		for(Employee emp: newfilteredList)
			System.out.println(emp+"\n");
	}

}
