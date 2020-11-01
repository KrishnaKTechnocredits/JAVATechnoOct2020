package prasad;

public class Bankingsystem {
	
	int accountbalance ;
	int debitamount;
	int creditamount;
	int debitcount;
	int creditcount;
	int printbalance;
	static int totaldebitcount;
	static int totalcreditcount;
	static int totalprintbalancecount;
	
	void creditamt(int amt) {
		creditamount= creditamount+ amt;
		accountbalance = accountbalance+amt;
		creditcount++;
		totalcreditcount++;
	}
	
	void debitamt(int amt) {
		debitamount=debitamount+amt;
		accountbalance = accountbalance-amt;
		debitcount++;	
		totaldebitcount++;
	}
	
	void individualTransactionSummary() {
		System.out.println("Credit:- " + creditcount+ " times " + "; Debit:- " + debitcount+ " times " + "; Print Balance:- " + printbalance + " times");
		System.out.println(" Credit amount: " + "Rs "+ creditamount+"/-" + " ; Debit amount: " + "Rs " + debitamount + "/-");
	}
	
	void printbalance() {
		System.out.println("account balance:-" + "Rs " + accountbalance + "/-");
		printbalance++;
		totalprintbalancecount++;
	}
	
    static void allTransactionSummary() {
		System.out.println("****Printing transaction summery for all users****");
		System.out.println("Total credit transactions by all users: " + totalcreditcount);
		System.out.println("Total debit transactions by all users: " + totaldebitcount );
		System.out.println("Total print balance transactions by all users: " + totalprintbalancecount);
	}
	
	public static void main (String[]arg) {
		Bankingsystem user1 = new Bankingsystem();
		Bankingsystem user2 = new Bankingsystem();
		user1.creditamt(52340);
		user1.creditamt(87940);
		user1.debitamt(5000);
		System.out.print("Printing user1 ");
		user1.printbalance();
		System.out.print("User1 transaction summery: ");
		user1.individualTransactionSummary();
		user2.creditamt(14000);
		user2.creditamt(18957);
		user2.creditamt(745);
		user2.creditamt(981);
		user2.creditamt(250957);
		user2.debitamt(5000);
		System.out.print("Printing user2 ");
		user2.printbalance();
		System.out.print("User2 transaction summery: ");
		user2.individualTransactionSummary();
		allTransactionSummary() ;
	}

}
