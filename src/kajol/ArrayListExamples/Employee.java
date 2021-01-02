/*Assignment-41 :

Program 1: 
Print all the details of employee having minimum salary.
-> Employee class fields : firstName, lastName, surnName, age, empId, empDeptId, empDeptName.
-> override toString method in Employee class.
 */

package kajol.ArrayListExamples;
import java.util.ArrayList;
import java.util.List;

public class Employee {
	String firstName,middleName,surName,empDeptName;
	int age,empId,empDeptId;
	double salary;
	
	public Employee(String firstName,String middleName, String surName,int age,int empId,int empDeptId,String empDeptName,double salary) {
		this.firstName=firstName;
		this.middleName=middleName;
		this.surName=surName;
		this.age=age;
		this.empId=empId;
		this.empDeptId=empDeptId;
		this.empDeptName=empDeptName;
		this.salary=salary;
	}
	static void findmaximumSalary(List<Employee> list) {
		int maxIndex=0;
		for(int index=0;index<list.size();index++) {
			if(list.get(index).salary>list.get(maxIndex).salary)
				maxIndex=index;
		}
		System.out.println(list.get(maxIndex));
	}
	
	@Override
	public String toString() {
		return firstName + middleName+ surName +"(Age="+age+"yrs) of "+empDeptName+" Department(Department Id-"+empDeptId+") with employee Id= "+empId+" has Salary of Rs."+salary;			
	}
	
	public static void main(String[] args) {
		Employee employee1= new Employee("A","B","C",25,101,1,"RLT",25000);
		Employee employee2= new Employee("P","Q","R",26,102,2,"Insurance",26000);
		Employee employee3= new Employee("M","N","O",27,103,3,"HR",27000);
		Employee employee4= new Employee("X","Y","Z",28,104,4,"Banking",28000);
		List<Employee> list = new ArrayList<>();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		System.out.println("Details of Employee with Maximum Salary : ");
		Employee.findmaximumSalary(list);
	}
}
 