package prem;

// Assignment 9 : 31st Oct 2020 
// Create a Banking System which has the following functionality.

/*Create two object to perform below scenario.
1) Method to debit amount
2) Method to credit amount
3) Method to printBalance [it will print current balance]
4) individualTransactionSummary() method should show how many times individually debit, credit & printBalance method called .
Hint : Create 3 non static instance variable.
Output:
user1 transaction summary : Credit - 2 times, Debit - 1 times, printBalance - 1 time
user2 transaction summary : Credit - 5 times, Debit - 2 times, printBalance - 0 time

5) allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called.
Hint : Create 3 static variables will be required.
Output:
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time
*/


public class BankSys {
		
		int currentBalance;
		
		int creditCount;
		
		int debitCount;
		
		static int totalCreditCount;
		
		static int totalDebitCount;
		
		static int totalPrintBalCount;
		
		void setCurrentBal(int currentBal){
			
			currentBalance = currentBal;
		}
		
		void creditAmount(int creditAmt){
			
			currentBalance = currentBalance + creditAmt;
			
			creditCount++;
			
			totalCreditCount++;
		}
		
		void debitAmount(int debitAmt){
			
			currentBalance = currentBalance - debitAmt;
			
			debitCount++;
			
			totalDebitCount++;
		}
		
		void printBalance(){
			
			System.out.println("Current Balance is : " +currentBalance);
			
			totalPrintBalCount++;
			
			System.out.println("");
		}
		
		void individualTransactionSummary(String user){
			
			System.out.println("----Individual transaction summary -----");
			
			System.out.println(user+ " credited amount "+creditCount+ " times in account");
			
			System.out.println(user+ " debited amount "+debitCount+ " times in account");
		}
		
		void allTransactionSummary(){
			
			System.out.println("");
			
			System.out.println("---- All Transaction Summary ----");
			
			System.out.println("Total "+totalCreditCount+ " times amount was credited");
			
			System.out.println("Total "+totalDebitCount+ " times amount was debited");
			
			System.out.println("Total "+totalPrintBalCount+ " time current balance was printed");
			
			System.out.println("");
		}
		
		public static void main(String[] args) {
			
			BankSys bankSys = new BankSys();
			
			bankSys.setCurrentBal(90000);
			
			bankSys.creditAmount(5000);
			
			bankSys.creditAmount(1000);
			
			bankSys.debitAmount(2000);
			
			bankSys.individualTransactionSummary("User1");
			
			bankSys.printBalance();
			
			BankSys bankSysSupport = new BankSys();
			
			bankSysSupport.setCurrentBal(70000);
			
			bankSysSupport.creditAmount(3000);
			
			bankSysSupport.creditAmount(3000);
			
			bankSysSupport.creditAmount(3000);
			
			bankSysSupport.creditAmount(3000);
			
			bankSysSupport.creditAmount(3000);
			
			bankSysSupport.debitAmount(1000);
			
			bankSysSupport.debitAmount(1000);
			
			bankSysSupport.individualTransactionSummary("User2");
			
			BankSys bankSysReport = new BankSys();
			
			bankSysReport.allTransactionSummary();
			
		}
	}

	