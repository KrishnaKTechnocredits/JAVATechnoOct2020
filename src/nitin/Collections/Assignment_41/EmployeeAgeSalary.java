package nitin.Collections.Assignment_41;
/* Assignment-41 : 19th Dec'2020 - Program 3:Return a list of employee name whose age is less than 30 and salary is greater than 75000.
Hint : List<String> filterEmployeeByAgeAndSalary(List<Employee> listOfEmployee, double salary, int age){}*/
import java.util.ArrayList;

public class EmployeeAgeSalary {
	public static ArrayList<EmployeeBase> filterEmployeeByAgeSalary(ArrayList<EmployeeBase> empAgeSalary, double salary, int age){
		ArrayList<EmployeeBase> listOfEmp = new ArrayList<EmployeeBase>();
		for(int index=0;index<empAgeSalary.size();index++) {
			if(empAgeSalary.get(index).getSalary() > salary && empAgeSalary.get(index).getAge() < age)
				listOfEmp.add(empAgeSalary.get(index));
		}
		return listOfEmp;
	}
	public static void main(String[] args) {
		ArrayList<EmployeeBase> empAgeSalary = new ArrayList<EmployeeBase>();
		EmployeeBase e1 = new EmployeeBase("Nitin", "Jain", 29 , 3422, 12, "QA", 80000);
		EmployeeBase e2 = new EmployeeBase("Alan", "Walker", 30 , 3422, 12, "Reseach", 90000);
		EmployeeBase e3 = new EmployeeBase("Tom", "Ford", 32 , 3422, 12, "M&A", 100000);
		empAgeSalary.add(e1);
		empAgeSalary.add(e2);
		empAgeSalary.add(e3);
		System.out.println("Employee whose Age is Less then 30 Years & Salary is greater then Rs.75000 - "+EmployeeAgeSalary.filterEmployeeByAgeSalary(empAgeSalary,75000,30));
	}
}
