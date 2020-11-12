package prem;

//Java Assignment : 2, Program:1,Date:20th Oct 2020																												
//Print All details of Student like Name, Middle name, Surname, birthdate, Address and Roll number 

class StudentInfo{

		String name;
		String middlename;
		String surname;
		String dateofbirth;
		String address;
		int rollnumber;

		void studentName(){
			name = "Rajesh";
			middlename = "Ajit";
			surname = "Khanna";
			System.out.println(name);
			System.out.println(middlename);
			System.out.println(surname);
		}
		
		void studentOtherDetails(){
			dateofbirth = "9th Sep 1988";
			rollnumber = 1020;
			address = "10, Sterlling Owsis, Dhanesh Nagar";			
			System.out.println(dateofbirth);
			System.out.println(address);
			System.out.println(rollnumber);
		}
		
		public static void main(String[] a){
			StudentInfo student = new StudentInfo();
			student.studentName();
			student.studentOtherDetails();
		}			
}