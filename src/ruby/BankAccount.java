package ruby;

class BankAccount{
	String username;
	String password;
	int accountNumber;
	
	void setDetails(String username1, String password1, int accountNumber1){ //Set Bank Details 
		username=username1;
		password=password1;
		accountNumber=accountNumber1;
	}
	
	void updatePassword(String newpassword){	// Update Password
		password = newpassword;
	}
	
	void displayInfo(){							// Display User Bank Details information
		System.out.println(" Username: "+username);
		System.out.println(" Password: "+password);	
		System.out.println(" AccountNumber: "+accountNumber);
	}

	public static void main(String[] a){
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails("rubykhan", "PASSWORD", 123456);
		bankAccount.displayInfo();							// Before Update
		bankAccount.updatePassword("NEWPASSWORD");
		System.out.println("Bank Details after updating passowrd");
		bankAccount.displayInfo();							// After Update Password
	}
}