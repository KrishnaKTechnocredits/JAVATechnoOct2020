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
		                 SBI//*/


package kajol;

import java.util.Scanner;

public class MultipleBankAccounts {
	float iciciBalance,hdfcBalance,bobBalance,sbiBalance;
	int iciciCreditCount,hdfcCreditCount,bobCreditCount,sbiCreditCount;
	int iciciDebitCount,hdfcDebitCount,bobDebitCount,sbiDebitCount;
	static int totalCreditCount,totalDebitCount;
	
	void creditOperations(String bankName,float amount) {
		
		switch(bankName) {
			case "ICICI":
			case "icici":
				iciciBalance+=amount;
				iciciCreditCount++;
				totalCreditCount++;
				break;
			case "HDFC":
			case "hdfc":
				hdfcBalance+=amount;
				hdfcCreditCount++;
				totalCreditCount++;
				break;
			case "BOB":
			case "bob":
				bobBalance+=amount;
				bobCreditCount++;
				totalCreditCount++;
				break;
			case "SBI":
			case "sbi":
				sbiBalance+=amount;
				sbiCreditCount++;
				totalCreditCount++;
				break;
		}
		
	}
	
void debitOperations(String bankName,float amount) {
		
		switch(bankName) {
			case "ICICI":
			case "icici":
				if(iciciBalance>amount) {
					iciciBalance-=amount;
					iciciDebitCount++;
					totalDebitCount++;
				}
				else
					System.out.println("Insufficient Balance in your "+bankName+" account.You cannot debit.");	
				break;
			case "HDFC":
			case "hdfc":
				if(hdfcBalance>amount) {
					hdfcBalance-=amount;
					hdfcDebitCount++;
					totalDebitCount++;
				}
				else
					System.out.println("Insufficient Balance in your "+bankName+" account.You cannot debit.");	
				break;
			case "BOB":
			case "bob":
				if(bobBalance>amount) {
					bobBalance-=amount;
					bobDebitCount++;
					totalDebitCount++;
				}
				else
					System.out.println("Insufficient Balance in your "+bankName+" account.You cannot debit.");
				break;
			case "SBI":
			case "sbi":
				if(sbiBalance>amount) {
					sbiBalance-=amount;
					sbiDebitCount++;
					totalDebitCount++;
				}
				else
					System.out.println("Insufficient Balance in your "+bankName+" account.You cannot debit.");
				break;

		}
		
	}

	void printTotalBalance() {
		System.out.println("Your Toatal Balance for all Bank Accounts: Rs."+(iciciBalance+hdfcBalance+bobBalance+sbiBalance));
	}
	
	void individualBankCreditDebitOprerations() {
		System.out.println("ICICI Bank operations: Credit - "+iciciCreditCount+"times  and  Debit - "+iciciDebitCount+"times.");
		System.out.println("HDFC Bank operations: Credit - "+hdfcCreditCount+"times  and  Debit - "+hdfcDebitCount+"times.");
		System.out.println("BOB Bank operations: Credit - "+bobCreditCount+"times  and  Debit - "+bobDebitCount+"times.");
		System.out.println("SBI Bank operations: Credit - "+sbiCreditCount+"times  and  Debit - "+sbiDebitCount+"times.");
	}
	
	void totalCreditDebitOprerations() {
		
		System.out.println("Total Credit operations of all Banks: "+totalCreditCount+" times.");
		System.out.println("Total Debit operations of all Banks: "+totalDebitCount+" times.");
	}
	
	public static void main(String[] args) {
		MultipleBankAccounts multipleBankAccounts=new MultipleBankAccounts();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please Enter Bank Name to perform Operations:");
		String bankName=scanner.next();
		System.out.println("Please Enter Amount to be Credited or Debited :");
		float amount=scanner.nextFloat();
	    multipleBankAccounts.creditOperations(bankName, amount);
	    multipleBankAccounts.creditOperations(bankName, amount);
	    multipleBankAccounts.debitOperations(bankName, amount);
	    System.out.println("Please Enter Bank Name to perform Operations:");
		bankName=scanner.next();
	    System.out.println("Please Enter Amount to be Credited or Debited :");
		amount=scanner.nextFloat();
	    multipleBankAccounts.debitOperations(bankName, amount);
	    System.out.println("Please Enter Bank Name to perform Operations:");
		bankName=scanner.next();
	    System.out.println("Please Enter Amount to be Credited or Debited :");
		amount=scanner.nextFloat();
	    multipleBankAccounts.creditOperations(bankName, amount);
	    multipleBankAccounts.creditOperations(bankName, amount);
	    multipleBankAccounts.debitOperations(bankName, amount);
	    System.out.println("Please Enter Bank Name to perform Operations:");
		bankName=scanner.next();
	    System.out.println("Please Enter Amount to be Credited or Debited :");
		amount=scanner.nextFloat();
	    multipleBankAccounts.creditOperations(bankName, amount);
	    multipleBankAccounts.creditOperations(bankName, amount);
	    multipleBankAccounts.debitOperations(bankName, amount);
	    multipleBankAccounts.individualBankCreditDebitOprerations();
	    multipleBankAccounts.totalCreditDebitOprerations();
	    multipleBankAccounts.printTotalBalance();	
	}
	

}
