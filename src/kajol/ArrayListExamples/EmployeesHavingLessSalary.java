/*Program2:
Return a list of employee whose salary is less than 30000.
Hint : List<Employee> filterEmployeeBySalary(List<Employee> listOfEmployee){}

*/


package kajol.ArrayListExamples;

import java.util.ArrayList;
import java.util.List;

public class EmployeesHavingLessSalary {
	
	static List<Employee> filterEmployeeBySalary(List<Employee> listOfEmployee){
		List<Employee> salaryList=new ArrayList<>();
		for(Employee e:listOfEmployee) {
			if(e.salary<30000)
				salaryList.add(e);
		}	
		return salaryList;
	}

	public static void main(String[] args) {
		Employee employee1= new Employee("A","B","C",25,101,1,"RLT",25000);
		Employee employee2= new Employee("P","Q","R",26,102,2,"Insurance",26000);
		Employee employee3= new Employee("M","N","O",27,103,3,"HR",27000);
		Employee employee4= new Employee("X","Y","Z",28,104,4,"Banking",32000);
		List<Employee> list = new ArrayList<>();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		System.out.println("Details of Employee with Salary less than 30000 : ");
		List<Employee> salaryList=EmployeesHavingLessSalary.filterEmployeeBySalary(list);
		for(Employee e:salaryList) {
			System.out.println(e+" ");
			System.out.println();
		}
	}
}
