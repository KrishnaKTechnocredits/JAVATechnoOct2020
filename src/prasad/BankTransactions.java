package prasad;

import java.util.Scanner;

public class BankTransactions {
	float icicibalance;
	int icicicreditcount;
	int icicidebitcount;
	float hdfcbalance;
	int hdfccreditcount;
	int hdfcdebitcount;
	float bobbalance;
	int bobcreditcount;
	int bobdebitcount;
	float sbibalance;
	int sbicreditcount;
	int sbidebitcount;
	int totaldebitcount;
	int totalcreditcount;
	
	void credit(String bank,float amount) {
		switch(bank.toUpperCase()) {
		case "ICICI":
			icicibalance = icicibalance+amount;
			icicicreditcount++;
			totalcreditcount++;
			break;
		case "HDFC":
			hdfcbalance = hdfcbalance+amount;
			hdfccreditcount++;
			totalcreditcount++;
			break;
		case "BOB":
			bobbalance = bobbalance+amount;
			bobcreditcount++;
			totalcreditcount++;
			break;
		case "SBI":
			sbibalance = sbibalance+amount;
			sbicreditcount++;
			totalcreditcount++;
			break;
		default:
			System.out.println("Transaction failed: Invalid bank name.");
		}
	}
	void debit(String bank,float amount) {
		switch(bank.toUpperCase()) {
		case "ICICI":
			if(amount<icicibalance) {
				icicibalance=icicibalance-amount;
				icicidebitcount++;	
				totaldebitcount++;
			}else 
				System.out.println("Transaction failed: Insufficient balance.");
			break;
		case "HDFC":
			if(amount<hdfcbalance) {
				hdfcbalance=hdfcbalance-amount;
				hdfcdebitcount++;	
				totaldebitcount++;
			}else 
				System.out.println("Transaction failed: Insufficient balance.");
			break;
		case "BOB":
			if(amount<bobbalance) {
				bobbalance=bobbalance-amount;
				bobdebitcount++;	
				totaldebitcount++;
			}else 
				System.out.println("Transaction failed: Insufficient balance.");
			break;
		case "SBI":
			if(amount<sbibalance) {
				sbibalance=sbibalance-amount;
				sbidebitcount++;	
				totaldebitcount++;
			}else 
				System.out.println("Transaction failed: Insufficient balance.");
			break;
		default:
			System.out.println("Transaction failed: Invalid bank name.");
		}
	}
	float totalbalance() {
		float totalbalance=0;
		totalbalance = icicibalance+sbibalance+hdfcbalance+bobbalance;
		return totalbalance;
	}
	void individualdebittrasactions() {
		System.out.println("ICICI debits: " + icicidebitcount);
		System.out.println("HDFC debits: " + hdfcdebitcount);
		System.out.println("SBI debits: " + sbidebitcount);
		System.out.println("BOB debits: " + bobdebitcount);	
	}
	void individualcredittrasactions() {
		System.out.println("ICICI credits: " + icicicreditcount);
		System.out.println("HDFC credits: " + hdfccreditcount);
		System.out.println("SBI credits: " + sbicreditcount);
		System.out.println("BOB credits: " + bobcreditcount);
	}
	void totaltransactions() {
		System.out.println("Total credits: " + totalcreditcount);
		System.out.println("Total debits: " + totaldebitcount);
	}
	void individualbalance() {
		System.out.println("ICICI account balance:-" + "Rs "+ icicibalance + "/-");
		System.out.println("HDFC account balance:-" + "Rs "+ hdfcbalance + "/-");
		System.out.println("SBI account balance:-" + "Rs "+ sbibalance + "/-");
		System.out.println("BOB account balance:-" + "Rs "+ bobbalance + "/-");
	}

	public static void main (String[]arg) {
		BankTransactions banktransactions = new BankTransactions();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Transaction- 01: Please enter transaction type Debit or Credit:");  
		String transaction= scanner.next();
		System.out.println("Please enter bank name:");
		String bank= scanner.next();
		System.out.println("Please enter amount:");
		float amount = scanner.nextInt();
		switch (transaction.toUpperCase()) {
			case "CREDIT":
				banktransactions.credit(bank,amount);
				break;
			case "DEBIT":
				banktransactions.debit(bank,amount);
				break;
			default:
				System.out.println("Transaction Failed: Invalid trasaction type.");
				break;
		}
		
		System.out.println("Transaction- 02: Please enter transaction type Debit or Credit:"); 
		transaction= scanner.next();
		System.out.println("Please enter bank name:");
		bank= scanner.next();
		System.out.println("Please enter amount:");
		amount = scanner.nextInt();
		switch (transaction.toUpperCase()) {
			case "CREDIT":
				banktransactions.credit(bank,amount);
				break;
			case "DEBIT":
				banktransactions.debit(bank,amount);
				break;
			default:
				System.out.println("Transaction Failed: Invalid trasaction type.");
				break;
		}
		
		System.out.println("Transaction- 03: Please enter transaction type Debit or Credit:");  
		transaction= scanner.next();
		System.out.println("Please enter bank name:");
		bank= scanner.next();
		System.out.println("Please enter amount:");
		amount = scanner.nextInt();
		switch (transaction.toUpperCase()) {
			case "CREDIT":
				banktransactions.credit(bank,amount);
				break;
			case "DEBIT":
				banktransactions.debit(bank,amount);
				break;
			default:
				System.out.println("Transaction Failed: Invalid trasaction type.");
				break;
		}
		
		System.out.println("Transaction- 04: Please enter transaction type Debit or Credit:");  
		transaction= scanner.next();
		System.out.println("Please enter bank name:");
		bank= scanner.next();
		System.out.println("Please enter amount:");
		amount = scanner.nextInt();
		switch (transaction.toUpperCase()) {
			case "CREDIT":
				banktransactions.credit(bank,amount);
				break;
			case "DEBIT":
				banktransactions.debit(bank,amount);
				break;
			default:
				System.out.println("Transaction Failed: Invalid trasaction type.");
				break;
		}
		System.out.println(" ");
		float totalbalance = banktransactions.totalbalance();
		System.out.println("Total account balance:- " + "Rs "+ totalbalance+"/-");
		System.out.println("=======================================================");
		banktransactions.individualbalance();
		System.out.println("=======================================================");
		banktransactions.totaltransactions();
		System.out.println("=======================================================");
		banktransactions.individualcredittrasactions();
		System.out.println("=======================================================");
		banktransactions.individualdebittrasactions();
	}
}
