package vishakha;

public class Mall {

		int numOfItem;
		String customerName;
		String paymentMode;
		boolean needBill;
		boolean haveCarryBag;
		String section;
		
		void customerName(String customerName){
			this.customerName = customerName;
		}
		
		void itemAddedToCart(int numOfItem){
			this.numOfItem = numOfItem;
		}
		
		void paymentDoneUsing(String paymentMode){
			this.paymentMode = paymentMode;
		}
		
		void needBill(boolean needBill){
			this.needBill = needBill;
		}
		
		void haveCarryBag(boolean haveCarryBag){
			this.haveCarryBag = haveCarryBag;
		}
		void displayCustomerInfo(){
			System.out.println(customerName+ " has bought " +numOfItem+ " items and payment is done using " +paymentMode+ "in " +section);
			if(needBill && !haveCarryBag){
				System.out.println("Customer needs bill and carry bag");
			}
		}
		
		void decideSection(){
			if(numOfItem < 10 && paymentMode.equals("Cash"))
				section = "Section 1A";
			if(numOfItem > 10 && paymentMode.equals("Visa Card"))
				section = "Section 1B";
			if(numOfItem > 10 && paymentMode.equals("Cash"))
				section = "Section 1C";
			if(numOfItem < 10 && paymentMode.equals("Visa Card"))
				section = "Section 1D";
		}
		
		public static void main(String[] a){
			Mall mall = new Mall();
			mall.customerName("Vishakha");
			mall.haveCarryBag(false);
			mall.needBill(true);
			mall.itemAddedToCart(50);
			mall.paymentDoneUsing("Visa Card");
			mall.decideSection();
			mall.displayCustomerInfo();
		}
}
