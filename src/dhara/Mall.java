package dhara;
public class Mall {
	
	String customerName;
	int items;
	String payment;
	boolean needBill;
	boolean haveCarryBag;

	void customerName(String customerName) {
		
		this.customerName=customerName;
	}
	
	void itemAddedToCart(int items) {
		
		this.items=items;
	}
	
	void paymentDoneUsing(String payment) {
		
		this.payment=payment;
	}
	
	void displayCustomerInfo(String section) {
		
		System.out.println(customerName+" brought "+items+" items and payment done using "+payment+" in "+section);
	}
	
	void needBill(boolean needBill) {
		
		this.needBill=needBill;
	}
	
	void haveCarryBag(boolean haveCarryBag) {
		
		this.haveCarryBag=haveCarryBag;
	}
	
	void decideSection() {
		
		if(items>10 && payment.equalsIgnoreCase("cash"))
			displayCustomerInfo("section1A");
		
		if(items<10 && payment.equalsIgnoreCase("visa card"))
			displayCustomerInfo("section1B");
		
		if(items<10 && payment.equalsIgnoreCase("cash"))
			displayCustomerInfo("section1C");
		
		if(items>10 && payment.equalsIgnoreCase("visacard"))
			displayCustomerInfo("section1D");
			
	}
	
	public static void main(String[] args) {
		
		Mall mall=new Mall();
		
		mall.customerName("Dhara");
		mall.itemAddedToCart(3);
		mall.paymentDoneUsing("cash");
		mall.decideSection();
		mall.needBill(true);
		mall.haveCarryBag(true);
		
	}
}
