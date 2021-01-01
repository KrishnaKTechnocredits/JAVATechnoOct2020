package himali.Assignment39;

public class Employee {
	
		int empId, salary;
		String empName;
		double yearsOfExperience ;
		

		Employee(int empId, String empName, double yearsOfExp, int salary) {
			this.empId = empId;
			this.empName = empName;
			this.yearsOfExperience  = yearsOfExp;
			this.salary = salary;
		}

		void displayEmployeeDetails()

		{
			System.out.println("Employee Id:" + empId + " \nEmployee Name:" + empName + "\nYears OF Experience:"
					+ yearsOfExperience  + " years of experience" + "\nSalary:" + salary);
		}

		boolean isEligible() {
			if (salary > 30000)
				return true;
			return false;
		}

		boolean isSwitchRequired() {
			if (yearsOfExperience  * 200000 < salary)
				return true;
			return false;
		}

		public static void main(String[] args) {

			Employee employee = new Employee(10, "ABC", 5, 35000);
			System.out.println("Employee  Information");
			employee.displayEmployeeDetails();
			System.out.println("Is Eligible:" + employee.isEligible());
			System.out.println("Is Switch Required:" + employee.isSwitchRequired());

		}

}
