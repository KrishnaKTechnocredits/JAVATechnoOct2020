package apurva;

class Mall {
	void itemAddedToCart(int items) {
		System.out.println(items);
	}

	void customerName(String name) {
		System.out.println(name);
	}

	void paymentDoneUsing(String visaCard, String cash) {
		System.out.println();
	}

	void displayCustomerInfo(int items, String visaCard, String cash){
		String payment = null;
		if (items<10 && payment==cash)
			System.out.println();
		else if (items>10 && payment==visaCard)
			System.out.println();
		else if (items>10 && payment==cash)
			System.out.println();
		else if (items<10 && payment==visaCard)
			System.out.println();
	}

	void needBill(boolean bill) {
		System.out.println(true);
	}

	void haveCarryBag(boolean carryBag) {
		System.out.println(true);
	}

	void decideSection(String section) {
		System.out.println();
	}

	public static void main(String[] args){
		Mall mall = new Mall();
		mall.itemAddedToCart(12);
		mall.customerName("Harsh");
		mall.paymentDoneUsing("visa card", null);
		mall.displayCustomerInfo(12, null, null);
		mall.needBill(false);
		mall.haveCarryBag(false);
		mall.decideSection(null);
	}
}