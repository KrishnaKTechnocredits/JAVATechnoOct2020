package deepak;

public class BankSwitchCaseDemo {
	double balICICI, balHDFC, balBOB, balSBI;
	int indvCrditcountICIC, indvDebitcountICICI, indvCrditcountHDFC, indvDebitcountHDFC, indvCrditcountBOB, indvDebitcountBOB, indvCrditcountSBI, indvDebitcountSBI;
	int totalCrditcountICIC, totalDebitcountICICI, totalCrditcountHDFC, totalDebitcountHDFC,totalCrditcountBOB, totalDebitcountBOB, totalCrditcountSBI, totalDebitcountSBI;
			
	void credit(String bankName, double amount) {
		switch(bankName) {
		case "ICICI":
		case "icici":
			balICICI = balICICI + amount;
			indvCrditcountICIC++;
			totalCrditcountICIC++;
			System.out.println("Balance in ICICI Account Is: "+ balICICI);
			break;
			
		case "HDFC":
		case "hdfc":
			balHDFC = balHDFC + amount;
			indvCrditcountHDFC++;
			totalCrditcountHDFC++;
			System.out.println("Balance in HDFC Account Is: "+ balHDFC);
			break;
			
		case "BOB":
		case "bob":
			balBOB = balBOB + amount;
			indvCrditcountBOB++;
			totalCrditcountBOB++;
			System.out.println("Balance in BOI Account Is: "+ balBOB);
			break;
			
		case "SBI":
		case "sbi":
			balSBI = balSBI + amount;
			indvCrditcountSBI++;
			totalCrditcountSBI++;
			System.out.println("Balance in SBI Account Is: "+ balSBI);
			break;
			
			default: System.out.println("Please Enter Valid Bank Name");
			
		}
	}
	void debit(String bankName, double amount) {
	
		switch(bankName) {
		case "ICICI":
		case "icici":
			if(amount < balICICI ) {
				balICICI = balICICI - amount;
				indvDebitcountICICI++;
				totalDebitcountICICI++;
				System.out.println("Balance in ICIC account after debit: "+ balICICI);
			}
			else
				System.out.println("Insufficiant Balance in your ICIC account");
			break;
			
		case "HDFC":
		case "hdfc":
			if(amount < balHDFC ) {
				balHDFC = balHDFC - amount;
				indvDebitcountHDFC++;
				totalDebitcountHDFC++;
				System.out.println("Balance in HDFC account after debit: "+ balHDFC);
			}
			else
				System.out.println("Insufficiant Balance in your HDFC account");
			break;
			
		case "BOB":
		case "bob":
			if(amount < balBOB ) {
				balBOB = balBOB - amount;
				indvDebitcountBOB++;
				totalDebitcountBOB++;
				System.out.println("Balance in BOB account after debit: "+ balBOB);
			}
			else
				System.out.println("Insufficiant Balance in your BOB account");
			break;
			
		case "SBI":
		case "sbi":
			if(amount < balSBI ) {
				balSBI = balSBI - amount;
				indvDebitcountSBI++;
				totalDebitcountSBI++;
				System.out.println("Balance in SBI account after debit: "+ balSBI);
			}
			else
				System.out.println("Insufficiant Balance in your SBI account");
			break;
		}
		
	}
	
	void TotalBal() {
		double totalBal = balICICI + balHDFC + balBOB + balSBI;
		System.out.println("Your Total Balannce Is : "+ totalBal);
	}
	
	void individaulCreditOps() {
		System.out.println("Individual ICIC Credit count :"+ indvCrditcountICIC );
		System.out.println("Individual HDFC Credit count :"+ indvCrditcountHDFC);
		System.out.println("Individual BOB Credit count :"+ indvCrditcountBOB);
		System.out.println("Individual SBI Credit count :"+ indvCrditcountSBI);
		
	}
	
	void individaulDebitOps() {
		System.out.println("Individual ICIC Debit count :"+ indvDebitcountICICI);
		System.out.println("Individual HDFC Debit count :"+ indvDebitcountHDFC);
		System.out.println("Individual BOB Debit count :"+ indvDebitcountBOB);
		System.out.println("Individual SBI Debit count :"+ indvDebitcountSBI);
	}
	
	void TotalCreditDebitOps() {
		System.out.println("Total ICIC Credit count :"+ totalCrditcountICIC);
		System.out.println("Total HDFC Credit count :"+ totalCrditcountHDFC);
		System.out.println("Total BOB Credit count :"+ totalCrditcountBOB);
		System.out.println("Total SBI Credit count :"+ totalCrditcountSBI);
		
		System.out.println("Total ICIC Debit count :"+ totalDebitcountICICI);
		System.out.println("Total HDFC Debit count :"+ totalDebitcountHDFC);
		System.out.println("Total BOB Debit count :"+ totalDebitcountBOB);
		System.out.println("Total SBI Debit count :"+ totalDebitcountSBI);
	}
	
	void bankOperation(String bankName, String operation, double amount) {
		
		switch(operation) {
		
		case "Credit":
			credit(bankName, amount);
			break;
			
		case "Debit":
			debit(bankName, amount);
			break;
		default:
			System.out.println("Please Check amount or Enter valid Operation");
		}	
	}
		
	public static void main(String[] args) {
		
		BankSwitchCaseDemo bankSwitchCaseDemo = new BankSwitchCaseDemo();
		
		System.out.println("-------CREDIT OPERATIONS-----------");
		bankSwitchCaseDemo.bankOperation("ICICI", "Credit", 50000);
		bankSwitchCaseDemo.bankOperation("HDFC", "Credit", 50000);
		bankSwitchCaseDemo.bankOperation("BOB", "Credit", 50000);
		bankSwitchCaseDemo.bankOperation("SBI", "Credit", 50000);
		
		System.out.println("-------CHECKING INDIVIDUAL CREDIT OPERATIONS-----------");
		bankSwitchCaseDemo.individaulCreditOps();
		
		System.out.println("-------CHECKING INDIVIDUAL DEBIT DEBIT OPRATION-----------");
		bankSwitchCaseDemo.individaulDebitOps();
		
		System.out.println("-------CHECKING TOTAL DEBIT/CREDIT DEBIT OPERATIONS-----------");
		bankSwitchCaseDemo.TotalCreditDebitOps();
		
		System.out.println("-------DEBIT OPERATIONS-----------");
		bankSwitchCaseDemo.bankOperation("ICICI", "Debit", 5000);
		bankSwitchCaseDemo.bankOperation("HDFC", "Debit", 10000);
		bankSwitchCaseDemo.bankOperation("BOB", "Debit", 15000);
		bankSwitchCaseDemo.bankOperation("SBI", "Debit", 20000);

		System.out.println("-------CHECKING INDIVIDUAL CREDIT OPERATIONS-----------");
		bankSwitchCaseDemo.individaulCreditOps();
		
		System.out.println("-------CHECKING INDIVIDUAL DEBIT DEBIT OPRATION-----------");
		bankSwitchCaseDemo.individaulDebitOps();
		
		System.out.println("-------CHECKING TOTAL DEBIT/CREDIT DEBIT OPERATIONS-----------");
		bankSwitchCaseDemo.TotalCreditDebitOps();
	}
}
