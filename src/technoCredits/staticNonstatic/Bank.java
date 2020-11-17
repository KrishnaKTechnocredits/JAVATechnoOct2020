package technoCredits.staticNonstatic;

public class Bank {
	int debitCnt, creditCnt,printSummary, balance;
	static int totalDebitCnt, totalCreditCnt,totalprintSummary;
	String username;
	
	void setData(String username, int balance) {
		this.username = username;
		this.balance = balance;
	}
	
	void debit(int amount) {
		if(amount <= balance) {
			balance = balance - amount;
			System.out.println(username + ": Debited Amount is " + amount + " and current balance is " + balance);
		}else
			System.out.println("Insufficient balance , current balance of " + username + " is " + balance + " and user try debiting " + amount);
		
		debitCnt++;
		totalDebitCnt++;
	}
	
	void credit(int amount) {
		this.balance = this.balance + amount;
		creditCnt++;
		totalCreditCnt++;
		System.out.println(username + ": Credited amount is " + amount + " and current balacne is " + balance);
	}
	

	void displaySummary() {
		printSummary++;
		totalprintSummary++;
		System.out.println("User " + username + "'s debit count is " + debitCnt + " and credit count is " + creditCnt + " and balance view count " + printSummary);
	}
	
	static void printOverAllSummary() {
		System.out.println("Total Debit operation " + totalDebitCnt + " and total credit operation " + totalCreditCnt + " and total balance view operation " + totalprintSummary);
	}
	
	public static void main(String[] args) {
		Bank bankUser1 = new Bank();
		bankUser1.setData("Maulik",5000);
		for(int index=1;index<=10;index++) {
			bankUser1.credit(2000);
			bankUser1.credit(1500);
			bankUser1.debit(4500);
		}
		bankUser1.displaySummary();
		
		Bank bankUser2 = new Bank();
		bankUser2.setData("Harsh",12000);
		bankUser2.credit(1000);
		bankUser2.debit(4000);
		bankUser2.debit(5000);
		bankUser2.debit(6000);
		bankUser2.credit(2000);
		bankUser2.debit(1000);
		bankUser2.displaySummary();
		
		Bank.printOverAllSummary();
		//printOverAllSummary();
		//bankUser2.printOverAllSummary();
	}
	
}
