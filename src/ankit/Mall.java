package ankit;

public class Mall {

	int noOfItems;
	String customerName;
	String paymentMethod;
	boolean billRequired;
	boolean carryBagRequired;
	String section;

	void itemAddedToCart(int noOfItem) {
		this.noOfItems = noOfItem;
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
		if (noOfItems < 10 && paymentMethod == "Cash")
			section = "Section1A";
		else if (noOfItems > 10 && paymentMethod == "Visa")
			section = "Section1B";
		else if (noOfItems > 10 && paymentMethod == "Cash")
			section = "Section1C";
		else if (noOfItems < 10 && paymentMethod == "Visa")
			section = "Section1D";
	}

	void displayCustomerInfo() {
		System.out.println(customerName + " has bought " + noOfItems + " number of items and payment is done using "
				+ paymentMethod + " in " + section);
	}

	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.itemAddedToCart(9);
		mall.customerName("Harsh");
		mall.paymentDoneUsing("Visa");
		mall.needBill(true);
		mall.haveCarryBag(false);
		mall.decideSection();
		mall.displayCustomerInfo();

	}

}
