package rohit;
public class Mall {

	int items;
	String name;
	String paymenttype;
	boolean bill;
	boolean carrybag;

	void itemAddedToCart(int items) {
		this.items = items;
	}

	void customerName(String name) {
		this.name = name;
	}

	void paymentDoneUsing(String paymenttype) {
		this.paymenttype = paymenttype;
	}

	void displayCutomerInfo() {
		System.out.print(name + " brought " + items + " items and ");
	}

	void needBill(boolean bill) {
		this.bill = bill;
	}

	void haveCarryBag(boolean carrybag) {
		this.carrybag = carrybag;
	}

	void decideSection() {
		if (items < 10 && paymenttype.equalsIgnoreCase("Cash")) {
			System.out.print("payment done using " + paymenttype + " in section 1A");
		} else if (items > 10 && paymenttype.equalsIgnoreCase("visa Card")) {
			System.out.print("payment done using " + paymenttype + " in section 1B");
		} else if (items > 10 && paymenttype.equalsIgnoreCase("Cash")) {
			System.out.print("payment done using " + paymenttype + " in section 1C");
		} else if (items < 10 && paymenttype.equalsIgnoreCase("Visa card")) {
			System.out.print("payment done using " + paymenttype + " in section 1D");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mall mall = new Mall();
		mall.customerName("Rohit Rai");
		mall.itemAddedToCart(12);
		mall.paymentDoneUsing("visa card");
		mall.needBill(true);
		mall.haveCarryBag(true);
		mall.displayCutomerInfo();
		mall.decideSection();
	}

}
