package mrunal;

public class Bankkaccount {

    String username ;
    String password;
    String bankAccountNumber;

   void setDetails(){
          username = "Axis Bank";
          password = "axisBank123";
          bankAccountNumber = "123456789";
 }

   void updatePassword(String newpassword){
          password = newpassword;
 }

   void displayInfo(){

     System.out.println("Username is  "  +username);
     System.out.println("Password is  "  +password);
     System.out.println("BankAccountNo is "  +bankAccountNumber);
 }

   public static void main(String[]args){
	   Bankkaccount bankaccount = new Bankkaccount();
      bankaccount.setDetails();
      bankaccount.updatePassword("axisBank789");
      bankaccount.displayInfo();
 }

}
