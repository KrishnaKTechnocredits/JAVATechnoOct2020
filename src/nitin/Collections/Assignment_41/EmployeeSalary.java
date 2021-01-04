package nitin.Collections.Assignment_41;
import nitin.Collections.Assignment_41.EmployeeBase;
import java.util.ArrayList;
/* Assignment-41 : 19th Dec'2020 - Program 2: Return a list of employee whose salary is less than 30000.
Hint : List<Employee> filterEmployeeBySalary(List<Employee> listOfEmployee){} */
public class EmployeeSalary {
	public static ArrayList<EmployeeBase> filterEmployeeBySalary(ArrayList<EmployeeBase> empSalary){
		ArrayList<EmployeeBase> listOfEmp = new ArrayList<EmployeeBase>();
		for(int index=0;index<empSalary.size();index++) {
			if(empSalary.get(index).getSalary() < 30000)
				listOfEmp.add(empSalary.get(index));
		}
		return listOfEmp;
	}
	public static void main(String[] args) {
		ArrayList<EmployeeBase> empSalary = new ArrayList<EmployeeBase>();
		EmployeeBase e1 = new EmployeeBase("Nitin", "Jain", 32 , 3422, 12, "QA", 40000);
		EmployeeBase e2 = new EmployeeBase("Alan", "Walker", 32 , 3422, 12, "Research", 35000);
		EmployeeBase e3 = new EmployeeBase("Tom", "Ford", 32 , 3422, 12, "M&A", 25000);
		empSalary.add(e1);
		empSalary.add(e2);
		empSalary.add(e3);
		System.out.println("Employee whose salary is less then Rs.30000 - "+EmployeeSalary.filterEmployeeBySalary(empSalary));
	}
}
