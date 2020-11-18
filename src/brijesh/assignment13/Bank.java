package brijesh.assignment13;

public class Bank {
	int hdfcBalance, iciciBalance, bobBalance, sbiBalance;
	int hdfcCreditCount, iciciCreditCount, bobCreditCount, sbiCreditCount;
	int hdfcDebitCount, iciciDebitCount, bobDebitCount, sbiDebitCount;
	static int totalDebitCount, totalCreditCount;

	public void credit(String bankName, int amount) {
		totalCreditCount++;
		switch (bankName.toLowerCase()) {
			case "icici":
				iciciBalance += amount;
				iciciCreditCount++;
				System.out.println("Amount credited in "+bankName+": "+amount+", Available Balance: "+iciciBalance);
				break;
			case "hdfc":
				hdfcBalance += amount;
				hdfcCreditCount++;
				System.out.println("Amount credited in "+bankName+": "+amount+", Available Balance: "+hdfcBalance);
				break;
			case "bob":
				bobBalance += amount;
				bobCreditCount++;
				System.out.println("Amount credited in "+bankName+": "+amount+", Available Balance: "+bobBalance);
				break;
			case "sbi":
				sbiBalance += amount;
				sbiCreditCount++;
				System.out.println("Amount credited in "+bankName+": "+amount+", Available Balance: "+sbiBalance);
				break;
			default:
				System.out.println("You don't have account in this bank. Please select valid bank");
		}
	}

	public void debit(String bankName, int amount) {
		boolean flag = false;
		switch (bankName.toLowerCase()) {
			case "icici":
				if (amount <= iciciBalance) {
					iciciBalance -= amount;
					iciciDebitCount++;
					System.out.println("Amount debited from "+bankName+": "+amount+", Available Balance: "+iciciBalance);
					flag = true;
				}
				break;
			case "hdfc":
				if (amount <= hdfcBalance) {
					hdfcBalance -= amount;
					hdfcDebitCount++;
					System.out.println("Amount debited from "+bankName+": "+amount+", Available Balance: "+hdfcBalance);
					flag = true;
				}
				break;
			case "bob":
				if (amount <= bobBalance) {
					bobBalance -= amount;
					bobDebitCount++;
					System.out.println("Amount debited from "+bankName+": "+amount+", Available Balance: "+bobBalance);
					flag = true;
				}
				break;
			case "sbi":
				if (amount <= sbiBalance) {
					sbiBalance -= amount;
					sbiDebitCount++;
					System.out.println("Amount debited from "+bankName+": "+amount+", Available Balance: "+sbiBalance);
					flag = true;
				}
				break;
			default:
				System.out.println("You don't have account in "+bankName+" bank. Please select valid bank");
		}
		if(flag)
			totalDebitCount++;
		else
			System.out.println("Insufficient balance in your " + bankName + " bank account");
	}

	public void showTotalBalance() {
		System.out.println("======================================================");
		System.out.println("Total balance of all bank accounts: "+(iciciBalance+hdfcBalance+bobBalance+sbiBalance));
		System.out.println("======================================================");
	}
	
	public void showTotalCreditDebit() {
		System.out.println("Total credit operation: "+totalCreditCount);
		System.out.println("Total debit operation: "+totalDebitCount);
		System.out.println("======================================================");
	}
	
	public void showIndividualCredit() {
		System.out.println("ICICI bank credit operation: "+iciciCreditCount);
		System.out.println("HDFC bank credit operation: "+hdfcCreditCount);
		System.out.println("BOB bank credit operation: "+bobCreditCount);
		System.out.println("SBI bank credit operation: "+sbiCreditCount);
		System.out.println("======================================================");
	}
	
	public void showIndividualDebit() {
		System.out.println("ICICI bank debit operation: "+iciciDebitCount);
		System.out.println("HDFC bank debit operation: "+hdfcDebitCount);
		System.out.println("BOB bank debit operation: "+bobDebitCount);
		System.out.println("SBI bank debit operation: "+sbiDebitCount);
	}
	
	
	public void bankOperations(String bankName, String operationType, int amount) {
		switch (operationType.toLowerCase()) {
		case "credit":
			credit(bankName, amount);
			break;
		case "debit":
			debit(bankName, amount);
			break;
		default:
			System.out.println("Invalid operation type. Please specify your operation type as 'debit' or 'credit'");
		}
	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.bankOperations("HDFC", "credit", 5000);
		bank.bankOperations("ICICI", "credit", 55800);
		bank.bankOperations("BOB", "credit", 5000);
		bank.bankOperations("sbi", "credit", 7000);
		bank.bankOperations("hdfc", "debit", 2100);
		bank.bankOperations("bob", "credit", 5000);
		bank.bankOperations("sbi", "debit", 1500);
		bank.bankOperations("bob", "credit", 5000);
		bank.bankOperations("bob", "debit", 25000);
		bank.bankOperations("hdfc", "debit", 500);
		bank.bankOperations("sbi", "debit", 300);
		
		bank.showTotalBalance();
		bank.showTotalCreditDebit();
		bank.showIndividualCredit();
		bank.showIndividualDebit();

	}

}
