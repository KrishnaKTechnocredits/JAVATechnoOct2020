package milind.Assignment_41;

import java.util.ArrayList;

public class EmployeeAgeSalary {
	
	String empName;
	int age;
	double salary;
	
	public EmployeeAgeSalary(String empName, int age, double salary) {
		this.empName = empName;
		this.age = age;
		this.salary = salary;
	}
	
	public String toString() {
		return "Employee name : " + empName + "\n" +
				"Employee age : " + age + "\n" +
				"Employee salary : " + salary ;
	}
	
	public ArrayList<EmployeeAgeSalary> filterEmployeeByAgeAndSalary(ArrayList<EmployeeAgeSalary> arrayList) {
		ArrayList<EmployeeAgeSalary> array = new ArrayList<EmployeeAgeSalary>();
		for(int index = 0; index < arrayList.size(); index++) {
			if(arrayList.get(index).age < 30 && arrayList.get(index).salary > 75000) {
				array.add(arrayList.get(index));
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		ArrayList<EmployeeAgeSalary> arrayList = new ArrayList<EmployeeAgeSalary>();
		EmployeeAgeSalary employeeAgeSalary = new EmployeeAgeSalary("Milind", 30, 60000);
		EmployeeAgeSalary employeeAgeSalary1 = new EmployeeAgeSalary("Bhairavi", 28, 80000);
		EmployeeAgeSalary employeeAgeSalary2 = new EmployeeAgeSalary("Puru", 33,100000);
		EmployeeAgeSalary employeeAgeSalary3 = new EmployeeAgeSalary("Shivaji", 21,100000);
		
		arrayList.add(employeeAgeSalary);
		arrayList.add(employeeAgeSalary1);
		arrayList.add(employeeAgeSalary2);
		arrayList.add(employeeAgeSalary3);
		
		System.out.println(employeeAgeSalary.filterEmployeeByAgeAndSalary(arrayList));
	}

}
