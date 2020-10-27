package priyanka;

class Mall{
	 String customerName;
	 int noOfItems;
	 String payment;
	 boolean needBill;
	 boolean carryBag;
	 
	 void customerName(String customerName){
		this.customerName=customerName;
	 }
	 void itemAddedToCart(int noOfItems){
		this.noOfItems=noOfItems;	
	 }
	 void paymentDoneUsing(String payment){
		this.payment=payment;	
	 }
	  void needBill(boolean needBill){
		this.needBill=needBill;
	  }
	  void haveCarryBag(boolean carryBag){
		this.carryBag=carryBag;	
	  }
	  void decideSection(){
		  if(noOfItems<10 && payment == "Cash")
			  System.out.println(" in section A ");
		  else if(noOfItems>10 && payment == "VisaCard")
			  System.out.println(" in section 1B ");
		  else if(noOfItems>10 && payment == "Cash")
			  System.out.println("in section 1C");
		  else if(noOfItems<10 && payment == "VisaCard")
			  System.out.println(" in section 1D");
	  }
	  void displayCustomerInfo(){  
		  System.out.println(customerName+" brought "+noOfItems+" items and payment is done using "+payment);	  
	  }
	  public static void main(String[] arg){
		  Mall mall = new Mall();
			mall.customerName("Harsh"); 
			mall.itemAddedToCart(14);
			mall.paymentDoneUsing("VisaCard");
			mall.displayCustomerInfo();
			mall.decideSection();	
		  }  
   }
