package tejashree;

class BankAssignment13{
static double iBal,bBal,sBal,hBal;
static int iCreditCount, hCreditCount, bCreditCount, sCreditCount, iDebitCount, hDebitCount, bDebitCount, sDebitCount;

void displayTotalBalance(String bank) {
		switch (bank) {
		case "ICICI":
			System.out.println("ICICI Total balance is "+iBal);
			break;
		case "SBI":
			System.out.println("SBI Total balance is "+sBal);
			break;
		case "HDFC" :
			System.out.println("HDFC Total balance is "+hBal);
			break;
		case "BOB" :
			System.out.println("BOB Total balance is " +bBal);
			break;	
		default :
			System.out.println("Enter Valid details to get your total balance");		
		}		
	}
public void bankOperation(String bank,double amount,String operation){
	switch(operation){
		
		case "credit": 
					credit(bank,amount);
					break;
		case "debit" :
					debit(bank, amount);
					break;
		case "printTotalBalance":
					displayTotalBalance(bank);
					break;
}
}
void credit(String bank, double amt){
	switch(bank){
		case "ICICI":
				iBal=iBal+amt;
				iCreditCount++;
				System.out.println("credited Rs. "+amt+" in "+bank+" account");
				break;
				
		case "BOB":
				bBal=bBal+amt;
				bCreditCount++;
				System.out.println("credited Rs. "+amt+" in "+bank+" account");
				break;

		case "HDFC" :
				hBal=hBal+amt;
				hCreditCount++;				
				System.out.println("credited Rs. "+amt+" in "+bank+" account");
				break;

		case "SBI" :
				sBal=sBal+amt;
				sCreditCount++;				
				System.out.println("credited Rs. "+amt+" in "+bank+" account");
				break;

	}
}
void debit(String bank, double amount){
		switch(bank) {
			case "ICICI":
				if (amount < iBal) {
					iBal -= amount;
					iDebitCount++;
					System.out.println("debited Rs. "+amount+" from "+bank+" account");
				}
				else 
					System.out.println("Amount you are trying to withdraw from ICICI bank is greater than the balance,Please check and try again");
				break;
			case "SBI":
				if (amount < sBal) {
					sBal -= amount;
					sDebitCount++;		
					System.out.println("debited Rs. "+amount+" from "+bank+" account");				
				}
				else 
					System.out.println("Amount you are trying to withdraw from SBI bank is greater than the balance,Please check and try again");
				break;
			case "HDFC" :
				if (amount < hBal) {
					hBal -= amount;
					hDebitCount++;
					System.out.println("debited Rs. "+amount+" from "+bank+" account");
				}
				else 
					System.out.println("Amount you are trying to withdraw from HDFC bank is greater than the balance,Please check and try again");
				break;
			case "BOB" :
				if (amount < bBal) {
					bBal -= amount;
					bDebitCount++;
					System.out.println("debited Rs. "+amount+" from "+bank+" account");
				}
				else 
					System.out.println("Amount you are trying to withdraw from BOB bank is greater than the balance,Please check and try again");
				break;	
			default :
				System.out.println("Enter Valid details for debit operation");	
		}		
}
void totalCreditDebit(String bank) {
		switch (bank) {
		case "ICICI":
			System.out.println("Total Credit operation performed on ICICI bank are "+iCreditCount+" and total debit operation on ICICI bank are "+iDebitCount);
			break;
		case "SBI":
			System.out.println("Total Credit operation performed on SBI bank are "+sCreditCount+" and total debit operation on SBI bank are "+sDebitCount);
			break;
		case "HDFC" :
			System.out.println("Total Credit operation performed on HDFC bank are "+hCreditCount+" and total debit operation on HDFC bank are "+hDebitCount);
			break;
		case "BOB" :
			System.out.println("Total Credit operation performed on BOB bank are "+bCreditCount+" and total debit operation on BOB bank are "+bDebitCount);
			break;	
		default :
			System.out.println("Enter Valid details to get your total credit and debit history");		
		}			
	}

void individualCredit(String bank) {
		switch (bank) {
		case "ICICI":
			System.out.println("Individual Credit operation performed on ICICI bank are "+iCreditCount);
			break;
		case "SBI":
			System.out.println("Individual Credit operation performed on SBI bank are "+sCreditCount);
			break;
		case "HDFC" :
			System.out.println("Individual Credit operation performed on HDFC bank are "+hCreditCount);
			break;
		case "BOB" :
			System.out.println("Individual Credit operation performed on BOB bank are "+bCreditCount);
			break;	
		default :
			System.out.println("Enter Valid details to get your total Credit history");		
		}		
	}

void individualDebit(String bank) {
		switch (bank) {
		case "ICICI":
			System.out.println("Individual Debit operation performed on ICICI bank are "+iDebitCount);
			break;
		case "SBI":
			System.out.println("Individual Debit operation performed on SBI bank are "+sDebitCount);
			break;
		case "HDFC" :
			System.out.println("Individual Debit operation performed on HDFC bank are "+hDebitCount);
			break;
		case "BOB" :
			System.out.println("Individual Debit operation performed on BOB bank are "+bDebitCount);
			break;	
		default :
			System.out.println("Enter Valid details to get your total Debit history");		
		}		
	}
public static void main(String []args){
	BankAssignment13 b13=new BankAssignment13();
	b13.bankOperation("ICICI",13000,"credit");
	b13.bankOperation("ICICI",13000,"credit");
	b13.bankOperation("HDFC",10000,"credit");
	b13.bankOperation("HDFC",1000,"debit");
	System.out.println("");
	System.out.println("-----ICICI Summary-----");
	b13.individualCredit("ICICI");
	b13.individualDebit("ICICI");
	b13.displayTotalBalance("ICICI");
	System.out.println("-----HDFC Summary-----");
	b13.individualCredit("HDFC");
	b13.individualDebit("HDFC");
	b13.displayTotalBalance("HDFC");	
	
}
}
