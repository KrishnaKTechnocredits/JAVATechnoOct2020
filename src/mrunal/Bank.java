package mrunal;

public class Bank {

		int debitCnt,creditCnt,balanceCnt,currentBalance;
		static int totalDebitCnt,totalCreditCnt,totalBalanceCnt;

		void creditAmount(int creditAmt) {
			currentBalance=currentBalance + creditAmt;
			creditCnt++;
			totalCreditCnt++;	
		}
		void debitAmount(int debitAmt) {
			currentBalance = currentBalance - debitAmt;
			debitCnt++;
			totalDebitCnt++;
		}
		void printBalance(String name) {
			System.out.println("Current balance of  "+name+" :" + currentBalance);
			balanceCnt++;
			totalBalanceCnt++;
		}
		void individualTransactionSummary(String name) {
			System.out.println( name +" Transaction Summary:"+ "credit-" +creditCnt+ ", Debit-"+ debitCnt +", printBal-" + balanceCnt+"\n");
		}
		static void allTransactionSummary() {
			System.out.println( "All transaction summary :credit-" +totalCreditCnt+ ", Debit-"+ totalDebitCnt +", printBal-" + totalBalanceCnt);
		}

		public static void main(String[] args0) {
			Bank b = new Bank();
			b.creditAmount(7000);
			b.debitAmount(1000);
			b.printBalance("mrunal");
			b.creditAmount(450);
			b.printBalance("mrunal");
			b.creditAmount(5000);
			b.debitAmount(700);
			b.printBalance("mrunal");
			b.individualTransactionSummary("mrunal");

			Bank b1 = new Bank();
			b1.creditAmount(8000);
			b1.debitAmount(653);
			b1.debitAmount(500);
			b1.debitAmount(453);
			b1.printBalance("drishti");
			b1.individualTransactionSummary("drishti");

			allTransactionSummary();

		}
	}
