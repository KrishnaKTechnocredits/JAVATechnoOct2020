package shrutiC;

class Mall {

	String customerName, paymentMethod, section;
	int items;

	void itemAddedToCart(int items) {
		this.items = items;

	}

	void customerName(String customerName) {
		this.customerName = customerName;

	}

	void paymentDoneUsing(String paymentMethod) {
		this.paymentMethod = paymentMethod.toLowerCase();

	}

	void displayCutomerInfo() {

		System.out.println(customerName + " brought " + items + " items and payment done using " + paymentMethod
				+ " in section " + section);

	}

	void needBill(boolean isBillRequired) {

	}

	void haveCarryBag(boolean isCarryBagRequired) {

	}

	void decideSection() {

		if (items < 10 && paymentMethod.equalsIgnoreCase("cash")) {
			section = "1A";
		} else if (items > 10 && paymentMethod.equalsIgnoreCase("visa card")) {
			section = "1B";
		} else if (items > 10 && paymentMethod.equalsIgnoreCase("cash")) {
			section = "1C";
		} else if (items < 10 && paymentMethod.equalsIgnoreCase("visa card")) {
			section = "1D";
		}

	}

	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.itemAddedToCart(12);
		mall.customerName("Harsh");
		mall.paymentDoneUsing("Visa Card");
		mall.decideSection();
		mall.displayCutomerInfo();
	}

}
