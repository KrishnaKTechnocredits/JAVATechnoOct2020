/* 1. Create a class named as Mall, which contains below methods
a. itemAddedToCart()
b. customerName()
c. paymentDoneUsing()
	i. Visa Card 
	ii. Cash
d. displayCutomerInfo()
e. needBill()
f. haveCarryBag()
g. decideSection()

i.e. console should print: Harsh brought 12 items and payment done using visa card in section 1B

Expectations:
• If items are less than 10 and payment done using cash, then send customer to section 1A
• If items are more than 10 and payment done using visa card, then send customer to section 1B
• If items are more than 10 and payment done using cash, then send customer to section 1C
• If items are less than 10 and payment done using visa card, then send customer to section 1D

Hint: itemAddedToCart method have int parameter, paymentDoneUsing() method have String parameter, needBill() have Boolean parameter & haveCarryBag have Boolean parameter

*/
package ritika.Assignments;

class Mall {
	int numberOfItems;
	String customerName;
	boolean billNeeded;
	boolean carryBag;
	String paymentMethod;
	boolean flag;
	
	void customerName(String customerName) {
		this.customerName = customerName;
	}
	void needBill(boolean billNeeded){
		this.billNeeded = billNeeded;
	}
	void haveCarryBag(boolean carryBag){
		this.carryBag = carryBag;
	}
	void displayCutomerInfo() {
		System.out.println("Customer's Name is " +customerName);
		if (billNeeded == true)
			System.out.println(customerName + " needs Bill");
		else if (billNeeded == false)
			System.out.println(customerName + " does not need Bill");
		if (carryBag == true)
			System.out.println(customerName + " has Carry Bag");
		else if (carryBag == false)
			System.out.println(customerName + " does not have Carry Bag");
	}
	
	void itemAddedToCart(int numberOfItems){
		this.numberOfItems = numberOfItems;
	}
	
	void paymentDoneUsingCardOrCash(String paymentMethod) {
		if (paymentMethod.equals("Card"))
			flag = true;
		else if (paymentMethod.equals("Cash"))
			flag = false;
	}	

	void decideSection() {
		if (numberOfItems<10 && flag==false) 
			System.out.println(customerName + " bought " + numberOfItems + " items and payment done using cash" + " in section 1A");
		
		else if (numberOfItems>10 && flag==true) 
			System.out.println(customerName + " bought " + numberOfItems + " items and payment done using visa card" + " in section 1B");
		
		else if(numberOfItems>10 && flag==false) 
			System.out.println(customerName + " bought " + numberOfItems + " items and payment done using cash" + " in section 1C");
		
		else if(numberOfItems<10 && flag==true) 
			System.out.println(customerName + " bought " + numberOfItems + " items and payment done using visa card" + " in section 1D");	
	}
	
	public static void main(String [] args) {
		
		Mall mall = new Mall();
		mall.customerName("Harsh");
		mall.needBill(true);
		mall.haveCarryBag(false);
		mall.itemAddedToCart(12);
		mall.paymentDoneUsingCardOrCash("Card");
		mall.displayCutomerInfo();
		System.out.println("------------------------------------------------------------");
		mall.decideSection();

	}
	
}