package sadhana;

class StudentInfo {

	void studentName(String Name, String middleName, String SurName) {
		System.out.println("Student Info:");
		System.out.println(Name);
		System.out.println(middleName);
		System.out.println(SurName);
	}

	void studentOtherDetails(int rollNumber, String birthdate, String Address) {
		System.out.println("Student other details are:");
		System.out.println(rollNumber);
		System.out.println(birthdate);
		System.out.println(Address);
	}

	public static void main(String[] args) {
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Shikha", "Amit", "Patel");
		studentInfo.studentOtherDetails(34, "10th Aug 1998", "G-809, Heaven Apartment, Baner, Pune.");
	}

}
