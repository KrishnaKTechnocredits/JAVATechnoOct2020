package sadhana;

public class Shop {
	int maggieStock = 50;
	int dosaStock = 43;
	int oilPoucheStock = 43;
	int panipuriStock = 43;
	int masalaStock = 73;

	void customerPurchasedItems(int pMaggie, int pDosa, int pOil, int pPanipuri, int pMasala) {

		if (maggieStock > 0 && pMaggie <= maggieStock)
			// maggieStock = maggieStock - pMaggie;
			maggieStock -= maggieStock;

		else
			System.out.println("Maggie running out of stocks." + " Only " + maggieStock + " packets are available ");
		if (dosaStock > 0 && pDosa <= dosaStock)
			// dosaStock = dosaStock - pDosa;
			dosaStock -= dosaStock;
		else
			System.out.println("Dosa running out of stocks." + " Only " + dosaStock + " packets are available ");
		if (oilPoucheStock > 0 && pMaggie <= oilPoucheStock)
			// oilPoucheStock = oilPoucheStock - pOil;
			oilPoucheStock -= oilPoucheStock;
		else
			System.out.println("Oil running out of stocks." + " Only " + oilPoucheStock + " packets are available ");
		if (panipuriStock > 0 && pPanipuri <= panipuriStock)
			// panipuriStock = panipuriStock - pPanipuri;
			panipuriStock -= panipuriStock;
		else
			System.out
					.println("Panipuri running out of stocks." + " Only " + panipuriStock + " packets are available ");
		if (masalaStock > 0 && pMasala <= masalaStock)
			// masalaStock = masalaStock - pMasala;
			masalaStock -= masalaStock;
		else
			System.out.println("Masala running out of stocks." + " Only " + masalaStock + " packets are available ");
	}

	void showInStockItems() {

		System.out.println("Items available in stock");
		if (maggieStock > 0)
			System.out.println("Maggie packets are " + maggieStock);
		if (dosaStock > 0)
			System.out.println("Dosa packets are " + dosaStock);
		if (oilPoucheStock > 0)
			System.out.println("Oil packets are " + oilPoucheStock);
		if (panipuriStock > 0)
			System.out.println("Panipuri packets are " + panipuriStock);
		if (masalaStock > 0)
			System.out.println("Masala packets are " + masalaStock);

	}

	void showOutOfStockItems() {
		if (maggieStock == 0)
			System.out.println("Maggie packets are out of stock");
		else if (dosaStock == 0)
			System.out.println("DOsa packets are out of stock");
		else if (oilPoucheStock == 0)
			System.out.println("Oil packets are out of stock");
		else if (panipuriStock == 0)
			System.out.println("Panipuri is out of stock");
		else if (masalaStock == 0)
			System.out.println("Spices are out of stock");
	}

	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.customerPurchasedItems(50, 40, 30, 35, 50);
		shop.showInStockItems();
		shop.showOutOfStockItems();

	}

}
