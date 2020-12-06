package tejashree;

public class Mall {

	String custName;
	int itemCount;
	String paymentChoice;
	String section;

	void itemAddedToCart(int noOfItems) {
		itemCount = noOfItems;
	}
	void customerName(String cName) {
		custName = cName;
	}
	void paymentDoneUsingVisa(String byVisa) {
		paymentChoice = byVisa;
	}
	void paymentDoneUsingCash(String byCash) {
		paymentChoice = byCash;
	}
	void displayCustomerInfo() {
		System.out.println(custName + " added " + itemCount + " items and payment done using " + paymentChoice + section);
	}
	void needBill(boolean needBill) {
		if (needBill) {
			System.out.println(custName + " needs a copy of bill");
		} else
			System.out.println(custName + " does not need a bill copy");
	}
	void haveCarryBag(boolean needBag) {
		if (needBag) {
			System.out.println(custName + " needs a carry bag");
		} else
			System.out.println(custName + " does not need a carry bag");
	}
	void decideSection() {
		if (itemCount > 10 && paymentChoice.equalsIgnoreCase("cash")) {
			section = " in section 1A";
		} else if (itemCount > 10 && paymentChoice.equalsIgnoreCase("visa")) {
			section = " in Section 1B";
		} else if (itemCount < 10 && paymentChoice.equalsIgnoreCase("cash")) {
			section = " in section 1C";
		} else if (itemCount < 10 && paymentChoice.equalsIgnoreCase("visa")) {
			section = " in section 1D";
		}

	}
	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.customerName("Tejashree");
		mall.itemAddedToCart(9);
		mall.paymentDoneUsingCash("cash");
		mall.decideSection();
		mall.needBill(true);
		mall.haveCarryBag(true);
		mall.displayCustomerInfo();
	}
}
