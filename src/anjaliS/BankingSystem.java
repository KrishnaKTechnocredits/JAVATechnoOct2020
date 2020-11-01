package anjaliS;

public class BankingSystem
  {
	  int debitdAmtCnt;
	  int creditAmtCnt;
	  int balanceCnt;
	  int currentBalance;
	  
	  static int totalCreditCnt;
	  static int totalDebitCnt;
	  static int totalBalanceCnt;

	   void creditAmount(int creditAmt)
	  {
	      currentBalance=currentBalance+creditAmt;
		   creditAmtCnt++;
		   totalCreditCnt++;
      }
	    void debitAmount(int debitAmt)
	  {  
		  currentBalance=currentBalance-debitAmt;
		  debitdAmtCnt++;
		  totalDebitCnt++;
	  }
	  
	   void printBalance(String name)
	  {
	    System.out.println( "Current Balance Of " +name+ ":"+currentBalance);
		 balanceCnt++;
		 totalBalanceCnt++;
	  }
	   void transactionSummaryIndividual(String name)
	  {
		System.out.println(name + " Transaction Summary :"+ " Credit: " +creditAmtCnt+ " Debit: " +debitdAmtCnt+ " BalancePrint " + balanceCnt);
	  }
	  
	   static void totalTrasanctionSummary()
	  {
	    System.out.println("All TransactionSummary :" + " Total Credit :" + totalCreditCnt+  " Debit: " + totalDebitCnt+ " balancePrint: " + totalBalanceCnt);
      }
	  
	   public static void main(String [] arr)
	  {
		  BankingSystem bankingSystem =  new BankingSystem();
		  bankingSystem.creditAmount(2200);
		  bankingSystem.debitAmount(500);
		  bankingSystem.printBalance("User1");
		  
		  bankingSystem.creditAmount(5500);
		  bankingSystem.printBalance("User1");
		  bankingSystem.debitAmount(500);
		  bankingSystem.debitAmount(1000);
		  bankingSystem.printBalance("User1");
		
		  bankingSystem.transactionSummaryIndividual("User1");
		  
		  BankingSystem bankingSystem1 = new BankingSystem();
		  bankingSystem1.creditAmount(2000);
		  bankingSystem1.debitAmount(2500);
		  bankingSystem1.printBalance("User2");

		  bankingSystem1.debitAmount(200);
		   bankingSystem1.printBalance("User2");
		  bankingSystem1.creditAmount(1500);
		  bankingSystem1.printBalance("User2");
		  
		  bankingSystem1.transactionSummaryIndividual("User2");
		   totalTrasanctionSummary();
		  
		}

	}