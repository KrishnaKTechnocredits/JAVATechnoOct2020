package anjaliS;

public class BankDetails {
	float sBal, iBal, hBal, bBal;
	int sCreditCnt, iCreditCnt, hCreditCnt, bCreditCnt;
	int sDebitCnt, iDebitCnt, hDebitCnt, bDebitCnt;
	static int totalCredit, totalDebit;

	public void creditOperation(String bankName, int amount) {
		switch (bankName) {
		case "sbi":
			sBal = sBal + amount;
			sCreditCnt++;
			totalCredit++;
			System.out.println("Credit balance of SBI is " + sBal);
			break;
		case "icici":
			iBal = iBal + amount;
			iCreditCnt++;
			totalCredit++;
			System.out.println("Credit balance of ICICI is " + iBal);
			break;
		case "hdfc":
			hBal = hBal + amount;
			hCreditCnt++;
			totalCredit++;
			System.out.println("Credit balance of HDFC is " + hBal);
			break;
		case "bob":
			bBal = bBal + amount;
			bCreditCnt++;
			totalCredit++;
			System.out.println("Credit balance of BOB is " + bBal);
		}
	}

	public void debitOperation(String bankName, int amount) {

		switch (bankName) {
		case "sbi":
			if (sBal > amount) {
				sBal = sBal - amount;
				sDebitCnt++;
				totalDebit++;
				System.out.println("Debit balance of SBI:" + sBal);
			} else
				System.out.println("Insufficient Amount");
			break;

		case "icici":
			if (iBal > amount) {
				iBal = iBal - amount;
				iDebitCnt++;
				totalDebit++;
				System.out.println("Debit balance of ICICI:" + iBal);
			} else
				System.out.println("Insufficient Amount:Please Enter Valid Amount");
			break;

		case "hdfc":
			if (hBal > amount) {
				hBal = hBal - amount;
				hDebitCnt++;
				totalDebit++;
				System.out.println("Debit balance of HDFC is " + hBal);
			} else
				System.out.println("Insufficient balance");
			break;

		case "bob":
			if (bBal > amount) {
				bBal = bBal - amount;
				bDebitCnt++;
				totalCredit++;
				System.out.println("Debit balance of BOB is " + bBal);
			} else
				System.out.println("Insufficient Amount");
			break;

		}
	}

	public void totalBalance() {
		float totalBal;
		totalBal = (sBal + iBal + hBal + bBal);
		System.out.println("Total Balance of All Bank Is:" + totalBal);
	}

	public void individualCreditCount() {
		System.out.println("SBI Credit Count is " + sCreditCnt);
		System.out.println("ICICI Credit Count is " + iCreditCnt);
		System.out.println("HDFC Credit  Count is " + hCreditCnt);
		System.out.println("BOB Credit Count is " + bCreditCnt);
	}

	public void individualDebitCount() {
		System.out.println("SBI Debit Count is " + sDebitCnt);
		System.out.println("ICICI Debit Count is " + iDebitCnt);
		System.out.println("HDFC Debit Count is " + hDebitCnt);
		System.out.println("BOB Debit Count is " + bDebitCnt);
	}

	public void totalCreditDebitCount() {
		System.out.println("Total Credit Count is " + totalCredit);
		System.out.println("Total Debit Count is " + totalDebit);
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
			System.out.println("Invalid Operation");
		}
	}

	public static void main(String[] arr) {
		BankDetails bankdetails = new BankDetails();
		bankdetails.bankOperation("icici", "credit", 5000);
		bankdetails.bankOperation("icici", "creditt", 2000);
		bankdetails.bankOperation("icici", "debit", 1500);
		bankdetails.bankOperation("sbi", "credit", 1800);
		bankdetails.bankOperation("sbi", "debit", 600);
		bankdetails.bankOperation("sbi", "debit", 1900);
		bankdetails.bankOperation("hdfc", "credit", 200);
		bankdetails.bankOperation("sbi", "credit", 1800);
		bankdetails.bankOperation("bob", "credit", 4200);
		bankdetails.bankOperation("hdfc", "debit", 600);
		bankdetails.bankOperation("hdfc", "credit", 3200);
		bankdetails.bankOperation("hdfc", "debit", 1690);
		bankdetails.bankOperation("bob", "debit", 3200);
		bankdetails.bankOperation("bob", "debit", 1000);

		System.out.println("Credit Count of each bank ");
		bankdetails.individualCreditCount();
		System.out.println("Debit count of each bank ");
		bankdetails.individualDebitCount();
		System.out.println("Total credit count ");
		bankdetails.totalCreditDebitCount();
		System.out.println("Total Balance Available is ");
		bankdetails.totalBalance();
	}
}