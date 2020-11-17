package surbhi;
import java.util.Scanner;

public class BankingOperation {

	static int iBal, sBal, hBal, kBal, totalBal;
	static int iDebitCnt, sDebitCnt, hDebitCnt, kDebitCnt, iCreditCnt, sCreditCnt, hCreditCnt, kCreditCnt;

	void bankCredit(String bankName, int amount) {
		switch (bankName) {
		case "ICICI":
			iBal += amount;
			iCreditCnt++;
			System.out.println("Amount Rs." + amount + " Credited in ICICI account, Now total balance " + iBal);
			break;
		case "HDFC":
			hBal += amount;
			hCreditCnt++;
			System.out.println("Amount Rs." + amount + " Credited in HDFC account, Now total balance " + hBal);
			break;
		case "SBI":
			sBal += amount;
			sCreditCnt++;
			System.out.println("Amount Rs." + amount + " Credited in SBI account, Now total balance " + sBal);
			break;
		case "KOTAK":
			kBal += amount;
			kCreditCnt++;
			System.out.println("Amount Rs." + amount + " Credited in KOTAK account, Now total balance " + kBal);
			break;
		default:
			System.out.println("Please enter amount more then Zero, Thank You..!!");
		}
	}

	void bankDebit(String bankName, int amount) {
		switch (bankName) {
		case "ICICI":
			if (amount <= iBal) {
				iBal -= amount;
				iDebitCnt++;
				System.out.println("Amount Debited from ICICI Account " + amount + ", Now Current Balance " + iBal);
			} else
				System.out.println("Insufficient Balance, Current Balance in ICICI Account " + iBal);
			break;
		case "HDFC":
			if (amount <= hBal) {
				hBal -= amount;
				hDebitCnt++;
				System.out
						.println("Amount Debited from HDFC Account is Rs." + amount + ", Now Current Balance " + hBal);
			} else
				System.out.println("Insufficient Balance, Current Balance in HDFC Account " + hBal);
			break;
		case "SBI":
			if (amount <= sBal) {
				sBal -= amount;
				sDebitCnt++;
				System.out.println("Amount Debited from SBI Account " + amount + ", Now Current Balance " + sBal);
			} else
				System.out.println("Insufficient Balance, Current Balance in SBI Account " + sBal);
			break;
		case "KOTAK":
			if (amount <= kBal) {
				kBal -= amount;
				kDebitCnt++;
				System.out.println("Amount Debited from KOTAK Account " + amount + ", Now Current Balance " + kBal);
			} else
				System.out.println("Insufficient Balance, Current Balance in KOTAK Account " + kBal);
			break;
		default:
			System.out.println("Operation Aborted..Enter Valid details, Please..!!");
		}
	}

	void individualBankDebitOperations(String bankName) {
		switch (bankName) {
		case "ICICI":
			System.out.println("Total No. of Debit Operations in ICICI Bank account " + iDebitCnt);
			break;
		case "HDFC":
			System.out.println("Total No. of Debit Operations in HDFC Bank account " + hDebitCnt);
			break;
		case "SBI":
			System.out.println("Total No. of Debit Operations in SBI Bank account " + sDebitCnt);
			break;
		case "KOTAK":
			System.out.println("Total No. of Debit Operations in KOTAK Bank account " + kDebitCnt);
			break;
		default:
			System.out.println("Please enter valid details.");
		}
	}

	void individualBankCreditOperations(String bankName) {
		switch (bankName) {
		case "ICICI":
			System.out.println("Total No. of Credit Operations in ICICI Bank account " + iCreditCnt);
			break;
		case "HDFC":
			System.out.println("Total No. of Credit Operations in HDFC Bank account  " + hCreditCnt);
			break;
		case "SBI":
			System.out.println("Total No. of Credit Operations in SBI Bank account " + sCreditCnt);
			break;
		case "KOTAK":
			System.out.println("Total No. of Credit Operations in KOTAK Bank account " + kCreditCnt);
			break;
		default:
			System.out.println("Please enter valid details.");
		}
	}

	void totalDebitCreditOperaions(String bankName) {
		switch (bankName) {
		case "ICICI":
			System.out.println("Total No. of Debit Operations in ICICI Bank account  " + iDebitCnt
					+ " & Total No. of Credit Operations in ICICI Bank account  " + iCreditCnt);
			break;
		case "HDFC":
			System.out.println("Total No. of Debit Operations in HDFC Bank account " + hDebitCnt
					+ " & Total No. of Credit Operations in HDFC Bank account  " + hCreditCnt);
			break;
		case "SBI":
			System.out.println("Total No. of Debit Operations in SBI Bank account  " + sDebitCnt
					+ " & Total No. of Credit Operations in SBI Bank account  " + sCreditCnt);
			break;
		case "KOTAK":
			System.out.println("Total No. of Debit Operations in KOTAK Bank account  " + kDebitCnt
					+ " & Total No. of Credit Operations in KOTAK Bank accountis " + kCreditCnt);
			break;
		default:
			System.out.println("Please enter valid details.");
		}
	}

	void totalBalance() {
		totalBal = iBal + sBal + hBal + kBal;
		System.out.println("Total Balance in all Accounts " + totalBal);
	}

	void bankOperations(String bankName, String operation, int amount) {
		switch (operation) {
		case "credit":
			bankCredit(bankName, amount);
			break;
		case "debit":
			bankDebit(bankName, amount);
			break;
		case "printBalance":
			totalBalance();
			break;
		}
	}

	public static void main(String[] args) {
		BankingOperation bankingOperation = new BankingOperation();
		bankingOperation.bankOperations("ICICI", "credit", 5000);
		bankingOperation.bankOperations("ICICI", "debit", 300);
		bankingOperation.bankOperations("SBI", "credit", 3500);
		bankingOperation.bankOperations("SBI", "debit", 50);
		bankingOperation.bankOperations("SBI", "debit", 100);
		bankingOperation.bankOperations("HDFC", "credit", 100);
		bankingOperation.bankOperations("HDFC", "credit", 400);
		bankingOperation.bankOperations("HDFC", "debit", 100);
		bankingOperation.bankOperations("KOTAK", "credit", 50);
		bankingOperation.bankOperations("KOTAK", "debit", 100);
		bankingOperation.totalDebitCreditOperaions("ICICI");
		bankingOperation.totalDebitCreditOperaions("SBI");
		bankingOperation.totalDebitCreditOperaions("HDFC");
		bankingOperation.totalDebitCreditOperaions("KOTAK");
		bankingOperation.individualBankCreditOperations("ICICI");
		bankingOperation.individualBankDebitOperations("ICICI");
		bankingOperation.individualBankCreditOperations("SBI");
		bankingOperation.individualBankDebitOperations("SBI");
		bankingOperation.individualBankCreditOperations("HDFC");
		bankingOperation.individualBankDebitOperations("HDFC");
		bankingOperation.individualBankCreditOperations("KOTAK");
		bankingOperation.individualBankDebitOperations("KOTAK");
		bankingOperation.totalBalance();
	}
}
