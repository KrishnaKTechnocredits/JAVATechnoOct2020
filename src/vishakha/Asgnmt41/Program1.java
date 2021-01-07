/*Print all the details of employee having minimum salary.
-> Employee class fields : firstName, lastName, surnName, age, empId, empDeptId, empDeptName.
-> override toString method in Employee class. 

package vishakha.Asgnmt41;

import java.util.ArrayList;

public class Program1 {
	
	static float minSal;
	
	private static void getLessSalaray(ArrayList<Employee> empList) {
		ArrayList<Employee> empSalList = new ArrayList<Employee>();
		for(int i=0; i<empList.size(); i++){
			if(empList.get(i).salary < 30000){
				empSalList.add(empList.get(i));
			}
		}
		for(int i=1; i<empList.size(); i++){
			minSal = empList.get(0).salary;
			if((empList.get(i).salary) < minSal){
				minSal = empList.get(i).salary;
			}
		}
		System.out.println(empSalList);
	}

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		Employee employee1 = new Employee(25, 101, 1, 25000, "Angad", "Prakash", "Chavan", "Engg");
		Employee employee2 = new Employee(28, 102, 1, 35000, "Arnav", "Chetan", "Shinde", "Engg");
		Employee employee3 = new Employee(25, 201, 2, 40000, "Naman", "Manish", "Gupta", "Research");
		Employee employee4 = new Employee(30, 202, 2, 40000, "Sarika", "Sanjay", "Chavan", "Research");
		Employee employee5 = new Employee(30, 103, 1, 35000, "Priya", "Manoj", "Patil", "Engg");
		
		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee3);
		empList.add(employee4);
		empList.add(employee5);
		
		getLessSalaray(empList);		
	}
}
*/