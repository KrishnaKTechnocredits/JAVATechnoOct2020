package vaibhav.assignment41;

/*Program 1: 
	
Print all the details of employee having minimum salary.
-> Employee class fields : firstName, lastName, surnName, age, empId, empDeptId, empDeptName.
-> override toString method in Employee class.*/ 

public class Employee {
	
	  String firstName;
	  String lastName;
	  double salary;
	  int age;
	  int empId;
	  int empDeptId; 
	  String empDeptName;
		 
	 public Employee(String firstName,String lastName,int salary,int age,int empId,int empDeptId,String empDeptName) {
		  this.firstName = firstName;
		  this.lastName = lastName;
		  this.salary = salary;
		  this.age = age;
		  this.empId = empId;
		  this.empDeptId = empDeptId; 
		  this.empDeptName = empDeptName;		 
	 }	 
	 
	 @Override
	 public String toString() {
		 return "Employee "+firstName+" "+lastName+" has Salary of "+salary+ " at the age of "+age+" having Employee id "+empId+" and department id "+empDeptId+" working in "+empDeptName+" department";
	 }
	 
	 public double getSalary() {
		 return salary;		 
	 }
	 
	 public int getAge() {
		 return age;		 
	 }
	 
}
