/*
 * Program : 1 
Create Employee class and parameterized constructor with attributes empId , empName,
years of Experience and salary. Write a method to display the details of employees. 
Create a method isEligible which will return true if Employee salary is more than 30000. 
Create a method isSwitchRequired, which will return true if yearsOfExperience * 200000 < salary.
 */

package deepak.assignment39;

public class Employee {

	String empName;
	int empId, yearsOfExp;
	double sal;
	
	Employee(int empId, String empName, int yearsOfExp, double sal){
			
		this.empId = empId;
		this.empName = empName;
		this.yearsOfExp = yearsOfExp;
		this.sal = sal;
	}
	
	void displayDetails() {
		
		System.out.println("Name of Emp is :"+ empName );
		System.out.println("Emp ID is :"+ empId);
		System.out.println("Having Experiance :"+ yearsOfExp );
		System.out.println("Current Salary is :"+ sal);
	}
	
	boolean isElligible() {
		
		if(sal>30000)
		return true;
		
		else
			return false;
	}
	
	boolean isSwitchRequired() {
		
		if(yearsOfExp * 200000 < sal)
			return true;
		else
			return false;
		
	}
	
	public static void main(String[] args) {
		
		Employee refVar = new Employee(1, "Deepak", 3, 35000);
		refVar.displayDetails();
		System.out.println("Elligibility :"+ " " +refVar.isElligible());
		System.out.println("Switch Required"+ " " +refVar.isSwitchRequired());
	}

}
