/*Program : 1
Create Employee class and parameterized constructor with attributes empId , empName,
years of Experience and salary. Write a method to display the details of employees.
 Create a method isEligible which will return true if Employee salary is more than 30000.
  Create a method isSwitchRequired, which will return true if yearsOfExperience * 200000 < salary.
*/
package ankita.assignment.constructor;

public class Employee {
	int empID;
	String empName;
	int expYear;
	int sal;

	public Employee(int empID, String empName, int expYear, int sal) {
		this.empID = empID;
		this.empName = empName;
		this.expYear = expYear;
		this.sal = sal;
	}

	void display() {
		System.out.println("Employee ID : " + empID);
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee Exp Year : " + expYear);
		System.out.println("Employee Salary : " + sal);

	}

	boolean isEligible(int salary) {
		if (salary > 30000)
			return true;
		return false;
	}

	boolean isSwitchRequired() {
		if ((expYear * 200000) < (sal * 12))
			return true;
		return false;
	}

	public static void main(String[] args) {
		Employee employee = new Employee(4, "Ankita", 4, 50000);
		employee.display();
		if (employee.isEligible(employee.sal))
			System.out.println("Employee is Eligible");
		else
			System.out.println("Employee is not Eligible");

		if (employee.isSwitchRequired())
			System.out.println("Employee require switch");
		else
			System.out.println("Employee do not require switch");

	}
}
