package raghvendra.Collection;
import java.util.ArrayList;
/*Program 2: 
Return a list of employee whose salary is less than 30000.
Hint : List<Employee> filterEmployeeBySalary(List<Employee> listOfEmployee){}*/
public class EmployeeLessSalary {
	String firstName;
	String lastName;
	String surnName;
	int age;
	int empId;
	int empDeptId;
	String empDeptName;
	double Salary;
	EmployeeLessSalary(String firstName,String lastName,String surnName,int age,int empId,int empDeptId,String empDeptName,double salary){
		this.firstName=firstName;
		this.lastName=lastName;
		this.surnName=surnName;
		this.age=age;
		this.empId=empId;
		this.empDeptId=empDeptId;
		this.empDeptName=empDeptName;
		this.Salary=salary;
	}
	static ArrayList<EmployeeLessSalary> filterEmployeeBySalary(ArrayList<EmployeeLessSalary> employeeList) {
		ArrayList<EmployeeLessSalary> employeeLessSalary=new ArrayList<EmployeeLessSalary>();
		for(int index=1;index<employeeList.size();index++) {
			if(employeeList.get(index).Salary<30000) {
				employeeLessSalary.add(employeeList.get(index));
			}
		}
		return employeeLessSalary;
	}
	public String toString() {
		return "\n"+"FirstName: "+ firstName+" "+" LastName: "+lastName+" "+" SurName: "+surnName+" "+"Salary: "+Salary;
	}
	public static void main(String[] args) {
		ArrayList<EmployeeLessSalary> employeeList=new ArrayList<EmployeeLessSalary>(); 
		EmployeeLessSalary employee=new EmployeeLessSalary("Raghv", "Chandramani", "Tiwari", 32, 3402, 1378, "Quality",123456);
		EmployeeLessSalary employee1=new EmployeeLessSalary("Lalit", "Ragh", "Vaidya", 33, 4560, 1234, "HR",1000.78);
		EmployeeLessSalary employee2=new EmployeeLessSalary("Rahul", "Ram", "Sharma", 36, 5600, 1298, "ADMIN",45678.90);
		EmployeeLessSalary employee3=new EmployeeLessSalary("Tom", "Jubek", "Alter", 39, 7800, 1322, "Development",1200);
		EmployeeLessSalary employee4=new EmployeeLessSalary("Joe", "Mike", "Stith", 39, 7800, 1322, "Development",13200);
		EmployeeLessSalary employee5=new EmployeeLessSalary("Shashi", "Ram", "Katapatu", 39, 7800, 1322, "Development",29999);
		employeeList.add(employee);
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee5);
		employeeList.add(employee4);
		System.out.println("List of Employee having salary less than 30000"+EmployeeLessSalary.filterEmployeeBySalary(employeeList));
	}
}
