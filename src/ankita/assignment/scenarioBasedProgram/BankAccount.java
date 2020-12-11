package ankita.assignment.scenarioBasedProgram;

public class BankAccount {
	String userName;
	String password;
	int bankAccountNumber;
	void setDetails(String name, String pwd, int accNum){
		userName = name;
		password = pwd;
		bankAccountNumber = accNum;
	}
	void updatePassword(String pwd){
		System.out.println("\nUpdating Details.............\n");
		password = pwd;
		}
	void displayInfo(){
		System.out.println("UserName : " + userName);
		System.out.println("Password : " + password);	
		System.out.println("Bank Acc Number : " + bankAccountNumber);
	}
	public static void main(String [] args){
		BankAccount bankAccount = new BankAccount();
		System.out.println("------------Bank Details------------");
		bankAccount.setDetails("Ankita", "Abcdef",13152);
		bankAccount.displayInfo();

		bankAccount.updatePassword("AAAAAA");
		
		System.out.println("------------Updated Bank Details------------");
		bankAccount.displayInfo();		
	}
}
