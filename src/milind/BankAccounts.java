package milind;

public class BankAccounts {
	
	double iciciBalance, hdfcBalance, bobBalance, sbiBalance;
	int iciciCreditCount, hdfcCreditCount, bobCreditCount, sbiCreditCount;
	int iciciDebitCount, hdfcDebitCount, bobDebitCount, sbiDebitCount;
	static int totalCreditCount, totalDebitCount;
	
	void debitCreditFromBank(String bankName, String operation, int amount) {
		
		switch(bankName) {	
			case ("ICICI") :
				if(operation.equalsIgnoreCase("Credit")) {
					iciciBalance = iciciBalance + amount;
					iciciCreditCount++;
					totalCreditCount++;
				}else if(operation.equalsIgnoreCase("Debit")) {
					if(iciciBalance >= amount) {
						iciciBalance = iciciBalance - amount;
						iciciDebitCount++;
						totalDebitCount++;
					}else {
						System.out.println("Insufficient Balance in ICICI bank account !!!");
					}
				}else {
					System.out.println("You have choosen wrong operation... Try again");
				} 
				break;
			
			
			case ("HDFC") :
				if(operation.equalsIgnoreCase("Credit")) {
					hdfcBalance = hdfcBalance + amount;
					hdfcCreditCount++;
					totalCreditCount++;
				}else if(operation.equalsIgnoreCase("Debit")) {
					if(hdfcBalance >= amount) {
						hdfcBalance = hdfcBalance - amount;
						hdfcDebitCount++;
						totalDebitCount++;
					}else {
						System.out.println("Insufficient Balance in HDFC bank account !!!");
					}
				}else {
					System.out.println("You have choosen wrong operation... Try again");
				}
				break;
			
			case ("BOB") :
				if(operation.equalsIgnoreCase("Credit")) {
					bobBalance = bobBalance + amount;
					bobCreditCount++;
					totalCreditCount++;
				}else if(operation.equalsIgnoreCase("Debit")) {
					if(bobBalance >= amount) {
						bobBalance = bobBalance - amount;
						bobDebitCount++;
						totalDebitCount++;
					}else {
						System.out.println("Insufficient Balance in BOB bank account !!!");
					}
				}else {
					System.out.println("You have choosen wrong operation... Try again");
				}
				break;
			
			case ("SBI") :
				if(operation.equalsIgnoreCase("Credit")) {
					sbiBalance = sbiBalance + amount;
					sbiCreditCount++;
					totalCreditCount++;
				}else if(operation.equalsIgnoreCase("Debit")) {
					if(sbiBalance >= amount) {
						sbiBalance = sbiBalance - amount;
						sbiDebitCount++;
						totalDebitCount++;
					}else {
						System.out.println("Insufficient Balance in SBI bank account !!!");
					}
				}else {
					System.out.println("You have choosen wrong operation... Try again");
				}
				break;
				
			default :
				System.out.println("You dont have account in " + bankName + "Please try again");
		}
			
	}
	
	double totalBalanceAvailable() {
		System.out.println("*****************************************************************");
		double totalBalance = iciciBalance + hdfcBalance + bobBalance + sbiBalance;
		return totalBalance;
	}
	
	void totalDebitAndCreditOperations() {
		System.out.println("*****************************************************************");
		System.out.println("Total " + totalCreditCount + " times user has credited amount in bank");
		System.out.println("Total " + totalDebitCount + " times user has debited amount from bank");
		System.out.println("*****************************************************************");
	}
	
	void individualBankCreditCount() {
		System.out.println("*****************************************************************");
		System.out.println(iciciCreditCount + " times user has credited amount in ICICI bank");
		System.out.println(hdfcCreditCount + " times user has credited amount in HDFC bank");
		System.out.println(bobCreditCount + " times user has credited amount in BOB bank");
		System.out.println(sbiCreditCount + " times user has credited amount in SBI bank");
		System.out.println("*****************************************************************");
	}
	
	void individualBankDebitCount() {
		System.out.println("*****************************************************************");
		System.out.println(iciciDebitCount + " times user has debited amount in ICICI bank");
		System.out.println(hdfcDebitCount + " times user has debited amount in HDFC bank");
		System.out.println(bobDebitCount + " times user has debited amount in BOB bank");
		System.out.println(sbiDebitCount + " times user has debited amount in SBI bank");
		System.out.println("*****************************************************************");
	}
	
	public static void main(String[] args) {
		
		BankAccounts bankAccounts = new BankAccounts();
		bankAccounts.debitCreditFromBank("ICICI", "Credit", 5000);
		bankAccounts.debitCreditFromBank("HDFC", "Credit", 10000);
		bankAccounts.debitCreditFromBank("BOB", "Credit", 7000);
		bankAccounts.debitCreditFromBank("SBI", "Credit", 1000);
		bankAccounts.debitCreditFromBank("ICICI", "Debit", 2000);
		bankAccounts.debitCreditFromBank("HDFC", "Debit", 8000);
		bankAccounts.debitCreditFromBank("BOB", "Debit", 2000);
		bankAccounts.debitCreditFromBank("SBI", "Debit", 2000);
		bankAccounts.debitCreditFromBank("ICICI", "Credit", 5000);
		bankAccounts.debitCreditFromBank("HDFC", "Credit", 10000);
		bankAccounts.debitCreditFromBank("BOB", "Credit", 7000);
		bankAccounts.debitCreditFromBank("SBI", "Credit", 1000);
		bankAccounts.debitCreditFromBank("ICICI", "Debit", 2000);
		bankAccounts.debitCreditFromBank("HDFC", "Debit", 13000);
		bankAccounts.debitCreditFromBank("BOB", "Debit", 2000);
		bankAccounts.debitCreditFromBank("SBI", "Debit", 2000);
		System.out.println("*****************************************************************");
		System.out.println("Total amount available in user's all bank account :" + bankAccounts.totalBalanceAvailable());
		System.out.println("*****************************************************************");
		System.out.println("ICICI account balance is : " + bankAccounts.iciciBalance);
		System.out.println("HDFC account balance is : " + bankAccounts.hdfcBalance);
		System.out.println("BOB account balance is : " + bankAccounts.bobBalance);
		System.out.println("SBI account balance is : " + bankAccounts.sbiBalance);
		System.out.println("*****************************************************************");
		bankAccounts.totalDebitAndCreditOperations();
		bankAccounts.individualBankCreditCount();
		bankAccounts.individualBankDebitCount();
	}

}
