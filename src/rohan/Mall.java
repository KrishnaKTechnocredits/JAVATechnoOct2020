package rohan;

public class Mall {
	int items;
	String customerName;
	String paymentMode;
	int paymentFlag;
	boolean isBillRequired;
	boolean isCarryBagRequired;
	String section;
	
	void itemAddedCart(int items) {
		this.items = items;
	}
	void customerName(String customerName) {
		this.customerName = customerName;
	}
	void paymentDoneUsing(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	void billRequired(boolean isBillRequired) {
		this.isBillRequired = isBillRequired;
	}
	void carryBagRequired(boolean isCarryBagRequired) {
		this.isCarryBagRequired = isCarryBagRequired;
	}
	void decideSection() {
		if(items < 10 && paymentMode.equalsIgnoreCase("cash"))
			section = "1A";
		else if(items > 10 && paymentMode.equalsIgnoreCase("visa card"))
			section = "1B";
		else if(items > 10 && paymentMode.equalsIgnoreCase("cash"))
			section = "1C";
		else
			section = "1D";
	}
	void displayCustomerInfo() {
		if(isBillRequired)
			System.out.println("Customer needs bill");
		else
			System.out.println("Customer does not bill");
		
		if(isCarryBagRequired)
			System.out.println("Customer needs carry bag");
		else
			System.out.println("Customer does not need carry bag");
		
		System.out.println(customerName + " brought "+items+" items and payment done using "+ paymentMode + " in Section "+section);
	}
	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.itemAddedCart(12);
		mall.customerName("Rohan");
		mall.paymentDoneUsing("visa card");
		mall.billRequired(true);
		mall.carryBagRequired(false);
		mall.decideSection();
		mall.displayCustomerInfo();
	}
}
