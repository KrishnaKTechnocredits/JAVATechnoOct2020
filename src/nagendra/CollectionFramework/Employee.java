package nagendra.CollectionFramework;

public class Employee {

	private String firstName;
	private String lastName;
	private int age;
	private int empId;
	private int empDeptId;
	private String empDeptName;
	private int salary;

	public Employee(String firstName, String lastName, int age, int empId, int empDeptId, String empDeptName, int salary) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.empId = empId;
		this.empDeptId = empDeptId;
		this.empDeptName = empDeptName;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public int getEmpId() {
		return empId;
	}

	public int getEmpDeptId() {
		return empDeptId;
	}

	public String getEmpDeptName() {
		return empDeptName;
	}

	public int getSalary() {
		return salary;
	}
	public String toString(){
		return firstName + " "+lastName  + " "+ age + " " + empId + " " + empDeptId + " " + empDeptName;		
	}	
}
