package nagendra;

public class BankingOpration {
	int iciciBalance = 1000;
	int hdfcBalance = 1000;
	int bobBalance = 1000;
	int sbiBalance = 1000;
	int iciciCredit;
	int hdfcCredit;
	int bobCredit;
	int sbiCredit;
	int iciciDebit;
	int hdfcDebit;
	int bobDebit;
	int sbiDebit;

	void bankOperation(String bank, String operation, int amount) {
		switch (bank) {
		case "ICICI":
			if (operation.equalsIgnoreCase("Credit"))
				creditOperation(bank, amount);
			else if (operation.equalsIgnoreCase("Debit"))
				debitOperation(bank, amount);
			break;
		case "HDFC":
			if (operation.equalsIgnoreCase("Credit"))
				creditOperation(bank, amount);
			else if (operation.equalsIgnoreCase("Debit"))
				debitOperation(bank, amount);
			break;
		case "BOB":
			if (operation.equalsIgnoreCase("Credit"))
				creditOperation(bank, amount);
			else if (operation.equalsIgnoreCase("Debit"))
				debitOperation(bank, amount);
			break;
		case "SBI":
			if (operation.equalsIgnoreCase("Credit"))
				creditOperation(bank, amount);
			else if (operation.equalsIgnoreCase("Debit"))
				debitOperation(bank, amount);
			break;
		}
	}
	void creditOperation(String bank, int amount) {
		switch (bank) {
		case "ICICI":
			if (amount > iciciBalance)
				iciciBalance += amount;
			iciciCredit++;
			break;
		case "HDFC":
			hdfcBalance += amount;
			hdfcCredit++;
			break;
		case "BOB":
			bobBalance += amount;
			bobCredit++;
			break;
		case "SBI":
			sbiBalance += amount;
			sbiCredit++;
			break;
		}
	}

	void debitOperation(String bank, int amount) {
		switch (bank) {
		case "ICICI":
			if (amount > iciciBalance) {
				System.out
						.println("The amount " + amount + " is not available in Your "+bank+" Account total Available Balance is " + iciciBalance + " ");
			} else
				iciciBalance -= amount;
			iciciDebit++;
			break;
		case "HDFC":
			if (amount > hdfcBalance) {
				System.out
						.println("The amount " + amount + " is not available in Your "+bank+" Account total Available Balance is " + hdfcBalance + " ");
			} else
				hdfcBalance -= amount;
			hdfcDebit++;
			break;
		case "BOB":
			if (amount > bobBalance) {
				System.out.println("The amount " + amount + " is not available in Your "+bank+" Account total Available Balance is " + bobBalance + " ");
			} else
				bobBalance -= amount;
			bobDebit++;
			break;
		case "SBI":
			if (amount > sbiBalance) {
				System.out.println("The amount " + amount + " is not available in Your  "+bank+" Account total Available Balance is " + sbiBalance + " ");
			} else
				sbiBalance -= amount;
			sbiDebit++;
		}
	}

	void totalOperation() {
		int totalCredit = iciciCredit  + hdfcCredit  + bobCredit + sbiCredit ;
		int totalDebit=iciciDebit+ hdfcDebit + bobDebit + sbiDebit;
		System.out.println("Total Credit  Operation is " + totalCredit);
		System.out.println("Total Credit  Operation is " + totalDebit);

	}

	void totalBalance() {
		int balance= bobBalance + hdfcBalance + iciciBalance + sbiBalance;
		System.out.println("Total Balance is :"+balance);
	}

	void bankCreditOperations(String bank) {
		switch (bank) {
		case "ICICI":
			System.out.println("Total Credit Operation By " + bank + " Bank is " + iciciCredit);
			break;
		case "HDFC":
			System.out.println("Total Credit Operation By " + bank + " Bank is " + hdfcCredit);
			break;
		case "BOB":
			System.out.println("Total Credit Operation By " + bank + " Bank is " + bobCredit);
			break;
		case "SBI":
			System.out.println("Total Credit Operation By " + bank + " Bank is " + sbiCredit);
			break;
		}
	}
	void bankDebitOperations(String bank) {
		switch (bank) {
		case "ICICI":
			System.out.println("Total Credit Operation By " + bank + " Bank is " + iciciDebit);
			break;
		case "HDFC":
			System.out.println("Total Credit Operation By " + bank + " Bank is " + hdfcDebit);
			break;
		case "BOB":
			System.out.println("Total Credit Operation By " + bank + " Bank is " + bobDebit);
			break;
		case "SBI":
			System.out.println("Total Credit Operation By " + bank + " Bank is " + sbiDebit);
			break;
		}
	}
	public static void main(String[] args) {

		BankingOpration operation = new BankingOpration();
		operation.bankOperation("SBI", "DEBIT", 5000);
		operation.bankOperation("HDFC", "CREDIT", 500);
		operation.bankOperation("ICICI", "CREDIT", 500);
		operation.bankOperation("BOB", "CREDIT", 500);
		operation.bankOperation("SBI", "CREDIT", 500);
		operation.bankOperation("HDFC", "DEBIT", 500);
		operation.bankOperation("SBI", "DEBIT", 60);
		operation.totalBalance();
		operation.bankCreditOperations("ICICI");
		operation.bankDebitOperations("SBI");
		operation.totalOperation();
	}
}
