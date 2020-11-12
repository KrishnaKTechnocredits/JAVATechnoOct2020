package brijesh;
class StudentInfo{
	String name="Brijesh";
	String middleName = "H";
	String surname= "Gajera";
	String birthdate = "10th Aug 1998";
	String address = "18, Mota Varachha";
	int rollNo=20;
	void studentName(){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	
	void studentOtherDetails(){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNo);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}

}