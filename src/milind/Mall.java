package milind;

public class Mall {
	
	int numberOfItem;
	String name;
	String paymentMethod;
	boolean billPrint;
	boolean needCarryBag;
	
	void itemAddedToCart(int numberOfItem) {
		this.numberOfItem = numberOfItem;
	}
	
	void customerName(String name) {
		this.name = name;
	}
	
	void paymentDoneUsing(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	void displayCutomerInfo() {
		System.out.print(name + " brought " + numberOfItem + " items and ");		
	}
	
	void needBill(boolean billPrint) {
		this.billPrint = billPrint;
	}
	
	void haveCarryBag(boolean needCarryBag) {
		this.needCarryBag = needCarryBag;
	}
	
	void decideSection() {
		if(numberOfItem < 10 && paymentMethod.equalsIgnoreCase("Cash")) {
			System.out.print("payment done using " + paymentMethod + " in section 1A");
		} else if(numberOfItem > 10 && paymentMethod.equalsIgnoreCase("visa Card")) {
			System.out.print("payment done using " + paymentMethod + " in section 1B");
		} else if(numberOfItem > 10 && paymentMethod.equalsIgnoreCase("Cash")){
			System.out.print("payment done using " + paymentMethod + " in section 1C");
		}else if(numberOfItem < 10 && paymentMethod.equalsIgnoreCase("Visa card")) {
			System.out.print("payment done using " + paymentMethod + " in section 1D");
		}
	}
	
	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.customerName("Milind");
		mall.itemAddedToCart(12);
		mall.paymentDoneUsing("visa card");
		mall.needBill(true);
		mall.haveCarryBag(true);
		mall.displayCutomerInfo();
		mall.decideSection();
	}

}
