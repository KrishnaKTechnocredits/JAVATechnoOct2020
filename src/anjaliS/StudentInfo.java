package anjaliS;

public class StudentInfo{
    String name = "Anjali";
    String middlename = "Dewesh";
    String surname = "Shukla";
    String birthdate = "26 Oct 1995";
    String address = "Sangam Nagar,Indore";	
    int rno = 10;
    
void studentName(){
   System.out.println("Name is  " +name);
   System.out.println("Middlename is " +middlename);
   System.out.println("Surname is " +surname);
}
void studentOtherDetails(){
   System.out.println("Address is  "  +address);
   System.out.println("Rollnum is  "  +rno);
   System.out.println("DOB is "  +birthdate);
 }
public static void main(String[]args){
      StudentInfo studentinfo = new StudentInfo();
      studentinfo.studentName();
      studentinfo.studentOtherDetails(); 
    }

}
