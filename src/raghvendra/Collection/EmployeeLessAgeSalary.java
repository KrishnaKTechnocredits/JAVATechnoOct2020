package raghvendra.Collection;
import java.util.ArrayList;
/*Program 3: 
return a list of employee name whose age is less than 30 and salary is greater than 75000.
Hint : List<String> filterEmployeeByAgeAndSalary(List<Employee> listOfEmployee, double salary, int age){}*/
public class EmployeeLessAgeSalary {
	String firstName;
	String lastName;
	String surnName;
	int age;
	int empId;
	int empDeptId;
	String empDeptName;
	double Salary;
	EmployeeLessAgeSalary(String firstName,String lastName,String surnName,int age,int empId,int empDeptId,String empDeptName,double salary){
		this.firstName=firstName;
		this.lastName=lastName;
		this.surnName=surnName;
		this.age=age;
		this.empId=empId;
		this.empDeptId=empDeptId;
		this.empDeptName=empDeptName;
		this.Salary=salary;
	}
	static ArrayList<String>  filterEmployeeByAgeAndSalary(ArrayList<EmployeeLessAgeSalary> employeeList,double salary,int age) {
		ArrayList<String> nameOfEmployee=new ArrayList<String>();
		for(int index=1;index<employeeList.size();index++) {
			if(employeeList.get(index).Salary>salary && employeeList.get(index).age<age ) {
				nameOfEmployee.add(employeeList.get(index).firstName+" "+employeeList.get(index).surnName+" "+employeeList.get(index).age+" "+employeeList.get(index).Salary);

				}
		}
		return nameOfEmployee;
	}
	public static void main(String[] args) {
		ArrayList<EmployeeLessAgeSalary> employeeList=new ArrayList<EmployeeLessAgeSalary>(); 
		EmployeeLessAgeSalary employee=new EmployeeLessAgeSalary("Raghv", "Chandramani", "Tiwari", 32, 3402, 1378, "Quality",123456);
		EmployeeLessAgeSalary employee1=new EmployeeLessAgeSalary("Lalit", "Ragh", "Vaidya", 26, 4560, 1234, "HR",118000.78);
		EmployeeLessAgeSalary employee2=new EmployeeLessAgeSalary("Rahul", "Ram", "Sharma", 26, 5600, 1298, "ADMIN",145678.90);
		EmployeeLessAgeSalary employee3=new EmployeeLessAgeSalary("Tom", "Jubek", "Alter", 29, 7800, 1322, "Development",1200);
		EmployeeLessAgeSalary employee4=new EmployeeLessAgeSalary("Joe", "Mike", "Stith", 39, 7800, 1322, "Development",13200);
		EmployeeLessAgeSalary employee5=new EmployeeLessAgeSalary("Shashi", "Ram", "Katapatu", 29, 7800, 1322, "Development",75999);
		employeeList.add(employee);
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee5);
		employeeList.add(employee4);
		System.out.println("List of Employee having age less than 30 and salary greater than 75000"+"\n"+EmployeeLessAgeSalary.filterEmployeeByAgeAndSalary(employeeList,75000,30));
	}
}
