package priyanka;

public class StudentInfo {

	String Name = "Priyanka";
	String Middlename = "Jitendra";
	String Surname = "Kamthe";
	String Address = "Ganeshnand Apt,Dhankawadi Pune";
	String Birthdate = "16th Aug 1991";
	int RollNumber = 10;

	void StudentName() {

		System.out.println("Student Name is : " + Name);
		System.out.println("Student Middlename is: " + Middlename);
		System.out.println("Student Surname is: " + Surname);

	}

	void StudentOtherDetails() {

		System.out.println("Student Bithdate is: " + Birthdate);
		System.out.println("Student Address is : " + Address);
		System.out.println("Student RollNumber is : " + RollNumber);

	}

	public static void main(String[] args) {

		StudentInfo studentInfo = new StudentInfo();
		studentInfo.StudentName();
		studentInfo.StudentOtherDetails();

	}
}
