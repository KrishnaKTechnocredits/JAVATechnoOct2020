package ritika.Assignments;

/* 
Create a system (Shop) which maintains each item's quantity.

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

class Shop{
	static int maggieInStock = 50;
	static int dosaInStock = 43;
	static int oilInStock = 39;
	static int panipuriInStock = 43;
	static int masalaInStock = 73;
	
	void buyMaggie(int maggieBought) {
		if (maggieBought > 0)
			maggieInStock = maggieInStock - maggieBought;	
	} 
	void buyDosa(int dosaBought) {
		if (dosaBought > 0)
			dosaInStock = dosaInStock - dosaBought;	
	} 
	void buyOil(int oilBought) {
		if (oilBought > 0)
			oilInStock = oilInStock - oilBought;
	} 
	void buyPanipuri(int panipuriBought) {
		if (panipuriBought > 0)
			panipuriInStock = panipuriInStock - panipuriBought;	
	} 
	void buyMasala(int masalaBought) {
		if (masalaBought > 0)
			masalaInStock = masalaInStock - masalaBought;	
	} 	
	
	void itemsInStock(){
		if (maggieInStock > 0)
			System.out.println("Maggie is Available In Stock " + maggieInStock + " packets remaining");
		
		if (dosaInStock > 0)
			System.out.println("Dosa is Available In Stock " + dosaInStock + " packets remaining");
	
		if (oilInStock > 0)
			System.out.println("Oil is Available In Stock " + oilInStock + " packets remaining");
		
		if (panipuriInStock > 0)
			System.out.println("Panipuri is Available In Stock " + panipuriInStock + " packets remaining");
		
		if (masalaInStock > 0)
			System.out.println("Masala is Available In Stock " + masalaInStock + " packets remaining");
	}
	
	void itemsOutOfStock() {
		if (maggieInStock == 0)
			System.out.println("Maggie is running out of stock!");
		
		if (dosaInStock == 0)
			System.out.println("Dosa is running out of stock!");
	
		if (oilInStock == 0)
			System.out.println("Oil is running out of stock!");
		
		if (panipuriInStock == 0)
			System.out.println("Panipuri is running out of stock!");
		
		if (masalaInStock == 0)
			System.out.println("Masala is running out of stock!");
	}
	
	public static void main (String[] args) {
		Shop shop = new Shop();
		shop.buyMaggie(50);
		shop.buyDosa(25);
		shop.buyOil(15);
		shop.buyPanipuri(43);
		shop.itemsInStock();
		shop.itemsOutOfStock();
		
	} 
}