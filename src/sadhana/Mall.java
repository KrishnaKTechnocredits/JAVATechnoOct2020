package sadhana;

public class Mall {

	int cartItems;
	String customerName;
	String paymentMethod;
	boolean bill;
	boolean requiredBag;
	String section;

	void itemAddedToCart(int cartItems) {
		this.cartItems = cartItems;
	}

	void customerName(String customerName) {
		this.customerName = customerName;
	}

	void paymentDoneUsing(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	void needBill(boolean bill) {
		this.bill = bill;
	}

	void haveCarryBag(boolean requiredBag) {
		this.requiredBag = requiredBag;
	}

	void decideSection() {
		if (cartItems < 10 && paymentMethod == "Cash")
			section = "1A";
		else if (cartItems > 10 && paymentMethod == "Visa")
			section = "1B";
		else if (cartItems > 10 && paymentMethod == "Cash")
			section = "1C";
		else if (cartItems < 10 && paymentMethod == "Visa")
			section = "1D";
	}

	void displayCustomerInfo() {
		System.out.println(customerName + " has bought " + cartItems + " number of items and payment is done using "
				+ paymentMethod + " in " + section);
	}

	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.itemAddedToCart(14);
		mall.customerName("Sadhana");
		mall.paymentDoneUsing("Visa");
		mall.needBill(true);
		mall.haveCarryBag(true);
		mall.decideSection();
		mall.displayCustomerInfo();

	}

}