package anjaliS;

public class Mall {
	 int itemAdded;
     String section;
     String paymentMethod;


     void itemAddedToCart(int itemAdded) {
    	 this.itemAdded = itemAdded;
  }

     void paymentDoneUSing(String paymentMethod){
    	 this.paymentMethod = paymentMethod;
  }

     void displayCustomerInfo(String customerName) {
    	 System.out.println(customerName+ " brought " + itemAdded + " items And payment done using " +paymentMethod+ " in section "  +section);
  }


     void decideSection() {
    	 if(itemAdded <=10 && paymentMethod.equalsIgnoreCase("cash")) 
    		 section = "1A";
    	 else if(itemAdded >10 && paymentMethod.equalsIgnoreCase("visa card")) 
                   section = "1B";
    	 else if(itemAdded >10 && paymentMethod.equalsIgnoreCase("cash")) 
    		 section = "1C";
    	 else if(itemAdded <=10 && paymentMethod.equalsIgnoreCase("visa card")) 
    		 section = "1D";
  }

     public static void main(String[] args) {
    	 Mall mall = new Mall();
    	 mall.itemAddedToCart(20);
    	 mall.paymentDoneUSing("VISA CARD");
    	 mall.decideSection();
    	 mall.displayCustomerInfo("Anjali");
 
   }

}