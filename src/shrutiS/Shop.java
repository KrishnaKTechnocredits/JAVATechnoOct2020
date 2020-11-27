package shrutiS;

public class Shop {
	int maggieInStock = 50;
	int dosaInStock = 43;
	int oilInStock = 39;
	int panipuriInStock = 43;
	int masalaInStock = 73;

	void customerPurchase(int maggieOrder, int dosaOrder, int oilOrder, int panipuriOrder, int masalaOrder) {
		System.out.println("Customer ordered below items");

		if (maggieOrder < 0)
			System.out.println("Maggie Packet ordered : " + maggieOrder + " Invalid input, value should not be less than 0");

		else if (maggieOrder <= maggieInStock) {
			System.out.println("Maggie Packet ordered : " + maggieOrder);
		    maggieInStock = maggieInStock - maggieOrder;
		} else
			System.out.println("Maggie Packet ordered : " + maggieOrder + " Running out of stock. Only " + maggieInStock+ " maggie packets in stock to buy");

		if (dosaOrder < 0)
			System.out.println("Dosa Packet ordered : " + dosaOrder + " Invalid input, value should not be less than 0");

		else if (dosaOrder <= dosaInStock) {
			System.out.println("Dosa Packet ordered : " + dosaOrder);
			dosaInStock = dosaInStock - dosaOrder;
		} else
			System.out.println("Dosa Packet ordered : " + dosaOrder + " Running out of stock. Only " + dosaInStock+ " dosa packets in stock to buy");

		if (oilOrder < 0)
			System.out.println("Oil Packet ordered : " + oilOrder + " Invalid input, value should not be less than 0");

		else if (oilOrder <= oilInStock) {
			System.out.println("Oil Packet ordered : " + oilOrder);
			oilInStock = oilInStock - oilOrder;
		} else
			System.out.println("Oil packets ordered : " + oilOrder + " Running out of stock. Only " + oilInStock
					+ " oil packets in stock to buy");

		if (panipuriOrder < 0)
			System.out.println(
					"Panipuri Packet ordered : " + panipuriOrder + " Invalid input, value should not be less than 0");

		else if (panipuriOrder <= panipuriInStock) {
			System.out.println("panipuri Packet ordered : " + panipuriOrder);
			panipuriInStock = panipuriInStock - panipuriOrder;
		} else
			System.out.println("Panipuri packet ordered : "+panipuriOrder+" Running out of stock. Only "+panipuriInStock+" panipuri packets in stock to buy");

		if (masalaOrder < 0)
			System.out.println(
					"Panipuri Packet ordered : " + masalaOrder + " Invalid input, value should not be less than 0");

		else if (masalaOrder <= masalaInStock) {
			System.out.println("Masala Packet ordered : " + masalaOrder);
			masalaInStock = masalaInStock - masalaOrder;
		} else
			System.out.println("Masala packet ordered : " + masalaOrder + " Running out of stock. Only " + masalaInStock+ " masala packets in stock to buy");
	}

	void outOfStock() {
		if (maggieInStock == 0)
			System.out.println("Maggie packets : Out of stock");

		if (dosaInStock == 0)
			System.out.println("Dosa packets : Out of stock");

		if (oilInStock == 0)

			System.out.println("Oil packets : Out of stock");

		if (panipuriInStock == 0)

			System.out.println("Panipuri packets : Out of stock");

		if (masalaInStock == 0)

			System.out.println("Masala packets : Out of stock");

	}

	void availableInStock() {
		if (maggieInStock > 0)
			System.out.println("Maggie packets : " + maggieInStock);

		if (dosaInStock > 0)
			System.out.println("Dosa packets : " + dosaInStock);

		if (oilInStock > 0)

			System.out.println("Oil packets : " + oilInStock);

		if (panipuriInStock > 0)

			System.out.println("Panipuri packets : " + panipuriInStock);

		if (masalaInStock > 0)

			System.out.println("Masala packets : " + masalaInStock);

	}

	public static void main(String[] a) {
		Shop shop = new Shop();
		shop.customerPurchase(-1, 10, 40, 43, 5);
		System.out.println("                              ");
		System.out.println("Items remaining in stock");
		shop.availableInStock();
		shop.outOfStock();

	}

}
