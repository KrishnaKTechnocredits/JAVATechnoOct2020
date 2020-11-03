package monika;
class Mall{

   int noOfItems;
   String customerName;
   String paymentMethod;
   boolean billRequired;
   boolean carryBag;
   String sectionDecide;
   
   void itemAddedToCart(int noOfItems){
      this.noOfItems = noOfItems;
	  
	} 
 
   void customerName(String customerName){
        this.customerName = customerName;
		
	}
	
	void paymentDoneUsing(String paymentMethod){
	    this.paymentMethod = paymentMethod;
		
	}
	
	void needBill(boolean billRequired){
	    this.billRequired = billRequired;
		
	}
	
	void haveCarryBag(boolean carryBag){
	    this.carryBag = carryBag;
		
	}
	
	void decideSection() {
		if (noOfItems < 10 && paymentMethod == "Cash")
			sectionDecide = "Section1A";
		else if (noOfItems > 10 && paymentMethod == "Visa")
			sectionDecide = "Section1B";
		else if (noOfItems > 10 && paymentMethod == "Cash")
			sectionDecide = "Section1C";
		else if (noOfItems < 10 && paymentMethod == "Visa")
			sectionDecide = "Section1D";
	}
	
	void displayCustomerInfo() {
		System.out.println(customerName + " has bought " + noOfItems + " number of items and payment is done using "
				+ paymentMethod + " in " + sectionDecide);
	}
	
	
	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.itemAddedToCart(12);
		mall.customerName("Harsh");
		mall.paymentDoneUsing("Visa");
		mall.needBill(true);
		mall.haveCarryBag(true);
		mall.decideSection();
		mall.displayCustomerInfo();

	}

}







