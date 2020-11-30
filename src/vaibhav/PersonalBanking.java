package vaibhav;

public class PersonalBanking {
	
	int iBal,sBal,hBal,bBal;
	int iCredit,sCredit,hCredit,bCredit,iDebit,sDebit,hDebit,bDebit;	
	
	void bankOperation(String operation,int amount,String bank) {
		switch(operation) {
			case "Credit" :
				creditOperation(bank,amount);
				break;
			case "Debit" :
				debitOperation(bank,amount);
				break;
			default :
				System.out.println("Enter Valid details to proceed");		
		}		
	}
	
	void creditOperation(String bank,int amount) {
		switch(bank) {
			case "ICICI":
				iBal +=amount;
				iCredit++;
				break;
			case "SBI":
				sBal +=amount;
				sCredit++;
				break;
			case "HDFC" :
				hBal +=amount;
				hCredit++;
				break;
			case "BOB" :
				bBal +=amount;
				bCredit++;
				break;		
		}		
	}
	
	void debitOperation(String bank,int amount) {
		switch(bank) {
			case "ICICI":
				if (amount < iBal) {
					iBal -= amount;
					iDebit++;
				}
				else 
					System.out.println("Amount you are trying to withdraw from ICICI bank is greater than the balance,Please check and try again");
				break;
			case "SBI":
				if (amount < sBal) {
					sBal -= amount;
					sDebit++;					
				}
				else 
					System.out.println("Amount you are trying to withdraw from SBI bank is greater than the balance,Please check and try again");
				break;
			case "HDFC" :
				if (amount < hBal) {
					hBal -= amount;
					hDebit++;
				}
				else 
					System.out.println("Amount you are trying to withdraw from HDFC bank is greater than the balance,Please check and try again");
				break;
			case "BOB" :
				if (amount < bBal) {
					bBal -= amount;
					bDebit++;
				}
				else 
					System.out.println("Amount you are trying to withdraw from BOB bank is greater than the balance,Please check and try again");
				break;	
			default :
				System.out.println("Enter Valid details for debit operation");	
		}		
	}
	
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
	
	void totalCreditDebit(String bank) {
		switch (bank) {
		case "ICICI":
			System.out.println("Total Credit operation performed on ICICI bank are "+iCredit+" and total debit operation on ICICI bank are "+iDebit);
			break;
		case "SBI":
			System.out.println("Total Credit operation performed on SBI bank are "+sCredit+" and total debit operation on SBI bank are "+sDebit);
			break;
		case "HDFC" :
			System.out.println("Total Credit operation performed on HDFC bank are "+hCredit+" and total debit operation on HDFC bank are "+hDebit);
			break;
		case "BOB" :
			System.out.println("Total Credit operation performed on BOB bank are "+bCredit+" and total debit operation on BOB bank are "+bDebit);
			break;	
		default :
			System.out.println("Enter Valid details to get your total credit and debit history");		
		}			
	}
	
	void individualCredit(String bank) {
		switch (bank) {
		case "ICICI":
			System.out.println("Individual Credit operation performed on ICICI bank are "+iCredit);
			break;
		case "SBI":
			System.out.println("Individual Credit operation performed on SBI bank are "+sCredit);
			break;
		case "HDFC" :
			System.out.println("Individual Credit operation performed on HDFC bank are "+hCredit);
			break;
		case "BOB" :
			System.out.println("Individual Credit operation performed on BOB bank are "+bCredit);
			break;	
		default :
			System.out.println("Enter Valid details to get your total Credit history");		
		}		
	}
	
	void individualDebit(String bank) {
		switch (bank) {
		case "ICICI":
			System.out.println("Individual Debit operation performed on ICICI bank are "+iDebit);
			break;
		case "SBI":
			System.out.println("Individual Debit operation performed on SBI bank are "+sDebit);
			break;
		case "HDFC" :
			System.out.println("Individual Debit operation performed on HDFC bank are "+hDebit);
			break;
		case "BOB" :
			System.out.println("Individual Debit operation performed on BOB bank are "+bDebit);
			break;	
		default :
			System.out.println("Enter Valid details to get your total Debit history");		
		}		
	}


	public static void main(String[] args) {
		
		PersonalBanking personalBanking=new PersonalBanking();
		personalBanking.bankOperation("Credit", 500, "ICICI");
		personalBanking.displayTotalBalance("ICICI");
		personalBanking.bankOperation("Debit", 250, "ICICI");
		personalBanking.displayTotalBalance("ICICI");
		personalBanking.bankOperation("Credit", 700, "SBI");
		personalBanking.displayTotalBalance("SBI");
		personalBanking.bankOperation("Debit", 300, "SBI");
		personalBanking.displayTotalBalance("SBI");
		personalBanking.bankOperation("Credit", 1000, "HDFC");
		personalBanking.displayTotalBalance("HDFC");
		personalBanking.bankOperation("Debit", 10, "HDFC");
		personalBanking.displayTotalBalance("HDFC");
		personalBanking.bankOperation("Credit", 157, "BOB");
		personalBanking.bankOperation("Credit", 157, "BOB");
		personalBanking.displayTotalBalance("BOB");
		personalBanking.bankOperation("Debit", 300, "BOB");
		personalBanking.displayTotalBalance("BOB");
		personalBanking.totalCreditDebit("ICICI");
		personalBanking.totalCreditDebit("SBI");
		personalBanking.totalCreditDebit("HDFC");
		personalBanking.totalCreditDebit("BOB");
		personalBanking.individualCredit("ICICI");
		personalBanking.individualCredit("SBI");
		personalBanking.individualCredit("HDFC");
		personalBanking.individualCredit("BOB");
		personalBanking.individualDebit("ICICI");
		personalBanking.individualDebit("HDFC");
		personalBanking.individualDebit("SBI");
		personalBanking.individualDebit("BOB");		
		}
}
