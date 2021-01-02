package suresh;
/*Program : 1 
Create Employee class and parameterized constructor with attributes empId , empName,
years of Experience and salary. Write a method to display the details of employees. Create a method isEligible which will return true if Employee salary is more than 30000. Create a method isSwitchRequired, which will return true if yearsOfExperience * 200000 < salary.
*/
public class EmployeeDetails {
	int empId ;
	String empName;
	int yearsOfExperience;
	int salary;

		void empData(int empId ,String empName,int yearsOfExperience,int salary) {
			this.empId= empId ;
			this.empName =  empName;
			this.yearsOfExperience = yearsOfExperience;
			this.salary = salary;
			System.out.println("<=========================>Employee Details<=========================>");
			System.out.println("Employee id is:" + empId);
			System.out.println("Employee Name is:" + empName);
			System.out.println("Employee Experience in Years:" + yearsOfExperience);
			System.out.println("Employee Salary is:" + salary);
		}
		
		void isEligible(int salary) {
			this.salary = salary;
			boolean flag = false;
			if(salary>30000) {
				System.out.println("<=========================>Salary Eligibility Check<=========================>");
				System.out.print("Salary is  as per Market standard: "+salary+" --->");
				flag = true;
			}
				
			System.out.println(flag);
		}
		void isSwitchRequired(int yearsOfExperience,int salary){
			this.yearsOfExperience = yearsOfExperience;
			this.salary = salary;
			boolean flag = false;
			if(salary<(yearsOfExperience*200000)) {
				System.out.print("Salary is low as per Market standard: "+salary+" --->");
				flag = true;
				
			}
			System.out.println(flag);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails employee = new EmployeeDetails();
		employee.isSwitchRequired(1, 150000);
		employee.isEligible(50000);
		employee.empData(3800,"Sri",3,20000);
	}

}
