package poojap;

public class Mall {
	
	int numberOfitem;
	String customerName;
	String paymentMode;
	boolean needBill;
	boolean haveCarryBag;
	
	void itemAddedToCard(int numberofitem) {
		
		this.numberOfitem=numberofitem;
		
	}
	void customerName(String customerName) {
		
		this.customerName=customerName;
		
	}
	void paymentDoneUsing(String paymentMode) {
		
		this.paymentMode=paymentMode;
		
	}
	void needBill(boolean needBill) {
		
		this.needBill=needBill;
		
		
	}
	void haveCarryBag(boolean haveCarryBag) {
		
		this.haveCarryBag=haveCarryBag;
		
	}
	void displayCustomerInfo() {
		
		System.out.println(customerName + " brought " +numberOfitem + " item and payment done by " + paymentMode + " card");
		
	}
	void decideSection() {
		
		
		if(numberOfitem< 10 && paymentMode== "cash")
			System.out.println("section 1A");
		else if(numberOfitem > 10 && paymentMode== "visa")
			System.out.println("Section 1B");
		else if(numberOfitem > 10 && paymentMode== "cash")
			System.out.println("Section 1c");
		else if(numberOfitem <10 && paymentMode=="visa")
			System.out.println("Section 1D");
	}

	public static void main(String[] args) {
		
		Mall mall = new Mall();
		mall.customerName("pooja");
		mall.itemAddedToCard(9);
		mall.paymentDoneUsing("cash");
		mall.displayCustomerInfo();
		mall.decideSection();
		
	}
}
