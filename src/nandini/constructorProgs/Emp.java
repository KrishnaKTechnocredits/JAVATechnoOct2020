package nandini.constructorProgs;

public class Emp {

	String empName;
	String deptId;
	int salary;
	
	Emp(String empName, String deptId, int salary){
		this.empName = empName;
		this.deptId = deptId;
		this.salary = salary;	
	}
	public static void compareEmpSalary(Emp e1,Emp e2) {
		if(e1.salary > e2.salary) 
			System.out.println("Employee "+e1.empName+ " with DeptId "+e1.deptId+ " has max salary of Rupees "+e1.salary);
		else
			System.out.println("Employee "+e2.empName+ " with DeptId "+e2.deptId+ " has max salary of Rupees "+e2.salary);
	}
	public static void main(String args[]) {
		Emp emp1 = new Emp("Shubham","4578",50000);
		Emp emp2 = new Emp("Mihika","6844",75000);
		Emp.compareEmpSalary(emp1, emp2);
	}
}
