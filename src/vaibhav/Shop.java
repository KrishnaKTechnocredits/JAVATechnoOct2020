package vaibhav;

public class Shop {	
	int maggie = 50;
	int dosa = 43;
	int oilPackets = 39;
	int paniPuri = 43;
	int masala = 73;
	
	void shopping(int noOfMaggies,int noOfDosas,int noOfOilPackets,int NoOfPaniPuri,int noOfMasalas ) {		
		if(noOfMaggies > maggie)
			System.out.println("Given quantity for maggie is not available in inventory.The available Quantity is "+maggie);
		else 
			maggie = maggie - noOfMaggies;
		if(noOfDosas > dosa)
			System.out.println("Given quantity for dosa is not available in inventory.The available Quantity is "+dosa);
		else 
			dosa = dosa - noOfDosas;
		if(noOfOilPackets > oilPackets)
			System.out.println("Given quantity for Oil packet not available in inventory.The available Quantity is "+oilPackets);
		else 
			oilPackets = oilPackets - noOfOilPackets;
		if(NoOfPaniPuri > paniPuri)
			System.out.println("Given quantity for panipuri not available in inventory.The available Quantity is "+paniPuri);
		else 
			paniPuri = paniPuri - NoOfPaniPuri;
		if(noOfMasalas > masala)
			System.out.println("Given quantity of masala is not available in inventory.The available Quantity is "+masala);
		else 
			masala = masala - noOfMasalas;			
	}
	
	void displayOutOfStocksItems() {		
		if(maggie == 0)
			System.out.println("Magiie is out of stock");
		if(dosa == 0)
			System.out.println("Dosa is out of stock");
		if(oilPackets == 0)
			System.out.println("Oil Packets are out of stock");
		if(paniPuri == 0)
			System.out.println("PaniPuri is out of stock");
		if(masala == 0)
			System.out.println("Masala is out of stock");
	}
	
	void displayAvailableInStocksItems() {
		if(maggie != 0)
		System.out.println("Quantity of maggie available in stock is " +maggie);
		if (dosa != 0)
		System.out.println("Quantity of Dosa available in stock is " +dosa);
		if(oilPackets != 0)
		System.out.println("Quantity of Oilpackets available in stock is " +oilPackets);
		if(paniPuri != 0)
		System.out.println("Quantity of panipuri available in stock is " +paniPuri);
		if(masala != 0)
		System.out.println("Quantity of masala available in stock is " +masala);		
	}	

	public static void main(String[] args) {
		Shop shop=new Shop();
		shop.shopping(49, 4, 5, 6, 7);
		shop.displayOutOfStocksItems();
		shop.displayAvailableInStocksItems();
		shop.shopping(51, 4, 5, 6, 7);
		shop.displayOutOfStocksItems();
		shop.displayAvailableInStocksItems();
		}

}
