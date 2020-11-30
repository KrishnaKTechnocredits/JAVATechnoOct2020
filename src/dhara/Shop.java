package dhara;

public class Shop {
	int maggie = 50;
	int dosa = 43;
	int oilPouches = 39;
	int panipuri = 43;
	int masala = 73;
	int maggieQuantity;
	int dosaQuantity;
	int oilPouchQuantity;
	int panipuriQuantity;
	int masalaQuantity;
	int itemPurchased;

	void runningOutOfStock() {
		
		if (maggie == 0)
			System.out.println("Maggie is running out of stock");
		else if (maggie > maggieQuantity) {
			maggie = maggie - maggieQuantity;
			System.out.println("Requested maggie quantity is " + maggieQuantity + " and available quantity is " + maggie);
		} else
			System.out.println("Requested maggie quantity is not available");

		if (dosa == 0)
			System.out.println("Dosa is running out of stock");
		else if (dosa > dosaQuantity) {
			dosa = dosa - dosaQuantity;
			System.out.println("Requested dosa quantity is " + dosaQuantity + " and available quantity is " + dosa);
		} else
			System.out.println("Requested dosa quantity is not available");

		if (oilPouches == 0)
			System.out.println("Oil Pouch is running out of stock");
		else if (oilPouches > oilPouchQuantity) {
			oilPouches = oilPouches - oilPouchQuantity;
			System.out.println(
					"Requested Oil ouch quantity is " + oilPouchQuantity + " and available quantity is " + oilPouches);
		} else
			System.out.println("Requested oil pouch quantity is not available");

		if (panipuri == 0)
			System.out.println("Panipuri is running out of stock");
		else if (panipuri > panipuriQuantity) {
			panipuri = panipuri - panipuriQuantity;
			System.out.println(
					"Requested panipuri quantity is " + panipuriQuantity + " and available quantity is " + panipuri);
		} else
			System.out.println("Requested panipuri quantity is not available");

		if (masala == 0)
			System.out.println("Masala is running out of stock");
		else if (masala > masalaQuantity) {
			masala = masala - masalaQuantity;
			System.out.println("Requested masala quantity is " + masalaQuantity + " and available quantity is " + masala);
		} else
			System.out.println("Requested masala quantity is not available");
	}

	void inStock() {
		
		if (maggie != 0)
			System.out.println("Total Maggie packets = " + maggie);
		if (dosa != 0)
			System.out.println("Total Dosa packets = " + dosa);
		if (oilPouches != 0)
			System.out.println("Total Oil pouches = " + oilPouches);
		if (panipuri != 0)
			System.out.println("Total Panipuri packets = " + panipuri);
		if (masala != 0)
			System.out.println("Total Masala packets available = " + masala);
		
		System.out.println("-------------------------------------------------------------------");

	}

	void displayInfo(String custName, int itemPurchased, int maggieQuantity, int dosaQuantity, int oilPouchQuantity, int panipuriQuantity,
			int masalaQuantity) {
		
		this.itemPurchased = itemPurchased;
		this.maggieQuantity = maggieQuantity;
		this.dosaQuantity = dosaQuantity;
		this.oilPouchQuantity = oilPouchQuantity;
		this.panipuriQuantity = panipuriQuantity;
		this.masalaQuantity = masalaQuantity;
		System.out.println(custName + " bought " + itemPurchased + " items.");
		System.out.println("-------------------------------------------------------------------");
	}

	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.displayInfo( "Dhara", 55 , 8, 3, 89, 5, 1);
		shop.inStock();
		shop.runningOutOfStock();

	}

}
