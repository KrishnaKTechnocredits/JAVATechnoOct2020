package surbhi;
class BankAccount {

	String username;
	String password;
	int bankAccountNumber;

	void setDetails() {

		username = "Surbhi";
		password = "ZZZZZZZZ";
		bankAccountNumber = 123567;
	};

	void upadtePassword(String stdpassword) {

		password = stdpassword;
	};

	void display() {

		System.out.println(" Username is " + username);
		System.out.println(" Password is " + password);
		System.out.println(" BankAccountNumber is " + username);
	}

	public static void main(String[] a) {
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails();
		bankAccount.upadtePassword("xxxxxxxx");
		bankAccount.display();

	}
}

