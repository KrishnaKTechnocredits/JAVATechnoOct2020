package anjaliP;

public class Shop {
	static int maggie = 50;
	static int dosa = 43;
	static int oilPouch = 39;
	static int paniPuri = 43;
	static int masala = 73;
	
	void customerItems(int maggie1 , int dosa1 , int oilPouch1 , int paniPuri1 , int masala1) 
	{		
		System.out.println("Customer Purchased :- "+"\n"+"--------------------------------------"
				+"\n"+maggie1+" Maggie Packets"+"\n"+dosa1+" Dosa packets"+"\n"+oilPouch1+
				" Oil Packets"+"\n"+paniPuri1+" Pani Puri packets "+"\n"+masala1+" Masala Packets. ");
		System.out.println("----------------------Current status of Items in stock are----------------");
		if (maggie==0)
			System.out.println("Maggie is Out of Stock");
		else if (maggie1>maggie)
			System.out.println("Maggie is currently running out of Stock");
		else maggie = maggie - maggie1;
			System.out.println("Maggie Available in Stock : "+maggie);
			
		if (dosa==0)
			System.out.println("Dosa Packet is Out of Stock");
		else if (dosa1>dosa)
			System.out.println("Dosa Packet is currently running out of Stock");
		else dosa = dosa - dosa1;
			System.out.println("Dosa Packet Available in Stock : "+dosa);
			
		if (oilPouch==0)
			System.out.println("OilPouch is Out of Stock");
		else if (oilPouch1>oilPouch)
			System.out.println("OilPouch is currently running out of Stock");
		else oilPouch = oilPouch - oilPouch1;
			System.out.println("OilPouch Available in Stock : "+oilPouch);
			
		if (paniPuri==0)
			System.out.println(" PaniPuri is Out of Stock");
		else if (paniPuri1>paniPuri)
			System.out.println("PaniPuri is currently running out of Stock");
		else paniPuri=paniPuri-paniPuri1;
			System.out.println("PaniPuri Available in Stock : "+paniPuri);
			
		if (masala==0)
			System.out.println("Masala packet is Out of Stock");
		else if (masala1>masala)
			System.out.println("Masala is currently running out of Stock");
		else masala = masala -1;
			System.out.println("Masala packet Available in Stock: "+masala);
	}	
	void itemOutOfStock() {
		System.out.println("-----------------------Items Out Of stock----------------");
		if (maggie==0)
				System.out.println("Maggie is Out of Stock");
		else if (dosa==0)
			System.out.println("Dosa Packet is Out of Stock");
		else if (oilPouch==0)
			System.out.println("OilPouch is Out of Stock");
		else if (paniPuri==0)
			System.out.println("PaniPuri is Out of Stock");
		else if (masala==0)
			System.out.println("Masala packet is Out of Stock");
	}	
	void itemInStock() {
		System.out.println("---------------------Items available in stock--------------------");
		if (maggie!=0)
			System.out.println("Maggie Available in Stock "+maggie);
	else if (dosa!=0)
		System.out.println("Dosa Packet Available in Stock "+dosa);
	else if (oilPouch!=0)
		System.out.println("OilPouch Available in Stock "+oilPouch);
	else if (paniPuri!=0)
		System.out.println("PaniPuri Available in Stock "+paniPuri);
	else if (masala!=0)
		System.out.println("Masala packet Available in Stock "+masala);
	}
	public static void main(String[] a) {
		Shop shop = new Shop();
		shop.customerItems(25, 30, 17, 25, 43);
		shop.itemInStock();
		shop.itemOutOfStock();
	}

}
