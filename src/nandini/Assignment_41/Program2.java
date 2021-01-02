package nandini.Assignment_41;

import java.util.ArrayList;
import java.util.List;

public class Program2 {
   
	public static List<Employee> filterEmpBySalary(List<Employee> listOfEmployee) {
			List<Employee> newList= new ArrayList<>();
			for(Employee object : listOfEmployee) {
				if(object.salary<30000)
					newList.add(object);
			}
			return newList;
		}
		
	public static void main(String[] args) {
		Employee employee1 = new Employee("Ashish", "Verma", 32, 123, 2586,7000, "Admin Department");
		Employee employee2 = new Employee("Manisha", "Singh", 31, 121, 3587,10000, "Marketing Department");
		Employee employee3 = new Employee("Prince", "Tiwari", 28, 124, 4586,300000, "Sales Department");
		Employee employee4 = new Employee("Yash", "Bhan", 34, 125, 5587,400000, "IT Department");
		List<Employee> list = new ArrayList<>();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		System.out.println("Employees with salary less than 30000");
		List<Employee> newList = Program2.filterEmpBySalary(list);
		for(Employee employee: newList)
				System.out.println(employee+"\n");
		}

}
