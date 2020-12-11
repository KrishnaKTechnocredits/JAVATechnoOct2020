/*
 * Assignment - 13 : 8th Nov 2020

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

package ritika.Assignments;

import java.util.Scanner;

public class Asgmt_13 {
	int balanceICICI;
	int balanceHDFC;
	int balanceSBI;
	int balanceBOB;
	int totalCreditOpsCnt;
	int totalDebitOpsCnt;
	int iciciCreditOpsCnt;
	int iciciDebitOpsCnt;
	int hdfcCreditOpsCnt;
	int hdfcDebitOpsCnt;
	int sbiCreditOpsCnt;
	int sbiDebitOpsCnt;
	int bobCreditOpsCnt;
	int bobDebitOpsCnt;

	void setBankBalance(String bankName, int bankBalance) {
		if (bankName.equalsIgnoreCase("ICICI"))
			balanceICICI = bankBalance;
		else if (bankName.equalsIgnoreCase("HDFC"))
			balanceHDFC = bankBalance;
		else if (bankName.equalsIgnoreCase("SBI"))
			balanceSBI = bankBalance;
		else if (bankName.equalsIgnoreCase("BOB"))
			balanceBOB = bankBalance;
	}

	void chooseBankAndItsOperations(String bank, int amount, String operation) {
		switch (bank) {

		case "ICICI":

			if (operation.equalsIgnoreCase("Credit")) {
				balanceICICI = balanceICICI + amount;
				totalCreditOpsCnt++;
				iciciCreditOpsCnt++;
			} else if (operation.equalsIgnoreCase("Debit")) {
				if (amount > balanceICICI)
					System.out.println("Error! you have only " + balanceICICI + " balance in your account");
				else {
					balanceICICI = balanceICICI - amount;
					totalDebitOpsCnt++;
					iciciDebitOpsCnt++;
				}
			} else if (operation.equalsIgnoreCase("Check Balance"))
				System.out.println(balanceICICI);
			else
				System.out.println("Wrong operation name entered. Credit or Debit or Check Balance ");
			break;

		case "HDFC":
			if (operation.equalsIgnoreCase("Credit")) {
				balanceHDFC = balanceHDFC + amount;
				totalCreditOpsCnt++;
				hdfcCreditOpsCnt++;
			} else if (operation.equalsIgnoreCase("Debit")) {
				if (amount > balanceHDFC)
					System.out.println("Error! you have only " + balanceHDFC + " balance in your account");
				else {
					balanceHDFC = balanceHDFC - amount;
					hdfcDebitOpsCnt++;
					totalDebitOpsCnt++;
				}
			} else if (operation.equalsIgnoreCase("Check Balance"))
				System.out.println(balanceHDFC);
			else
				System.out.println("Wrong operation name entered. Should be either Credit or Debit or Check Balance ");
			break;

		case "SBI":
			if (operation.equalsIgnoreCase("Credit")) {
				balanceSBI = balanceSBI + amount;
				totalCreditOpsCnt++;
				sbiCreditOpsCnt++;
			} else if (operation.equalsIgnoreCase("Debit")) {
				if (amount > balanceSBI)
					System.out.println("Error! you have only " + balanceSBI + " balance in your account");
				else {
					balanceSBI = balanceSBI - amount;
					sbiDebitOpsCnt++;
					totalDebitOpsCnt++;
				}
			} else if (operation.equalsIgnoreCase("Check Balance"))
				System.out.println(balanceSBI);
			else
				System.out.println("Wrong operation name entered. Should be either Credit or Debit or Check Balance ");
			break;

		case "BOB":
			if (operation.equalsIgnoreCase("Credit")) {
				balanceSBI = balanceBOB + amount;
				totalCreditOpsCnt++;
				bobCreditOpsCnt++;
			} else if (operation.equalsIgnoreCase("Debit")) {
				if (amount > balanceBOB)
					System.out.println("Error! you have only " + balanceBOB + " balance in your account");
				else {
					balanceSBI = balanceBOB - amount;
					bobDebitOpsCnt++;
					totalDebitOpsCnt++;
				}
			} else if (operation.equalsIgnoreCase("Check Balance"))
				System.out.println(balanceBOB);
			else
				System.out.println("Wrong operation name entered. Should be either Credit or Debit or Check Balance ");
			break;
		}
	}

	void printBalance(String bank) {
		if (bank.equalsIgnoreCase("ICICI"))
			System.out.println(balanceICICI);
		else if (bank.equalsIgnoreCase("HDFC"))
			System.out.println(balanceHDFC);
		else if (bank.equalsIgnoreCase("SBI"))
			System.out.println(balanceSBI);
		else if (bank.equalsIgnoreCase("BOB"))
			System.out.println(balanceBOB);
	}

	void totalBankBalance() {
		int totalBankBalance;
		totalBankBalance = balanceICICI + balanceHDFC + balanceSBI + balanceBOB;
		System.out.println("Total Balance of all banks is " + totalBankBalance);
	}

	void totalCreditandDebitOps() {
		System.out.println("All banks total credit operations - " + totalCreditOpsCnt);
		System.out.println("All banks total debit operations - " + totalDebitOpsCnt);
	}

	void individualCreditOps() {
		System.out.println("ICICI bank credit operations - " + iciciCreditOpsCnt);
		System.out.println("HDFC bank credit operations - " + hdfcCreditOpsCnt);
		System.out.println("SBI bank credit operations - " + sbiCreditOpsCnt);
		System.out.println("BOB bank credit operations - " + bobCreditOpsCnt);
	}

	void individualDebitOps() {
		System.out.println("ICICI bank debit operations - " + iciciDebitOpsCnt);
		System.out.println("HDFC bank debit operations - " + hdfcDebitOpsCnt);
		System.out.println("SBI bank debit operations - " + sbiDebitOpsCnt);
		System.out.println("BOB bank debit operations - " + bobDebitOpsCnt);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Asgmt_13 bankAccounts = new Asgmt_13();
		System.out.println("Choose Bank name from ICICI, HDFC, SBI and BOB and balance to be set respectively");
		bankAccounts.setBankBalance(sc.next(), sc.nextInt());
		bankAccounts.setBankBalance(sc.next(), sc.nextInt());
		bankAccounts.setBankBalance(sc.next(), sc.nextInt());
		bankAccounts.setBankBalance(sc.next(), sc.nextInt());
		bankAccounts.totalBankBalance();
		bankAccounts.chooseBankAndItsOperations("ICICI", 3500, "Debit");
		bankAccounts.chooseBankAndItsOperations("HDFC", 2400, "Debit");
		bankAccounts.chooseBankAndItsOperations("SBI", 1150, "Debit");
		bankAccounts.chooseBankAndItsOperations("BOB", 225, "Debit");
		bankAccounts.chooseBankAndItsOperations("ICICI", 450, "Credit");
		bankAccounts.chooseBankAndItsOperations("HDFC", 600, "Debit");
		bankAccounts.chooseBankAndItsOperations("ICICI", 1700, "Debit");
		bankAccounts.chooseBankAndItsOperations("HDFC", 350, "Credit");
		bankAccounts.chooseBankAndItsOperations("BOB", 170, "Credit");
		bankAccounts.chooseBankAndItsOperations("SBI", 5500, "Credit");
		bankAccounts.chooseBankAndItsOperations("BOB", 3675, "Credit");
		bankAccounts.chooseBankAndItsOperations("HDFC", 1370, "Credit");
		bankAccounts.chooseBankAndItsOperations("BOB", 900, "Credit");
		bankAccounts.individualCreditOps();
		bankAccounts.individualDebitOps();
		bankAccounts.totalCreditandDebitOps();
		bankAccounts.totalBankBalance();

	}
}
