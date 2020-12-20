package prasad.collections;

import java.util.ArrayList;
/*Program 2: 
Return a list of employee whose salary is less than 30000.
Hint : List<Employee> filterEmployeeBySalary(List<Employee> listOfEmployee){}*/
import java.util.Scanner;

public class FindEmpWithSalLess30k {
	
	static ArrayList<Employee> getEmpDetails(ArrayList<Employee>salLess30){
		ArrayList<Employee>output = new ArrayList<Employee>();
		for(int index=0;index<salLess30.size();index++) {
			Employee employee = salLess30.get(index);
			if(employee.getSalary()<30000) {
				output.add(employee);
			}
		}
		return output;
	}
	
	public static void main(String[]arg) {
		Scanner scanner = new Scanner(System.in);
		ArrayList <Employee> salLess30 = new ArrayList<Employee>();
		
		System.out.println("Enter how many employee data you want to enter");
		int empCount = scanner.nextInt();
		//public Employee(String empFirstName,String empLastName,int age,int empID,int deptID,String deptName,int salary) {
		for(int index=0;index<empCount;index++) {
			System.out.println("Enter first name");
			String fName= scanner.next();
			System.out.println("Enter last name");
			String lName= scanner.next();
			System.out.println("Enter age");
			int age= scanner.nextInt();
			System.out.println("Enter employee ID");
			int iD= scanner.nextInt();
			System.out.println("Enter department ID");
			int departId= scanner.nextInt();
			System.out.println("Enter department name");
			String departName= scanner.next();
			System.out.println("Enter monthly salary");
			int sal= scanner.nextInt();
			Employee employee = new Employee (fName,lName,age,iD,departId,departName,sal);
			salLess30.add(employee);	
		}
		ArrayList<Employee>output= getEmpDetails(salLess30);
		System.out.println("Employee(s) with salary less than 30000 monthly salary");
		for(int index=0;index<output.size();index++) {
			Employee employee = output.get(index);
			employee.displayEmpDetails();
		}
	}

}