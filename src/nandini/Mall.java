package nandini;

public class Mall {
	int itemNumbers;
	String name;
	String paymentMode;
	boolean bill;
	boolean carryBag;
	String section;
	void itemAddedToCart(int numberOfItems){
		itemNumbers = numberOfItems;
	}
	
	void customerName(String custName) {
		name = custName;
	}
	
	void paymentDoneUsing(String modeOfPayment) {
		paymentMode = modeOfPayment;
	}
	
	void needBill(boolean bill) {
		this.bill = bill;
	}
	
	void haveCarryBag(boolean carryBag) {
		this.carryBag = carryBag;
	}
	
	void displayCutomerInfo(){
		System.out.println(name+" brought "+itemNumbers+  " items and payment was done using "+ paymentMode+" in "+section);
	}
	
	void decisionSection() {
		if(itemNumbers <= 10 && paymentMode.equals("Cash"))
		{
			section = "Section 1A";
		}
		else if(itemNumbers > 10 && paymentMode.equals("Visa Card"))
		{
			section = "Section 1B";
		}
		else  if(itemNumbers > 10 && paymentMode.equals("Cash"))
		{
			section = "Section 1C";
		}
		else if(itemNumbers <= 10 && paymentMode.equals("Visa Card"))
		{
			section = "Section 1D";		
		}
}
	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.customerName("Nandini");
		mall.itemAddedToCart(50);
		mall.paymentDoneUsing("Visa Card");
		mall.haveCarryBag(true);
		mall.needBill(true);
		mall.decisionSection();
		mall.displayCutomerInfo();
	}

}
