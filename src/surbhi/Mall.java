package surbhi;
/*
 a. itemAddedToCart()
	b. customerName()
	c. paymentDoneUsing()
		i. Visa Card ii. Cash
	d. displayCutomerInfo()
	e. needBill()
	f. haveCarryBag()
	g. decideSection()

	i.e. console should print: Harsh brought 12 items and payment done using visa card in section 1B

Expectations:
• If items are less than 10 and payment done using cash, then send customer to section 1A
• If items are more than 10 and payment done using visa card, then send customer to section 1B
• If items are more than 10 and payment done using cash, then send customer to section 1C
• If items are less than 10 and payment done using visa card, then send customer to section 1D

Hint: itemAddedToCart method have int parameter, paymentDoneUsing() method have String parameter, needBill() have Boolean parameter & haveCarryBag have Boolean parameter
 */
public class Mall{

	int itemCart;
	String customerName;
	String paymentBy;
	String section;
	Boolean needBill;
	Boolean haveCarryBag;

	void itemAddedToCart(int itemCart) {
		this.itemCart = itemCart;
	}

	void customerName(String customerName) {
		this.customerName = customerName;
	}

	void paymentDoneUsing(String paymentBy) {
		this.paymentBy = paymentBy;
	}

	void displayCutomerInfo() {
		System.out.println(customerName + " bought " + itemCart + " items and payment done using " + paymentBy
				+ " in " + section);

	}

	void needBill(Boolean needBill) {
		this.needBill = needBill;
	}

	void haveCarryBag(Boolean haveCarryBag) {
		this.haveCarryBag = haveCarryBag;
	}

	void decideSection() {
		if (itemCart < 10 && paymentBy == "cash")
			section = "section 1A";
		else if (itemCart > 10 && paymentBy == "visa card")
			section = "section 1B";
		else if (itemCart > 10 && paymentBy == "cash")
			section = "section 1C";
		else if (itemCart < 10 && paymentBy == "visa card")
			section = "section 1D";
	}

	public static void main(String[] a) {
		Mall mall = new Mall();
		mall.customerName("Surbhi");
		mall.itemAddedToCart(16);
		mall.paymentDoneUsing("visa card");
		mall.needBill(false);
		mall.haveCarryBag(true);
		mall.decideSection();
		mall.displayCutomerInfo();
	}
}
