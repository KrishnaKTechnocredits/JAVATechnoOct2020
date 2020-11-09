package shrutiS;

import java.util.Scanner;

public class CustomerBankInfo {

	// Array with balance of banks in the following order ICICI, HDFC, BOB, SBI
	double[] balance = new double[4];
	// Array with credits of 4 banks in the following order ICICI, HDFC, BOB, SBI
	int noOfCredits[] = new int[4];
	// Array with debits of 4 banks in the following order ICICI, HDFC, BOB, SBI
	int noOfDebits[] = new int[4];

	// Setting initial balance for each bank account
	void initialBalance(double iciciBalance, double hdfcBalance, double bobBalance, double sbiBalance) {
		balance[0] = iciciBalance;
		balance[1] = hdfcBalance;
		balance[2] = bobBalance;
		balance[3] = sbiBalance;
	}

	void bankOperations(String bankName, String operation, double txnAmount) {
		switch (bankName.toUpperCase()) {
		case "ICICI":
			operation(operation, txnAmount, 0);
			break;
		case "HDFC":
			operation(operation, txnAmount, 1);
			break;
		case "BOB":
			operation(operation, txnAmount, 2);
			break;
		case "SBI":
			operation(operation, txnAmount, 3);
			break;
		}
	}

	private void operation(String operation, double txnAmount, int index) {
		switch (operation.toLowerCase()) {
		case "debit":
			balance[index] = balance[index] - txnAmount;
			noOfDebits[index]++;
			break;
		case "credit":
			balance[index] = balance[index] + txnAmount;
			noOfCredits[index]++;
			break;
		}
	}

	void totalBalance() {
		System.out.println("total balance of all banks is : " + (balance[0] + balance[1] + balance[2] + balance[3]));
	}

	void totalCreditDebitAllBank() {
		int totalBankCredit = noOfCredits[0] + noOfCredits[1] + noOfCredits[2] + noOfCredits[3];
		System.out.println("Total credit operation done on banks" + totalBankCredit);
		int totalBankDebit = noOfDebits[0] + noOfDebits[1] + noOfDebits[2] + noOfDebits[3];
		System.out.println("Total Debit operation done on banks" + totalBankDebit);
	}

	void totalCreditIndividualBank() {
		System.out.println("ICICI bank Credit Operation : " + noOfCredits[0]);
		System.out.println("HDFC bank Credit Operation : " + noOfCredits[1]);
		System.out.println("BOB bank Credit Operation : " + noOfCredits[2]);
		System.out.println("SBI bank Credit Operation : " + noOfCredits[3]);
	}

	void totalDebitIndividualBank() {
		System.out.println("ICICI bank Debit Operation : " + noOfDebits[0]);
		System.out.println("HDFC bank Debit Operation : " + noOfDebits[1]);
		System.out.println("BOB bank Debit Operation : " + noOfDebits[2]);
		System.out.println("SBI bank Debit Operation : " + noOfDebits[3]);
	}

	public static void main(String[] args) {
		CustomerBankInfo customerBankInfo = new CustomerBankInfo();
		customerBankInfo.initialBalance(3000, 2400, 5000, 600);
		Scanner sc = new Scanner(System.in);
		String ans;
		do {
			String bankName = null;
			String operation = null;
			System.out.println("choose your bank ");
			System.out.println("1.ICICI \n2.HDFC \n3.BOB \n4.SBI");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				bankName = "ICICI";
				break;
			case 2:
				bankName = "HDFC";
				break;
			case 3:
				bankName = "BOB";
				break;
			case 4:
				bankName = "SBI";
				break;
			}
			System.out.println("Enter the operation you want to perform ");
			System.out.println("1.Debit \n2.Credit");
			option = sc.nextInt();
			switch (option) {
			case 1:
				operation = "Debit";
				break;
			case 2:
				operation = "Credit";
				break;
			}
			System.out.println("Enter the amount ");
			double txnAmount = sc.nextDouble();
			System.out.println("Do you want to continue? ");
			ans = sc.next();
			customerBankInfo.bankOperations(bankName, operation, txnAmount);
		} while (ans.toUpperCase().equals("Y"));
		customerBankInfo.totalBalance();
		customerBankInfo.totalCreditDebitAllBank();
		customerBankInfo.totalCreditIndividualBank();
		customerBankInfo.totalDebitIndividualBank();
	}

}
