package priya;

public class Shop {

	int maggieStock;
	int dosaStock;
	int oilPouches;
	int panipuriPackets;
	int masalaStock;
	int noOfMaggiePurchased;
	int noOfDosaPurchased;
	int noOfOilPurchased;
	int noOfPanipuriPurchased;
	int noOfMasalaPurchased;

	void maggieStock(int maggieStock){
		this.maggieStock = maggieStock;
	}

	void dosaStock(int dosaStock){
		this.dosaStock = dosaStock;
	}

	void oilPouches(int oilPouches){
		this.oilPouches = oilPouches;
	}

	void panipuriPackets(int panipuriPackets){
		this.panipuriPackets = panipuriPackets;
	}

	void masalaStock(int masalaStock){
		this.masalaStock = masalaStock;
	}

	void noOfMaggiePurchased(int noOfMaggiePurchased){
		this.noOfMaggiePurchased = noOfMaggiePurchased;
	}

	void noOfDosaPurchased(int noOfDosaPurchased){
		this.noOfDosaPurchased = noOfDosaPurchased;
	}

	void noOfOilPurchased(int noOfOilPurchased){
		this.noOfOilPurchased = noOfOilPurchased;
	}

	void noOfPanipuriPurchased(int noOfPanipuriPurchased){
		this.noOfPanipuriPurchased = noOfPanipuriPurchased;
	}

	void noOfMasalaPurchased(int noOfMasalaPurchased){
		this.noOfMasalaPurchased = noOfMasalaPurchased;
	}

	void displayInformation(){
		System.out.println("Customer purchased " +noOfMaggiePurchased+ " Maggi packets, " +noOfOilPurchased+" Oil Packets, " +noOfDosaPurchased +" Dosa Packets, " +noOfPanipuriPurchased+ " Panipuri packets, " +noOfMasalaPurchased+ " Masala packets");
	}
	void outOfStock(){
		int availableMaggieStock = maggieStock - noOfMaggiePurchased;
		int availableDosaStock = dosaStock - noOfDosaPurchased;
		int availableOilStock = oilPouches - noOfOilPurchased;
		int availablePanipuriStock = panipuriPackets - noOfPanipuriPurchased;
		int availableMasalaStock = masalaStock - noOfMasalaPurchased;
		System.out.println("Items available in stock****");
		if(noOfMaggiePurchased < maggieStock)			
			System.out.println("Maggie is available. Available quantity is "+ availableMaggieStock+ " packets");		
		if(noOfDosaPurchased < dosaStock)
			System.out.println("Dosa is available. Available quantity is "+ availableDosaStock+ " packets");
		if(noOfOilPurchased < oilPouches)			
			System.out.println("Oil is available. Available quantity is "+ availableOilStock+ " packets");
		if(noOfPanipuriPurchased < panipuriPackets)
			System.out.println("Panipuri is available. Available quantity is "+ availablePanipuriStock+ " packets");
		if(noOfMasalaPurchased < masalaStock)			
			System.out.println("Masala is available. Available quantity is "+ availableMasalaStock+ " packets");
	}

	void runningOutOfStock(){
		System.out.println("Item out of stock****");
		if(noOfMaggiePurchased > maggieStock)
			System.out.println("Maggie is currently out of stock.");
		if(noOfDosaPurchased > dosaStock)
			System.out.println("Dosa packets are currently out of stock.");
		if(noOfOilPurchased > oilPouches)
			System.out.println("Oil Pouches are currently out of stock.");
		if(noOfPanipuriPurchased > panipuriPackets)
			System.out.println("Panipuri packets are currently out of stock.");
		if(noOfMasalaPurchased > masalaStock)
			System.out.println("Masala packets are currently out of stock.");
	}

	public static void main(String[] a){
		Shop shop = new Shop();
		shop.maggieStock(50);
		shop.dosaStock(43);
		shop.oilPouches(39);
		shop.panipuriPackets(43);
		shop.masalaStock(73);
		shop.noOfMaggiePurchased(45);
		shop.noOfDosaPurchased(42);
		shop.noOfOilPurchased(40);
		shop.noOfPanipuriPurchased(2);
		shop.noOfMasalaPurchased(75);
		shop.displayInformation();
		shop.outOfStock();
		shop.runningOutOfStock();
	}
}
