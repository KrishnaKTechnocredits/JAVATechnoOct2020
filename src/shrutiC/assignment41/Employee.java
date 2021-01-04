package shrutiC.assignment41;

public class Employee {

	String firstName;
	String midName;
	String lastName;
	int age;
	int empId;
	int empDeptId;
	String empDeptName;
	int empSalary;

	Employee(String firstName, String midName, String lastName, int age, int empId, int empDeptId, String empDeptName,
			int empSalary) {
		this.firstName = firstName;
		this.midName = midName;
		this.lastName = lastName;
		this.age = age;
		this.empId = empId;
		this.empDeptId = empDeptId;
		this.empDeptName = empDeptName;
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee name : " + firstName + " " + midName + " " + lastName + "\nAge : " + age + "\nEmployee ID : "
				+ empId + "\nDepartment ID : " + empDeptId + "\nDept Name : " + empDeptName + "\nSalary : " + empSalary;
	}

	public static void main(String[] args) {
		Employee obj = new Employee("Shruti", "Kaustubh", "Jagtap", 25, 1165514, 03, "BT", 40000);
		System.out.println(obj.toString());
	}
}
