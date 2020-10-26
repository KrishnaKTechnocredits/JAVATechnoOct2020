package shrutiS;

public class Mall {
	int itemInCart;
	String customerName;
	String paymentBy;
	String section;
	Boolean needBill;
	Boolean haveCarryBag;

	void itemAddedToCart(int itemInCart) {
		this.itemInCart = itemInCart;
	}

	void customerName(String customerName) {
		this.customerName = customerName;
	}

	void paymentDoneUsing(String paymentBy) {
		this.paymentBy = paymentBy;
	}

	void displayCutomerInfo() {
		System.out.println(customerName + " bought " + itemInCart + " items and payment done using " + paymentBy
				+ " in " + section);

	}

	void needBill(Boolean needBill) {
		this.needBill = needBill;
	}

	void haveCarryBag(Boolean haveCarryBag) {
		this.haveCarryBag = haveCarryBag;
	}

	void decideSection() {
		if (itemInCart < 10 && paymentBy == "cash")
			section = "section 1A";
		else if (itemInCart > 10 && paymentBy == "visa card")
			section = "section 1B";
		else if (itemInCart > 10 && paymentBy == "cash")
			section = "section 1C";
		else if (itemInCart < 10 && paymentBy == "visa card")
			section = "section 1D";
	}

	public static void main(String[] a) {
		Mall mall = new Mall();
		mall.customerName("Harsh");
		mall.itemAddedToCart(12);
		mall.paymentDoneUsing("visa card");
		mall.needBill(false);
		mall.haveCarryBag(true);
		mall.decideSection();
		mall.displayCutomerInfo();
	}
}
