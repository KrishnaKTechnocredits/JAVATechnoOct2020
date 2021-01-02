/* Assignment 41 : 
 * Program 1:
Print all the details of employee having minimum salary.
-> Employee class fields : firstName, lastName, surnName, age, 
   empId, empDeptId, empDeptName.
-> override toString method in Employee class.*/package mrunal;

public class Employee {
	private int Salary,age,empId;
	private String firstName,lastName,surnName,empDeptName;
	
	Employee( int Salary,int age,int empId ,String firstName,
			String lastName,String surnName,String empDeptName){
		this.Salary=Salary;
		this.age=age;
		this.empId=empId;
		this.firstName=firstName;
		this.lastName=lastName;
		this.surnName=surnName;
		this.empDeptName= empDeptName;
	}
	public int getEmpSalary() {
		return Salary;
	}
	public int getEmpAge() {
		return age;
	}
	public int getEmpID() {
		return empId;
	}
	public String getEmpFirstName() {
		return firstName;
	}
	public String getEmpLastName() {
		return lastName;
	}
	public String getEmpSurName() {
		return surnName;
	}
	public String getEmpDepttName() {
		return empDeptName;
	}
	
	public String toString(){
		return  "\n " + "Salary is:" + Salary + 
				"\n " + "Age of Employee is : " + age +
				"\n " + "Employee ID is : " + empId + 
				"\n " + "Name of Employee: " + firstName + " " + lastName + " " + surnName +
				"\n " + "Department Of Employee is : "  + empDeptName ; 
	}

}
