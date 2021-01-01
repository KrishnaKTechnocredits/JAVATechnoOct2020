package nitin.Assignment_39;
/* Program : 1 
Create Employee class and parameterized constructor with attributes empId, empName, years of Experience and salary. 
Write a method to display the details of employees. 
Create a method isEligible which will return true if Employee salary is more than 30000. 
Create a method isSwitchRequired, which will return true if yearsOfExperience * 200000 < salary.*/
public class Employee {
	int empId;
	String empName;
	int exp;
	double salary;
	public Employee(int empId, String empName, int exp, double salary){
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		this.exp=exp;
	}
	public boolean isEligible() {
		if(salary>30000)
			return true;
		else
			return false;
	}
	public boolean isSwitchRequired(){
		if(exp*200000<salary)
			return false;
		else
			return true;
	}
	public void display() {
		System.out.println("Name of the Employee "+empName);
		System.out.println("Employee Id is "+empId);
		System.out.println("Experience of the Employee is "+exp+" Years.");
		System.out.println("Salary of the Employee "+salary);
		System.out.println("Employee salary is more than 30K -> "+isEligible());
		System.out.println("Employee need to switch -> "+isSwitchRequired());
	}
	public static void main(String[] args) {
		Employee emp = new Employee(37,"Nitin Jain",10,50000);
		emp.display();
	}
}
