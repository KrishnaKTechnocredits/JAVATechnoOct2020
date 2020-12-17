package raghvendra.Constructor;
/*Program : 1 
Create Employee class and parameterized constructor with attributes empId , empName,
years of Experience and salary. Write a method to display the details of employees. 
Create a method isEligible which will return true if Employee salary is more than 30000. 
Create a method isSwitchRequired, which will return true if yearsOfExperience * 200000 < salary.*/
public class Employee {
	int employeeID;
	String employeeName;
	double yearsOfExperience;
	double salary;
	Employee(int empid, String name,double expreience, double eSalary){
		this.employeeID=empid;
		this.employeeName=name;
		this.yearsOfExperience=expreience;
		this.salary=eSalary;
	}
	void displayEmployeeDetail() {
		System.out.println("Employee ID: "+employeeID);
		System.out.println("Employee Name: "+employeeName);
		System.out.println("Employee Salary: "+salary);
		if(isEligible(salary))
			System.out.println("Employee is eligible for tax deduction");
		else
			System.out.println("Employee is not eligible for tax deduction");

		if(isSwitchRequired(yearsOfExperience,salary))
			System.out.println("Emplyee salary is sufficient so doesnt require to switch");
		else
			System.out.println("Emplyee salary is not sufficient so requires switch");

	}
	boolean isEligible(double salary) {
		if(salary>30000)
			return true;
		else
			return false;
	} 
	
	boolean isSwitchRequired(double expreience,double salary) {
		if((expreience*200000)<salary)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Employee employee=new Employee(1234, "Raghv", 10.3, 55000);
		employee.displayEmployeeDetail();
		Employee employee1=new Employee(1238, "Rahul", 10, 255000);
		employee1.displayEmployeeDetail();
	}
}
