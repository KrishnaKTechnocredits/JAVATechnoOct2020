package mrunal;

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
public class assignment_13 {
	float iciciBalance,hdfcBalance, bobBalance, sbiBalance;
	int iciciCreditCount, hdfcCreditCount, bobCreditCount, sbiCreditCount;
	int iciciDebitCount, hdfcDebitCount, bobDebitCount, sbiDebitCount;
	static int totalDebitCount, totalCreditCount;

	public void credit(String bankName, int amount) {
		switch (bankName) {
			case "icici":
				iciciBalance =iciciBalance+amount;
				iciciCreditCount++;
				totalCreditCount++;
				System.out.println("Available Credit Balance in ICICI: "+iciciBalance);
				break;
			case "hdfc":
				hdfcBalance=hdfcBalance+amount;
				hdfcCreditCount++;
				totalCreditCount++;
				System.out.println("Available Credit Balance in HDFC: "+hdfcBalance);
				break;
			case "bob":
				bobBalance=bobBalance+amount;
				bobCreditCount++;
				totalCreditCount++;
				System.out.println("Available Credit Balance in BOB: "+bobBalance);
				break;
			case "sbi":
				sbiBalance=sbiBalance+amount;
				sbiCreditCount++;
				totalCreditCount++;
				System.out.println("Available Credit Balance in SBI: "+sbiBalance);
				break;
			default:
				System.out.println("You don't have account in this bank. Please select valid bank");
		}
	}

	public void debit(String bankName, int amount) {
		switch (bankName) {
		case "icici":
			if (iciciBalance > amount) {
				iciciBalance = iciciBalance - amount;
				iciciDebitCount++;
				totalDebitCount++;
				System.out.println("Debit balance of ICICI:" + iciciBalance);
			} else
				System.out.println("Insufficient Amount:Please Enter Valid Amount");
			break;
		case "hdfc":
			if (hdfcBalance > amount) {
				hdfcBalance = hdfcBalance - amount;
				hdfcDebitCount++;
				totalDebitCount++;
				System.out.println("Debit balance of HDFC is " + hdfcBalance);
			} else
				System.out.println("Insufficient balance");
			break;
		case "bob":
			if (bobBalance > amount) {
				bobBalance = bobBalance - amount;
				bobDebitCount++;
				totalDebitCount++;
				System.out.println("Debit balance of BOB is " + bobBalance);
			} else
				System.out.println("Insufficient Amount");
			break;
		case "sbi":
			if (sbiBalance > amount) {
				sbiBalance = sbiBalance - amount;
				sbiDebitCount++;
				totalDebitCount++;
				System.out.println("Debit balance of SBI:" + sbiBalance);
			} else
				System.out.println("Insufficient Amount");
			break;
		default:
				System.out.println("You don't have account in "+bankName+" bank. Please select valid bank");
		}
	}

	public void totalBalance() {
		float totalBal;
		totalBal = (iciciBalance+hdfcBalance+bobBalance+sbiBalance);
		System.out.println("Total Balance of All Bank Is:" + totalBal);

	}
	public void showTotalCreditDebit() {
		System.out.println("Total credit operation: "+totalCreditCount);
		System.out.println("Total debit operation: "+totalDebitCount);
		System.out.println("======================================================");
	}

	public void showIndividualCredit() {
		System.out.println("ICICI bank credit operation: "+iciciCreditCount);
		System.out.println("HDFC bank credit operation: "+hdfcCreditCount);
		System.out.println("BOB bank credit operation: "+bobCreditCount);
		System.out.println("SBI bank credit operation: "+sbiCreditCount);
		System.out.println("======================================================");
	}

	public void showIndividualDebit() {
		System.out.println("ICICI bank debit operation: "+iciciDebitCount);
		System.out.println("HDFC bank debit operation: "+hdfcDebitCount);
		System.out.println("BOB bank debit operation: "+bobDebitCount);
		System.out.println("SBI bank debit operation: "+sbiDebitCount);
	}

	void bankOperation(String bankName, String operationType, int amount) {
		switch (operationType) {
		case "credit":
			credit(bankName, amount);
			break;
		case "debit":
			debit(bankName, amount);
			break;
		default:
			System.out.println("Invalid operation type. Please specify your operation type as 'debit' or 'credit'");
		}
	}

	public static void main(String[] args) {
		assignment_13 bank = new assignment_13();	
		bank.bankOperation("icici", "credit", 5000);
		bank.bankOperation("icici", "creditt", 2000);
		bank.bankOperation("icici", "debit", 1500);
		bank.bankOperation("sbi", "credit", 1800);
		bank.bankOperation("sbi", "debit", 600);
		bank.bankOperation("sbi", "debit", 1900);
		bank.bankOperation("hdfc", "credit", 200);
		bank.bankOperation("sbi", "credit", 1800);
		bank.bankOperation("bob", "credit", 4200);
		bank.bankOperation("hdfc", "debit", 600);
		bank.bankOperation("hdfc", "credit", 3200);
		bank.bankOperation("hdfc", "debit", 1690);
		bank.bankOperation("bob", "debit", 3200);
		bank.bankOperation("bob", "debit", 1000);

		bank.totalBalance();
		bank.showTotalCreditDebit();
		bank.showIndividualCredit();
		bank.showIndividualDebit();
	}
}
