// Date - 20-Oct-2020, Day 4
//Java Assignment 2 - Program:1
package nitin;
class StudentInfo{
	
	int rollNumber=10;
	String name="Narendra";
	String middleName="DamodarDas";
	String surname="Modi";
	String birthDate="17th Sep 1950";
	String address="North Block, PMO, New Delhi";
	
	void studentName(){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	
	void studentOtherDetails(){
		System.out.println(birthDate);
		System.out.println(address);
		System.out.println(rollNumber);
	}
	
	public static void main(String[] a){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	
	}
}

