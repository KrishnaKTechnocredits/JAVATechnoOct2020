package shrutiS;

public class Practice1_291020 {
	
	String studentname;
	int studentRollNo;
	static String collegeName = "GH Raisoni";
	
	void studentDetails(String studentname, int studentRollNo) {
		this.studentname = studentname;
		this.studentRollNo = studentRollNo;
				
	}
	void displaystudentDetails() {
		System.out.println("Name : "+studentname);
		System.out.println("RollNo : "+studentRollNo);
		System.out.println("College name : "+collegeName);
	}
	
	public static void main(String[] a) {
		Practice1_291020 studentdetails1 = new Practice1_291020();
		Practice1_291020 studentdetails2 = new Practice1_291020();
		System.out.println("Student's details ");
		studentdetails1.studentDetails("Shruti", 10);
		studentdetails1.displaystudentDetails();
		System.out.println("                          ");
		studentdetails2.studentDetails("Shikha", 11);
		studentdetails2.displaystudentDetails();
		
	}
	
}
