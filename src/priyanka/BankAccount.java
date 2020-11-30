package priyanka;

public class BankAccount {

	String UserName;
	String Password;
	int AccountNumber;

	void setdetails(String Username, String Pass, int AccountNo) {

		UserName = Username;
		Password = Pass;
		AccountNumber = AccountNo;

	}

	void updatePassword(String UpdatePass) {

		Password = UpdatePass;
		System.out.println("*******The User Information after Password update******");

	}

	void display() {

		System.out.println("Username = " + UserName);
		System.out.println("Password = " + Password);
		System.out.println("AccountNumber = " + AccountNumber);

	}

	public static void main(String[] args) {

		BankAccount bankaccount = new BankAccount();
		bankaccount.setdetails("Priyanka", "Password#12", 98500);
		bankaccount.display();
		bankaccount.updatePassword("Password@09");
		bankaccount.display();

	}

}
