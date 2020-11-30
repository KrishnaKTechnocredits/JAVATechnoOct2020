package vishakha;

import java.util.Scanner;

public class BankOperation {

	int iciciBal = 8000;
	int hdfcBal = 5000;
	int bobBal = 10000;
	int sbiBal = 1000;
	int iciciCCount;
	int hdfcCCount;
	int bobCCount;
	int sbiCCount;
	int iciciDCount;
	int hdfcDCount;
	int bobDCount;
	int sbiDCount;
	int totalBalance;
	static int creditTotalCount;
	static int debitTotalCount;
	static String bankName;
	static String operation;
	static int amount;
	
	void bankOperation(String bankName, String op, int amount){
		switch(op){
		case "credit":
		case "CREDIT":
			creditOperation(bankName, amount);
			break;			
		case "debit":
		case "DEBIT":
			debitOperation(bankName, amount);
			break;

		}
	}
	
	void creditOperation(String bankName, int amount){
		switch(bankName){
		case "ICICI" :
		case "icici" :
			iciciBal = iciciBal + amount;
			iciciCCount++;
			creditTotalCount++;
			break;
		case "HDFC" :
		case "hdfc" :
			hdfcBal = hdfcBal + amount;
			hdfcCCount++;
			creditTotalCount++;
			break;
		case "BOB" :
		case "bob" :
			bobBal = bobBal + amount;
			bobCCount++;
			creditTotalCount++;
			break;
		case "SBI" :
		case "sbi" :
			sbiBal = sbiBal + amount;
			sbiCCount++;
			creditTotalCount++;
			break;
		}
	}
	
	void debitOperation(String bankName, int amount){
		switch(bankName){
		case "ICICI" :
		case "icici" :
			if(iciciBal >= amount){
				iciciBal = iciciBal - amount;
				iciciDCount++;
				debitTotalCount++;
			}else{
				System.out.println("Insufficient Balance in ICICI account. Available balance is : "+iciciBal);
			}
			break;
		case "HDFC" :
		case "hdfc" :
			if(hdfcBal >= amount){
				hdfcBal = hdfcBal - amount;
				hdfcDCount++;
				debitTotalCount++;
			}else{
				System.out.println("Insufficient Balance in HDFC account. Available balance is : "+hdfcBal);
			}
			break;
		case "BOB" :
		case "bob" :
			if(bobBal >= amount){
				bobBal = bobBal - amount;
				bobDCount++;
				debitTotalCount++;
			}else{
				System.out.println("Insufficient Balance in BOB account. Available balance is : "+bobBal);
			}
			break;
		case "SBI" :
		case "sbi" :
			if(sbiBal >= amount){
				sbiBal = sbiBal - amount;
				sbiDCount++;
				debitTotalCount++;
			}else{
				System.out.println("Insufficient Balance in SBI account. Available balance is : "+sbiBal);
			}
			break;
		}
	}
	
	void totalBalanceofAllBankAccount(){
		totalBalance = iciciBal + hdfcBal + bobBal + sbiBal;
		System.out.println("Total balance of all the bank account is "+totalBalance);
	}
	
	void individualCreditDebitCount(){
		System.out.println("Individual credit count for ICICI bank is :" +iciciCCount+ " and debit count is : "+iciciDCount);
		System.out.println("Individual credit count for HDFC bank is :" +hdfcCCount+ " and debit count is : "+hdfcDCount);
		System.out.println("Individual credit count for BOB bank is :" +bobCCount+ " and debit count is : "+bobDCount);
		System.out.println("Individual credit count for SBI bank is :" +sbiCCount+ " and debit count is : "+sbiDCount);
	}
	
	void totalCreditDebitCount(){
		System.out.println("Total credit count is "+creditTotalCount+ " and total debit count is : "+debitTotalCount);
	}
	
	void takeInputsFromUser(Scanner scanner){
		System.out.println("Enter bank name : ");
		bankName = scanner.next();
		System.out.println("Enter operation to be performed : ");
		operation = scanner.next();
		System.out.println("Enter amount : ");
		amount = scanner.nextInt();
	}
	
	public static void main(String[] args) {
		BankOperation bankOperation = new BankOperation();			
		Scanner scanner = new Scanner(System.in);
		bankOperation.takeInputsFromUser(scanner);
		bankOperation.bankOperation(bankName,operation,amount);
		bankOperation.takeInputsFromUser(scanner);
		bankOperation.bankOperation(bankName,operation,amount);
		bankOperation.takeInputsFromUser(scanner);
		bankOperation.bankOperation(bankName,operation,amount);
		bankOperation.takeInputsFromUser(scanner);
		bankOperation.bankOperation(bankName,operation,amount);
		bankOperation.individualCreditDebitCount();
		bankOperation.totalCreditDebitCount();
	}
}
