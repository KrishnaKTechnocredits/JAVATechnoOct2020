package anjaliP;

public class StudentInfo {
	String name;
	String middleName;
	String surName;
	String birthDate;
	String address;
	int rollNum;
	
	void studentName(String name,String middleName,String surName) {
		System.out.println("----------------Student Details-------------------");
		System.out.println("Student Name : "+name);
		System.out.println("Middle Name : "+middleName);
		System.out.println("SurName is : "+surName);
	}
	void studentDetails(String birthDate,String address , int rollNum) {
		System.out.println("Student Birthdate is : "+birthDate);
		System.out.println("Student address : "+address);
		System.out.println("Student Roll No : "+rollNum);
	}
	public static void main(String[] a) {
		StudentInfo studentinf = new StudentInfo();
		studentinf.studentName("Aishwarya","Padmakumar","Nair");
		studentinf.studentDetails("17th Aug 1994","Krishna Tyres,Chandrapur", 02);
	}
}
