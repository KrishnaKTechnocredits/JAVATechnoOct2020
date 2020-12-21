package prasad.collections;

public class Employee {
	private int empId,age,deptId,salary;
	private String empFirstName,empLastName,deptName;
	
	public Employee(String empFirstName,String empLastName,int age,int empId,int deptID,String deptName,int salary) {
		this.empId=empId;
		this.empFirstName=empFirstName;
		this.empLastName=empLastName;
		this.age=age;
		this.deptId=deptID;
		this.deptName=deptName;
		this.salary=salary;
	}
	
	 int getSalary() {
		return salary;
	}
	 
	 int getAge() {
		 return age;
	 }
	 
	 void displayEmpDetails() {
		 System.out.println("=================================================");
		 System.out.println("Printing employee details:");
		 System.out.println("Employee First Name: "+ empFirstName);
		 System.out.println("Employee Last Name: "+ empLastName);
		 System.out.println("Employee Age: "+ age);
		 System.out.println("Employee ID: "+ empId);
		 System.out.println("Department ID: "+ deptId);
		 System.out.println("Department Name: "+ deptName);
		 System.out.println("Salary: "+ salary);
	 }
	 
	 String displayEmpName() {
		 String name = empFirstName + " "+ empLastName;
		 return name; 
	 }
}
