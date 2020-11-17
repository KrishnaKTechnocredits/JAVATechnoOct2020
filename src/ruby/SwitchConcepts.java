package ruby;

import java.util.Scanner;

/*Assignment - 13 : 8th Nov 2020

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

public class SwitchConcepts {

	int iBal, hdfcBal, sbiBal, bobBal;
	int iDebitCnt, hdfcDebitCnt, sbiDebitCnt, bobDebitCnt, iCreditCnt, hdfcCreditCnt, bobCreditCnt, sbiCreditCnt;

	void totalBalance() {
		int totalBal = iBal + hdfcBal + sbiBal + bobBal;
		System.out.println("Total Balance " + totalBal);

	}

	void debit(String bankName, int amount) {
		switch (bankName) {
		case "ICICI":
			if (amount < iBal) {
				iBal -= amount;
				iDebitCnt++;
			} else {
				System.out.println("You do not have sufficient balance");
			}
			break;
		case "HDFC bank":
			if (amount < hdfcBal) {
				hdfcBal -= amount;
				hdfcDebitCnt++;
			} else {
				System.out.println("You do not have sufficient balance");
			}
			break;
		case "BOB bank":
			if (amount < bobBal) {
				bobBal -= amount;
				bobDebitCnt++;
			} else {
				System.out.println("You do not have sufficient balance");
			}
			break;
		case "SBI bank":
			if (amount < sbiBal) {
				sbiBal -= amount;
				sbiDebitCnt++;
			} else {
				System.out.println("You do not have sufficient balance");
			}
			break;

		}
	}

	void credit(String bankName, int amount) {
		switch (bankName) {
		case "ICICI":
			iBal += amount;
			iCreditCnt++;
			break;
		case "HDFC bank":
			hdfcBal += amount;
			hdfcCreditCnt++;
			break;
		case "BOB bank":
			bobBal += amount;
			bobCreditCnt++;
			break;
		case "SBI bank":
			sbiBal += amount;
			sbiCreditCnt++;
			break;
		}
	}

	void printStatement(String bankName) {
		switch (bankName) {
		case "ICICI":
			System.out.println("Your available balance in ICICI " + iBal);
			break;
		case "HDFC bank":
			System.out.println("Your available balance in HDFC " + hdfcBal);
			break;
		case "BOB bank":
			System.out.println("Your available balance in BOB " + bobBal);
			break;
		case "SBI bank":
			System.out.println("Your available balance in SBI " + sbiBal);
			break;
		}
	}

	/*
	 * void showIndividualOperation() {
	 * System.out.println("ICICI bank Credit Operation "+iCreditCnt);
	 * System.out.println("HDFC bank Credit Operation "+hdfcCreditCnt);
	 * System.out.println("BOB bank Credit Operation "+bobCreditCnt);
	 * System.out.println("SBI bank Credit Operation "+sbiCreditCnt); }
	 */

	void displayIndividualOperation(String bankName) {
		switch (bankName) {
		case "ICICI":
			System.out.println("ICICI Credit Operation: " + iCreditCnt);
			System.out.println("ICICI Debit Operation: " + iDebitCnt);
			break;
		case "HDFC bank":
			System.out.println("HDFC Credit Operation: " + hdfcCreditCnt);
			System.out.println("HDFC Debit Operation: " + hdfcDebitCnt);
			break;
		case "BOB bank":
			System.out.println("BOB Credit Operation: " + bobCreditCnt);
			System.out.println("BOB Debit Operation: " + bobDebitCnt);
			break;
		case "SBI bank":
			System.out.println("SBI Credit Operation: " + sbiCreditCnt);
			System.out.println("SBI Debit Operation: " + sbiDebitCnt);
			break;
		}
	}

	void totalOperation() {
		System.out.println("Total Credit Operation: " + (iCreditCnt + hdfcCreditCnt + bobCreditCnt + sbiCreditCnt));
		System.out.println("Total Debit Operation: " + (iDebitCnt + hdfcDebitCnt + sbiDebitCnt + bobDebitCnt));
	}

	public static void main(String[] args) {
/*		Scanner scan = new Scanner(System.in);
		System.out.println("Please select Bank");
		System.out.println("1. ICICI");
		System.out.println("2. HDFC Bank");
		System.out.println("3. BOB Bank");
		System.out.println("4. SBI Bank");
		int bank = scan.nextInt();
		if (bank < 0 && bank > 4)
			System.out.println("Please select valid bank");
		else {*/
			SwitchConcepts switchConcepts = new SwitchConcepts();
			switchConcepts.credit("ICICI", 500);
			switchConcepts.credit("ICICI", 3400);
			switchConcepts.debit("ICICI", 200);
			switchConcepts.debit("ICICI", 600);
			switchConcepts.printStatement("ICICI");
			switchConcepts.displayIndividualOperation("ICICI");
			switchConcepts.credit("HDFC bank", 600);
			switchConcepts.credit("HDFC bank", 3400);
			switchConcepts.debit("HDFC bank", 200);
			switchConcepts.printStatement("HDFC bank");
			switchConcepts.displayIndividualOperation("HDFC bank");
			switchConcepts.credit("SBI bank", 500);
			switchConcepts.printStatement("SBI bank");
			switchConcepts.displayIndividualOperation("SBI bank");
			switchConcepts.credit("BOB bank", 3400);
			switchConcepts.credit("BOB bank", 400);
			switchConcepts.credit("BOB bank", 300);
			switchConcepts.credit("BOB bank", 400);
			switchConcepts.debit("BOB bank", 200);
			switchConcepts.debit("BOB bank", 200);
			switchConcepts.printStatement("BOB bank");
			switchConcepts.displayIndividualOperation("BOB bank");
			switchConcepts.totalOperation();
		}
}
