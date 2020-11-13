package suresh;

public class Mall {
		int items;
	String customername;
	String paymentmethod;
	boolean billrequired;
	boolean carrybag;
	String section;
	
	 void itemAddedToCart(int items) {
		 this.items = items;
		 }
	 void customerName(String customername) {
		 this.customername = customername;
		 	 }
	 void paymentDoneUsing(String paymentmethod){
		  this.paymentmethod = paymentmethod;
	 }
	void needBill(boolean billrequired ) {
		this.billrequired = billrequired;
	}
	void haveCarryBag(boolean carrybag ) {
		this.carrybag = carrybag;		
	}
	void decideSection() {
		if(items < 10 && paymentmethod == "cash")
			section = "Section1A";	 
		else if (items > 10 && paymentmethod == "Visa")
			section = "Section1B";
		else if (items > 10 && paymentmethod == "Cash")
			section = "Section1C";
		else if (items < 10 && paymentmethod == "Visa")
			section = "Section1D";
	}
	void displayCutomerInfo() {
		System.out.println(customername + " has bought " + items + " number of items and payment is done using "
				+ paymentmethod + " in " + section);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mall mall  = new Mall();
		
		mall.itemAddedToCart(9);
		mall.customerName("Harsh");
		mall.paymentDoneUsing("Visa");
		mall.needBill(true);
		mall.haveCarryBag(true);
		mall.decideSection();
		mall.displayCutomerInfo();

	}

}
