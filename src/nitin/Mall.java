/* 	JAVA Assignment - 7 : Day 5 : 25th Oct 2020
 	a. itemAddedToCart()
	b. customerName()
	c. paymentDoneUsing()
		i. Visa Card ii. Cash
	d. displayCustomerInfo()
	e. needBill()
	f. haveCarryBag()
	g. decideSection()
Hint: itemAddedToCart method have int parameter, paymentDoneUsing() method have String parameter, 
needBill() have Boolean parameter & haveCarryBag have Boolean parameter*/
package nitin;

public class Mall {
	int numberOfItems;
	String cardType;
	String nameOfCustomer;
	boolean billNeeded;
	boolean carryBagNeeded;

	void itemAddedToCart(int numberOfItem) {
		this.numberOfItems = numberOfItem;
	}

	void customerName(String nameOfCustomer) {
		// System.out.print(nameOfCustomer);
		this.nameOfCustomer = nameOfCustomer;
	}

	void paymnetDoneUsing(String cardType) {
		this.cardType = cardType;
	}

	void needBill(boolean isBillRequired) {
		this.billNeeded = isBillRequired;
	}

	void haveCarryBag(boolean carryBagRequired) {
		this.carryBagNeeded = carryBagRequired;
	}

	void displayCustomerInfo() {
		System.out.print(
				nameOfCustomer + " bought " + numberOfItems + " items and payment done using " + cardType + " card");
	}

	void decideSection() {
		if (numberOfItems < 10 && cardType == "cash")
			System.out.print(" in section 1A");
		else if (numberOfItems > 10 && cardType == "Visa")
			System.out.print(" in section 1B");
		else if (numberOfItems > 10 && cardType == "cash")
			System.out.print(" in section 1C");
		else if (numberOfItems < 10 && cardType == "Visa")
			System.out.print(" in section 1D");
	}

	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.customerName("Nitin");
		mall.itemAddedToCart(12);
		mall.paymnetDoneUsing("Visa");
		mall.displayCustomerInfo();
		mall.decideSection();
	}
}
