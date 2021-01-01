package milind.Assignment_41;

import java.util.ArrayList;

public class EmployeeSalary {
	
	int empId;
	String empFirstName, empLastName;
	double salary;
	
	public EmployeeSalary(int empId, String empFirstName, String empLastName, double salary) {
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.salary = salary;
	}
	
	public String toString() {
		return "Employee Id : " +  empId + "\n" +
				"Employee Name : " + empFirstName + "\n" + 
				"Employee Last : " + empLastName + "\n" +
				"salary : " + salary;
	}
	
	public ArrayList<EmployeeSalary> filterEmployeeBySalary(ArrayList<EmployeeSalary> arrayList) {
		ArrayList<EmployeeSalary> array = new ArrayList<EmployeeSalary>();
		for(int index = 0; index < arrayList.size(); index++) {
			if(arrayList.get(index).salary < 30000) {
				array.add(arrayList.get(index));
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		ArrayList<EmployeeSalary> arrayList = new ArrayList<EmployeeSalary>();
		EmployeeSalary employeeSalary = new EmployeeSalary(101, "Milind", "Chavhan", 20000);
		EmployeeSalary employeeSalary1 = new EmployeeSalary(102, "Bhairavi", "Patil", 40000);
		EmployeeSalary employeeSalary2 = new EmployeeSalary(103, "Puru", "Patil", 50000);
		EmployeeSalary employeeSalary3 = new EmployeeSalary(104, "Dipti", "Patil", 10000);
		
		arrayList.add(employeeSalary);
		arrayList.add(employeeSalary1);
		arrayList.add(employeeSalary2);
		arrayList.add(employeeSalary3);
		
		System.out.println(employeeSalary.filterEmployeeBySalary(arrayList));
		
	}

}
