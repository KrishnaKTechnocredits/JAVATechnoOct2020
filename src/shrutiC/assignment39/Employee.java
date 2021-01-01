package shrutiC.assignment39;

public class Employee {

	int salary;
	int experience;
	int empId;
	String empName;

	Employee(int empId, String empName, int experience, int salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.experience = experience;
	}

	void displayEmpDetails() {
		System.out.println("Name : " + empName);
		System.out.println("Employee ID : " + empId);
		System.out.println("Years of experience : " + experience);
		
		if(isEligible())
			System.out.println("Is eligible : Yes");
		else
			System.out.println("Is eligible : No");
		
		if(isSwitchRequired())
			System.out.println("Switch required : Yes");
		else
			System.out.println("Switch required : No");
	}

	boolean isEligible() {
		if (salary > 30000)
			return true;
		return false;
	}

	boolean isSwitchRequired() {
		if (experience * 200000 < salary)
			return true;
		return false;
	}

	public static void main(String[] args) {
		Employee object = new Employee(101, "Shruti", 5, 45000);
		object.displayEmpDetails();

	}

}
