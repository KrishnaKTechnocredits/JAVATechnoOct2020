package technoCredits.collectionDemo;

public class Employee {
	int empId;
	String empName;
	int salary;
	
	public Employee(int empId, String empName, int salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee)obj;
		return (this.empId == e.empId) && this.empName.equals(e.empName) && this.salary == e.salary;
	}
	
}
