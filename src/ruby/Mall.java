/* 1. Create a class named as Mall, which contains below methods
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
Hint: itemAddedToCart method have int parameter, paymentDoneUsing() method have String parameter, needBill() have Boolean parameter & haveCarryBag have Boolean parameter*/

package ruby;

public class Mall {
	int numberOfItems;
	String name;
	String modeOfPay;
	boolean bill;
	boolean carryBag;
	String section;

	void itemAddedToCart(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	void customerName(String name) {
		this.name = name;
	}

	void paymentDoneUsing(String modeOfPay) {
		this.modeOfPay = modeOfPay;
	}

	void needBill(boolean bill) {
		this.bill = bill;
	}

	void haveCarryBag(boolean CarryBag) {
		this.bill = bill;
	}

	void displayCutomerInfo() {
		System.out.println(
				name + " brought " + numberOfItems + " items and payment done using " + modeOfPay + " in " + section);
	}

	void decisionSection() {
		if (numberOfItems <= 10 && modeOfPay.equals("Cash")) {
			section = "Section 1A";
		} else if (numberOfItems > 10 && modeOfPay.equals("Visa Card")) {
			section = "Section 1B";
		} else if (numberOfItems > 10 && modeOfPay.equals("Cash")) {
			section = "Section 1C";
		} else if (numberOfItems <= 10 && modeOfPay.equals("Visa Card")) {
			section = "Section 1D";
		}
	}

	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.customerName("Ruby");
		mall.itemAddedToCart(10);
		mall.paymentDoneUsing("Visa Card");
		mall.haveCarryBag(true);
		mall.needBill(true);
		mall.decisionSection();
		mall.displayCutomerInfo();
	}
}
