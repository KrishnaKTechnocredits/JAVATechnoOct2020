package tejashree;

public class Shop {
	static int maggieCount = 50;
	static int dosaCount = 43;
	static int oilPouchesCount = 39;
	static int panipuriPacketsCount = 43;
	static int masalaCount = 73;
	String userSelectedItem;
	int userSelectedQty;

	void availableItems(String userSelectedItem, int userSelectedQty) {
		this.userSelectedItem = userSelectedItem;
		this.userSelectedQty = userSelectedQty;

		if (userSelectedItem.equalsIgnoreCase("maggie")) {
			maggieCount = maggieCount - userSelectedQty;
			if (maggieCount > 0) {
				System.out.println("available count of " + userSelectedItem + " is " + maggieCount);
			}
		}
		if (userSelectedItem.equalsIgnoreCase("dosa")) {
			dosaCount = dosaCount - userSelectedQty;
			if (dosaCount > 0) {
				System.out.println("available count of" + userSelectedItem + " is " + dosaCount);
			}
		}
		if (userSelectedItem.equalsIgnoreCase("oilPouches")) {
			oilPouchesCount = oilPouchesCount - userSelectedQty;
			if (oilPouchesCount > 0) {
				System.out.println("available count of " + userSelectedItem + " is " + oilPouchesCount);
			}

		}
		if (userSelectedItem.equalsIgnoreCase("panipuriPackets")) {
			panipuriPacketsCount = panipuriPacketsCount - userSelectedQty;
			if (panipuriPacketsCount > 0) {
				System.out.println("available count of " + userSelectedItem + " is " + panipuriPacketsCount);
			}

		}
		if (userSelectedItem.equalsIgnoreCase("masala")) {
			masalaCount = masalaCount - userSelectedQty;
			if (masalaCount > 0) {
				System.out.println("available count of " + userSelectedItem + " is " + masalaCount);
			}
		}
	}

	void outOfStock() {
		if (userSelectedQty > maggieCount && maggieCount <= 0) {
			System.out.println("Maggie is running out of stock");
		}
		if (userSelectedQty > dosaCount && dosaCount <= 0) {
			System.out.println("dosa is running out of stock");
		}
		if (userSelectedQty > oilPouchesCount && oilPouchesCount <= 0) {
			System.out.println("oilPouches is running out of stock");
		}
		if (userSelectedQty > masalaCount && masalaCount <= 0) {
			System.out.println("masala is running out of stock");
		}
		if (userSelectedQty > panipuriPacketsCount && panipuriPacketsCount <= 0) {
			System.out.println("panipuripackets are running out of stock");
		}
	}

	public static void main(String[] args) {
		Shop shop = new Shop();
		System.out.println("----------Below are the available items-------------");
		shop.availableItems("dosa", 43);
		shop.availableItems("maggie", 54);
		shop.availableItems("masala", 71);
		shop.availableItems("oilpouches", 5);
		shop.availableItems("panipuriPackets", 5);
		System.out.println("---------Below items are running out of stock---------------");
		shop.outOfStock();

	}
}