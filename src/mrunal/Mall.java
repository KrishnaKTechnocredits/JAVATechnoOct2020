package mrunal;

public class Mall {
	
	String customerName;
	int itemAddedToCart;
	String paymentDoneUsing;
	boolean needBill;
	boolean haveCarryBag;
	
	void customerName(String customerName)
	{
		this.customerName=customerName;
	}
	void itemAddedToCart(int itemAddedToCart)
	{
		this.itemAddedToCart=itemAddedToCart;
	}
	
	
	void DisplayCustomerInfo()
	{
		
		if (itemAddedToCart<10)
		{
			System.out.println(customerName +  " brought " + itemAddedToCart + " items " + " and Payment is done using Cash" );
		}
		else
		{
			System.out.println(customerName +  " brought " + itemAddedToCart + " items " + " and Payment is done using VisaCard");
		}
	}
	
	void DecideSection ()
	{
		if (itemAddedToCart<10)
		{
			System.out.println("section 1A");
		}
		else if (itemAddedToCart>10)
		{
			System.out.println("section 1B");
		}
	}

	public static void main(String[] args) {

Mall m = new Mall();
m.customerName("Harsh");
m.itemAddedToCart(12);
m.DecideSection ();
m.DisplayCustomerInfo();
	}

}
