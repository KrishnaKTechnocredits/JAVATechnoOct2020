package anjaliS;

public class BankAccount{

    String username ;
    String password;
    String bankAccountNumber;
   
   void setDetails(){
          username = "anjalidewesh";
          password = "ani1234";
          bankAccountNumber = "19072882299";
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
      BankAccount bankaccount = new BankAccount();
      bankaccount.setDetails();
      bankaccount.updatePassword("ani2233");
      bankaccount.displayInfo();
 }

}
 

