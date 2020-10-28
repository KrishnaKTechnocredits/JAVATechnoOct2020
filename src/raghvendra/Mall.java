package raghvendra;

public class Mall {
	
	int item;
	String custName;
	String paymentMethod;
	boolean bill;
	boolean neddCarryBag;
	
	
	void itemAddedToCart(int item) {
		this.item=item;
	}
	
	void customerName(String custName) {
		this.custName=custName;
		}
	
	void paymentDoneUsing(String paymentMethod) {
		this.paymentMethod= paymentMethod;
	}
	
	void displayCustomerInfo() {
		System.out.println(custName+" has bought "+item+" items");	
	}
	
	void needBill(boolean bill){
		this.bill=bill;
	}
	
	void haveCarryBag(boolean neddCarryBag) {
		this.neddCarryBag=neddCarryBag;
	}
	
	void decideSection() {
		
		if (item<10 && paymentMethod.equalsIgnoreCase("Cash"))
			System.out.println("Payment done using "+paymentMethod+" in section 1A");
		else if (item>10 && paymentMethod.equalsIgnoreCase("Visa Card"))
			System.out.println("Payment done using "+paymentMethod+" in section 1B");
		else if (item>10 && paymentMethod.equalsIgnoreCase("Cash"))
			System.out.println("Payment done using "+paymentMethod+" in section 1C");
		else if (item<10 && paymentMethod.equalsIgnoreCase("Visa Card"))
			System.out.println("Payment done using "+paymentMethod+" in section 1D");
	}
	
	public static void main(String[] args) {
		
		Mall mall=new Mall();
		mall.itemAddedToCart(12);
		mall.customerName("Raghvendra");
		mall.paymentDoneUsing("Visa Card");
		mall.displayCustomerInfo();
		mall.needBill(false);
		mall.haveCarryBag(false);
		mall.decideSection();

	}
}
