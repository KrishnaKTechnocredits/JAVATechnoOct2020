package ruby;

/*Assignment - 39 : 16th Dec'2020

Program : 1 
Create Employee class and parameterized constructor with attributes empId , empName,
years of Experience and salary. Write a method to display the details of employees. 
Create a method isEligible which will return true if Employee salary is more than 30000. 
Create a method isSwitchRequired, which will return true if yearsOfExperience * 200000 < salary. */

public class A39Employee {
	int empId, yearsOfExp;
	String empName;
	double salary;

	A39Employee(int empId, String empName, int yearsOfExp, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.yearsOfExp = yearsOfExp;
		this.salary = salary;
	}

	void display() {
		System.out.println("Employee ID: " + empId + "\nEmployee Name: " + empName + "\nSalary: " + salary
				+ "\nYears of Experience: " + yearsOfExp);
	}

	boolean isEligible() {
		if (salary > 30000)
			return true;
		return false;
	}

	boolean isSwitchRequired() {
		if (yearsOfExp * 200000 > salary)
			return true;
		return false;
	}

	public static void main(String[] args) {
		A39Employee emp1 = new A39Employee(1, "Ruby", 6, 50000);
		A39Employee emp2 = new A39Employee(2, "Nasir", 10, 555000);
		A39Employee emp3 = new A39Employee(3, "Tina", 4, 845000);

		System.out.println("Employee: " + emp1.empName + " isEligible: " + emp1.isEligible() + " isSwitchRequired: "
				+ emp1.isSwitchRequired());
		System.out.println("Employee: " + emp2.empName + " isEligible: " + emp2.isEligible() + " isSwitchRequired: "
				+ emp2.isSwitchRequired());
		System.out.println("Employee: " + emp3.empName + " isEligible: " + emp3.isEligible() + " isSwitchRequired: "
				+ emp3.isSwitchRequired());

	}
}