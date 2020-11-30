// Date - 20-Oct-2020, Day 4
//Java Assignment 2 - Program:2
package nitin;
class BankAccount{

	String uname;
	String pwd;
	int bankAccNo;

	void setDetails(String userName, String password, int bankAccountNumber){
		uname=userName;
		pwd=password;
		bankAccNo=bankAccountNumber;
	}

	void updatePassword(String updatedpassword){
		pwd=updatedpassword;
	}

	void displayInfo(){
		System.out.println("UserName is "+uname);
		System.out.println("Password is "+pwd);
		System.out.println("Bank Account Number is "+bankAccNo);
	}

	public static void main(String[] a){
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails("Nitin","XXXXXX",123456);
		bankAccount.displayInfo();
		bankAccount.updatePassword("XYZXYZ");
		System.out.println("---- YOUR PASSWORD IS UPDATED -----");
		bankAccount.displayInfo();
	}
}