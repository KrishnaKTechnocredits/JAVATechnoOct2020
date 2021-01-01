package prasad.constructors;

/*Program : 1 
Create Employee class and parameterized constructor with attributes empId , empName,
years of Experience and salary. Write a method to display the details of employees. 
Create a method isEligible which will return true if Employee salary is more than 30000. 
Create a method isSwitchRequired, which will return true if yearsOfExperience * 200000 < salary.*/

public class Employee {
	int empId;
	String empName;
	double exp;
	int salary;
	
	Employee(int empId, String empName, double exp , int salary){
		this.empId=empId;
		this.empName=empName;
		this.exp=exp;
		this.salary=salary;
	}
	
	void printEmpDetails(){
		System.out.println("Employee Details");
		System.out.println("====================");
		System.out.println("Employee ID: "+ empId);
		System.out.println("Employee Name: "+ empName);
		System.out.println("Experience: "+ exp + " yrs");
		System.out.println("Salary: "+ salary);
	}
	
	boolean isEligible(){
		boolean flag = false;
		if(salary>30000)
			flag= true;
		
		return flag;
	}
	
	boolean isSwitchRequired() {
		boolean flag = false;
		if(salary <exp*200000) {
			flag=true;
		}
	
		return flag;
	}
	
	public static void main(String[]arg) {
		Employee emp= new Employee(447446,"Mark",8.5,1200000);
		emp.printEmpDetails();
		boolean flag = emp.isEligible();
		System.out.println("Is emp eligible? " + flag);
		boolean flag01 = emp.isSwitchRequired();
		System.out.println("Is switch required? " + flag01);	
	}

}
