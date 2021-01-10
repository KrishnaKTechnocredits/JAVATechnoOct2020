package priyanka.Assignment39;

/*Program : 1 
Create Employee class and parameterized constructor with attributes empId , empName,
years of Experience and salary. Write a method to display the details of employees. Create a method isEligible which will return true if Employee salary is more than 30000. Create a method isSwitchRequired, which will return true if yearsOfExperience * 200000 < salary.
*/

public class Employee {
	
	int empId;
	String empName;
	int yearsOfExperience;
	int salary;
	
	public Employee(int empID, String empName, int yearsOfExperience, int salary) {
		this.empId=empID;
		this.empName=empName;
		this.yearsOfExperience=yearsOfExperience;
		this.salary=salary;
	}
	
	boolean isEligible() {
		if(salary>30000)
			return true;
		return false;
	}

	boolean isSwitchRequired() {
		if(yearsOfExperience*200000 > salary)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		Employee employee1 = new Employee(123, "Rajesh", 10, 2100000);
		Employee employee2 = new Employee(124, "Vignesh", 5, 600000);
		Employee employee3 = new Employee(125, "RamuKaka", 2, 20000);
		System.out.println("Employee: "+employee1.empName+", isEligible: "+employee1.isEligible()+", isSwitchRequired: "+employee1.isSwitchRequired());
		System.out.println("Employee: "+employee2.empName+", isEligible: "+employee2.isEligible()+", isSwitchRequired: "+employee2.isSwitchRequired());
		System.out.println("Employee: "+employee3.empName+", isEligible: "+employee3.isEligible()+", isSwitchRequired: "+employee3.isSwitchRequired());
	}

}
