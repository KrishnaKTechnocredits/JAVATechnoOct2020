package technoCredits.collectionDemo;

public class EmployeeDetails implements Comparable<EmployeeDetails> {
	
	int empId;
	String empName;
	int salary;
	
	public EmployeeDetails(int empId, String empName, int salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	@Override
	public int compareTo(EmployeeDetails empDetails) {
		return this.salary - empDetails.salary; // 0, + , -
		//return this.empName.compareTo(empDetails.empName);
	}
	
	// 0 = both objects are same
	// + = first object is bigger than second
	// - = first object is smaller than second
	
	
	public String toString() {
		return this.empName + "-" + this.salary;
	}
	/*@Override
	public int hashCode() {
		return 1;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee)obj;
		return (this.empId == e.empId) && this.empName.equals(e.empName) && this.salary == e.salary;
	}
	*/
}
