package dhara;
class StudentInfo{
	String name="Dhara";
	String middleName="Hardik";
	String surname="Boda";
	String birthDate="9th March 1991";
	String address="Belgium";
	int rollNumber= 12;
	
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
	
	public static void main(String[] args){
		StudentInfo studentInfo=new StudentInfo();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}	
	
	
}