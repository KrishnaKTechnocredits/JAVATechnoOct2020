package apurva;

class Mall {

	String custName;
	int items;
	boolean bill;
	boolean carryBag;
	String payment;
	
	void itemAddedToCart(int items) {
		this.items = items;
	}

	void customerName(String custname) {
		this.custName = custname;
	}

	void paymentDoneUsing(String payment) {
		this.payment = payment;
	}

	void needBill(boolean bill) {
		this.bill = bill;
	}

	void haveCarryBag(boolean carryBag) {
		this.carryBag = carryBag;
	}

	void decideSection() {
		if (items < 10 && payment == "cash")
			System.out.println("1A");
		else if (items > 10 && payment == "visaCard")
			System.out.println("1B");
		else if (items > 10 && payment == "cash")
			System.out.println("1C");
		else if (items < 10 && payment == "visaCard")
			System.out.println("1D");
	}

	void displayCustomerInfo() {
		System.out.println(custName + " Total Num of items = " + items + " payment mode = " + payment);
		if (bill) {
			System.out.println("Customer needs a bill");
		} else {
			System.out.println("Customer not requesting for bill");
		}

		if (carryBag) {
			System.out.println("Need a carry bag");
		} else {
			System.out.println("No need carry bag");
		}
	}

	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.itemAddedToCart(12);
		mall.customerName("Harsh");
		mall.paymentDoneUsing("visaCard");
		mall.displayCustomerInfo();
		mall.decideSection();
	}
}