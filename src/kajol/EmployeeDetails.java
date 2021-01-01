/*Assignment - 39 

Program : 1 
-Create Employee class and parameterized constructor with attributes empId , empName,years of Experience and salary.
-Write a method to display the details of employees. 
-Create a method isEligible which will return true if Employee salary is more than 30000. 
-Create a method isSwitchRequired, which will return true if yearsOfExperience * 200000 > salary.

*/

package kajol;
public class EmployeeDetails {
	int employeeId;
	String employeeName;
	int yrsOfExperience;
	double salary;
	
	public EmployeeDetails(int employeeId, String employeeName, int yrsOfExperience, double salary) {
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.yrsOfExperience=yrsOfExperience;
		this.salary=salary;
	}
	
	void displayEmployeeDetails() {
		System.out.println("-----------------Employee Details---------------");
		System.out.println("Employee Id : "+employeeId);
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Years of Experience : "+yrsOfExperience);
		System.out.println("Employee Salary : "+salary);
		if(isEligible())
			System.out.println("Is Employee Eligible according to Salary : YES.");
		else {
			System.out.println("Is Employee Eligible according to Salary : NO.");
		}
		if(isEligible()) {
			if(isSwitchRequired())
				System.out.println("Is Switch required according to current Salary : YES.");
			else
				System.out.println("Is Switch required according to current Salary : NO.");
		}
		System.out.println();
	}
	
	boolean isEligible() {
		if(salary>30000)
			return true;
		return false;
	}
	
	boolean isSwitchRequired() {
		if((yrsOfExperience* 200000)>salary)
			return true;
		return false;
	}
	
	public static void main(String args[]) {
		EmployeeDetails empDetails=new EmployeeDetails(101,"ABC",3,400000);
		empDetails.displayEmployeeDetails();
		EmployeeDetails empDetails1=new EmployeeDetails(102,"XYZ",5,1000000);
		empDetails1.displayEmployeeDetails();
		EmployeeDetails empDetails2=new EmployeeDetails(103,"PQR",2,25000);
		empDetails2.displayEmployeeDetails();			
	}
}
