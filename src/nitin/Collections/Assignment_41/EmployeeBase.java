package nitin.Collections.Assignment_41;
/* Assignment-41 : 19th Dec'2020 - Program 1: Print all the details of employee having minimum salary.
-> Employee class fields : firstName, lastName, surnName, age, empId, empDeptId, empDeptName.
-> override toString method in Employee class. */ 
public class EmployeeBase {
	String firstName,lastName,empDeptName;
	int age,empId,empDeptId;
	double salary;
	public EmployeeBase(String firstName, String lastName, int age, int empId, int empDeptId, String empDeptName, double salary) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
		this.empId=empId;
		this.empDeptId=empDeptId;
		this.empDeptName=empDeptName;
		this.salary=salary;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getempDeptName() {
		return empDeptName;
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
	public double getSalary() {
		return salary;
	}
	public String toString() {
		return "\n Name : "+firstName+"\n LastName : "+lastName+"\n Age : "+age+"\n EmpID : "+empId+"\n EmpDeptID : "+empDeptId+"\n EmpDeptName : "+empDeptName+"\n Salary : "+salary;
	}
}
