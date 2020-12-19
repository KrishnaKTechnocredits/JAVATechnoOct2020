package vaibhav.assignment40;

public class Employee {
	String employeeName;
	String deptId;
	int salary;
	
	Employee(String employeeName, String deptId, int salary){
		this.employeeName = employeeName;
		this.deptId = deptId;
		this.salary = salary;		
	}
	
	public static void displayHighestSalaryEmployee(Employee e1, Employee e2) {
		if (e1.salary > e2.salary) {	
			System.out.println("Employee "+e1.employeeName+" With DeptID "+e1.deptId+" has max salary of Rupees "+e1.salary);		
		}
		else{	
			System.out.println("Employee "+e2.employeeName+" With DeptID "+e2.deptId+" has max salary of Rupees "+e2.salary);		
		}
	}
	
	public static void main(String[] args) {
		Employee employee1 = new Employee("Vaibhav", "23", 35000);
		Employee employee2 = new Employee("Rohan", "25", 85000);
		Employee.displayHighestSalaryEmployee(employee1,employee2);
		
	}
	
	

}
