package himali;



public class Mall {

	int numberOfItems;
	String customerName;
	String paymentMethod;
	boolean billRequired;
	boolean carryBagRequired;
	String section;

	void itemAddedToCart(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	void customerName(String customerName) {
		this.customerName = customerName;
	}

	void paymentDoneUsing(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	void needBill(boolean billRequired) {
		this.billRequired = billRequired;
	}

	void haveCarryBag(boolean carryBagRequired) {
		this.carryBagRequired = carryBagRequired;
	}

	void decideSection() {
		if (numberOfItems < 10 && paymentMethod == "Cash")
			section = "Section1A";
		else if (numberOfItems > 10 && paymentMethod == "Visa")
			section = "Section1B";
		else if (numberOfItems > 10 && paymentMethod == "Cash")
			section = "Section1C";
		else if (numberOfItems < 10 && paymentMethod == "Visa")
			section = "Section1D";
	}

	void displayCustomerInfo() {
		System.out.println(customerName + " has bought " + numberOfItems + " number of items and payment is done using "
				+ paymentMethod + " in " + section);
	}

	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.itemAddedToCart(9);
		mall.customerName("ABC");
		mall.paymentDoneUsing("Cash");
		mall.needBill(true);
		mall.haveCarryBag(false);
		mall.decideSection();
		mall.displayCustomerInfo();

	}
}