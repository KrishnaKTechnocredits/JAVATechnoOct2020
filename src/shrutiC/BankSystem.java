package shrutiC;

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
		System.out.println("Current balance is : ");
	}

	void individualTransactionSummary() {

		System.out.println("\nTransaction Summary for :- " + customerName);
		System.out.println("Amount credited : " + creditCounter + " times");
		System.out.println("Amount debited : " + debitCounter + " times");
		System.out.println("Balance printed : " + printBalCounter + " times");

	}

	static void allTransactionSummary() {

		System.out.println("\nOverall Transaction Summary :- ");

		System.out.println("Amount credited : " + totalCreditCounter + " times");
		System.out.println("Amount debited : " + totalDebitCounter + " times");
		System.out.println("Balance printed : " + totalBalPrintCounter + " times");

	}

	public static void main(String[] args) {
		BankSystem customer1 = new BankSystem();
		customer1.setCustomerName("Shruti");
		customer1.creditAmount();
		customer1.debitAmount();
		customer1.creditAmount();
		customer1.printBalance();
		customer1.individualTransactionSummary();

		BankSystem customer2 = new BankSystem();
		customer2.setCustomerName("Chavan");
		customer2.creditAmount();
		customer2.creditAmount();
		customer2.creditAmount();
		customer2.creditAmount();
		customer2.debitAmount();
		customer2.debitAmount();
		customer2.creditAmount();
		customer2.individualTransactionSummary();

		allTransactionSummary();

	}

}
