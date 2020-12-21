package nandini.constructorProgs;

public class Employee {

	int empId;
	String empName;
	int yearsofExp;
	int salary;
	
	public Employee(int empId, String empName, int yearsofExp, int salary){
		this.empId = empId;
		this.empName = empName;
		this. yearsofExp = yearsofExp;
		this.salary = salary;
	}
	void displayEmpDetails() {
		System.out.println("Employee ID is: "+empId+" Employee Name is: "+empName+" Years of Exp is: "+yearsofExp+" Salary is: "+salary);
	}
	boolean isEligible() {
		if(salary > 30000)
			return true;
		else
			return false;
	}
	boolean isSwitchRequired() {
		if((yearsofExp * 200000) < salary)
			return true;
		else
			return false;
	}
	
	public static void main(String args[]) {
		Employee employee = new Employee(4567,"Nandini",3,55000);
		employee.displayEmpDetails();
		boolean Eligibility = employee.isEligible();
		if(Eligibility)
			System.out.println("Employee is Eligible");
		else
			System.out.println("Employee is Not Eligible");
		boolean switchRequired = employee.isSwitchRequired();
		if(switchRequired)
			System.out.println("Employee requires a Switch");
		else
			System.out.println("Employee does not require a Switch");
			
	}
	
}
