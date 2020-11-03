package priyanka;

public class BankSystem {
		int balance;
		static int totalCredit;
		static int totalDebit;
		static int totalPrintBalance;
		int credit;
		int debit;
		int printBal;

		void debitAmount(int debitAmount) {

			if(debitAmount <= balance) {
			balance = balance - debitAmount;
			System.out.println("The Debited amount is :" + debitAmount+ " and current Balance is :" + balance);
			debit++;
			totalDebit++;
			}
			else
				System.out.println("The user want to debit "+debitAmount+ ", Insufficiant balance" + " current balance is "+balance);
		}

		void creditAmount(int creditAmount) {

			balance = balance + creditAmount;
			System.out.println("The Credited amount is :" + creditAmount+" and current Balance is :" + balance);
			credit++;
			totalCredit++;
		}

		void printBalance() {
			printBal++;
			totalPrintBalance++;
			individualTransaction();
		}

		void individualTransaction() {
			System.out.println("Transaction summary is: ");
			System.out.println(
					" Credit " + credit + " times " + " Debit " + debit + " times " + " Print " + printBal + " times ");

		}

		static void allTransactionSummary() {

			System.out.println(" All Transaction summary is: ");
			System.out.println(" Credit " + totalCredit + " times " + " Debit " + totalDebit + " times " + " Print "
					+ totalPrintBalance + " times ");

		}

		public static void main(String[] arg) {

			BankSystem bankSystem1 = new BankSystem();
			bankSystem1.creditAmount(1000);
			bankSystem1.debitAmount(5000);
			bankSystem1.creditAmount(2000);
			bankSystem1.debitAmount(500);
			bankSystem1.creditAmount(200);
			bankSystem1.printBalance();
			System.out.println("User1");
			System.out.println("****************************************************");

			BankSystem bankSystem2 = new BankSystem();
			bankSystem2.creditAmount(5000);
			bankSystem2.debitAmount(500);
			bankSystem2.creditAmount(2000);
			bankSystem2.printBalance();
			System.out.println("User2");
			System.out.println("****************************************************");
			allTransactionSummary();

		}
	}

