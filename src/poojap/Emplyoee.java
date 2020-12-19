/*Program : 1 
Create Employee class and parameterized constructor with attributes empId , empName,
years of Experience and salary. Write a method to display the details of employees. 
Create a method isEligible which will return true if Employee salary is more than 30000. 
Create a method isSwitchRequired, which will return true if yearsOfExperience * 200000 < salary.
 * */
package poojap;

public class Emplyoee {
	int empID, salary;
	String empName;
	double yearOfExp;

	Emplyoee(int empId, String empName, double yearOfExp, int salary) {
		this.empID = empId;
		this.empName = empName;
		this.yearOfExp = yearOfExp;
		this.salary = salary;
	}

	void detalisOfEmplyoee() {
		System.out.println(" Employee ID : " + empID + "\n" + " Emplyoee Name : " + empName + " \n"
				+ " Years Of Experiance : " + yearOfExp + " \n" + " Salary : " + salary);
	}

	boolean isEligible() {
		if (salary > 30000)
			return true;
		return false;
	}

	boolean isSwitchRequired() {
		if (yearOfExp * 200000 < salary)
			return true;
		return false;
	}

	public static void main(String[] args) {
		Emplyoee emplyoee = new Emplyoee(1, "Pooja", 1.8, 32000);
		emplyoee.detalisOfEmplyoee();
		boolean ans = emplyoee.isEligible();
		System.out.println(" Employee salary is more than 30000 : " + ans);
		boolean result = emplyoee.isSwitchRequired();
		System.out.println(" isSwitchRequired : " + result);
	}
}
