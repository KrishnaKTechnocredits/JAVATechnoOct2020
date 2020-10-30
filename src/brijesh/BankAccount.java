package brijesh;
class BankAccount{
	String username;
	String password;
	int bankAccountNumber;
	void setDetails(String username, String password, int bankAccountNumber){
		this.username=username;
		this.password=password;
		this.bankAccountNumber=bankAccountNumber;
	}
	void updatePassword(String password){
		this.password=password;
	}
	void displayInfo(){
		System.out.println(username);
		System.out.println(password);
		System.out.println(bankAccountNumber);
	}
	public static void main(String[] args){
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails("bgajera","xyz",12364);
		bankAccount.updatePassword("def");
		bankAccount.displayInfo();
	}
}