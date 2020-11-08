package tejashree;

public class Assignment9 {
		int creditCount;
		int debitCount;
	    double currentBalance;
		static int totalCreditCount;
		static int totalDebitCount;
		static int totalPrintBalCount;

		void setCurrentBal(double currentBal){
			currentBalance = currentBal;
		}

		void creditAmount(int creditAmount){
			currentBalance = currentBalance + creditAmount;
			creditCount++;
			totalCreditCount++;
		}

		void debitAmount(int debitAmountt){
			currentBalance = currentBalance - debitAmountt;
			debitCount++;
			totalDebitCount++;
		}

		void printBalance(){
			System.out.println("Current Balance is : " +currentBalance);
			totalPrintBalCount++;
		}
		
		void individualTransactionSummary(String userDetails){
			System.out.println("Individual transaction summary for "+userDetails);
			System.out.println();
			System.out.println(userDetails+ " credited "+creditCount+ " times in account");
			System.out.println(userDetails+ " debited "+debitCount+ " times in account");
		}

		void allTransactionSummary(){
			System.out.println("Overall transactions Summary");
			System.out.println();
			System.out.println(totalCreditCount+ " times amount was credited");
			System.out.println(totalDebitCount+ " times amount was debited");
			System.out.println(totalPrintBalCount+ " times current balance was printed");
		}

		public static void main(String[] args) {
			Assignment9 asgmt9 = new Assignment9();
			asgmt9.setCurrentBal(190000);
			asgmt9.creditAmount(10000);
			asgmt9.debitAmount(12000);
			asgmt9.individualTransactionSummary("User1");
			asgmt9.printBalance();
			System.out.println("--------------------------------");

			Assignment9 asgmt9_2 = new Assignment9();
			asgmt9_2.setCurrentBal(170000);
			asgmt9_2.creditAmount(3000);
			asgmt9_2.creditAmount(6000);
			asgmt9_2.creditAmount(9000);
			asgmt9_2.debitAmount(10000);
			asgmt9_2.debitAmount(900);
			asgmt9_2.individualTransactionSummary("User2");
			System.out.println("--------------------------------");
			Assignment9 summary = new Assignment9();
			summary.allTransactionSummary();
		}
}
