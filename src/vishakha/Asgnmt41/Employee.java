package vishakha.Asgnmt41;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	int age, empId, empDeptId;
	float salary;
	String firstName, lastName, surnName, empDeptName;
	
	public Employee(String firstName, String lastName, int age, int empId, int empDeptId, int salary, String empDeptName){
		this.age = age;
		this.empId = empId;
		this.empDeptId = empDeptId;
		this.salary = salary;
		this.firstName = firstName;
		this.lastName = lastName;
		this.surnName = surnName;
		this.empDeptName = empDeptName;
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

	public float getSalary() {
		return salary;
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
	

	public String toString(int age, int empId, int empDeptId, float salary, String firstName, String lastName, String surnName, String empDeptName){
		return "First Name: "+firstName+"\nLastName: "+lastName+"\nAge: "+age+"\nEmpId: "+empId+"\nEmpDeptId: "+empDeptId+"\nSalary: "+salary+"\nEmpDeptName: "+empDeptName;
	}
	
	public static void findMaxSalary(List<Employee> list) {
		int maxIndex=0;
		for(int index=0;index<list.size();index++) {
			if(list.get(index).salary > list.get(maxIndex).salary)
				maxIndex=index;
		}
		System.out.println(list.get(maxIndex));
	}
	
	public static List<Employee> filterEmployeeBySalary(List<Employee> listOfEmployee) {
		List<Employee> filteredList= new ArrayList<>();
		for(Employee object : listOfEmployee) {
			if(object.salary<30000)
				filteredList.add(object);
		}
		return filteredList;
	}
	
	public static List<Employee> filterEmployeeByAgeAndSalary(List<Employee> listOfEmployee, int salary, int age) {
		List<Employee> filteredList= new ArrayList<>();
		for(Employee object : listOfEmployee) {
			if(object.salary>salary && object.age<30)
				filteredList.add(object);
		}
		return filteredList;
	}
	
	public static void main(String[] args) {
		Employee employee1 = new Employee("Rakesh", "Malhotra", 30, 123, 1586,500000, "Department1");
		Employee employee2 = new Employee("Vignesh", "Kamath", 31, 121, 1587,800000, "Department2");
		Employee employee3 = new Employee("Vikash", "Rakholiya", 28, 124, 1586,20000, "Department1");
		Employee employee4 = new Employee("Vimal", "Dhaduk", 34, 125, 1587,400000, "Department2");
		List<Employee> list = new ArrayList<>();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		System.out.println("Employee details with Maximum salary:");
		Employee.findMaxSalary(list);
		System.out.println("Employees with salary less than 30000");
		List<Employee> filteredListSal = Employee.filterEmployeeBySalary(list);
		for(Employee employee: filteredListSal)
			System.out.println(employee+"\n");
		System.out.println("Employees with salary more than 75000 & age below 30");
		List<Employee> filteredListAgeSal = Employee.filterEmployeeByAgeAndSalary(list,75000,30);
		for(Employee e2: filteredListAgeSal)
			System.out.println(e2+"\n");
	}
}
