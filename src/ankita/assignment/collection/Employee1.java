/*Program 1:
Print all the details of employee having minimum salary.
-> Employee class fields : firstName, lastName, surnName, age, empId, empDeptId, empDeptName.
-> override toString method in Employee class.
*/

package ankita.assignment.collection;

public class Employee1 {
	String firstName, lastName, surnName, empDeptName;
	int age, empId, empDeptId, salary;
	
	public Employee1(String firstName, String lastName, String surnName, String empDeptName,int age, int empId,int empDeptId, int salary) {
		
		this.firstName = firstName;
		this.lastName= lastName;
		this.surnName =surnName;
		this.empDeptName =empDeptName;
		this.age=age;
		this.empId=empId;
		this.empDeptId = empDeptId;
		this.salary =salary;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getSurnName() {
		return surnName;
	}
	public String getEmpDeptName() {
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
	public int getSalary() {
		return salary;
	}
	public String toString() {
		return "\n Name    :" +  firstName 
			+  "\n LastName:" +  lastName
			+  "\n Surname :" +  surnName
			+  "\n Age     :" +  age 
			+  "\n EmpID   :" +  empId
			+  "\n EmpDptID:" +  empDeptId 
			+  "\n EmpDptNm:" +  empDeptName 
			+  "\n Salary  :" +  salary;
	}
}
