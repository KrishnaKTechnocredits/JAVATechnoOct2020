package yogita;

class BankAccount{
	  String userName1;
	  String password1;
	  int bankAccountNumber;

 void setDeatils( String userName ,String password,int acntNo){
	  userName1 = userName;
	  password1 = password;
	  bankAccountNumber = acntNo;
	}
	
 void updatePassword(String updatedPassword){
	  password1 = updatedPassword;
	}
	
 void displayInfo(){
	  System.out.println("User name is : "+userName1);
	  System.out.println("Password is : "+password1);
	  System.out.println("Accoutn Number is :"+bankAccountNumber);
	}
	
public static void main(String [] arr){
	  BankAccount bankAccount = new BankAccount();
	  bankAccount.setDeatils("Yogita" , "Xyz@12345",13164);
	  bankAccount.displayInfo();
	  System.out.println("Password After Updation is :");
	  bankAccount.updatePassword("Abc@6789");
	  System.out.println(bankAccount.password1);
	}
}