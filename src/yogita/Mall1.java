package yogita;

public class Mall1 {
	 int cartItem;
     String section;
	 String paymentMode;
	
	void itemAddedToCart(int cartItem) {
		this.cartItem = cartItem;
	}
	
	void paymentDoneUSing(String paymentMode){
		this.paymentMode = paymentMode;
	}
	
	void displayCustomerInformation(String customerName) {
		System.out.println(customerName+ " has brought " + cartItem + " items And payment done using " +paymentMode+ " in section "  +section);
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
        Mall1 mall = new Mall1();
        mall.itemAddedToCart(15);
        mall.paymentDoneUSing("VISA CARD");
        mall.decisionSection();
        mall.displayCustomerInformation("Yogita");
       
    }

}