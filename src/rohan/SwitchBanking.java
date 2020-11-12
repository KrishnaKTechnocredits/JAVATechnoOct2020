package rohan;

import java.util.Scanner;

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
		                 SBI */

public class SwitchBanking {
	double iciciTotalBalance, hdfcTotalBalance, bobTotalBalance,sbiTotalBalance;
	int iCreditCnt,hCreditCnt,bCreditCnt,sCreditCnt;
	int iDebitCnt,hDebitCnt,bDebitCnt,sDebitCnt;
	
	void setTotalBalance(double iTotalAmt, double hTotalAmt, double bTotalAmt, double sTotalAmt) {
		iciciTotalBalance = iTotalAmt;
		hdfcTotalBalance = hTotalAmt;
		bobTotalBalance = bTotalAmt;
		sbiTotalBalance = sTotalAmt;
	}
	
	void printMessage(String bName, String operation) {
		System.out.println("----Transcation Terminated----");
		System.out.println("Your "+bName+" account balance is: "+iciciTotalBalance+" Rupees. Kindly enter correct amount to be "+operation+"ed");
	}
	
	void performTransactions(String bankName,String operation, double amount) {
		switch(operation) {
		case "Credit": 
			switch(bankName) {
			case "ICICI":
						iciciTotalBalance += amount;
						iCreditCnt++;
						break;
			case "HDFC":
						hdfcTotalBalance += amount;
						hCreditCnt++;
						break;
			case "BOB":
						bobTotalBalance += amount;
						bCreditCnt++;
						break;
			case "SBI":
						sbiTotalBalance += amount;
						sCreditCnt++;
						break;
			default: System.out.println("Invalid bank Name specified");	
			}
			break;
		case "Debit":
			switch(bankName) {
			case "ICICI":
						if(amount<iciciTotalBalance) {
							iciciTotalBalance -= amount;
							iDebitCnt++;
						}
						else
							printMessage("ICICI", "Debit");
						break;
			case "HDFC":
						if(amount<hdfcTotalBalance) {
							hdfcTotalBalance -= amount;
							hDebitCnt++;
						}
						else
							printMessage("HDFC", "Debit");
						break;
			case "BOB":
						if(amount>bobTotalBalance) {
							bobTotalBalance -= amount;
							bDebitCnt++;
						}
						else
							printMessage("BoB", "Debit");
						break;
			case "SBI":
						if(amount<sbiTotalBalance) {
							sbiTotalBalance -= amount;
							sDebitCnt++;
						}
						else
							printMessage("SBI", "Debit");
						break;
			default: System.out.println("Invalid bank name specified");	
			}
		break;
		default: System.out.println("Invalid operation performed");
		}
	}
	
	void displayTotalBalance() {
		double totalBal = iciciTotalBalance+hdfcTotalBalance+bobTotalBalance+sbiTotalBalance;
		System.out.println("Your Total Balance is: "+totalBal+" Rupees");
	}
	
	void totalCreditDebitOperations() {
		int totalCreditOps = iCreditCnt+hCreditCnt+bCreditCnt+sCreditCnt;
		int totalDebitOps = iDebitCnt+hDebitCnt+bDebitCnt+sDebitCnt;
		System.out.println("Total Credit: "+totalCreditOps);
		System.out.println("Total Debit: "+totalDebitOps);
	}
	
	void bankwiseCreditOps() {
		System.out.println("ICICI bank Credit Operations: "+iCreditCnt);
		System.out.println("HDFC bank Credit Operations: "+hCreditCnt);
		System.out.println("BOB bank Credit Operations: "+bCreditCnt);
		System.out.println("SBI bank Credit Operations: "+sCreditCnt);
	}
	
	void bankwiseDebitOps() {
		System.out.println("ICICI bank Debit Operations: "+iDebitCnt);
		System.out.println("HDFC bank Debit Operations: "+hDebitCnt);
		System.out.println("BOB bank Debit Operations: "+bDebitCnt);
		System.out.println("SBI bank Debit Operations: "+sDebitCnt);
	}
	
	public static void main(String[] args) {
		SwitchBanking switchBanking = new SwitchBanking();
		switchBanking.setTotalBalance(100,200,500,600);
		Scanner sc = new Scanner(System.in);
		String choice;
		do {
			System.out.println("Enter Bank Name as given: ICICI, HDFC, BOB, SBI");
			String bankName = sc.next();
			System.out.println("Enter operation to be performed - Credit or Debit");
			String operation = sc.next();
			System.out.println("Enter Amount to be "+operation+"ed: ");
			Double amount = sc.nextDouble();
			switchBanking.performTransactions(bankName,operation,amount);
			System.out.println("----Transcations completed successfully----");
			System.out.println("Do you wish to continue: Yes or No");
			choice = sc.next();
		}while(choice.equalsIgnoreCase("Yes"));
		System.out.println("----Total Balance (in all accounts)----");
		switchBanking.displayTotalBalance();
		System.out.println("----TotalCredit Debit Operations----");
		switchBanking.totalCreditDebitOperations();
		System.out.println("----Bankwise Credit Operations----");
		switchBanking.bankwiseCreditOps();
		System.out.println("----Bankwise Debit Operations----");
		switchBanking.bankwiseDebitOps();
	}
}
