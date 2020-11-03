package prasad;

class Bankingsystem {
	
	double accountbalance ;
	double debitamount;
	double creditamount;
	int debitcount;
	int creditcount;
	int printbalance;
	String name;
	static int totaldebitcount;
	static int totalcreditcount;
	static int totalprintbalancecount;
	
	void setusername(String name) {
		this.name=name;
	}
	
	void creditamt(double amt) {
		creditamount= creditamount+ amt;
		accountbalance = accountbalance+amt;
		creditcount++;
		totalcreditcount++;
	}
	
	void debitamt(double amt) {
		if(accountbalance<amt) {
			System.out.println(name+"'s "+ "debit transaction failed due to insufficient account balance," + "current balance is " + "Rs " + accountbalance + "/-");
		}
		else {
			accountbalance = accountbalance-amt;
			debitcount++;
			totaldebitcount++;
			debitamount=debitamount+amt;
		}	
	}
	
	void individualTransactionSummary() {
		System.out.print(name+"'s "+ "account summary: ");
		System.out.println("Credit:- " + creditcount+ " times " + "; Debit:- " + debitcount+ " times " + "; Print Balance:- " + printbalance + " times");
		System.out.println("Credit amount: " + "Rs "+ creditamount+"/-" + " ; Debit amount: " + "Rs " + debitamount + "/-");
	}
	
	void printbalance() {
		System.out.println(name+"'s " + "account balance:- " + "Rs " + accountbalance + "/-");
		printbalance++;
		totalprintbalancecount++;
	}
	
    static void allTransactionSummary() {
		System.out.println("****Printing transaction summary for all users****");
		System.out.println("Total credit transactions by all users: " + totalcreditcount);
		System.out.println("Total debit transactions by all users: " + totaldebitcount );
		System.out.println("Total print balance transactions by all users: " + totalprintbalancecount);
	}
	
	public static void main (String[]arg) {
		Bankingsystem user1 = new Bankingsystem();
		Bankingsystem user2 = new Bankingsystem();
		user1.setusername("Tim");
		user1.creditamt(52340);
		user1.creditamt(87940);
		user1.debitamt(2000000);
		user1.printbalance();
		user1.individualTransactionSummary();
		user2.setusername("Alice");
		user2.creditamt(14000);
		user2.creditamt(18957);
		user2.creditamt(745);
		user2.creditamt(981);
		user2.creditamt(250957);
		user2.debitamt(5000);
		user2.printbalance();
		user2.individualTransactionSummary();
		Bankingsystem.allTransactionSummary() ;
	}

}
