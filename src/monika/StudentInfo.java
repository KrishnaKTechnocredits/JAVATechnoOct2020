package monika;
class StudentInfo{
      int rollno = 10;   
      String firstName = "John";
	  String middleName = "Bred";
	  String surName = "Linn";
	  String birthdate = "20th Oct 2020";
	  String address = "Ricmond circle ,Bangalore";
	  
	   void studentName(){
	         System.out.println("First Name is: "+ firstName);
			 System.out.println("Middle Name is: " + middleName);
			 System.out.println("Last Name is : "+ surName);
			 
			 
	   }
		void studentOtherDetails(){
		     System.out.println("Birthdate is: "+ birthdate);
			 System.out.println("Address is: "+ address);
			 System.out.println("RollNumber is: "+rollno);
			 
		}
		public static void main(String []args){
		   StudentInfo studentinfo = new StudentInfo();
		   studentinfo.studentName();
		   studentinfo.studentOtherDetails();
		   
		}
		   
}	   
		
			 
			 