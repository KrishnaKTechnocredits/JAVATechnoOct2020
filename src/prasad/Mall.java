package prasad;

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
			System.out.println("> Customer requires a copy of bill.");
		else
			System.out.println("> Customer does not require a copy of bill.");
	}
	
	void haveCarrybag(Boolean bag) {
		this.bag=bag;
		if(bag)
			System.out.println("> Customer wants a bag to carry his/her items.");
		else
			System.out.println("> Customer is carrring his/her own bag.");
	}
	
	void displayCustomerInfo() {
		System.out.println("****Printing order details****");
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
	
	public static void main (String[]arg) {
		Mall mall = new Mall();
		mall.itemsAddedToCart(12);
		mall.customername("Martina");
		mall.paymentDoneusing("visa card");
		mall.needBill(true);
		mall.haveCarrybag(true);
		mall.displayCustomerInfo();
		mall.decideSection();
	}

}
