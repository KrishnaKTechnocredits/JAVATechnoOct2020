package anurag;

public class Shop {

	int maggie = 50;
	int dosa = 43;
	int oil = 39;
	int panipuri = 43;
	int masala = 73;

	void calculate(String item, int qty) { // qty is the quantity purchased by the customer.

		if (item == "Maggie" && qty <= maggie) {
			maggie = maggie - qty;
			// System.out.println("remaining Item of maggie is" + maggie);
		} else if (item == "Dosa" && qty <= dosa) {
			dosa = dosa - qty;
			// System.out.println("remaining Item of dosa is " + dosa);
		} else if (item == "Oil" && qty <= oil) {
			oil = oil - qty;
			// System.out.println("remaining Item of oil is " + oil);
		} else if (item == "PaniPuri" && qty <= panipuri) {
			panipuri = panipuri - qty;
			// System.out.println("remaining Item of oil is " + panipuri);
		} else if (item == "Masala" && qty <= masala) {
			masala = masala - qty;
			// System.out.println("remaining Item of masala is " + masala);
		}

	}

	void OutOfStockItems() {
		if (maggie <= 0)
			System.out.println("Maggie is out of stock, " + "remaining value : " + maggie);
		if (dosa <= 0)
			System.out.println("Dosa is out of stock, " + "remaining value : " + dosa);
		if (oil <= 0)
			System.out.println("oil is out of stock, " + "remaining value : " + oil);
		if (panipuri <= 0)
			System.out.println("panipuri is out of stock, " + "remaining value : " + panipuri);
		if (masala <= 0)
			System.out.println("masala is out of stock, " + "remaining value : " + masala);
	}

	void ItemsInStock() {
		if (maggie > 0)
			System.out.println("Maggie is in stock, " + "remaining value : " + maggie);
		if (dosa > 0)
			System.out.println("Dosa is in stock, " + "remaining value : " + dosa);
		if (oil > 0)
			System.out.println("Oil is in stock, " + "remaining value : " + oil);
		if (panipuri > 0)
			System.out.println("panipuri is in stock, " + "remaining value : " + panipuri);
		if (masala > 0)
			System.out.println("masala is in stock, " + "remaining value : " + masala);

	}

	public static void main(String[] args) {

		Shop shop1 = new Shop();
		shop1.calculate("Masala", 73);
		shop1.calculate("Maggie", 25);
		shop1.calculate("Dosa", 43);
		shop1.OutOfStockItems();
		shop1.ItemsInStock();

	}

}
