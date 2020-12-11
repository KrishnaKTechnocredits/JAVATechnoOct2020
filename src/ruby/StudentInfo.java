package ruby;

class StudentInfo{

	void studentName(String name, String middlename, String surname){ // Set Student Name
		System.out.println(name);
		System.out.println(middlename);
		System.out.println(surname);	
	}

	void studentOtherDetials(String birthdate, String address, int rollno){ // Set Student Other details
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollno);
	}
	
	public static void main(String [] a){
	StudentInfo studentInfo = new StudentInfo();
	studentInfo.studentName(" Ruby"," Nasir"," Khan");
	studentInfo.studentOtherDetials(" 21th Mar 1990", " Gini bellissimo,Dhanori,Pune.", 12);
	}
}
