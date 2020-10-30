package priya;

public class StudentInfo {
	String name = "Aarya";
	String middlename = "Ajit";
	String surname = "More";
	String birthdate = "06th Dec 2008";
	String address = "G-809, Heaven Apartment, Baner, Pune";
	int rollnumber = 34;
	
	void studentName() {
		System.out.println(name);
		System.out.println(middlename);
		System.out.println(surname);
	}
	void studentOtherDetails() {
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollnumber);
	}
	public static void main(String[] args) {
		StudentInfo studentdetails = new StudentInfo();
		studentdetails.studentName();
		studentdetails.studentOtherDetails();
	}
}
