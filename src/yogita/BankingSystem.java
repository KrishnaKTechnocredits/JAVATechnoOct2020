package yogita;

class BankingSystem
{
	int debitdAmntCnt;
	int creditAmntCnt;
	int balanaceCnt;
	int currenBalance;
  
	static int totalCreditCnt;
	static int totalDebitCnt;
	static int totalBalnceCnt;

  void creditAmount(int creditAmt) {
	  currenBalance=currenBalance+creditAmt;
	  creditAmntCnt++;
	  totalCreditCnt++;
  }
  void debitAmount(int debitAmt) {
	  currenBalance=currenBalance-debitAmt;
	  debitdAmntCnt++;
	  totalDebitCnt++;
  }
  void printBalance(String name) {
      System.out.println( "Current Balance Of :" +name+ ":"+currenBalance);
	  balanaceCnt++;
	  totalBalnceCnt++;
  }
  void transactionSummaryIndividual(String name) {
      System.out.println(name + " Transaction Summary :"+ " Credit: " +creditAmntCnt+ " Debit: " +debitdAmntCnt+ " BalancePrint " + balanaceCnt);
  }
  static void totalTrasanctionSummary(){
	  System.out.println("All TransactionSummary :" + " Total Credit :" + totalCreditCnt+  " Total Debit: " + totalDebitCnt+ " Total BalancePrint: " + totalBalnceCnt);
  }
  
public static void main(String [] arr){

	  BankingSystem bankingSystem1 =  new BankingSystem();
	  bankingSystem1.creditAmount(3000);
	  bankingSystem1.debitAmount(500);
	  bankingSystem1.creditAmount(4000);
      bankingSystem1.printBalance("User1");
      bankingSystem1.transactionSummaryIndividual("User1");
	  
	  BankingSystem bankingSystem2 = new BankingSystem();
	  bankingSystem2.creditAmount(4000);
	  bankingSystem2.debitAmount(2000);
	  bankingSystem2.creditAmount(1000);
	  bankingSystem2.debitAmount(500);
	  bankingSystem2.creditAmount(1000);
	  bankingSystem2.creditAmount(400);
	  bankingSystem2.creditAmount(800);
	  bankingSystem2.transactionSummaryIndividual("User2");
	  totalTrasanctionSummary();
	  
  }
}
  