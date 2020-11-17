package sadhana;

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
		                 SBI
*/
public class BankTransactionDetails{
	String bankName;
	int balICICI=10000;
	int balHDFC=85000;
	int balBOB=2000;
	int balSBI=1000;
	int totalCreditCount;
	int totalDebitCount;
	int iciciCreditCounter,hdfcCreditCounter,bobCreditCounter,sbiCreditCounter;
	int iciciDebitCounter,hdfcDebitCounter,bobDebitCounter,sbiDebitCounter;
	
	void totalBalance(){
	int allAccountBalance =balICICI+balHDFC+balBOB+balSBI; 
	System.out.println("Total balance of user is:"+allAccountBalance);
	}
	
	void creditAmount(String bankName,int amount){
		switch (bankName){
		case"ICICI":
			balICICI += amount;
			iciciCreditCounter++;
			System.out.println("Credited amount in account is :"+amount);
			System.out.println("Total available balance :"+balICICI);
			break;
		case"HDFC":
			balHDFC += amount;
			hdfcCreditCounter++;
			System.out.println("Credited amount in account is :"+amount);
			System.out.println("Total available balance :"+balHDFC);
			break;
		case"BOB":
			balBOB= amount;
			bobCreditCounter++;
			System.out.println("Credited amount in account is :"+amount);
			System.out.println("Total available balance :"+balBOB);
			break;
		case"SBI":
			balSBI += amount;
			sbiCreditCounter++;
			System.out.println("Credited amount in account is :"+amount);
			System.out.println("Total available balance :"+balSBI);
			break;
		}
		totalCreditCount++;
	}
	
	void debitAmount(String bankName,int amount){
		boolean flag=false;
		switch (bankName){
		case"ICICI":
			if(amount<balICICI){
				balICICI -= amount;
				iciciDebitCounter++;
				System.out.println("Debited amount from account is :"+amount);
				System.out.println("Total available balance :"+balICICI);
				flag=true;
			}else
				System.out.println("Insufficient Balance");
			break;
		case"HDFC":
			if(amount<balHDFC){
				balHDFC -= amount;
				hdfcDebitCounter++;
				System.out.println("Debited amount from account is :"+amount);
				System.out.println("Total available balance :"+balHDFC);
				flag=true;
			}else
				System.out.println("Insufficient Balance");
			break;
		case"BOB":
			if(amount<balBOB){
				balBOB -= amount;
				bobDebitCounter++;
				System.out.println("Credited amount from account is :"+amount);
				System.out.println("Total available balance :"+balBOB);
				flag=true;
			}else
				System.out.println("Insufficient Balance");
			break;
		case"SBI":
			if(amount<balSBI){
				balSBI -= amount;
				sbiDebitCounter++;
				System.out.println("Credited amount from account is :"+amount);
				System.out.println("Total available balance :"+balSBI);
				flag=true;
			}else
				System.out.println("Insufficient Balance");
			break;
		}
		if (flag=true)
			totalDebitCount++;
	}
	void individualCreditOperations(){
			System.out.println("Individual credit operations: "+iciciCreditCounter);
			System.out.println("Individual credit operations: "+hdfcCreditCounter);
			System.out.println("Individual credit operations: "+bobCreditCounter);
			System.out.println("Individual credit operations: "+sbiCreditCounter);
		}
	void individualDebitOperations(){
			System.out.println("Individual debit operations: "+iciciDebitCounter);
			System.out.println("Individual debit operations: "+hdfcDebitCounter);
			System.out.println("Individual debit operations: "+bobDebitCounter);
			System.out.println("Individual debit operations: "+sbiDebitCounter);
		}
	
	public static void main(String[] args){
		BankTransactionDetails bankTransactionDetails = new BankTransactionDetails();
		bankTransactionDetails.creditAmount("ICICI",15000);
		bankTransactionDetails.creditAmount("SBI",500);
		bankTransactionDetails.creditAmount("ICICI",22000);
		bankTransactionDetails.creditAmount("ICICI",22000);
		bankTransactionDetails.creditAmount("HDFC",970000);
		bankTransactionDetails.creditAmount("BOB",100);
		bankTransactionDetails.creditAmount("HDFC",97000);
		bankTransactionDetails.creditAmount("SBI",750);
		bankTransactionDetails.debitAmount("ICICI",5000);
		bankTransactionDetails.debitAmount("HDFC",15000);
		bankTransactionDetails.debitAmount("SBI",1000);
		bankTransactionDetails.debitAmount("BOB",200);
		bankTransactionDetails.debitAmount("ICICI",5000);
		bankTransactionDetails.debitAmount("HDFC",15000);
		bankTransactionDetails.debitAmount("SBI",200);
		bankTransactionDetails.debitAmount("BOB",100);
		bankTransactionDetails.debitAmount("ICICI",5000);
		bankTransactionDetails.debitAmount("HDFC",15000);
		bankTransactionDetails.individualDebitOperations();
		bankTransactionDetails.individualCreditOperations();
		bankTransactionDetails.totalBalance();
	}
}
