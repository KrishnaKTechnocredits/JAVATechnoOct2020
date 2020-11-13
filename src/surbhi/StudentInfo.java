package surbhi;
class StudentInfo {

	String name;
	String middlename;
	String surname;
	String bdate;
	String address;
	int rollNumber;

	void StudentName() {

		name = "Surbhi";
		middlename = "jain";
		surname = "Singhai";

		System.out.println(" Name is  = " + name + " Middlename is = " + middlename + " Surname is = " + surname);

	};

	void studentOtherDetails() {

		bdate = "10th Aug 1998";
		address = "24 Jawahar ward";
		rollNumber = 105;
		System.out.println(" Bdate is = " + bdate + " Address is = " + address + " RollNumber is = " + rollNumber);

	};

	public static void main(String[] a) {
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.StudentName();
		studentInfo.studentOtherDetails();

	}

}