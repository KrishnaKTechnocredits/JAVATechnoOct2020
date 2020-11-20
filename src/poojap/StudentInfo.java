package poojap;

public class StudentInfo {
	
	int rollNumber=1;
	String Name="Pooja";
	String middleName="Prakash";
	String Surname="Pekhale";
	String birthDate="19th Jan 1996";
	String Address="P-102 Pride Apartment,Nashik";
	
	void studentName() {
		
		System.out.println(Name);
		System.out.println(middleName);
		System.out.println(Surname);
	}
	
	void studentOtherDetails() {
		
		System.out.println(rollNumber);
		System.out.println(birthDate);
		System.out.println(Address);
	}
	
	public static void main(String[] args) {
		
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}

}
