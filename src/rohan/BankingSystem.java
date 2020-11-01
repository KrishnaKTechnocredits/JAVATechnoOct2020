package rohan;

public class BankingSystem {

		static int totalBalance;
		int creditCount;
		int debitCount;
		int printBalCount;
		
		static int allCreditCount;
		static int allDebitCount;
		static int allPrintBalCount;
				
		void setBalance(int totalBal) {
			totalBalance = totalBal;
		}
		
		void debitAmount(int amountToBeDebited) {
			debitCount+=1;
			allDebitCount+=1;
			totalBalance = totalBalance - amountToBeDebited;
		}
		
		void creditAmount(int amountToBeCredited) {
			creditCount+=1;
			allCreditCount+=1;
			totalBalance = totalBalance + amountToBeCredited;
		}
		
		void printBalance() {
			printBalCount+=1;
			allPrintBalCount+=1;
			System.out.println("Current Balance " +totalBalance+ "Rupees");
		}
		
		void individualTransactionSummary(String User) {
			System.out.print(User+"'s Transaction Summary: ");
			System.out.println("Credits: "+creditCount+" times"+" Debits: "+debitCount+" times"+" Print Balance:"+printBalCount+" times");
		}
		
		static void allTransactionSummary() {
			System.out.print("All Transaction Summary: ");
			System.out.println("Credits: "+allCreditCount+" times"+" Debits: "+allDebitCount+" times"+" Print Balance:"+allPrintBalCount+" times");
		}
		
		public static void main(String[] a) {
			BankingSystem bankingSystemUsr1 = new BankingSystem();
			bankingSystemUsr1.setBalance(50000);
			bankingSystemUsr1.debitAmount(20000);
			bankingSystemUsr1.printBalance();
			bankingSystemUsr1.debitAmount(10000);
			bankingSystemUsr1.printBalance();
			bankingSystemUsr1.debitAmount(5000);
			bankingSystemUsr1.printBalance();
			bankingSystemUsr1.creditAmount(1500);
			bankingSystemUsr1.individualTransactionSummary("Rohan");
			
			BankingSystem bankingSystemUsr2 = new BankingSystem();
			bankingSystemUsr2.setBalance(50000);
			bankingSystemUsr2.debitAmount(20000);
			bankingSystemUsr2.printBalance();
			bankingSystemUsr2.creditAmount(5000);
			bankingSystemUsr2.printBalance();
			bankingSystemUsr2.individualTransactionSummary("Vaibhav");
			
			allTransactionSummary();
		}
}
