/*
 1. Create a class named as Mall, which contains below methods
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
� If items are less than 10 and payment done using cash, then send customer to section 1A
� If items are more than 10 and payment done using visa card, then send customer to section 1B
� If items are more than 10 and payment done using cash, then send customer to section 1C
� If items are less than 10 and payment done using visa card, then send customer to section 1D

Hint: itemAddedToCart method have int parameter, paymentDoneUsing() method have String parameter, needBill() have Boolean parameter & haveCarryBag have Boolean parameter
*/


package prem;

public class Mall {
	int numberofItems;
	String customerName;
	String paymentMethod;
	Boolean bill;
	Boolean bag;
	
	void itemsAddedToCart(int numberofItems) {
		this.numberofItems = numberofItems;	
	}
	
	void customername(String customerName) {
		this.customerName=customerName;
	}
	
	void paymentDoneusing(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	void needBill(Boolean bill) {
		this.bill=bill;
		if (bill)
			System.out.println(customerName + " requires a copy of bill.");
		else
			System.out.println(customerName + " does not require a copy of bill.");
	}
	
	void haveCarrybag(Boolean bag) {
		this.bag=bag;
		if(bag)
			System.out.println(customerName + " wants a bag to carry his/her items.");
		else
			System.out.println(customerName +" carrring his/her own bag.");
	}
	
	void displayCustomerInfo() {
		System.out.println("Order details");
		System.out.print(customerName + " has bought " + numberofItems + " items");
	}
	
	void decideSection() {
		if (numberofItems<=10 && paymentMethod.equals("cash"))
			System.out.print(" and payment done using " + paymentMethod + " in section 1A");
		else if (numberofItems>10 && paymentMethod.equals("visa card"))
			System.out.print(" and payment done using " + paymentMethod + " in section 1B");
		else if (numberofItems>10 && paymentMethod.equals("cash"))
			System.out.print(" and payment done using " + paymentMethod + " in section 1C");
		else if (numberofItems<10 && paymentMethod.equals("visa card"))
			System.out.print(" and payment done using " + paymentMethod + " in section 1D" );	
	}
	
	public static void main (String[] arg) {
		Mall mall = new Mall();
		mall.itemsAddedToCart(12); 
		mall.customername("MohanBhargav");
		mall.paymentDoneusing("cash");
		mall.needBill(false);
		mall.haveCarrybag(true);
		mall.displayCustomerInfo();
		mall.decideSection();
	}

}
