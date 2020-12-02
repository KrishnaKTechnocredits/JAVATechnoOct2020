package technoCredits;

public class BankSwitch {
	static int iBal, sBal, hBal, kBal, totalBalance;
	static int iDebitCount, sDebitCount, hDebitCount, kDebitCount, iCreditCount, sCreditCount, hCreditCount, kCreditCount;

	void bankCredit(String bankName, int amount) {
		switch(bankName){
			case "ICICI":
				iBal+=amount;
				iCreditCount++;
				System.out.println("Amount Rs."+amount+" Credited in ICICI account, Now total balance is Rs."+iBal);
				break;
			case "HDFC":
				hBal+=amount;
				hCreditCount++;
				System.out.println("Amount Rs."+amount+" Credited in HDFC account, Now total balance is Rs."+hBal);
				break;
			case "SBI":
				sBal+=amount;
				sCreditCount++;
				System.out.println("Amount Rs."+amount+" Credited in SBI account, Now total balance is Rs."+sBal);
				break;
			case "KOTAK":
				kBal+=amount;
				kCreditCount++;
				System.out.println("Amount Rs."+amount+" Credited in KOTAK account, Now total balance is Rs."+kBal);
				break;
			default:
				System.out.println("Please enter amount more then Zero, Thank You..!!");
		}
	}
	void bankDebit(String bankName, int amount) {
		switch(bankName) {
			case "ICICI":
					if(amount<=iBal) {
						iBal-=amount;
						iDebitCount++;
						System.out.println("Amount Debited from ICICI Account is Rs."+amount+", Now Current Balance is Rs."+iBal);
					}		
					else
						System.out.println("Insufficient Balance, Current Balance in ICICI Account is Rs."+iBal);
					break;
			case "HDFC":
					if(amount<=hBal) {
						hBal-=amount;
						hDebitCount++;
						System.out.println("Amount Debited from HDFC Account is Rs."+amount+", Now Current Balance is Rs."+hBal);
					}		
					else
						System.out.println("Insufficient Balance, Current Balance in HDFC Account is Rs."+hBal);
					break;
			case "SBI":
					if(amount<=sBal) {
						sBal-=amount;
						sDebitCount++;
						System.out.println("Amount Debited from SBI Account is Rs."+amount+", Now Current Balance is Rs."+sBal);
					}		
					else
						System.out.println("Insufficient Balance, Current Balance in SBI Account is Rs."+sBal);
					break;
			case "KOTAK":
				if(amount<=kBal) {
					kBal-=amount;
					kDebitCount++;
					System.out.println("Amount Debited from KOTAK Account is Rs."+amount+", Now Current Balance is Rs."+kBal);
				}		
				else
					System.out.println("Insufficient Balance, Current Balance in KOTAK Account is Rs."+kBal);
				break;
			default: 
				System.out.println("Operation Aborted..Enter Valid details, Please..!!");
		}
	}
	void individualBankDebitOperations(String bankName) {
		switch(bankName) {
		case "ICICI":
			System.out.println("Total No. of Debit Operations in ICICI Bank account is "+iDebitCount);
			break;
		case "HDFC":
			System.out.println("Total No. of Debit Operations in HDFC Bank account is "+hDebitCount);
			break;
		case "SBI":
			System.out.println("Total No. of Debit Operations in SBI Bank account is "+sDebitCount);
			break;
		case "KOTAK":
			System.out.println("Total No. of Debit Operations in KOTAK Bank account is "+kDebitCount);
			break;
		default:
			System.out.println("Please enter valid details.");
		}
	}
	void individualBankCreditOperations(String bankName) {
		switch(bankName) {
			case "ICICI":
				System.out.println("Total No. of Credit Operations in ICICI Bank account is "+iCreditCount);
				break;
			case "HDFC":
				System.out.println("Total No. of Credit Operations in HDFC Bank account is "+hCreditCount);
				break;
			case "SBI":
				System.out.println("Total No. of Credit Operations in SBI Bank account is "+sCreditCount);
				break;
			case "KOTAK":
				System.out.println("Total No. of Credit Operations in KOTAK Bank account is "+kCreditCount);
				break;
			default:
				System.out.println("Please enter valid details.");
		}
	}
	void totalDebitCreditOperaions(String bankName) {
		switch(bankName) {
			case "ICICI":
				System.out.println("Total No. of Debit Operations in ICICI Bank account is "+iDebitCount+" & Total No. of Credit Operations in ICICI Bank account is "+iCreditCount);
				break;
			case "HDFC":
				System.out.println("Total No. of Debit Operations in HDFC Bank account is "+hDebitCount+" & Total No. of Credit Operations in HDFC Bank account is "+hCreditCount);
				break;
			case "SBI":
				System.out.println("Total No. of Debit Operations in SBI Bank account is "+sDebitCount+" & Total No. of Credit Operations in SBI Bank account is "+sCreditCount);
				break;
			case "KOTAK":
				System.out.println("Total No. of Debit Operations in KOTAK Bank account is "+kDebitCount+" & Total No. of Credit Operations in KOTAK Bank account is "+kCreditCount);
				break;
			default:
				System.out.println("Please enter valid details.");
		}
	}
	void totalBalance() {
		totalBalance = iBal + sBal + hBal + kBal;
		System.out.println("Total Balance in all Accounts is Rs."+totalBalance);
	}
	void bankOperations(String bankName, String operation, int amount) {
		switch(operation) {
			case "credit":
				bankCredit(bankName,amount);
				break;
			case "debit":
				bankDebit(bankName,amount);
				break;
			case "printBalance":
				totalBalance();
				break;
			default :
				System.out.println("Invalid choice");
		}
	}
	public static void main(String[] args) {
		BankSwitch bank=new BankSwitch();
		bank.bankOperations("ICICI", "credit", 2000);
		bank.bankOperations("ICICI", "debit", 500);
		bank.bankOperations("SBI", "credit", 2500);
		bank.bankOperations("SBI", "debit", 100);
		bank.bankOperations("SBI", "debit", 1000);
		bank.bankOperations("HDFC", "credit", 1000);
		bank.bankOperations("HDFC", "credit", 500);
		bank.bankOperations("HDFC", "debit", 200);
		bank.bankOperations("KOTAK", "credit", 100);
		bank.bankOperations("KOTAK", "debit", 200);
		bank.totalDebitCreditOperaions("ICICI");
		bank.totalDebitCreditOperaions("SBI");
		bank.totalDebitCreditOperaions("HDFC");
		bank.totalDebitCreditOperaions("KOTAK");
		bank.individualBankCreditOperations("ICICI");
		bank.individualBankDebitOperations("ICICI");
		bank.individualBankCreditOperations("SBI");
		bank.individualBankDebitOperations("SBI");
		bank.individualBankCreditOperations("HDFC");
		bank.individualBankDebitOperations("HDFC");
		bank.individualBankCreditOperations("KOTAK");
		bank.individualBankDebitOperations("KOTAK");
		bank.totalBalance();
	}
}
