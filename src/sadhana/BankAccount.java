package sadhana;

class BankAccount {
	String username;
	String password;
	int bankAccountNumber;

	void setDetails(String uName, String Pwd, int accNo) {
		username = uName;
		password = Pwd;
		bankAccountNumber = accNo;
	}

	void updatePassword(String Newpassword) {
		password = Newpassword;
	}

	void displayInfo() {
		System.out.println("FirstName:" + username);
		System.out.println("Password:" + password);
		System.out.println("AccountNumber:" + bankAccountNumber);

	}

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		System.out.println("Account Info is:");
		bankAccount.setDetails("Sadhana", "23Bije45", 201200);
		bankAccount.displayInfo();
		System.out.println("After updating password Account Info is:");
		bankAccount.updatePassword("456Patil");
		bankAccount.displayInfo();
	}

}