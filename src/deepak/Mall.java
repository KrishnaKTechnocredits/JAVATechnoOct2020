package deepak;

public class Mall {
	
	int items;
	String payment;
	String name;
	String section;
	
	void ItemAddedToCart(int itemsBought){
		
		items = itemsBought;	
	}
	
	void customerName(String customerName){
		
		name = customerName;
	}
	
	void paymentDoneUsing( String paymentType){
		
		payment = paymentType;
		
	}
	
	void displayCustomerInfo(){
		
		System.out.println(name +" "+ "bought"+" "+ items + " "+ "items and"+ " "+ "payment done using"+ " "+ payment + " in" + " "+ "section"+ " "+ section);
		
	}
	
	void needBill(boolean flag){
		
		if(flag) {
			
			System.out.println(name+" "+ "needs a bill");
		}
		else {
			System.out.println(name+" "+ "does not need bill");
		}
		
	}
	
	void haveCarryBag(boolean flag){
		if(flag) {
			
			System.out.println(name+" "+ "needs a carry bag");
		}
		else {
			System.out.println(name+" "+ "does not need carry bag");
		}
		
		
	}
	
	void decideSection(){
		
		if(items < 10 && payment.equalsIgnoreCase("cash")) {
			
			section = "1A";	
		}
		
		else if(items > 10 && payment.equalsIgnoreCase("visa card")){
			
			section = "1B";		
		}
		
		else if(items > 10 && payment.equalsIgnoreCase("cash")){
			
			section = "1C";
			
		}
		
		else if(items < 10 && payment.equalsIgnoreCase("visa card")) {
			
			section = "1D";
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mall mall = new Mall();
		mall.customerName("Harsh");
		mall.ItemAddedToCart(12);
		mall.paymentDoneUsing("cash");
		mall.decideSection();
		mall.displayCustomerInfo();
		mall.needBill(true);
		mall.haveCarryBag(false);

	}

}

