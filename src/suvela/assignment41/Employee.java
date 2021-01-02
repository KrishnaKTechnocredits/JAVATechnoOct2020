package suvela.assignment41;

public class Employee {
	public String fname, lname, empDeptName;
	public int age, empId, empDeptId, Salary;

	Employee(String fname, String lname, String empDeptName, int age, int empId, int empDeptId, int Salary) {
		this.age = age;
		this.empDeptId = empDeptId;
		this.empDeptName = empDeptName;
		this.empId = empId;
		this.fname = fname;
		this.lname = lname;
		this.Salary = Salary;
	}

	public String getFirstName() {
		return fname;
	}

	public String getLastName() {
		return lname;
	}

	public String getempDeptName() {
		return empDeptName;
	}

	public int getage() {
		return age;
	}

	public int getempId() {
		return empId;
	}

	public int getempDeptId() {
		return empDeptId;
	}

	public int getSalary() {
		return Salary;
	}

	public String toString() {
		return fname + ":" + lname + ":" + empDeptName + ":" + empDeptId + ":" + age + ":" + empId + ":" + Salary;
	}
}