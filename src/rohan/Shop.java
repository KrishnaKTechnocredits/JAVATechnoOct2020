package rohan;

public class Shop {

	static int maggie = 50;
	static int dossaPackets = 43;
	static int oilPouches = 39;
	static int paniPuri = 43;
	static int masalaPouches = 73;
	
	void purchaseMade(int maggie, int dossaPackets, int oilPouches, int paniPuri, int masalaPouches) {
		if(Shop.maggie == 0) //Maggie 
			itemsOutStock();
		else if(Shop.maggie < maggie) {
			System.out.println("Available stock for maggie is only "+Shop.maggie);
			System.out.println("Please select quantity accordingly");
		}
		else {
			Shop.maggie = Shop.maggie - maggie;
			System.out.println("Customer purchased " +maggie+ " maggie packets");
		}
		
		if(Shop.dossaPackets == 0) // Dossa Packets
			itemsOutStock();
		else if(Shop.dossaPackets < dossaPackets) {
			System.out.println("Available stock for Dossa packets is only "+Shop.dossaPackets);
			System.out.println("Please select quantity accordingly");
		}
		else {
			Shop.dossaPackets = Shop.dossaPackets - dossaPackets;
			System.out.println("Customer purchased " +dossaPackets+ " Dossa packets");
		}
		
		if(Shop.oilPouches == 0) //Oil Pouches
			itemsOutStock();
		else if(Shop.oilPouches < oilPouches) {
			System.out.println("Available stock for Oil Pouches is only "+Shop.oilPouches);
			System.out.println("Please select quantity accordingly");
		}
		else {
			Shop.oilPouches = Shop.oilPouches - oilPouches;
			System.out.println("Customer purchased " +oilPouches+ " Oil Pouches");
		}
		
		if(Shop.masalaPouches == 0) // Masala Packets
			itemsOutStock();
		else if(Shop.masalaPouches < masalaPouches) {
			System.out.println("Available stock for Masala Pouches is only "+Shop.masalaPouches);
			System.out.println("Please select quantity accordingly");
		}
		else {
			Shop.masalaPouches = Shop.masalaPouches - masalaPouches;
			System.out.println("Customer purchased " +masalaPouches+ " Masala Pouches");
		}
		
		if(Shop.paniPuri == 0) //Pani Puri
			itemsOutStock();
		else if(Shop.paniPuri < paniPuri) {
			System.out.println("Available stock for Pani Puris is only "+Shop.paniPuri);
			System.out.println("Please select quantity accordingly");
		}
		else {
			Shop.paniPuri = Shop.paniPuri - paniPuri;
			System.out.println("Customer purchased " +paniPuri+ " Pani Puris");
		}
	}
	
	void itemsInStock() {
		if(Shop.maggie != 0)
			System.out.println("Maggie is available in stock. Available quantity is: " + Shop.maggie);
		if(Shop.dossaPackets != 0)
			System.out.println("Dossa packets is available in stock. Available quantity is: " + Shop.dossaPackets);
		if(Shop.oilPouches != 0)
			System.out.println("Oil Pouches is available in stock. Available quantity is: " + Shop.oilPouches);
		if(Shop.paniPuri != 0)
			System.out.println("Pani Puri is available in stock. Available quantity is: " + Shop.paniPuri);
		if(Shop.masalaPouches != 0)
			System.out.println("Masala Pouches is available in stock. Available quantity is: " + Shop.masalaPouches);
	}
	
	void itemsOutStock() {
		if(Shop.maggie!=0 && Shop.dossaPackets!=0 && Shop.oilPouches!=0 && Shop.paniPuri!=0 && Shop.masalaPouches!=0)
			System.out.println("All Items are in Stock");
		else {
			if(Shop.maggie == 0)
				System.out.println("Maggie is running out of stock");
			if(Shop.dossaPackets == 0)
				System.out.println("Dossa packets are running out of stock");
			if(Shop.oilPouches == 0)
				System.out.println("Oil Pouches are running out of stock");
			if(Shop.paniPuri == 0)
				System.out.println("Pani Puris are running out of stock");
			if(Shop.masalaPouches == 0)
				System.out.println("Masala Pouches are running out of stock");
		}
	}
	
	public static void main(String[] a) {
		Shop shop = new Shop();
		shop.purchaseMade(40,10,20,15,30);
		System.out.println("---------Sale2----------");
		shop.purchaseMade(10,33,6,7,48);
		//shop.purchaseMade(1,0,0,0,0);
		System.out.println();
		System.out.println("----------Items in Stock ------------- ");
		shop.itemsInStock();
		System.out.println();
		System.out.println("----------Items out OF Stock ------------- ");
		shop.itemsOutStock();
	}
}
