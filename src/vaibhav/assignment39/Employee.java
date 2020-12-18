package vaibhav.assignment39;

/*Program : 1 
Create Employee class and parameterized constructor with attributes empId , empName,
years of Experience and salary. Write a method to display the details of employees. Create a method isEligible which will return true if Employee salary is more than 30000. Create a method isSwitchRequired, which will return true if yearsOfExperience * 200000 < salary.*/


public class Employee {
	int empId ;
	String empName;
	int yearsOfExp;
	int salary;	
	
	public Employee(int empId ,String empName,int yearsOfExp,int salary) {
		this.empId = empId;
		this.empName = empName;
		this.yearsOfExp = yearsOfExp;
		this.salary = salary;		
	}
	
	void displayEmployeeDetails() {
		System.out.println("Employee ID is "+empId+" Employee Name is "+empName+" Years of Exp is "+yearsOfExp+" Salary is "+salary);
	}
	
	boolean isEligible() {
		if (salary > 30000)
			return true;
		else 
			return false;
	}
	
	boolean isSwitchRequired() {
		if ((yearsOfExp * 200000) < salary)
			return true;
		else 
			return false;	
	}
	
	public static void main(String[] args) {
		Employee employee = new Employee(23,"Vaibhav",3,800000);
		employee.displayEmployeeDetails();
		boolean eligibility=employee.isEligible();{
			if (eligibility)
				System.out.println("Employee is eligible for change the company");
			else
				System.out.println("Employee is not eligible for change the company");
		}
		boolean switch1= employee.isSwitchRequired();{
			if (switch1)
				System.out.println("Employee doesn't need to change the job");
			else
				System.out.println("Employee need to change the job ASAP");
		}		
	}	

}
