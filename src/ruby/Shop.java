
/*Create a system (Shop) which maintains each item's quantity.

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
package ruby;
public class Shop {
	int maggie = 50;
	int dosa= 43;
	int oilPouches = 39;
	int panipuri = 43;
	int masala = 73;
	
	void outOfStock(){
		if(maggie <= 0)
			System.out.println("Maggie Packet running out of stock");
		if(dosa <= 0)
			System.out.println("Dosa running out of stock");
		if(oilPouches <= 0)
			System.out.println("Oil Pouches running out of stock");
		if(panipuri <= 0)
		   System.out.println("Panipuri running out of stock");
		if(masala <= 0)
			System.out.println("Masala running out of stock");
	}
	void availableInStock(){
		if(maggie > 0)
			System.out.println(maggie+" Maggie Packet available in Stock");
		if(dosa > 0)
			System.out.println(dosa+" Dosa Packet available in Stock");
		if(oilPouches > 0)
			System.out.println(oilPouches+" Oil Pouches available in Stock");
		if(panipuri > 0)
			System.out.println(panipuri+" Panipuri Packet available in Stock");
		if(masala >0)
			System.out.println(masala+" Masala Packet available in Stock");
	}

	void shoppingItems(int numMaggie, int numDosa, int numOil, int numPanipuri, int numMasala){	
		maggie = maggie - numMaggie;
		dosa = dosa - numDosa;
		oilPouches = oilPouches - numOil;
		panipuri = panipuri - numPanipuri;
		masala = masala - numMasala;
		System.out.println( "Customer bought "+numMaggie+" maggie "+numDosa+" Dosa "+numOil+ " Oil "+numPanipuri+" Panipuri "+numMasala+" Masala " );
	}

	public static void main(String[] args) {
		Shop shop = new Shop();	
		shop.shoppingItems(50,38,39,2,3);
		shop.outOfStock();
		shop.availableInStock();
	}
}
