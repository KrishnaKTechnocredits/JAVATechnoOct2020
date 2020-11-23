package priya;

public class BankAccountSwitchcase {
	float sbiBal, iciciBal, hdfcBal, bobBal;
	int sbiCreditCnt, iciciCreditCnt, hdfcCreditCnt, bobCreditCnt;
	int sbiDebitCnt, iciciDebitCnt, hdfcDebitCnt, bobDebitCnt;
	static int totalCredit, totalDebit;

	public void creditOperation(String bankName, int amount) {
		switch (bankName) {
		case "sbi":
			sbiBal = sbiBal + amount;
			sbiCreditCnt++;
			totalCredit++;
			System.out.println("Credit balance of SBI:" + sbiBal);
			break;
		case "icici":
			iciciBal = iciciBal + amount;
			iciciCreditCnt++;
			totalCredit++;
			System.out.println("Credit balance of ICICI:" + iciciBal);
			break;
		case "hdfc":
			hdfcBal = hdfcBal + amount;
			hdfcCreditCnt++;
			totalCredit++;
			System.out.println("Credit balance of HDFC:" + hdfcBal);
			break;
		case "bob":
			bobBal = bobBal + amount;
			bobCreditCnt++;
			totalCredit++;
			System.out.println("Credit balance of BOB:" + bobBal);
		}
	}

	public void debitOperation(String bankName, int amount) {

		switch (bankName) {
		case "sbi":
			if (sbiBal > amount) {
				sbiBal = sbiBal - amount;
				sbiDebitCnt++;
				totalDebit++;
				System.out.println("Debit balance of SBI:" + sbiBal);
			} else
				System.out.println("Insufficient Amount:Please Enter Valid Amount");
			break;

		case "icici":
			if (iciciBal > amount) {
				iciciBal = iciciBal - amount;
				iciciDebitCnt++;
				totalDebit++;
				System.out.println("Debit balance of ICICI:" + iciciBal);
			} else
				System.out.println("Insufficient Amount:Please Enter Valid Amount");
			break;

		case "hdfc":
			if (hdfcBal > amount) {
				hdfcBal = hdfcBal - amount;
				hdfcDebitCnt++;
				totalDebit++;
				System.out.println("Debit balance of HDFC:" + hdfcBal);
			} else
				System.out.println("Insufficient Amount:Please Enter Valid Amount");
			break;

		case "bob":
			if (bobBal > amount) {
				bobBal = bobBal - amount;
				bobDebitCnt++;
				totalCredit++;
				System.out.println("Debit balance of BOB:" + bobBal);
			} else
				System.out.println("Insufficient Amount:Please Enter Valid Amount");
			break;

		}
	}

	public void totalBalnce() {
		float totalBal;
		totalBal = (sbiBal + iciciBal + hdfcBal + bobBal);
		System.out.println("Total Balance of All Bank Is:" + totalBal);
	}

	public void individualCreditCount() {
		System.out.println("SBI Credit Count:" + sbiCreditCnt);
		System.out.println("ICICI Credit Count:" + iciciCreditCnt);
		System.out.println("HDFC Credit  Count:" + hdfcCreditCnt);
		System.out.println("BOB Credit Count:" + bobCreditCnt);
	}

	public void individualDebitCount() {
		System.out.println("SBI Debit Count:" + sbiDebitCnt);
		System.out.println("ICICI Debit Count:" + iciciDebitCnt);
		System.out.println("HDFC Debit Count:" + hdfcDebitCnt);
		System.out.println("BOB Debit Count:" + bobDebitCnt);
	}

	public void totalCreditDebitCount() {
		System.out.println("Total Credit Count Is:" + totalCredit);
		System.out.println("Total Debit Count Is:" + totalDebit);
	}

	public void bankOperation(String bankName, String op, int amount) {
		switch (op) {

		case "credit":

			creditOperation(bankName, amount);
			break;

		case "debit":
			debitOperation(bankName, amount);
			break;
		default:
			System.out.println("Invalid Operation:Please Enter valid Operation");
		}
	}

	public static void main(String[] arr) {
		BankAccountSwitchcase bankData = new BankAccountSwitchcase();
		bankData.bankOperation("icici", "credit", 3000);
		bankData.bankOperation("icici", "credit", 1000);
		bankData.bankOperation("icici", "debit", 800);
		bankData.bankOperation("sbi", "credit", 1500);
		bankData.bankOperation("sbi", "debit", 700);
		bankData.bankOperation("sbi", "debit", 1200);
		bankData.bankOperation("hdfc", "credit", 1000);
		bankData.bankOperation("hdfc", "credit", 1000);
		bankData.bankOperation("sbi", "credit", 10000);
		bankData.bankOperation("bob", "credit", 4000);
		bankData.bankOperation("hdfc", "debit", 500);
		bankData.bankOperation("hdfc", "credit", 3000);
		bankData.bankOperation("hdfc", "debit", 1000);
		bankData.bankOperation("bob", "debit", 3000);
		bankData.bankOperation("bob", "debit", 1500);

		System.out.println("---------Individual Credit Count------------");
		bankData.individualCreditCount();
		System.out.println("----------Individual Debit Count-------------");
		bankData.individualDebitCount();
		System.out.println("----------Total CreditDebit Count------------");
		bankData.totalCreditDebitCount();
		System.out.println("----------Toatal Balance Available Is-----------");
		bankData.totalBalnce();
	}

}
