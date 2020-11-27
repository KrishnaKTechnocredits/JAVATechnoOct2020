package priyanka;

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
		                 SBI*/

public class BankAccountSwitchcase {

	int ibal, hbal, sbal, bbal, iCcount, hCcount, bCcount, sCcount, iDcount, hDcount, bDcount, sDcount;
	static int totalBal, totalDebitCount, totalCreditCount, amount, d = 0;
	static String bankName, operations;

	void bankOperations(String bankName, String operations, int amount) {

		switch (operations) {
		case "credit":
		case "CREDIT":
			credit(bankName, amount);
			break;
		case "debit":
		case "DEBIT":
			debit(bankName, amount);
			break;
		default:
			System.out.println("invalid Transaction");

		}
	}

	double credit(String bankName, int amount) {
		switch (bankName) {

		case "icici":
		case "ICICI":
			ibal = ibal + amount;
			System.out.println("ICICI : Credited amount is: " + amount + ", Current balance is :" + ibal);
			iCcount++;
			totalCreditCount++;
			return ibal;
		case "hdfc":
		case "HDFC":
			hbal = hbal + amount;
			System.out.println("HDFC : Credited amount is: " + amount + ", Current balance is :" + hbal);
			hCcount++;
			totalCreditCount++;
			return hbal;
		case "sbi":
		case "SBI":
			sbal = sbal + amount;
			System.out.println("SBI: Credited amount is: " + amount + ", Current balance is :" + sbal);
			sCcount++;
			totalCreditCount++;
			return sbal;
		case "bob":
		case "BOB":
			bbal = bbal + amount;
			System.out.println("BOB : Credited amount is: " + amount + ", Current balance is :" + bbal);
			bCcount++;
			totalCreditCount++;
			return bbal;

		default:
			System.out.println("Invalid transaction");
			return d;
		}
	}

	double debit(String bankName, int amount) {
		switch (bankName) {

		case "icici":
		case "ICICI":
			if (ibal >= amount) {
				ibal = ibal - amount;
				System.out.println("ICICI : Debited amount is: " + amount + ", Current balance is :" + ibal);
			} else
				System.out.println("ICICI : Insufficient balance, Customer want to debit " + amount
						+ " but current balance is " + ibal);
			iDcount++;
			totalDebitCount++;
			return ibal;
		case "hdfc":
		case "HDFC":
			if (hbal >= amount) {
				hbal = hbal - amount;
				System.out.println("HDFC: Debited amount is: " + amount + ", Current balanceis :" + hbal);
			} else
				System.out.println("HDFC: Insufficient balance, Customer want to debit " + amount
						+ " but current balance is " + hbal);
			hDcount++;
			totalDebitCount++;
			return hbal;
		case "sbi":
		case "SBI":
			if (sbal >= amount) {
				sbal = sbal - amount;
				System.out.println("SBI: Debited amount is: " + amount + ", Current balance is :" + sbal);
			} else
				System.out.println("SBI : Insufficient balance, Customer want to debit " + amount
						+ " but current balance is " + sbal);
			sDcount++;
			totalDebitCount++;
			return sbal;
		case "bob":
		case "BOB":
			if (bbal >= amount) {
				ibal = bbal - amount;
				System.out.println("BOB : Debited amount is: " + amount + ", Current balance is :" + bbal);
			} else
				System.out.println("BOB : Insufficient balance, Customer want to debit " + amount
						+ " but current balance is " + bbal);
			bDcount++;
			totalDebitCount++;
			return bbal;

		default:
			System.out.println("Invalid transaction");
			return d;
		}
	}

	void totalBalance() {

		System.out.println("*****************************************************************************");
		totalBal = ibal + hbal + sbal + bbal;
		System.out.println("The Total balance is :" + totalBal);
	}

	void individualTransaction() {
		System.out.println("***********************************************************************************");
		System.out.println("Transaction summary of ICICI is: " + " Credit " + iCcount + " times " + ", Debit " + iDcount
				+ " times");
		System.out.println("Transaction summary of HDFC is: " + " Credit " + hCcount + " times " + ", Debit " + hDcount
				+ " times");
		System.out.println("Transaction summary of SBI is:  " + " Credit " + sCcount + " times " + ", Debit " + sDcount
				+ " times");
		System.out.println(
				"Transaction summary of BOB is: " + " Credit " + bCcount + " times " + ", Debit " + bDcount + " times");
	}

	static void allTransactionSummary() {

		System.out.println("***********************************************************************************");
		System.out.println(" All Transaction summary is: ");
		System.out.println(" Credit " + totalCreditCount + " times " + " Debit " + totalDebitCount + " times ");

	}

	public static void main(String[] args) {

		BankAccountSwitchcase bankAccountSwitchcase = new BankAccountSwitchcase();
		bankAccountSwitchcase.bankOperations("ICICI", "CREDIT", 1000);
		bankAccountSwitchcase.bankOperations("HDFC", "CREDIT", 1000);
		bankAccountSwitchcase.bankOperations("SBI", "CREDIT", 1000);
		bankAccountSwitchcase.bankOperations("BOB", "CREDIT", 1000);
		bankAccountSwitchcase.bankOperations("ICICI", "CREDIT", 500);
		bankAccountSwitchcase.bankOperations("ICICI", "DEBIT", 1000);
		bankAccountSwitchcase.bankOperations("HDFC", "DEBIT", 1000);
		bankAccountSwitchcase.bankOperations("SBI", "DEBIT", 2000);
		bankAccountSwitchcase.individualTransaction();
		bankAccountSwitchcase.allTransactionSummary();
		bankAccountSwitchcase.totalBalance();

	}
}
