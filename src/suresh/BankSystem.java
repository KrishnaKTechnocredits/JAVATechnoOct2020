package suresh;

public class BankSystem {
	int debitCnt, creditCnt , balance, printSummary;
	static int TotalDebitCnt , totalCreditCnt, totalprintSummary;
	String username;
	
	void setData(String username , int balance) {
		this.username = username;
		this.balance = balance;
	}
	void Debit(int amount) {
		if(amount <= balance) {
			balance = balance - amount;
			debitCnt++;
			TotalDebitCnt++;
			System.out.println(username+":Debited Amount :" + amount+ " and current balance is:" + balance);
		}
		else
			System.out.println("Insufficient balance, Current of "+ username+"is" +balance +" and user trying debitting: " + amount);
	}
	
	 void Credit(int amount) {
		
		this.balance = this.balance +amount;
		creditCnt++;
		totalCreditCnt++;
		
		System.out.println(username + " Credited Amount  :" + amount + " and current balance is "+ balance);
	}
	void PrintBalance(int Amount) {
		
		printSummary++;
		totalprintSummary++;
		System.out.println("User :" + username + " 's debit count is " + debitCnt + " and credit count is" + creditCnt+ "and balance is:" +printSummary);
	}
	void TrasnsactionSummary() {
		System.out.println("Total Debit operation" + TotalDebitCnt + "Total Credit operation " + totalCreditCnt+ "and total balance is :"+ totalprintSummary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankSystem banksystem = new BankSystem();
		//banksystem.Credit(6000);
		//banksystem.Debit(4000);
		banksystem.setData("Suresh",5000);
		for(int i=1;i<=10;i++) {
			banksystem.Credit(2000);
			banksystem.Credit(1500);
			banksystem.Debit(4500);
			
		}
		banksystem.PrintBalance(TotalDebitCnt);
	}

}
