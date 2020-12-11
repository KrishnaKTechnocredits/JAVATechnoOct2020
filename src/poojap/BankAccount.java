package poojap;

public class BankAccount {
	
	String password;
	String userName;
	int bankAccountNumber;
	
	void setDetails() {
		
		userName="pooja";
		password="143";
		bankAccountNumber=46231;
	}
	
	void updatePassword(String updatePassword) {
		
		password=updatePassword;
	}
	
	void displayInfo() {
		
		System.out.println("UserName is :" +userName);
		System.out.println("Password is :" +password);
		System.out.println("BankAccountNumber is:" +bankAccountNumber);
	}

	public static void main(String[] args) {
		
		BankAccount bankAccount = new BankAccount();
		bankAccount.displayInfo();
		bankAccount.setDetails();
		bankAccount.updatePassword("****");
		bankAccount.displayInfo();
	}
}
