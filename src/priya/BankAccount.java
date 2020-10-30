package priya;

public class BankAccount {

	int bankAccountNumber;
	String username;
	String password;
	
	void setDetails(String uname, String pwd, int bankAccountNum) {
		username = uname;
		password = pwd;
		bankAccountNumber = bankAccountNum;
	}
	void updatePassword(String pwd) {
		password = pwd;
		System.out.println("*****Updated Password*****");
	}
	void displayInfo() {
		System.out.println("Username is : " +username);
		System.out.println("Password is : " +password);
		System.out.println("BankAccountNumber is : " +bankAccountNumber);
	}
	public static void main(String[] args) {
		BankAccount bankaccount = new BankAccount();
		bankaccount.setDetails("Priya","priya@006", 112233445);
		bankaccount.displayInfo();
		bankaccount.updatePassword("priya@123");
		bankaccount.displayInfo();
	}
}
