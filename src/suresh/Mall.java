package suresh;
public class Mall {
	int items;
	 void itemAddedToCart(int items) {
		 this.items = items;
		 System.out.println("Items Added to Cart: " + items);
		if(items < 10) {
		 
			System.out.println("<--->Payment done using cash for less than 10 items<---->");
		}
		
		 
	 }
	 void customerName(String customername) {
		 
		if(items>10) {
			 System.out.println("<--->Payment done using visa card for more than 10 items<-->");
		System.out.println("customer Name is : " + customername);
		}
		 
		 	 }
	 void paymentDoneUsing(String paymenttype){
		 if(items>10) {
			 System.out.println("<--->Payment done using cash for more than 10 items<-->");
		
		}
	 }
		
	void displayCutomerInfo(String customername) {
		if(items>10) {
			 System.out.println("<--->Payment done using visa card for more than 10 items<-->");
		System.out.println("customer Name is : " + customername);
		}
	}
	void needBill(boolean bill ) {
		System.out.println("Need Bill:" + bill);
		
	}
	void haveCarryBag(boolean carrybag ) {
		
		System.out.println("Having Carry Bag:" + carrybag);
	}
	void decideSection(boolean decide) {
		System.out.println("Decide confirmation" + decide);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mall mall  = new Mall();
		
		mall.itemAddedToCart(12);
		mall.customerName("Suresh");
		mall.haveCarryBag(true);
		mall.needBill(true);
		

	}

}
