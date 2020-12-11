/*
 * Assignment - 13 : 8th Oct'2020

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
		                 SBI
 */
package ankita.assignment.scenarioBasedProgram;

public class BankAccountManagement {
	static int totalBalance;
	static int totalCreditCnt;
	static int totalDebitCnt;

	int iciciCreditCnt, hdfcCreditCnt, sbiCreditCnt, bobCreditCnt;
	int iciciDebitCnt, hdfcDebitCnt, sbiDebitCnt, bobDebitCnt;
	int iciciBalance, hdfcBalance, bobBalance, sbiBalance;

	void bankTransaction(String bankName, String op, int amount) {
		switch (bankName) {
		case "ICICI":
			if (op.equals("credit")) {
				totalBalance = totalBalance + amount;
				iciciBalance = iciciBalance + amount;
				iciciCreditCnt++;
				totalCreditCnt++;
			}
			if (op.equals("debit")) {
				if (amount > iciciBalance)
					System.out.println("ICICI bank -Insuficient fund.Available Bal: " + iciciBalance);
				else {
					totalBalance = totalBalance - amount;
					iciciBalance = iciciBalance - amount;
					iciciDebitCnt++;
					totalDebitCnt++;
				}
			}
			break;
		case "HDFC":
			if (op.equals("credit")) {
				totalBalance = totalBalance + amount;
				hdfcBalance = hdfcBalance + amount;
				hdfcCreditCnt++;
				totalCreditCnt++;
			}
			if (op.equals("debit")) {
				if (amount > hdfcBalance)
					System.out.println("HDFC bank -Insuficient fund.Available Bal: " + hdfcBalance);
				else {
					totalBalance = totalBalance - amount;
					hdfcBalance = hdfcBalance - amount;
					hdfcDebitCnt++;
					totalDebitCnt++;
				}
			}
			break;
		case "BOB":
			if (op.equals("credit")) {
				totalBalance = totalBalance + amount;
				bobBalance = bobBalance + amount;
				bobCreditCnt++;
				totalCreditCnt++;
			}
			if (op.equals("debit")) {
				if (amount > bobBalance)
					System.out.println("BOB bank -Insuficient fund.Available Bal: " + bobBalance);
				else {
					totalBalance = totalBalance - amount;
					bobBalance = bobBalance - amount;
					bobDebitCnt++;
					totalDebitCnt++;
				}
			}
			break;
		case "SBI":
			if (op.equals("credit")) {
				totalBalance = totalBalance + amount;
				sbiBalance = sbiBalance + amount;
				sbiCreditCnt++;
				totalCreditCnt++;
			}
			if (op.equals("debit")) {
				if (amount > sbiBalance)
					System.out.println("SBI bank -Insuficient fund.Available Bal: " + sbiBalance);
				else {
					totalBalance = totalBalance - amount;
					sbiBalance = sbiBalance - amount;
					sbiDebitCnt++;
					totalDebitCnt++;
				}
			}
			break;
		}
	}

	void displayTotalbalance() {
		System.out.println("---------------------------------------------");
		System.out.println("Total balance :" + totalBalance);
		System.out.println("ICICI balance :" + iciciBalance);
		System.out.println("HDFC balance :" + hdfcBalance);
		System.out.println("BOB balance :" + bobBalance);
		System.out.println("SBI balance :" + sbiBalance);
	}

	void displayTotalCreditDebit() {
		System.out.println("---------------------------------------------");
		System.out.println("total credit:" + totalCreditCnt);
		System.out.println("total debit:" + totalDebitCnt);
	}

	void displayIndividualCredit() {
		System.out.println("---------------------------------------------");
		System.out.println("ICICI Credit :" + iciciCreditCnt);
		System.out.println("HDFC Credit :" + hdfcCreditCnt);
		System.out.println("BOB Credit :" + bobCreditCnt);
		System.out.println("SBI Credit :" + sbiCreditCnt);
	}

	void displayIndividualDebit() {
		System.out.println("---------------------------------------------");
		System.out.println("ICICI Debit :" + iciciDebitCnt);
		System.out.println("HDFC Debit :" + hdfcDebitCnt);
		System.out.println("BOB Debit :" + bobDebitCnt);
		System.out.println("SBI Debit :" + sbiDebitCnt);
	}

	public static void main(String[] args) {

		BankAccountManagement bankAccountManagement = new BankAccountManagement();

		bankAccountManagement.bankTransaction("ICICI", "credit", 500);
		bankAccountManagement.bankTransaction("SBI", "credit", 400);
		bankAccountManagement.bankTransaction("HDFC", "credit", 50);
		bankAccountManagement.bankTransaction("BOB", "credit", 750);
		bankAccountManagement.bankTransaction("ICICI", "credit", 50);
		bankAccountManagement.bankTransaction("SBI", "credit", 50);
		bankAccountManagement.bankTransaction("SBI", "credit", 50);
		bankAccountManagement.bankTransaction("BOB", "credit", 5000);
		bankAccountManagement.bankTransaction("BOB", "credit", 5000);
		bankAccountManagement.bankTransaction("BOB", "credit", 5000);

		bankAccountManagement.bankTransaction("BOB", "debit", 500);
		bankAccountManagement.bankTransaction("ICICI", "debit", 1500);
		bankAccountManagement.bankTransaction("HDFC", "debit", 400);
		bankAccountManagement.bankTransaction("SBI", "debit", 789);
		bankAccountManagement.bankTransaction("SBI", "debit", 465);
		bankAccountManagement.bankTransaction("ICICI", "debit", 1532);
		bankAccountManagement.bankTransaction("BOB", "debit", 4896);

		bankAccountManagement.displayTotalbalance();
		bankAccountManagement.displayTotalCreditDebit();
		bankAccountManagement.displayIndividualCredit();
		bankAccountManagement.displayIndividualDebit();
	}
}