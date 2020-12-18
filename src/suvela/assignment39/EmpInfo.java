/*Program : 1 
Create Employee class and parameterized constructor with attributes empId , empName,
years of Experience and salary. Write a method to display the details of employees.
 Create a method isEligible which will return true if Employee salary is more than 30000. 
 Create a method isSwitchRequired, which will return true if yearsOfExperience * 200000 < salary.*/
package suvela.assignment39;

public class EmpInfo {
	int empId;
	String empName;
	int yearsOfExp;
	double salary;
	
	public EmpInfo(int empId,String empName,int yearsOfExp,double salary) {
		this.empId= empId;
		this.empName= empName;
		this.yearsOfExp= yearsOfExp;
		this.salary= salary;
	}
	public void displayInfo() {
		System.out.println("Employee Id:"+empId+" Employee Name:"+empName+" Years of experience:"+yearsOfExp+" Salary:"+salary);
	}
	public boolean isEligible() {
		if(salary >30000)
			return true;
		return false;
	}
	public boolean isSwitchRequired() {
		int value;
		value= yearsOfExp * 200000;
		if(value<salary)
			return true;
		return false;
	}
	public static void main(String[] args) {
		EmpInfo ei= new EmpInfo(1020, "Harshit", 4, 25000);
		ei.displayInfo();
		
		boolean value= ei.isEligible();
		if(value)
			System.out.println(value+":Salary is more than 30000");
		else
			System.out.println(value+ ":Salary is not more than 30000");
		
		boolean flag=ei.isSwitchRequired();
		if(flag)
			System.out.println(flag+" :Switch required");
		else
			System.out.println(flag+" :Switch not required");
		
		EmpInfo ei1= new EmpInfo(1400, "Vedant", 2, 600000);
		ei1.displayInfo();
		
		boolean value1= ei1.isEligible();
		if(value1)
			System.out.println(value1+":Salary is more than 30000");
		else
			System.out.println(value1+ ":Salary is not more than 30000");
		
		boolean flag2=ei1.isSwitchRequired();
		if(flag2)
			System.out.println(flag2+" :Switch required");
		else
			System.out.println(flag2+" :Switch not required");
	}

}
