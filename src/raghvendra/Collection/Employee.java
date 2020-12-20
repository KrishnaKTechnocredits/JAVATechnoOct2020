package raghvendra.Collection;
import java.util.ArrayList;
/*Print all the details of employee having minimum salary.
-> Employee class fields : firstName, lastName, surnName, age, empId, empDeptId, empDeptName.
-> override toString method in Employee class.*/
public class Employee {
	String firstName;
	String lastName;
	String surnName;
	int age;
	int empId;
	int empDeptId;
	String empDeptName;
	double Salary;
	Employee(String firstName,String lastName,String surnName,int age,int empId,int empDeptId,String empDeptName,double salary){
		this.firstName=firstName;
		this.lastName=lastName;
		this.surnName=surnName;
		this.age=age;
		this.empId=empId;
		this.empDeptId=empDeptId;
		this.empDeptName=empDeptName;
		this.Salary=salary;
	}
	static void printSalary(ArrayList<Employee> employeeList) {
		int maxIndex=1;
		double maxSalary=employeeList.get(0).Salary;
		for(int index=1;index<employeeList.size();index++) {
			if(employeeList.get(index).Salary<maxSalary) {
				maxSalary=employeeList.get(index).Salary;
				maxIndex=index;
			}
		}
		System.out.println("Details of Employee with minimum salary" +"\r\n"+employeeList.get(maxIndex));
	}
	public String toString() {
		return "FirstName: "+ firstName+"\n"+" LastName: "+lastName+"\n"+" SurName: "+surnName+
				"\n"+" Age: "+age+"\n"+" Employee ID: "+empId+"\n"+" Employee Deprtment ID: "+empDeptId+
				"\n"+" Employee Department Name: "+empDeptName+"\n"+" Salary: "+Salary;
	}
	public static void main(String[] args) {
		ArrayList<Employee> employeeList=new ArrayList<Employee>(); 
		Employee employee=new Employee("Raghv", "Chandramani", "Tiwari", 32, 3402, 1378, "Quality",123456);
		Employee employee1=new Employee("Lalit", "Ragh", "Vaidya", 33, 4560, 1234, "HR",1000.78);
		Employee employee2=new Employee("Rahul", "Ram", "Sharma", 36, 5600, 1298, "ADMIN",45678.90);
		Employee employee3=new Employee("Mani", "Shyam", "PAtil", 39, 7800, 1322, "Development",3200);
		employeeList.add(employee);
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		Employee.printSalary(employeeList);
	}
}
