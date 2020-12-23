package ruby.collections;
/*-> Employee class fields : firstName, lastName, surnName, age, empId, empDeptId, empDeptName.
-> override toString method in Employee class.*/

public class Employee {

	private String firstName, lastName, empDeptName;
	private double salary;
	private int age, empId, empDeptId;

	Employee(String firstName, String lastName, double salary, int age, int empId, int empDeptId, String empDeptName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.age = age;
		this.empId = empId;
		this.empDeptId = empDeptId;
		this.empDeptName = empDeptName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public double getSalary() {
		return salary;
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
	
	@Override
	public String toString(){
		return "\n FirstName: "+firstName +" LastName: "+ lastName +" Salary: "+ salary + " Age: "+ age +" EmpID: "+ empId+" empDeptID: "+ empDeptId + " Dept Name: "+ empDeptName; 
	}
}
