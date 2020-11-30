package monika;
public class Banking {

		int debitCount,creditCount,balanceCount,currentBalance;
		static int totalDebitCount,totalCreditCount,totalBalanceCount;

		void creditAmount(int creditAmount) {
			currentBalance=currentBalance + creditAmount;
			creditCount++;
			totalCreditCount++;	
		}
		void debitAmount(int debitAmount) {
			currentBalance = currentBalance - debitAmount;
			debitCount++;
			totalDebitCount++;
		}
		void printBalance(String name) {
			System.out.println("Current balance of  "+name+" :" + currentBalance);
			balanceCount++;
			totalBalanceCount++;
		}
		void individualTransactionSummary(String name) {
			System.out.println( name +" Transaction Summary:"+ "credit-" +creditCount+ ", Debit-"+ debitCount +", printBal-" + balanceCount+"\n");
		}
		static void allTransactionSummary() {
			System.out.println( "All transaction summary :credit-" +totalCreditCount+ ", Debit-"+ totalDebitCount +", printBal-" + totalBalanceCount);
		}

		public static void main(String[] args0) {
			Banking banking = new Banking();
			banking.creditAmount(10000);
			banking.debitAmount(1000);
			banking.printBalance("John");
			banking.creditAmount(100);
			banking.printBalance("john");
			banking.creditAmount(5000);
			banking.debitAmount(900);
			banking.printBalance("John");
			banking.individualTransactionSummary("john");

			Banking banking2 = new Banking();
			banking2.creditAmount(10000);
			banking2.debitAmount(900);
			banking2.debitAmount(800);
			banking2.debitAmount(700);
			banking2.printBalance("Mark");
			banking2.individualTransactionSummary("Mark");

			allTransactionSummary();

		}
	}