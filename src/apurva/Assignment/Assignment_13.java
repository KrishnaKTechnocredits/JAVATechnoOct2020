package apurva.Assignment;
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

public class Assignment_13 {
	int iciciBalance, hdfcBalance, bobBalance, sbiBalance;
	int iciciCreditCnt, hdfcCreditCnt, bobCreditCnt, sbiCreditCnt;
	int iciciDebitCnt, hdfcDebitCnt, bobDebitCnt, sbiDebitCnt;
	static int totalCreditCnt, totalDebitCnt;

	void displayOperation(String bankName, String operation, int amt) {
		switch (operation.toLowerCase()) {
		case "credit":
			credit(bankName, amt);
			break;
		case "debit":
			debit(bankName, amt);
			break;
		default:
			System.out.println("Invalid operation");
		}
	}

	void credit(String bankName, int amt) {
		totalCreditCnt++;
		switch (bankName.toLowerCase()) {
		case "icici":
			iciciBalance = iciciBalance + amt;
			iciciCreditCnt++;
			System.out.println("Amount credit in " + bankName + ":" + amt + ", available balance: " + iciciBalance);
			break;
		case "hdfc":
			hdfcBalance = hdfcBalance + amt;
			hdfcCreditCnt++;
			System.out.println("Amount credit in " + bankName + ":" + amt + ", available balance: " + hdfcBalance);
			break;
		case "bob":
			bobBalance = bobBalance + amt;
			bobCreditCnt++;
			System.out.println("Amount credit in " + bankName + ":" + amt + ", available balance: " + bobBalance);
			break;
		case "sbi":
			sbiBalance = sbiBalance + amt;
			sbiCreditCnt++;
			System.out.println("Amount credit in " + bankName + ":" + amt + ", available balance: " + sbiBalance);
			break;
		default:
			System.out.println("You do not have account in this bank, select valid bank");
		}
	}

	void debit(String bankName, int amt) {
		boolean flag = true;
		switch (bankName.toLowerCase()) {
		case "icici":
			if (amt <= iciciBalance) {
				iciciBalance = iciciBalance - amt;
				iciciDebitCnt++;
				System.out.println("Amount debit in" + bankName + ":" + amt + ", available balance: " + iciciBalance);
				flag = false;
			}
			break;
		case "hdfc":
			if (amt <= hdfcBalance) {
				hdfcBalance = hdfcBalance - amt;
				hdfcDebitCnt++;
				System.out.println("Amount debit in" + bankName + ":" + amt + ", available balance: " + hdfcBalance);
				flag = false;
			}
			break;
		case "bob":
			if (amt <= bobBalance) {
				bobBalance = bobBalance - amt;
				bobDebitCnt++;
				System.out.println("Amount debit in" + bankName + ":" + amt + ", available balance: " + bobBalance);
				flag = false;
			}
			break;
		case "sbi":
			if (amt <= sbiBalance) {
				sbiBalance = sbiBalance - amt;
				sbiDebitCnt++;
				System.out.println("Amount debit in" + bankName + ":" + amt + ", available balance: " + sbiBalance);
				flag = false;
			}
			break;
		default:
			System.out.println("You do not have account in this bank, select valid bank");
		}
		if (!flag)
			totalDebitCnt++;
		else
			System.out.println("Insufficent balance " + bankName + "bank account");
	}

	void showTotalBalance() {
		System.out.println("--------------------------------------------");
		System.out
				.println("Total balance of all bank account:" + (iciciBalance + hdfcBalance + bobBalance + sbiBalance));
	}

	void showTotalCreditDebit() {
		System.out.println("--------------------------------------------");
		System.out.println("Total Credit" + totalCreditCnt);
		System.out.println("Total Debit" + totalDebitCnt);
		System.out.println("--------------------------------------------");
	}

	void showIndividualCredit() {
		System.out.println("ICICI bank credit oprations:" + iciciCreditCnt);
		System.out.println("HDFC bank credit oprations:" + hdfcCreditCnt);
		System.out.println("BOB bank credit oprations:" + bobCreditCnt);
		System.out.println("SBI bank credit oprations:" + sbiCreditCnt);
		System.out.println("--------------------------------------------");
	}

	void showIndividualDebit() {
		System.out.println("ICICI bank debit oprations:" + iciciDebitCnt);
		System.out.println("HDFC bank debit oprations:" + hdfcDebitCnt);
		System.out.println("BOB bank debit oprations:" + bobDebitCnt);
		System.out.println("SBI bank debit oprations:" + sbiDebitCnt);
		System.out.println("--------------------------------------------");
	}

	public static void main(String[] args) {
		Assignment_13 assignment_13 = new Assignment_13();
		assignment_13.displayOperation("HDFC", "credit", 1000);
		assignment_13.displayOperation("HDFC", "credit", 10000);
		assignment_13.displayOperation("ICICI", "credit", 1000);
		assignment_13.displayOperation("ICICI", "credit", 15000);
		assignment_13.displayOperation("SBI", "credit", 1000);
		assignment_13.displayOperation("BOB", "credit", 1000);
		assignment_13.displayOperation("BOB", "credit", 8000);
		assignment_13.displayOperation("ICICI", "debit", 1000);
		assignment_13.displayOperation("ICICI", "debit", 2000);
		assignment_13.displayOperation("HDFC", "debit", 2500);
		assignment_13.displayOperation("HDFC", "debit", 1000);
		assignment_13.displayOperation("SBI", "debit", 2000);

		assignment_13.showTotalBalance();
		assignment_13.showTotalCreditDebit();
		assignment_13.showIndividualCredit();
		assignment_13.showIndividualDebit();

	}
}