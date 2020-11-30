package anurag;

public class Mall {
	int item;
	String customName;
	String visaCard ;
	String cash;
    String section;
    String paymentMethod;
    
    void itemAddedToCart(int item) {
		this.item = item;
		}
	void customerName(String customName ) {
		this.customName=customName;
		}
	void paymentDoneUsing(String paymentMethod) {
		this.paymentMethod = paymentMethod;
		}
	void needBill(boolean bill){ 
		 if(bill==true) 
			 System.out.println("bill given");
		}
	 void haveCarryBag(boolean carrybag) {
		 if(carrybag==true)
			 System.out.println("carrybag given");
		}
	 void decideSection() {
		 if(item < 10 && paymentMethod == "Cash")
			 section = "1A";
		 else if (item > 10 && paymentMethod == "Visa Card")
			 section = "1B";
		 else if (item > 10 && paymentMethod == "Cash")
			 section = "1C";
		 else if (item < 10 && paymentMethod == "Visa card" )
			 section = "1D";
		 else
			 section ="No section assigned , please check your data" ;
		  }
	 
	 void displaycustomerInfo() {
		 System.out.println(customName + " brought " + item + " items and Payment done using " + paymentMethod + " in section " + section);
	      }
	  public static void main(String[] args) {
		 Mall mall1 = new Mall();
		 mall1.customerName("Harsh");
		 mall1.itemAddedToCart(12);
		 mall1.paymentDoneUsing("Visa Card");
		 mall1.decideSection();
		 mall1.displaycustomerInfo();
		 }
	 
}


