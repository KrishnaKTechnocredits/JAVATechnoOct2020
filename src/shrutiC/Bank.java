package shrutiC;

public class Bank {
	int balICICI, balHDFC, balBOB, balSBI;
	int creditCountICICI, creditCountHDFC, creditCountBOB, creditCountSBI;
	int debitCountICICI, debitCountHDFC, debitCountBOB, debitCountSBI;
	static int totalCreditCount, totalDebitCount;

	void getTotalBalance() {
		int totalAmount = balICICI + balBOB + balHDFC + balSBI;
		System.out.println("Total balance in all the banks : " + totalAmount);

	}

	void totalCreditDebitTransaction() {
		System.out.println("Total Credit operations performed : " + totalCreditCount);
		System.out.println("Total Debit operations performed : " + totalDebitCount);

	}

	void creditAmount(String bank, int creditAmount) {
		totalCreditCount++;

		switch (bank.toUpperCase()) {

		case "ICICI":
			balICICI += creditAmount;
			creditCountICICI++;
			break;

		case "HDFC":
			balHDFC += creditAmount;
			creditCountHDFC++;
			break;

		case "SBI":
			balSBI += creditAmount;
			creditCountSBI++;
			break;

		case "BOB":
			balBOB += creditAmount;
			creditCountBOB++;
			break;

		default:
			System.out.println("Kindly check the bank name");

		}

	}

	void bankCreditCount() {

		System.out.println("\nBank Credit operations:-");
		System.out.println("ICICI Bank : " + creditCountICICI);
		System.out.println("HDFC Bank : " + creditCountHDFC);
		System.out.println("SBI Bank : " + creditCountSBI);
		System.out.println("BOB Bank : " + creditCountBOB);

	}

	void bankDebitCount() {
		System.out.println("\nBank Debit operations:-");
		System.out.println("ICICI Bank : " + debitCountICICI);
		System.out.println("HDFC Bank : " + debitCountHDFC);
		System.out.println("SBI Bank : " + debitCountSBI);
		System.out.println("BOB Bank : " + debitCountBOB);

	}

	void debitAmount(String bank, int debitAmount) {

		boolean isAmountDebited = false;
		int balInAccount = 0;
		switch (bank.toUpperCase()) {

		case "ICICI":
			if (balICICI >= debitAmount) {
				balICICI -= debitAmount;
				debitCountICICI++;
				isAmountDebited = true;
			} else
				balInAccount = balICICI;
			break;

		case "HDFC":
			if (balHDFC >= debitAmount) {
				balHDFC -= debitAmount;
				debitCountHDFC++;
				isAmountDebited = true;
			} else
				balInAccount = balHDFC;
			break;

		case "SBI":
			if (balSBI >= debitAmount) {
				balSBI -= debitAmount;
				debitCountSBI++;
				isAmountDebited = true;
			} else
				balInAccount = balSBI;
			break;

		case "BOB":
			if (balBOB >= debitAmount) {
				balBOB -= debitAmount;
				debitCountBOB++;
				isAmountDebited = true;
			} else
				balInAccount = balBOB;
			break;

		default:
			System.out.println("Invalid bank name");
		}

		if (isAmountDebited)
			totalDebitCount++;
		else
			System.out.println("Amount " + debitAmount + " cannot be debitted from your " + bank
					+ " bank account due to insufficient balance of Rs " + balInAccount);

	}

	public static void main(String[] args) {
		Bank bank = new Bank();

		bank.creditAmount("ICICI", 50000);
		bank.creditAmount("SBI", 25000);
		bank.creditAmount("HDFC", 10000);
		bank.debitAmount("SBI", 15000);
		bank.creditAmount("ICICI", 2000);
		bank.creditAmount("HDFC", 20000);
		bank.debitAmount("SBI", 15000);
		bank.creditAmount("BOB", 30000);

		bank.bankCreditCount();
		bank.bankDebitCount();

		System.out.println("\nOverall Bank Operation details :- ");
		bank.getTotalBalance();
		bank.totalCreditDebitTransaction();

	}

}
