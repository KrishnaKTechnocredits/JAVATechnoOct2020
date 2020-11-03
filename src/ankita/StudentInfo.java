package ankita;

public class StudentInfo {
	String name = "Ankita";
	String middleName = "Mukund";
	String surname = "Dahiwelkar";
	String birthdate = "7th Jan 1993";
	String address = "Shivajinagar, Pune";
	int rollNumber = 1;
	
	void studentName(){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	
	void studentOtherDetails(){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNumber);
	}
	
	public static void main(String [] args)	{
	StudentInfo studentInfo = new StudentInfo();
	studentInfo.studentName();
	studentInfo.studentOtherDetails();
	}}
