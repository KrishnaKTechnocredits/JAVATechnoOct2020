package prem;

//Assignment - 2, Program  - 2 , Date 19th Oct 2020
//Create a class called BankAccount which is having different methods and perform operations

class BankAccount{
	
	String username;
	String password;
	int bankAccountNumber;

	void setDetails(){
		 username = "Raman";
		 password = "XXXX";
		 bankAccountNumber = 112244;
	}
	
	void updatePassword(String newpassword){
		password = newpassword;
	}
	
	void displayInfo(){
		System.out.println("Account holder name is "+username);
		System.out.println("Password is "+password);
		System.out.println("Bank Account number  "+bankAccountNumber);
	}
	
	public static void main (String[] a){
		BankAccount bankaccount = new BankAccount();
		bankaccount.setDetails();
		bankaccount.updatePassword("TestPassword");
		bankaccount.displayInfo();
	}

}
