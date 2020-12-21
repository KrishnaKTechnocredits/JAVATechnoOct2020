package prasad.collections;
import java.util.ArrayList;
import java.util.Scanner;
/*Program 1:
Print all the details of employee having minimum salary.
-> Employee class fields : firstName, lastName, surnName, age, empId, empDeptId, empDeptName.
-> override toString method in Employee class.*/
 public class FindEmpWithMinSal {
	
	 static int empMinSal(ArrayList<Employee> empList) {
		 int minSalIndex=0;
		 for(int index=0;index<empList.size();index++) {
			 Employee employee = empList.get(index);
			 if(employee.getSalary()<empList.get(minSalIndex).getSalary()) {
				 minSalIndex=index;
			 }
		 }
		 return minSalIndex;
	}
	
	public static void main (String[]arg) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Employee> empList = new ArrayList<Employee>();
		System.out.println("Details to be entered for how many employees?");
		int empCount = scanner.nextInt();
		
		for(int index=0;index<empCount;index++) {
			System.out.println("Enter employee first name");
			String fName = scanner.next();
			System.out.println("Enter employee last name");
			String lName = scanner.next();
			System.out.println("Enter employee age");
			int age= scanner.nextInt();
			System.out.println("Enter employee ID");
			int Id= scanner.nextInt();
			System.out.println("Enter department ID");
			int deptId=scanner.nextInt();
			System.out.println("Enter department name");
			String deptName = scanner.next();
			System.out.println("Enter salary");
			int sal=scanner.nextInt();
			Employee employee = new Employee(fName,lName,age,Id,deptId,deptName,sal);
			empList.add(employee);
		}
		
		int index=empMinSal(empList);
		empList.get(index).displayEmpDetails();
	}
}
