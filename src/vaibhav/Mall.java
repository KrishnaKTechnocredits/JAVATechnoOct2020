package vaibhav;

public class Mall {
	
	String customerName;
	int items;
	String paymentMethod;
	boolean needBill;
	boolean needCarryBag;
	String section;
	
	void itemAddedToCart(int items) {
		this.items = items;
	}
	void customerName(String customerName){
		this.customerName = customerName;
	}
	void paymentDone(String paymentMethod) {
		//Visa Card or Cash
		this.paymentMethod = paymentMethod;
	}
	void displayCutomerInfo() {
		System.out.println(customerName+" brought "+items+" Items "+"and payement done using "+paymentMethod+" in section "+section);
		
	}
	void needBill(boolean needBill) {
		this.needBill = needBill;
	}
	void haveCarryBag(boolean needCarryBag) {
		this.needCarryBag = needCarryBag;
	}
	void decideSection() {
		if (items < 10 && paymentMethod == "Cash") 
			section = "1A";			
		else if(items > 10 && paymentMethod == "Visa")
			section = "1B";		
		else if(items > 10 && paymentMethod == "Cash")
			section = "1C";
		else if(items < 10 && paymentMethod == "Visa")
			section = "1D";		
	}

	public static void main(String[] args) {
		
		Mall mall =new Mall();
		mall.customerName("Rohan");
		mall.itemAddedToCart(8);
		mall.paymentDone("Cash");
		mall.decideSection();
		mall.displayCutomerInfo();
		
	}

}
