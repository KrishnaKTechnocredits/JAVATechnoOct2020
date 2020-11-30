/*Assignment - 13 : 8th Oct'2020
A person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
          a) Person can debit or credit amount from respective bank.
              Hint : Switch case is expected here. [Please watch today's recording again, in case of confusion.]
          b) A Method to show total balance [ICICI balance + HDFC balance + BOB balance + SBI Balance]
          c) A Method to show total credit, debit operations 
                 output : Total credit operation - 7 times
                              Total debit operation - 5 times
         d) A Method to show individual bank credit operations.
                output : ICICI bank Credit Operation - 2
                         HDFC bank Credit Operation - 2
		                 SBI bank Credit Operation - 1
                         BOB bank Credit Operation - 4
         e) A Method to show individual bank debit operations.
                output : ICICI bank Debit Operation - 2
                         HDFC bank Debit Operation - 2
		                 SBI */

package anurag;

public class Assignment13 {

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
			System.out.println("Credit balance SBI:" + sbiBal);
			break;
		case "icici":
			iciciBal = iciciBal + amount;
			iciciCreditCnt++;
			totalCredit++;
			System.out.println("Credit balance ICICI:" + iciciBal);
			break;
		case "hdfc":
			hdfcBal = hdfcBal + amount;
			hdfcCreditCnt++;
			totalCredit++;
			System.out.println("Credit balance HDFC:" + hdfcBal);
			break;
		case "bob":
			bobBal = bobBal + amount;
			bobCreditCnt++;
			totalCredit++;
			System.out.println("Credit balance BOB:" + bobBal);
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
				System.out.println("Insufficient Amount:Please Enter correct Amount");
			break;

		case "icici":
			if (iciciBal > amount) {
				iciciBal = iciciBal - amount;
				iciciDebitCnt++;
				totalDebit++;
				System.out.println("Debit balance of ICICI:" + iciciBal);
			} else
				System.out.println("Insufficient Amount:Please Enter correct Amount");
			break;

		case "hdfc":
			if (hdfcBal > amount) {
				hdfcBal = hdfcBal - amount;
				hdfcDebitCnt++;
				totalDebit++;
				System.out.println("Debit balance of HDFC:" + hdfcBal);
			} else
				System.out.println("Insufficient Amount:Please Enter correct Amount");
			break;

		case "bob":
			if (bobBal > amount) {
				bobBal = bobBal - amount;
				bobDebitCnt++;
				totalCredit++;
				System.out.println("Debit balance of BOB:" + bobBal);
			} else
				System.out.println("Insufficient Amount:Please Enter correct Amount");
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

	public void bankOperation(String bankName, String operation, int amount) {
		switch (operation) {

		case "credit":
			creditOperation(bankName, amount);
			break;

		case "debit":
			debitOperation(bankName, amount);
			break;
			
		default:
			System.out.println("Operation Invalid: Please Enter valid Operation");
		}
	}

	public static void main(String[] arr) {
		Assignment13 assignment13 = new Assignment13();
		assignment13.bankOperation("icici", "credit", 1000);
		assignment13.bankOperation("icici", "creditt", 2000);
		assignment13.bankOperation("icici", "debit", 3000);
		assignment13.bankOperation("sbi", "credit", 4000);
		assignment13.bankOperation("sbi", "debit", 5000);
		assignment13.bankOperation("sbi", "debit", 6000);
		assignment13.bankOperation("hdfc", "credit", 7000);
		assignment13.bankOperation("sbi", "credit", 8000);
		assignment13.bankOperation("bob", "credit", 9000);
		assignment13.bankOperation("hdfc", "debit", 10000);
		assignment13.bankOperation("hdfc", "credit", 11000);
		assignment13.bankOperation("hdfc", "debit", 12000);
		assignment13.bankOperation("bob", "debit", 13000);
		assignment13.bankOperation("bob", "debit", 1400);

		System.out.println("Individual Credit Count: ");
		assignment13.individualCreditCount();
		System.out.println("Individual Debit Count:");
		assignment13.individualDebitCount();
		System.out.println("Total Credit-Debit Count:");
		assignment13.totalCreditDebitCount();
		System.out.println("Toatal Balance Available Is:");
		assignment13.totalBalnce();
	}
}
 