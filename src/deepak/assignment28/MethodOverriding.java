//Method Overrriding Demo

package deepak.assignment28;

public class MethodOverriding extends Object{
	
	int empID = 123;
	String deptName = "QA";
	
	 public String toString() {
	        return "Employee_ID :"+ empID + " Depart_Name :"+ deptName;
	    }
	 
	public static void main(String[] args) {
		
		MethodOverriding methodOverriding = new MethodOverriding();
		
		System.out.println(methodOverriding.toString());
	}
}
