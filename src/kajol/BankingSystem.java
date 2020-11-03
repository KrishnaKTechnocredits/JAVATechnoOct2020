package kajol;

public class BankingSystem {
	int individualCreditcount;
	int individualDebitcount;
	int individualPrintBalancecount;
	int currentBalance;
	static int allUsersCreditcount;
	static int allUsersDebitcount;
	static int allUsersPrintBalancecount; 
	
	void  creditAmount(int creditamount) {
		currentBalance=currentBalance + creditamount;
		individualCreditcount++;
		allUsersCreditcount++;
	}
	
	void debitAmount(int debitamount) {
		currentBalance=currentBalance - debitamount;
		individualDebitcount++;
		allUsersDebitcount++;
	}
	
	void printUserBalance(String userName) {
		System.out.println("Current Balance of "+userName+" : Rs."+currentBalance+"/-");
		individualPrintBalancecount++;
		allUsersPrintBalancecount++;
		System.out.println("");
	}
	
	void individualTransactionSummary(String userName) {
		System.out.println(userName+" Transaction Summary :");
		System.out.println("---------------------------------------------");
		System.out.println("Account was Credited : "+individualCreditcount+" times.");
		System.out.println("Account was Debited : "+individualDebitcount+" times.");
		System.out.println("Printed Balance : "+individualPrintBalancecount+" times.");	
		
		System.out.println("");
	}
	
	static void allUsersTransactionSummary() {
		System.out.println("All Users Transaction Summary :");
		System.out.println("---------------------------------------------");
		System.out.println("Total Credits performed on all Users Accounts : "+allUsersCreditcount+" times.");
		System.out.println("Total Debits performed on all Users Accounts : "+allUsersDebitcount+" times.");
		System.out.println("Printed Balance for all Users Accounts : "+allUsersPrintBalancecount+" times.");
	}
	
	public static void main(String[] args) {
		BankingSystem bankingSystem1=new BankingSystem();
		bankingSystem1.creditAmount(2000);
		bankingSystem1.creditAmount(2000);
		bankingSystem1.debitAmount(1000);
		bankingSystem1.printUserBalance("User1");
		bankingSystem1.individualTransactionSummary("User1");
		
		BankingSystem bankingSystem2=new BankingSystem();
		bankingSystem2.creditAmount(3000);
		bankingSystem2.debitAmount(1000);
		bankingSystem2.debitAmount(500);
		bankingSystem2.printUserBalance("User2");
		bankingSystem2.individualTransactionSummary("User2");
		
		allUsersTransactionSummary();
		
	}
	
}
