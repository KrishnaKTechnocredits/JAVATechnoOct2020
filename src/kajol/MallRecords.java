package kajol;

public class MallRecords{
	String customerName;
	int numberOfItems;
	String modeOfPayment;
	boolean customerNeedsBill;
	boolean customerNeedsCarryBag;
	String paymentSection;
	void setCustomerName(String customerName ){
		this.customerName=customerName;			
	}
	
	void numberOfItemsAddedToCard(int numberOfItems){
		this.numberOfItems=numberOfItems;
	}
	
	void paymentDoneUsing(String modeOfPayment){
		this.modeOfPayment=modeOfPayment;
	}
	
	void doesCustomerNeedBillCopy(boolean customerNeedsBill){
		this.customerNeedsBill=customerNeedsBill;
	}
	
	void doesCustomerNeedCarryBag(boolean customerNeedsCarryBag){
		this.customerNeedsCarryBag=customerNeedsCarryBag;
	}
	
	void decidepaymentSection(){
		if(numberOfItems<10 && modeOfPayment.equals("Cash")){
			paymentSection="Section 1A";
		}else if(numberOfItems>10 && modeOfPayment.equals("Visa Card")){
			paymentSection="Section 1B";	
		}else if(numberOfItems>10 && modeOfPayment.equals("Cash")){
			paymentSection="Section 1C";
		}else if(numberOfItems<10 && modeOfPayment.equals("Visa Card")){
			paymentSection="Section 1D";
		}
	}
	
	void displayCustomerInformation(){
		System.out.println("Payment Processing......");
		if(customerNeedsCarryBag)
			System.out.println("Carry Bag Charges will be icluded.");
		System.out.println(customerName+" brought "+numberOfItems+" items and payment done using "+modeOfPayment+" in "+paymentSection+".");		
		if(customerNeedsBill)
			System.out.println("Bill Printed Successfully.");
		System.out.println("Payment Done.");
		System.out.println("Thankyou "+customerName+" and visit again.");
	}

	public static void main(String[] args){
		MallRecords mallRecords= new MallRecords();
		mallRecords.setCustomerName("Kajol");
		mallRecords.numberOfItemsAddedToCard(13);
		mallRecords.paymentDoneUsing("Visa Card");
		mallRecords.doesCustomerNeedBillCopy(true);
		mallRecords.doesCustomerNeedCarryBag(true);
		mallRecords.decidepaymentSection();
		mallRecords.displayCustomerInformation();	
	}
}
