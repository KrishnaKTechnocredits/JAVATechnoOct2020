package anurag;

public class Bank3 {

	int debitamount;
	int totalamount;
	int currentamount;
	int creditamount;
	int counter1;
	int counter2;
	int counter3;
	static int counter4;
	static int counter5;
	static int counter6;

	void debit(int debitamount) {

		this.debitamount = debitamount;
		currentamount = totalamount - debitamount;
		counter1 += 1;
		counter4 += 1;
	}

	void credit(int creditamount) {

		this.creditamount = creditamount;
		currentamount = currentamount + creditamount;
		counter2 += 1;
		counter5 += 1;
	}

	void printbalance(String user) {

		System.out.println(user + " current balance is :" + currentamount);
		counter3 += 1;
		counter6 += 1;
	}

	void IndividualTransactionSummary(String user) {
		System.out.println(user + " transaction summary: Credit - " + counter2 + " times, Debit - " + counter1
				+ " times, print balance - " + counter3 + " times");

	}

	void allTransactionsSummary() {
		System.out.println("All transaction summary: Credit - " + counter5 + " times, Debit - " + counter4
				+ " times, print balance - " + counter6 + " times");

	}

	public static void main(String[] args) {

		String user1 = "Anurag";
		String user2 = "Komal";

		Bank3 bank31 = new Bank3();
		Bank3 bank32 = new Bank3();
		bank31.debit(500);
		bank31.credit(10000);
		bank31.credit(20000);
		bank31.printbalance(user1);
		bank31.IndividualTransactionSummary(user1);
		bank32.debit(100);
		bank32.credit(200);
		bank32.credit(200);
		bank32.credit(200);
		bank32.credit(200);
		bank32.credit(200);
		bank32.printbalance(user2);
		bank32.IndividualTransactionSummary(user2);
		bank32.allTransactionsSummary();

	}

}
