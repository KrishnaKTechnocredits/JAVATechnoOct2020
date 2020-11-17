package ankita;

public class Mall {
	int itemAddedinCart;
	String customerName;
	String paymenttype;
	boolean needBill;
	boolean haveCarrybag;
	String section;
	
	void itemAddedToCart(int itemAddedinCart1) {
		itemAddedinCart = itemAddedinCart1;
	}
	void customerName(String custName1) {
		customerName = custName1;
	}
	void paymentDoneUsing(String paymenttype1) {
		paymenttype = paymenttype1;
	}
	void needBill(boolean needBillFlag) {
		needBill = needBillFlag;
	}
	void haveCarryBag(boolean haveCarrybagFlag) {
		haveCarrybag = haveCarrybagFlag;
	}
	void decideSection() {
		if(itemAddedinCart<10 && paymenttype=="cash")
			section = "section 1A";
		if(itemAddedinCart>10 && paymenttype=="Visa card")
			section = "section 1B";
		if(itemAddedinCart>10 && paymenttype=="cash")
			section = "section 1C";
		if(itemAddedinCart<10 && paymenttype=="Visa card")
			section = "section 1D";
	}
	void displayCutomerInfo() {
		System.out.println(customerName + " bought " + itemAddedinCart + " items and payment done using " + paymenttype +" in " + section);
		if(needBill)
			System.out.println(customerName + " needs bill ");
		else 
			System.out.println(customerName + "does not need bill");
		
		if(haveCarrybag)
			System.out.println(customerName + " have carry bag ");
		else
			System.out.println(customerName + " needs carry bag");
	}
	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.itemAddedToCart(5);
		mall.customerName("Sagar");
		mall.paymentDoneUsing("Visa card");
		mall.decideSection();
		mall.needBill(true);
		mall.haveCarryBag(false);
		mall.displayCutomerInfo();
	}
}
