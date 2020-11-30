package brijesh;

public class Mall {
	int numberOfItems;
	String name;
	String paymentMode;
	boolean requiredBill;
	boolean haveCarryBag;
	String section;
	
	void itemAddedToCart(int items) {
		this.numberOfItems=items;
	}
	
	void customerName(String name) {
		this.name=name;
	}
	
	void paymentDoneUsing(String paymentMode) {
		this.paymentMode=paymentMode;	
	}
	
	void displayCutomerInfo() {
		System.out.println(name+" brought "+numberOfItems+" items and payment done using "+paymentMode+" in section "+section);
		if(requiredBill)
			System.out.print("customer requested for bill. ");
		else
			System.out.print("customer doesn't need bill. ");
		if(haveCarryBag)
			System.out.print("customer required carry bag.");
		else
			System.out.print("customer doesn't need carry bag.");
	}
	
	void needBill(boolean requiredBill) {
		this.requiredBill=requiredBill;
	}
	
	void haveCarryBag(boolean haveCarryBag) {
		this.haveCarryBag=haveCarryBag;
	}
	
	void decideSection() {
		if(numberOfItems<=10 && paymentMode.equalsIgnoreCase("cash"))
			section="1A";
		else if(numberOfItems>10 && paymentMode.equalsIgnoreCase("visa card"))
			section="1B";
		else if(numberOfItems>10 && paymentMode.equalsIgnoreCase("cash"))
			section="1C";
		else if(numberOfItems<=10 && paymentMode.equalsIgnoreCase("visa card"))
			section="1D";
	}

	public static void main(String[] args) {
		Mall mall=new Mall();
		mall.itemAddedToCart(12);
		mall.paymentDoneUsing("visa card");
		mall.customerName("Vikash");
		mall.needBill(true);
		mall.haveCarryBag(false);
		mall.decideSection();
		mall.displayCutomerInfo();

	}

}
