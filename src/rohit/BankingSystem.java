
package rohit;

public class BankingSystem {
	int currentbalance;
	int debitamount;
	int creditamount;
	static int alldebit;
	static int allcredit;
	static int allprintbalance;

	void currentbalance(int balance) {
		currentbalance = balance;
	}

	void debitamount(int debit) {
		currentbalance = currentbalance - debit;
		debitamount++;
		alldebit++;
	}

	void creditamount(int credit) {
		currentbalance = currentbalance + credit;
		creditamount++;
		allcredit++;
	}

	void printbalance() {

		System.out.println("Current Balance= " + currentbalance);
		allprintbalance++;
	}

	void individualtranssactionsummary() {
		System.out.println("Individual transaction======");
		System.out.println("Debit transaction summary :" + debitamount);
		System.out.println("Credit transaction summary :" + creditamount);
	}

	static void alltransactionsummary() {
		System.out.println("All transaction======");
		System.out.println("Debit transaction summary :" + alldebit);
		System.out.println("Credit transaction summary :" + allcredit);
		System.out.println("Print Balance transaction summary :" + allprintbalance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankingSystem user1 = new BankingSystem();
		System.out.println("User1 transaction======");
		user1.currentbalance(25000);
		user1.debitamount(5000);
		user1.creditamount(1200);
		user1.debitamount(500);
		user1.creditamount(200);
		user1.individualtranssactionsummary();
		user1.printbalance();

		BankingSystem user2 = new BankingSystem();
		System.out.println("User2 transaction======");
		user2.currentbalance(25000);
		user2.debitamount(6000);
		user2.creditamount(3000);
		user2.debitamount(900);
		user2.creditamount(100);
		user2.individualtranssactionsummary();
		user2.printbalance();
		alltransactionsummary();

	}

}
