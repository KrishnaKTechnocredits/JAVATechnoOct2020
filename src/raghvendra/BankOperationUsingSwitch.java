package raghvendra;

import java.util.Scanner;

public class BankOperationUsingSwitch {
	static int creditCount;
	static int debitCount;
	static double hdfcAmount;
	static int hdfcCreditCount;
	static int hdfcDebitCount;
	static int iciciDebitCount;
	static int sbiDebitCount;
	static int bobDebitCount;
	static double iciciAmount;
	static int iciciCreditCount;
	static double bobAmount;
	static int bobCreditCount;
	static double sbiAmount;
	static int sbiCreditCount;
	static double creditAmount;
	static double debitAmount;
	static double totalBalance;
	public void bankSetInitialBalance() {
		System.out.println("\r\n"+"Enter HDFC Initial amount");
		Scanner sc = new Scanner(System.in);
		hdfcAmount=sc.nextDouble();
		System.out.println("Enter ICICI Initial amount");
		iciciAmount=sc.nextDouble();
		System.out.println("Enter BOB Initial amount");
		bobAmount=sc.nextDouble();
		System.out.println("Enter SBI Initial amount");
		sbiAmount=sc.nextDouble();
		System.out.println("Enter Bank Name");
		String bankName=sc.next();
		System.out.println("Enter Operation");
		String operation=sc.next();
		if (operation.equalsIgnoreCase("Credit")) {
			System.out.println("Enter Credit Amount");
			creditAmount=sc.nextDouble();
		}
		else {
			System.out.println("Enter Debit Amount");
			debitAmount=sc.nextDouble();
		}
	
		bankSwitch(bankName, operation, creditAmount, debitAmount);
		bankBalance(bankName);
		bankCreditDebit();
	}
	

	public void bankSwitch(String bankName,String operation,double creditAmount,double debitAmount) {
		switch(bankName.toLowerCase()){
		case "hdfc":
			if(operation.equalsIgnoreCase("Credit"))
				bankCredit(bankName,creditAmount);
			else if (operation.equalsIgnoreCase("Debit"))
				bankDebit(bankName,debitAmount);
				break;
		case "icici":
			if(operation.equalsIgnoreCase("Credit"))
				bankCredit(bankName,creditAmount);
			else if (operation.equalsIgnoreCase("Debit"))
				bankDebit(bankName,debitAmount);
			break;

		case "sbi":
			if(operation.equalsIgnoreCase("Credit"))
				bankCredit(bankName,creditAmount);
			else if (operation.equalsIgnoreCase("Debit"))
				bankDebit(bankName,debitAmount);
			break;

		case "bob":
			if(operation.equalsIgnoreCase("Credit"))
				bankCredit(bankName,creditAmount);
			else if (operation.equalsIgnoreCase("Debit"))
				bankDebit(bankName,debitAmount);
			}
		}
	
	void bankCredit(String bankname,double amount ) {
		if (bankname.equalsIgnoreCase("HDFC")) {
			hdfcAmount=hdfcAmount+amount;
			creditCount++;
			hdfcCreditCount++;
			System.out.println("HDFC Credit transaction:" +hdfcCreditCount);
		}
		else if (bankname.equalsIgnoreCase("icici")) {
			iciciAmount+=amount;
			creditCount++;
			iciciCreditCount++;
			System.out.println("ICICI Credit transaction:" +iciciCreditCount);
		}
		else if (bankname.equalsIgnoreCase("bob")) {
			bobAmount+=amount;
			creditCount++;
			bobCreditCount++;
			System.out.println("BOB Credit transaction:" +bobCreditCount);
		}
		else if (bankname.equalsIgnoreCase("SBI")) {
			sbiAmount+=amount;
			creditCount++;
			sbiCreditCount++;
			System.out.println("SBI Credit transaction:" +sbiCreditCount);
			}
	}
	
	void bankDebit(String bankname,double amount ) {
	
		if (bankname.equalsIgnoreCase("HDFC") && hdfcAmount>0) {
			hdfcAmount=hdfcAmount-amount;
			debitCount++;
			hdfcDebitCount++;
			System.out.println("HDFC Bank Debit transaction:"+hdfcDebitCount);
		}
		else if ((bankname.equalsIgnoreCase("icici") && iciciAmount>0)) {
			iciciAmount=iciciAmount-amount;
			debitCount++;
			iciciDebitCount++;
			System.out.println("ICICI Bank Debit transaction:"+iciciDebitCount);
		}
		else if (bankname.equalsIgnoreCase("BOB") && bobAmount>0) {
			bobAmount=bobAmount-amount;
			debitCount++;
			bobDebitCount++;
			System.out.println("ICICI Bank Debit transaction:"+bobDebitCount);
		}
		else if (bankname.equalsIgnoreCase("sbiAmount") && sbiAmount>0) {
			sbiAmount=sbiAmount-amount;
			debitCount++;
			sbiDebitCount++;
			System.out.println("ICICI Bank Debit transaction:"+sbiDebitCount);
		}else
			System.out.println("Insufficient Balanc in Account");
	}
	
	void bankBalance(String bankName) {
		totalBalance+=(hdfcAmount+iciciAmount+bobAmount+sbiAmount);
		System.out.println("Total balance in all acoounts: "+totalBalance);
	}
	void bankCreditDebit() {
		System.out.println("Total Credit transactions:"+creditCount);
		System.out.println("Total Debit transactions:"+debitCount);
	}
	
	public static void main(String[] args) {
		BankOperationUsingSwitch bankOperationUsingSwitch=new BankOperationUsingSwitch();
		bankOperationUsingSwitch.bankSetInitialBalance();
		BankOperationUsingSwitch bankOperationUsingSwitch1=new BankOperationUsingSwitch();
		bankOperationUsingSwitch1.bankSetInitialBalance();
	}
}
