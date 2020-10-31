package surbhi;
/*
 a. Initial stocks of Maggie: 50 Maggie packets 
b. Initial stocks of Dosa : 43 packets 
c. Initial stocks of pouches : 39 oil packets 
d. Initial stocks of panipuri : 43 packets  
e. Initial stocks of masala’s : 73 packets.

Expectation:
1) Only one Customer came for shopping, he picked different items with different quantities, print "running out of stock" message if a particular item is sold out otherwise deduct requested quantity from total quantity. 
2) Create a method which shows only those item which is "Out of stock".
3) Create a method which shows only those item which is "Available in stock" & respective quantities.
 */
public class Shop {

	int maggie;
	int dosa;
	int oilPacket;
	int panipuri;
	int masala;
	int qty = 10;

	void shopping(int mangoQty) {

		// if (maggie == 0 || dosa == 0) {
		if (maggie / qty == 0 || dosa / qty == 0) {
			System.out.println("Running out of stock");
		} else {
			System.out.println(maggie - qty);
		}

	}

	void itemOutOfStock(int maggie) {
		this.maggie = maggie;

		if (maggie < 50) {
			System.out.println("Maggie in Stock");
		} else {
			System.out.println("Out of Stock");
		}

	}

	void itemAvailaleInStock(int masala) {
		this.masala = masala;
		if (masala < 73) {
			System.out.println("Available in Stock");
		} else {
			System.out.println("Out of Stock");
		}

	}

	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.shopping(56);
		shop.itemOutOfStock(56);
		shop.itemAvailaleInStock(70);

	}

}
