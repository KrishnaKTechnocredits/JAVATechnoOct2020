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
	static int count=0;
	public void bankSetInitialBalance() {
		if (count==0) {
		System.out.println("\r\n"+"Enter HDFC Initial amount");
		Scanner sc = new Scanner(System.in);
		hdfcAmount=sc.nextDouble();
		System.out.println("Enter ICICI Initial amount");
		iciciAmount=sc.nextDouble();
		System.out.println("Enter BOB Initial amount");
		bobAmount=sc.nextDouble();
		System.out.println("Enter SBI Initial amount");
		sbiAmount=sc.nextDouble();
		count++;
		}
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter name of Bank you want to do transaction today");
		String bankName=sca.next();
		System.out.println("Enter Operation");
		String operation=sca.next();
		if (operation.equalsIgnoreCase("Credit")) {
			System.out.println("Enter Credit Amount");
			creditAmount=sca.nextDouble();
		}
		else {
			System.out.println("Enter Debit Amount");
			debitAmount=sca.nextDouble();
		}
	
		bankSwitch(bankName, operation);
		
	}
	

	public void bankSwitch(String bankName,String operation) {
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
		}
		else if (bankname.equalsIgnoreCase("icici")) {
			iciciAmount+=amount;
			creditCount++;
			iciciCreditCount++;
		}
		else if (bankname.equalsIgnoreCase("bob")) {
			bobAmount+=amount;
			creditCount++;
			bobCreditCount++;
		}
		else if (bankname.equalsIgnoreCase("SBI")) {
			sbiAmount+=amount;
			creditCount++;
			sbiCreditCount++;
		}
	}
	
	void bankDebit(String bankname,double amount ) {
	
		if (bankname.equalsIgnoreCase("HDFC") && hdfcAmount>0) {
			hdfcAmount=hdfcAmount-amount;
			debitCount++;
			hdfcDebitCount++;
		}
		else if ((bankname.equalsIgnoreCase("icici") && iciciAmount>0)) {
			iciciAmount=iciciAmount-amount;
			debitCount++;
			iciciDebitCount++;
		}
		else if (bankname.equalsIgnoreCase("BOB") && bobAmount>0) {
			bobAmount=bobAmount-amount;
			debitCount++;
			bobDebitCount++;
		}
		else if (bankname.equalsIgnoreCase("sbiAmount") && sbiAmount>0) {
			sbiAmount=sbiAmount-amount;
			debitCount++;
			sbiDebitCount++;
			}else
			System.out.println("Insufficient Balanc in Account");
	}
	
	void bankBalance() {
		totalBalance+=(hdfcAmount+iciciAmount+bobAmount+sbiAmount);
		System.out.println("Total balance in all acoounts: "+totalBalance);
	}
	void bankCreditDebit() {
		System.out.println("Total Credit transactions:"+creditCount);
		System.out.println("Total Debit transactions:"+debitCount);
	}
	void showCredit() {
		System.out.println("HDFC Credit transaction:" +hdfcCreditCount);
		System.out.println("ICICI Credit transaction:" +iciciCreditCount);
		System.out.println("BOB Credit transaction:" +bobCreditCount);
		System.out.println("SBI Credit transaction:" +sbiCreditCount);
	}
	void showDebit() {
		System.out.println("HDFC Bank Debit transaction:"+hdfcDebitCount);
		System.out.println("ICICI Bank Debit transaction:"+iciciDebitCount);
		System.out.println("BOB Bank Debit transaction:"+bobDebitCount);
		System.out.println("SBI Bank Debit transaction:"+sbiDebitCount);
	}
	public static void main(String[] args) {
		BankOperationUsingSwitch bankOperationUsingSwitch=new BankOperationUsingSwitch();
		bankOperationUsingSwitch.bankSetInitialBalance();
		BankOperationUsingSwitch bankOperationUsingSwitch1=new BankOperationUsingSwitch();
		bankOperationUsingSwitch1.bankSetInitialBalance();
		bankOperationUsingSwitch.bankCreditDebit();
		bankOperationUsingSwitch.bankBalance();
		bankOperationUsingSwitch.showCredit();
		bankOperationUsingSwitch.showDebit();
		}
}
