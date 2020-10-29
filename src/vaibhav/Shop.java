package vaibhav;

public class Shop {	
	int maggie = 50;
	int dosa = 43;
	int oilPackets = 39;
	int paniPuri = 43;
	int masala = 73;
	
	void shopping(int noOfMaggies,int noOfDosas,int noOfOilPackets,int NoOfPaniPuri,int noOfMasalas ) {		
		if(noOfMaggies>maggie)
			maggie = 0;
		else 
			maggie=maggie-noOfMaggies;
		if(noOfDosas>dosa)
			dosa=0;
		else 
			dosa=dosa-noOfDosas;
		if(noOfOilPackets>oilPackets)
			oilPackets=0;
		else 
			oilPackets=oilPackets-noOfOilPackets;
		if(NoOfPaniPuri>paniPuri)
			paniPuri=0;
		else 
			paniPuri=paniPuri-NoOfPaniPuri;
		if(noOfMasalas>masala)
			masala=0;
		else 
			masala=masala-noOfMasalas;			
	}
	
	void displayOutOfStocksItems() {		
		if(maggie == 0)
			System.out.println("Maggie is out of stock");
		if(dosa == 0)
			System.out.println("Dosa is out of stock");
		if(oilPackets == 0)
			System.out.println("OilPackets are out of stock");
		if(paniPuri == 0)
			System.out.println("panipuri is out of stock");
		if(masala == 0)
			System.out.println("masala is out of stock");
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
		shop.shopping(3, 4, 5, 6, 7);
		shop.displayOutOfStocksItems();
		shop.displayAvailableInStocksItems();
	}

}
