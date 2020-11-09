/*A person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
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
*/
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
    // Calling operation bank wise
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
     // Performing debit and credit operation
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
      //Calculate total balance [ICICI balance + HDFC balance + BOB balance + SBI Balance]
	void totalBalance() {
		System.out.println("total balance of all banks is : " + (balance[0] + balance[1] + balance[2] + balance[3]));
	}
     //Calculating total credit, debit opertion performed 
	void totalCreditDebitAllBank() {
		int totalBankCredit = noOfCredits[0] + noOfCredits[1] + noOfCredits[2] + noOfCredits[3];
		System.out.println("Total credit operation done on banks" + totalBankCredit);
		int totalBankDebit = noOfDebits[0] + noOfDebits[1] + noOfDebits[2] + noOfDebits[3];
		System.out.println("Total Debit operation done on banks" + totalBankDebit);
	}
     //Calculating individual bank credit operations.
	void totalCreditIndividualBank() {
		System.out.println("ICICI bank Credit Operation : " + noOfCredits[0]);
		System.out.println("HDFC bank Credit Operation : " + noOfCredits[1]);
		System.out.println("BOB bank Credit Operation : " + noOfCredits[2]);
		System.out.println("SBI bank Credit Operation : " + noOfCredits[3]);
	}
	//Calculating individual bank debit operations.
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
		//loop to allow user to perform operation multiple times as per choice 
		do {
			String bankName = null;
			String operation = null;
			// user can choose bank name and set the bank name
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
			// user can choose operation to perform and set the operation
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
