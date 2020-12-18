package rohan.Assignment39;

/*
 * Program : 1 
Create Employee class and parameterized constructor with attributes empId , empName,
years of Experience and salary. Write a method to display the details of employees. 
Create a method isEligible which will return true if Employee salary is more than 30000. 
Create a method isSwitchRequired, which will return true if yearsOfExperience * 200000 < salary.
 */

public class Employee {
	
	int empID=0,exp=0,sal=0;
	String empName;
	static Employee emp;

	Employee(int empID,String empName, int exp, int sal){
		this.empID = empID;
		this.empName = empName;
		this.exp = exp;
		this.sal = sal;
	}
	
	void display() {
		System.out.println("Employee ID: "+empID);
		System.out.println("Employee Name: "+empName);
		System.out.println("Total Year of experience: "+exp);
		System.out.println("Gross Salary: "+sal);
		boolean isSalGreaterThan30K = emp.isEligible(sal);
		if(isSalGreaterThan30K)
			System.out.println("Salary is more than 30,000");
		else
			System.out.println("Salary is less than 30,000");
		boolean isSwitch = emp.isSwitchRequired(exp,sal);
		if(isSwitch)
			System.out.println("Switch is required");
		else
			System.out.println("Switch is not required");
	}
	
	boolean isEligible(int sal) {
		if(sal > 30000)
			return true;
		else 
			return false;
	}
	
	boolean isSwitchRequired(int exp, int sal) {
		if((exp*200000) < (sal*12))
			return false;
		else
			return true;
	}
	
	public static void main(String[] args) {
		emp = new Employee(97122,"Rohan",10,80000);
		emp.display();
		System.out.println("-------------------------------");
		emp = new Employee(97123,"Sagar",11,210000);
		emp.display();
	}
}
