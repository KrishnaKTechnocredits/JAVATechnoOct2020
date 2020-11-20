package deepak;

public class BankSystem {
	
	int balance, amout, debitCount,creditCount;
	String username;
	static int totalDebitCount, totalCreditCount;
	
	void setData(String username, int balance) {
		this.username = username;
		this.balance = balance;
	}
	void debit( int amout){
		if(amout <= balance) {
			balance = balance - amout;
			debitCount++;
			totalDebitCount++;
		}	
	}
	void credit(int amout) {
		balance = balance + amout;
		creditCount++;
		totalCreditCount++;
	}
	void printBalance(){
		System.out.println(username +"'s balance is "+ balance);
	}
	void transactionSummary() {
		System.out.println(username + "'s Transaction Summary: credit "+ creditCount + " times, Debit "+ debitCount + " times, Balance Is "+ balance);
	}
	void allTransactionSummary() {
		System.out.println("Bank Overall Transaction History: ");
		System.out.println("Overall Credits happened: "+ totalCreditCount +" times, Overall Debit happened: "+ totalDebitCount + " times, Balance remaining: "+ balance);
	}
	
	public static void main(String[] args) {
		
		BankSystem bankSystem= new BankSystem();
		
		bankSystem.setData("Deepak", 5000);
		bankSystem.debit(2000);
		bankSystem.credit(97000);
		bankSystem.credit(2000);
		bankSystem.debit(50000);
		bankSystem.printBalance();
		bankSystem.transactionSummary();
		bankSystem.allTransactionSummary();
		
		BankSystem bankSystem1 = new BankSystem();
		bankSystem1.setData("Harsh", 50000);
		bankSystem1.debit(25000);
		bankSystem1.credit(75000);
		bankSystem1.credit(2000);
		bankSystem1.debit(50000);
		bankSystem1.printBalance();
		bankSystem1.transactionSummary();
		bankSystem1.allTransactionSummary();
	}

}
