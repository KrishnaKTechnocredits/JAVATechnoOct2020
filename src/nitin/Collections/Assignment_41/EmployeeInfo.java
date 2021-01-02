package nitin.Collections.Assignment_41;
import nitin.Collections.Assignment_41.EmployeeBase;
import java.util.ArrayList;
/* Assignment-41 : 19th Dec'2020 - Program 1: Print all the details of employee having minimum salary.
-> Employee class fields : firstName, lastName, surnName, age, empId, empDeptId, empDeptName.
-> override toString method in Employee class. */ 
public class EmployeeInfo {
	public static EmployeeBase getEmployeeMinSalary(ArrayList<EmployeeBase> empInfo) {
		double minSalary = empInfo.get(0).getSalary();
		int minSalaryIndex=0;
		for(int index=0; index<empInfo.size();index++) {
			if(empInfo.get(index).getSalary() < minSalary) {
				minSalary = empInfo.get(index).getSalary();
				minSalaryIndex=index;
			}
		}
		return empInfo.get(minSalaryIndex);
	}
	public static void main(String[] args) {
		ArrayList<EmployeeBase> employeeInfo = new ArrayList<EmployeeBase>();
		EmployeeBase e1 = new EmployeeBase("Nitin", "Jain", 32 , 3422, 12, "QA", 95000);
		EmployeeBase e2 = new EmployeeBase("Alan", "Walker", 32 , 3422, 12, "Research", 80000);
		EmployeeBase e3 = new EmployeeBase("Tom", "Ford", 32 , 3422, 12, "M&A", 99000);
		employeeInfo.add(e1);
		employeeInfo.add(e2);
		employeeInfo.add(e3);
		EmployeeBase employeeBase = getEmployeeMinSalary(employeeInfo);
		System.out.println("Employee  having minimum salary - \n"+employeeBase);
	}
}
