package suvela;

class Mall {
	int items;
	String cust_Name;
	String payment;
	String section;
	boolean bill;
	boolean carry_Bag;

	void itemAddedToCart(int items) {
		this.items = items;
	}

	void customerName(String cust_Name) {
		this.cust_Name = cust_Name;
	}

	void paymentDoneUsing(String payment) {
		this.payment = payment;
	}

	void needBill(boolean bill) {
		this.bill = bill;
	}

	void haveCarryBag(boolean carry_Bag) {
		this.carry_Bag = carry_Bag;
	}

	void decideSection() {
		if (items < 10 && payment == "cash")
			section = "1A";
		else if (items > 10 && payment == "cash")
			section = "1C";
		else if (items > 10 && payment == "visa_card")
			section = "1B";
		else if (items < 10 && payment == "visa_card")
			section = "1D";
	}

	void displayCustomerInfo() {
		System.out.println("Customer Name is: " + cust_Name);
		if (bill == true && carry_Bag == true)
			System.out.println("Customer wants bill and carry Bag");
		else
			System.out.println("Customer does not want bill and Carry Bag");
		System.out.println(cust_Name + " bought " + items + " items and payment done using " + payment + " in " + section);

	}

	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.itemAddedToCart(15);
		mall.customerName("Suvela");
		mall.haveCarryBag(true);
		mall.needBill(false);
		mall.paymentDoneUsing("cash");
		mall.decideSection();
		mall.displayCustomerInfo();
		

	}

}
