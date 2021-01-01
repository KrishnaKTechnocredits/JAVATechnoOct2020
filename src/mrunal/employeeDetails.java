/* Assignment 41 - 
 * Program 1:
Print all the details of employee having minimum salary.
-> Employee class fields : firstName, lastName, surnName, age, empId, empDeptId, empDeptName.
-> override toString method in Employee class.*/package mrunal;
import java.util.ArrayList;
public class employeeDetails {
	
	public static Employee getEmployeeWithMaxSalary(ArrayList<Employee> empDetails) {
		int minimumSalary = empDetails.get(0).getEmpSalary();
		int minSalaryIndex = 0;
		for (int index = 0; index < empDetails.size(); index++) {
			if (empDetails.get(index).getEmpSalary() < minimumSalary) {
				minimumSalary = empDetails.get(index).getEmpSalary();
				minSalaryIndex = index;
			}
		}
		return empDetails.get(minSalaryIndex);
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> empDetails = new ArrayList<Employee>();
		
		Employee employee1 = new Employee
				(45000 , 30 ,123, "Naina", "Manoj","Shetty", "HR" );
		
		Employee employee2 = new Employee
				(47000 , 35 ,456,"Trupti", "Shailesh","Narayanan", "Finance" );
		
		Employee employee3 = new Employee
				(52000 , 33 ,789,"Neha", "Kalpesh","Raj", "Production" );
		
		Employee employee4 = new Employee
				(60000 , 42 ,1011, "Patrick", "Daniel","Fernandes", "HR" );
		
		empDetails.add(employee1);
		empDetails.add(employee2);
		empDetails.add(employee3);
		empDetails.add(employee4);

		Employee employee =getEmployeeWithMaxSalary(empDetails);
		System.out.println("Employee having  Minimum Salary is : " + employee);
		

	}

}
