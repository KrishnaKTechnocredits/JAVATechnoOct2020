package ankit;

public class UserBankingAction {

	String bankName;
	int iciciBalance, hdfcBalance, bobBalance, sbiBalance;
	int iciciCreditCounter, hdfcCreditCounter, bobCreditCounter, sbiCreditCounter;
	int iciciDebitCounter, hdfcDebitCounter, bobDebitCounter, sbiDebitCounter;
	static int totalCreditCounter, totalDebitCounter;

	void creditFunction(String bankName, int amount) {
		switch (bankName) {
		case "icici":
			iciciBalance += amount;
			iciciCreditCounter++;
			System.out.println("Credited amount in the account is: " + amount + " and total available balance is: "
					+ iciciBalance);
			break;

		case "hdfc":
			hdfcBalance += amount;
			hdfcCreditCounter++;
			System.out.println(
					"Credited amount in the account is: " + amount + " and total available balance is: " + hdfcBalance);
			break;

		case "bob":
			bobBalance += amount;
			bobCreditCounter++;
			System.out.println(
					"Credited amount in the account is: " + amount + " and total available balance is: " + bobBalance);
			break;

		case "sbi":
			sbiBalance += amount;
			sbiCreditCounter++;
			System.out.println(
					"Credited amount in the account is: " + amount + " and total available balance is: " + sbiBalance);
			break;

		}
		totalCreditCounter++;

	}

	void debitFunction(String bankName, int amount) {
		boolean flag = false;
		switch (bankName) {
		case "icici":
			if (amount < iciciBalance) {
				iciciBalance -= amount;
				iciciDebitCounter++;
				System.out.println("Debited amount in the account is: " + amount + " and total available balance is: "
						+ iciciBalance);
				flag = true;
			} else
				System.out.println("You do not have sufficient Balance");

			break;
		case "hdfc":
			if (amount < hdfcBalance) {
				hdfcBalance -= amount;
				hdfcDebitCounter++;
				System.out.println("Debited amount in the account is: " + amount + " and total available balance is: "
						+ hdfcBalance);
				flag = true;
			} else
				System.out.println("You do not have sufficient Balance");

			break;

		case "bob":
			if (amount < bobBalance) {
				bobBalance -= amount;
				bobDebitCounter++;
				System.out.println("Debited amount in the account is: " + amount + " and total available balance is: "
						+ bobBalance);
				flag = true;
			} else
				System.out.println("You do not have sufficient Balance");

			break;

		case "sbi":
			if (amount < sbiBalance) {
				sbiBalance -= amount;
				sbiDebitCounter++;
				System.out.println("Debited amount in the account is: " + amount + " and total available balance is: "
						+ sbiBalance);
				flag = true;
			} else
				System.out.println("You do not have sufficient Balance");

			break;
		}
		if (flag = true)
			totalDebitCounter++;
	}

	void totalCreditDebitOperations() {
		System.out.println("Total Credit operation on user's account is: " + totalCreditCounter);
		System.out.println("Total Debit operation on user's account is: " + totalDebitCounter);

	}

	void individualCreditOperation() {

		System.out.println("Total credit operation on ICICI Bank is: " + iciciCreditCounter);
		System.out.println("Total credit operation on HDFC Bank is: " + hdfcCreditCounter);
		System.out.println("Total credit operation on BOB Bank is: " + bobCreditCounter);
		System.out.println("Total credit operation on SBI Bank is: " + sbiCreditCounter);
	}

	void individualDebitOperation() {
		System.out.println("Total debit operation on ICICI Bank is: " + iciciDebitCounter);
		System.out.println("Total debit operation on HDFC Bank is: " + hdfcDebitCounter);
		System.out.println("Total debit operation on BOB Bank is: " + bobDebitCounter);
		System.out.println("Total debit operation on SBI Bank is: " + sbiDebitCounter);
	}

	void totalBalance() {
		System.out.println(
				"Total Balance in all the accounts is: " + (iciciBalance + hdfcBalance + bobBalance + sbiBalance));

	}

	public static void main(String[] args) {
		UserBankingAction userBankingAction = new UserBankingAction();
		userBankingAction.creditFunction("icici", 700);
		userBankingAction.creditFunction("icici", 700);
		userBankingAction.debitFunction("hdfc", 500);
		userBankingAction.creditFunction("sbi", 700);
		userBankingAction.creditFunction("hdfc", 700);
		userBankingAction.debitFunction("sbi", 500);
		userBankingAction.creditFunction("sbi", 700);
		userBankingAction.creditFunction("bob", 700);
		userBankingAction.debitFunction("hdfc", 500);
		userBankingAction.creditFunction("sbi", 700);
		userBankingAction.creditFunction("bob", 700);
		userBankingAction.debitFunction("sbi", 500);
		userBankingAction.debitFunction("bob", 200);
		userBankingAction.debitFunction("icici", 300);

		userBankingAction.totalCreditDebitOperations();
		userBankingAction.individualCreditOperation();
		userBankingAction.individualDebitOperation();
		userBankingAction.totalBalance();

	}

}
