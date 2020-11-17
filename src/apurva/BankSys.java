package apurva;

public class BankSys {
	int debitCnt, creditCnt, balance, amount, transactionSummary; // (credit2, balance1600, debit1) (credit5,
																	// balance2900, debit2)
	String userName;
	static int totalCreditCnt, totalDebitCnt, totalBalance; // (totalcredit2,totaldebit1) (totalcredit5,totaldebit2) =
															// (totalcredit7,totaldebit2)

	void setData(String userName, int balance) { // user1/1000 user2/800
		this.userName = userName;
		this.balance = balance;
	}

	void credit(int amount) { // (700 /700), 500/500/500/500/500
		balance = balance + amount; // (700 + 1000 = 1700, 700 + 1700 = 2400), (500+800=1300 500+1300=1800
									// 500+1800=2300 500+2300=2800 500+2800=3300)
		creditCnt++; // (1/2) (1/2/3/4/5)
		totalCreditCnt++; // 2+5 = 7
		System.out.println("credit amount is: " + amount + "and current balance is: " + balance);
	}

	void debit(int amount) { // (800)
		if (amount <= balance) { // (true 2times, 800<=2400) (true 2times, 200<=3300)
			balance = balance - amount; // (1600) (3100, 2900)
		} else {
			System.out.println("Insufficient balance" + balance);
		}
		debitCnt++; // (1) (1/2)
		totalDebitCnt++; // 1+2=3/
		System.out.println(userName + "Debit Amount is: " + amount + " and Current Balance: " + balance);
	}

	void individualTransactionSummary(String userName) {
		System.out.println(userName + "transactionSummary: credit - " + creditCnt + "times, Debit - " + debitCnt
				+ "times, balance - " + balance);
		totalBalance = totalBalance + balance; // (0+(1600+2900)= 4500)
	}

	static void allTransactionSummary() {
		System.out.println("totalTransactionSummary: credit - " + totalCreditCnt + "times, Debit - " + totalDebitCnt
				+ "times, balance - " + totalBalance);
	}

	public static void main(String[] args) {
		BankSys banksys = new BankSys();
		banksys.setData("user1", 1000);
		for (int index = 1; index <= 2; index++) {
			banksys.credit(700);
		}
		banksys.debit(800);
		banksys.individualTransactionSummary("user1");
		banksys.setData("user2", 800);
		for (int index = 0; index <= 4; index++) {
			banksys.credit(500);
		}
		for (int index = 1; index <= 2; index++) {
			banksys.debit(200);
		}
		banksys.individualTransactionSummary("user2");
		allTransactionSummary(); // 4500
	}
}