
package nagendra;

public class Mall {

	int numberOfItems;
	String customername;
	String paymentType;
	String section;
	boolean isBillRequired;
	boolean doesCustomerNeedCarryBag;

	void itemAddedToCart(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	void customerName(String customername) {
		this.customername = customername;
	}

	void paymentDoneUsing(String paymentType) {
		this.paymentType = paymentType;
	}

	void displayCutomerInfo() {
		System.out.println(customername + " brought " + numberOfItems + " items and payment done using " + paymentType
				+ " in " + section);
	}

	void needBill(boolean isBillRequired) {
		this.isBillRequired = isBillRequired;
	}

	void haveCarryBag(boolean doesCustomerNeedCarryBag) {
		this.doesCustomerNeedCarryBag = doesCustomerNeedCarryBag;
	}

	void decideSection() {
		if (numberOfItems < 10 && paymentType.equals("cash")) {
			section = "section 1A";
		} else if (numberOfItems > 10 && paymentType.equals("visa card")) {
			section = "section 1B";
		} else if (numberOfItems > 10 && paymentType.equals("cash")) {
			section = "section 1c";

		} else if (numberOfItems < 10 && paymentType.equals("visa card")) {
			section = "section 1D";
		}
	}

	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.itemAddedToCart(12);
		mall.customerName("Harsh");
		mall.paymentDoneUsing("visa card");
		mall.decideSection();
		mall.displayCutomerInfo();

	}

}
