/*Program : 1 
Create Employee class and parameterized constructor with attributes empId , empName,
years of Experience and salary. Write a method to display the details of employees. 
Create a method isEligible which will return true if Employee salary is more than 30000. 
Create a method isSwitchRequired, which will return true if yearsOfExperience * 200000 < salary.*/

package vishakha.Asgnmt39;

public class Employee {

	int empId, yrsOfExp;
	String empName;
	float salary;

	Employee(int empId, String empName, int exp, float salary){
		this.empId = empId;
		this.empName = empName;
		this.yrsOfExp = exp;
		this.salary = salary;
	}

	void printDetails(){
		System.out.println("Employee " +empName+ " with id "+empId+ " has "+yrsOfExp+ " years of experience and salary is "+salary);
	}

	boolean isEligible(){
		if(salary > 30000)
			return true;
		return false;		
	}

	boolean isSwitchRequired(){
		if(!(yrsOfExp * 200000 < salary)){
			return true;
		}
		return false;
	}


	public static void main(String[] args) {
		Employee employee1 = new Employee(1, "Rohan", 10, 2500000);
		employee1.printDetails();
		System.out.println("Employee: " +employee1.empName+ " . Is employee eligible? "+employee1.isEligible());
		System.out.println("Employee: " +employee1.empName+ " . Is switch needed ? "+employee1.isSwitchRequired());
		Employee employee2 = new Employee(2, "Vishakha", 5, 5000);
		employee2.printDetails();
		System.out.println("Employee: " +employee2.empName+ " . Is employee eligible? "+employee2.isEligible());
		System.out.println("Employee: " +employee2.empName+ " . Is switch needed ? "+employee2.isSwitchRequired());
	}
}
