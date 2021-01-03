package monika;
/*Assignment - 41
 Program 2: 
Return a list of employee whose salary is less than 30000.
Hint : List<Employee> filterEmployeeBySalary(List<Employee> listOfEmployee){}
 */



import java.util.ArrayList;

public class EmployeeSalary {
	String firstName, lastName;
	int age, empId;
	double salary;

	EmployeeSalary(String firstName, String lastName, int age, int empId, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.empId = empId;
		this.salary = salary;
	}

	public String toString() {
		return "Name Of Employee:" + firstName + " " + lastName + "\nAge:" + age + "\nEmp_ID:" + empId + "\nSalary:"
				+ salary;
	}

	public static ArrayList<EmployeeSalary> filterEmployeeBySalary(ArrayList<EmployeeSalary> arrayList) {
		ArrayList<EmployeeSalary> list = new ArrayList<EmployeeSalary>();
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).salary < 30000) {
				list.add(arrayList.get(i));
			}
		}
		return list;
	}

	public static void main(String[] args) {
		ArrayList<EmployeeSalary> empDetails = new ArrayList<EmployeeSalary>();
		EmployeeSalary emp1 = new EmployeeSalary("A", "a", 26, 101, 50000);
		EmployeeSalary emp2 = new EmployeeSalary("B", "b", 25, 102, 60000);
		EmployeeSalary emp3 = new EmployeeSalary("c", "c", 28, 103, 28000);
		EmployeeSalary emp4 = new EmployeeSalary("D", "d", 30, 104, 25000);
		empDetails.add(emp1);
		empDetails.add(emp2);
		empDetails.add(emp3);
		empDetails.add(emp4);

		System.out.println(EmployeeSalary.filterEmployeeBySalary(empDetails));
	}
}
