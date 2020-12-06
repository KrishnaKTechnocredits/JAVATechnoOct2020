package yogita;

public class Mall {
	 int cartItem;
     String section;
	 String paymentMode;
	 boolean wantBill;
	 boolean carryBag;
	
	void itemAddedToCart(int cartItem) {
		this.cartItem = cartItem;
	}
	
	void paymentDoneUSing(String paymentMode){
		this.paymentMode = paymentMode;
	}
	
	void displayCustomerInformation(String customerName) {
		System.out.println(customerName+ " has brought " + cartItem + " items And payment done using " +paymentMode+ " in section "  +section);
	}
	void needBill(boolean wantBill) {
		this.wantBill = wantBill;
		if(wantBill)
		 System.out.println("Customer need bill");
		else
		 System.out.println("Customer don't need bill");			
	}
	void haveCarryBag(boolean carryBag) {
		this.carryBag = carryBag;
	    if (carryBag)
		  System.out.println("Customert need bag");
		else
		  System.out.println("Customer don't need bag");
	}
 
	void decisionSection() {
		if(cartItem <=10 && paymentMode.equalsIgnoreCase("cash")) 
			section = "1A";
		else if(cartItem >10 && paymentMode.equalsIgnoreCase("visa card")) 
            section = "1B";
		else if(cartItem >10 && paymentMode.equalsIgnoreCase("cash")) 
			section = "1C";
		else if(cartItem <=10 && paymentMode.equalsIgnoreCase("visa card")) 
			section = "1D";
	}
	
public static void main(String[] args) {
        Mall mall = new Mall();
        mall.itemAddedToCart(25);
        mall.paymentDoneUSing("VISA CARD");
        mall.decisionSection();
        mall.displayCustomerInformation("yogita");
        mall.needBill(true);
        mall.haveCarryBag(false);
    }

}
