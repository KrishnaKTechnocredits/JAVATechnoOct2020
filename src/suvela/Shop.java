package suvela;

public class Shop {
	int maggie = 50;
	int dosa = 43;
	int oilPouches = 0;
	int panipuri = 43;
	int masala = 73;
	int maggieQnty;
	int dosaQnty;
	int oilPouchQnty;
	int panipuriQnty;
	int masalaQnty;
	int itemPurchased;

	void runningOutOfStock() {
		if (maggie == 0)
			System.out.println("Maggie is running out of stock");
		else if (maggie > maggieQnty) {
			maggie = maggie - maggieQnty;
			System.out.println("Requested maggie quantity is " + maggieQnty + " and available quantity is " + maggie);
		} else
			System.out.println("Requested maggie quantity is unavailable");

		if (dosa == 0)
			System.out.println("Dosa is running out of stock");
		else if (dosa > dosaQnty) {
			dosa = dosa - dosaQnty;
			System.out.println("Requested dosa quantity is " + dosaQnty + " and available quantity is " + dosa);
		} else
			System.out.println("Requested dosa quantity is unavailable");

		if (oilPouches == 0)
			System.out.println("Oil Pouch is running out of stock");
		else if (oilPouches > oilPouchQnty) {
			oilPouches = oilPouches - oilPouchQnty;
			System.out.println(
					"Requested Oil ouch quantity is " + oilPouchQnty + " and available quantity is " + oilPouches);
		} else
			System.out.println("Requested oil pouch quantity is unavailable");

		if (panipuri == 0)
			System.out.println("Panipuri is running out of stock");
		else if (panipuri > panipuriQnty) {
			panipuri = panipuri - panipuriQnty;
			System.out.println(
					"Requested panipuri quantity is " + panipuriQnty + " and available quantity is " + panipuri);
		} else
			System.out.println("Requested panipuri quantity is unavailable");

		if (masala == 0)
			System.out.println("Masala is running out of stock");
		else if (masala > masalaQnty) {
			masala = masala - masalaQnty;
			System.out.println("Requested masala quantity is " + masalaQnty + " and available quantity is " + masala);
		} else
			System.out.println("Requested masala quantity is unavailable");
	}

	void inStock() {
		if (maggie != 0)
			System.out.println("Total Maggie packets available are " + maggie);
		if (dosa != 0)
			System.out.println("Total Dosa packets available are " + dosa);
		if (oilPouches != 0)
			System.out.println("Total Oil pouches available are " + oilPouches);
		if (panipuri != 0)
			System.out.println("Total Panipuri packets available are " + panipuri);
		if (masala != 0)
			System.out.println("Total Masala packets available are " + masala);

	}

	void displayInfo(int itemPurchased, int maggieQnty, int dosaQnty, int oilPouchQnty, int panipuriQnty,
			int masalaQnty, String custName) {
		this.itemPurchased = itemPurchased;
		this.maggieQnty = maggieQnty;
		this.dosaQnty = dosaQnty;
		this.oilPouchQnty = oilPouchQnty;
		this.panipuriQnty = panipuriQnty;
		this.masalaQnty = masalaQnty;
		System.out.println(custName + " bought " + itemPurchased + " items.");
	}

	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.displayInfo(6, 2, 1, 1, 100, 1, "ABC");
		shop.inStock();
		shop.runningOutOfStock();

	}

}
