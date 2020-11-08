package shrutiC;

class Shop {

	static int maggieStock = 50;
	static int dosaStock = 43;
	static int oilPouchStock = 39;
	static int panipuriStock = 43;
	static int masalaStock = 73;

	void displayOutOfStockItem() {

		System.out.println("\nSorry below items are Out of stock :-");
		if (maggieStock == 0)
			System.out.println("Maggie");
		if (panipuriStock == 0)
			System.out.println("Panipuri");
		if (oilPouchStock == 0)
			System.out.println("Oil pouch");
		if (dosaStock == 0)
			System.out.println("Dosa");
		if (masalaStock == 0)
			System.out.println("Masala");

	}

	void displayAvailableItem() {

		System.out.println("Below items are available in stock :-");
		if (maggieStock > 0)
			System.out.println("Maggie - " + maggieStock + " packets");
		if (panipuriStock > 0)
			System.out.println("Panipuri - " + panipuriStock + " packets");
		if (oilPouchStock > 0)
			System.out.println("Oil Pouch - " + oilPouchStock + " packets");
		if (dosaStock > 0)
			System.out.println("Dosa - " + dosaStock + " packets");
		if (masalaStock > 0)
			System.out.println("Masala - " + masalaStock + " packets");

	}

	void orderMaggie(int maggieOrder) {

		if (maggieOrder <= maggieStock) {
			maggieStock = maggieStock - maggieOrder;
		} else if (maggieOrder > maggieStock && !(maggieStock == 0)) {
			maggieStock = 0;
		}
	}

	void orderDosa(int dosaOrder) {
		if (dosaOrder <= dosaStock) {
			dosaStock = dosaStock - dosaOrder;
		} else if (dosaOrder > dosaStock && !(dosaStock == 0)) {
			dosaStock = 0;
		}
	}

	void orderOilPouch(int oilPouchOrder) {
		if (oilPouchOrder <= oilPouchStock) {
			oilPouchStock = oilPouchStock - oilPouchOrder;
		} else if (oilPouchOrder > oilPouchStock && !(oilPouchStock == 0)) {
			oilPouchOrder = 0;
		}

	}

	void orderPanipuri(int panipuriOrder) {
		if (panipuriOrder <= panipuriStock) {
			panipuriStock = panipuriStock - panipuriOrder;
		} else if (panipuriOrder > panipuriStock && !(panipuriStock == 0)) {
			panipuriOrder = 0;
		}

	}

	void orderMasala(int masalaOrder) {
		if (masalaOrder <= masalaStock) {
			masalaStock = masalaStock - masalaOrder;
		} else if (masalaOrder > masalaStock && !(masalaStock == 0)) {
			masalaOrder = 0;
		}

	}

	public static void main(String[] args) {

		Shop customer1 = new Shop();
		customer1.orderMaggie(40);
		customer1.orderDosa(43);
		customer1.orderPanipuri(20);
		customer1.orderOilPouch(39);

		customer1.displayAvailableItem();
		customer1.displayOutOfStockItem();
	}

}
