package prasad;

public class Shop {
	int maggie = 50;
	int oilPouch = 0;
	int paniPuri = 43;
	int masalaPackets = 73;

	void customerorder(int item1,int item2,int item3,int item4) {
		if(maggie==0)
			System.out.println("[!] Sorry Maggie is running out of stock."); 
		else if (item1>maggie) 
			System.out.println("Sorry quantity ordered for maggie cannot be fulfilled.");
			else maggie = maggie-item1;
		if(oilPouch==0)
			System.out.println("[!] Sorry Oil Pouches are running out of stock.");
		else if (item2>oilPouch)
				System.out.println("Sorry quantity ordered for oil pouch cannot be fulfilled.");
				else oilPouch = oilPouch-item2;
		if(paniPuri==0)
			System.out.println("[!] Sorry Pani Puri packets are running out of stock.");
		else if(item3>paniPuri)
				System.out.println("Sorry quantity ordered for pani puri packets cannot be fulfilled.");
				else paniPuri = paniPuri-item3;
		if(masalaPackets==0)
			System.out.println("[!] Sorry Masala Packets are running out of stock.");
		else if(item4>masalaPackets)
				System.out.println("Sorry quantity ordered for pani puri packets cannot be fulfilled.");
				else masalaPackets = masalaPackets-item4;
	}
	
	void outofstockitems() {
		if(maggie==0)
			System.out.println("Items out of stock - Maggie.");
		else if(oilPouch==0)
			System.out.println("Items out of stock - Oil Pouches.");
		else if(paniPuri==0)
			System.out.println("Items out of stock - Pani Puri Packets.");
		else if(masalaPackets==0)
			System.out.println("Items out of stock - Masala Packets.");	
	}
	
	void instockitems() {
		System.out.println(">Items avaliable in inventory: ");
		if(maggie!=0)
			System.out.println("Maggie nos: " + maggie);
	    if(oilPouch!=0)
			System.out.println("Oil pouches nos: " + oilPouch);
		if(paniPuri!=0)
			System.out.println("Pani Puri Packets nos: " + paniPuri);
		if(masalaPackets!=0)
			System.out.println("Masala Packets nos: " + masalaPackets);
	}
	
	public static void main(String[]arg) {
		Shop shop = new Shop();
		shop.customerorder(59,20,40,23);
		shop.outofstockitems();
		shop.instockitems();
	}
		
	}
