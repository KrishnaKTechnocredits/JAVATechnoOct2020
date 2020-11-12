package dhara;

public class BankSystem {
	
	int debitCounter, creditCounter, printBalCounter;
	String customerName;

	static int totalDebitCounter, totalCreditCounter, totalBalPrintCounter;

	void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	void debitAmount() {
		debitCounter++;
		totalDebitCounter++;
	}

	void creditAmount() {
		creditCounter++;
		totalCreditCounter++;
	}

	void printBalance() {
		printBalCounter++;
		totalBalPrintCounter++;
	}

	void individualTransactionSummary() {
		System.out.println("Transaction Summary of -  " + customerName);
		System.out.println("Credit Amount : " + creditCounter + " times, Debit Amount :" + debitCounter + " times, Print Balance : " + printBalCounter + " times");
	}

	static void allTransactionSummary() {
		System.out.println("Overall Transaction Summary - ");
		System.out.println("Credit Amount : " + totalCreditCounter + " times, Debit Amount : " + totalDebitCounter + " times, Print Balance : " + totalBalPrintCounter + " times");

	}

	public static void main(String[] args) {
		BankSystem customer1 = new BankSystem();
		customer1.setCustomerName("Dhara");
		customer1.creditAmount();
		customer1.debitAmount();
		customer1.creditAmount();
		customer1.printBalance();
		customer1.individualTransactionSummary();

		BankSystem customer2 = new BankSystem();
		customer2.setCustomerName("Krishna");
		customer2.creditAmount();
		customer2.creditAmount();
		customer2.creditAmount();
		customer2.creditAmount();
		customer2.creditAmount();
		customer2.debitAmount();
		customer2.debitAmount();
		customer2.individualTransactionSummary();

		allTransactionSummary();

	}
}
