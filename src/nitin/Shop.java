/* Day 10 : Java Assignment - 6 : 27th Oct 2020

Create a system (Shop) which maintains each item's quantity.

	a. Initial stocks of Maggie: 50 Maggie packets 
	b. Initial stocks of Dosa : 43 packets 
	c. Initial stocks of pouches : 39 oil packets 
	d. Initial stocks of panipuri : 43 packets  
	e. Initial stocks of masala’s : 73 packets.

Expectation:
	1) Only one Customer came for shopping, he picked different items with different quantities, 
		print "running out of stock" message if a particular item is sold out otherwise deduct requested quantity from total quantity. 
	2) Create a method which shows only those item which is "Out of stock".
	3) Create a method which shows only those item which is "Available in stock" & respective quantities. */
package nitin;
class Shop{
	int noOfMaggie=50;
	int noOfDosa=43;
	int noOfOilPackets=39;
	int noOfPanipuri=43;
	int noOfMasala=73;
	int customerOrderQuantity;
	String itemSelectedByCustomer;
		
	void availableStock(String itemSelectedByCustomer,int customerOrderQuantity){
		this.itemSelectedByCustomer=itemSelectedByCustomer;
		this.customerOrderQuantity=customerOrderQuantity;
		
		if(customerOrderQuantity < 0)
			System.out.println("Invalid entry, Quantity must be greater then Zero. Please select valid quantity of "+itemSelectedByCustomer+".");
		else if(itemSelectedByCustomer=="Maggie" && customerOrderQuantity <= noOfMaggie) {
			noOfMaggie=noOfMaggie - customerOrderQuantity;
			System.out.println("Customer Ordered "+customerOrderQuantity+" packets of "+itemSelectedByCustomer+" :: Now "+noOfMaggie+" Packets of Maggie are currently available in stock.");
		}
		else if(itemSelectedByCustomer=="Dosa" && customerOrderQuantity <= noOfDosa) {
			noOfDosa=noOfDosa - customerOrderQuantity;
			System.out.println("Customer Ordered "+customerOrderQuantity+" packets of "+itemSelectedByCustomer+" :: Now "+noOfDosa+" Packets of Dosa are currently available in stock.");
		}
		else if(itemSelectedByCustomer=="Oil" && customerOrderQuantity <= noOfOilPackets) {
			noOfOilPackets=noOfOilPackets - customerOrderQuantity;
			System.out.println("Customer Ordered "+customerOrderQuantity+" packets of "+itemSelectedByCustomer+" :: Now "+noOfOilPackets+" Packets of Oil are currently available in stock.");
		}
		else if(itemSelectedByCustomer=="PaniPuri" && customerOrderQuantity <= noOfPanipuri) {
			noOfPanipuri=noOfPanipuri - customerOrderQuantity;
			System.out.println("Customer Ordered "+customerOrderQuantity+" packets of "+itemSelectedByCustomer+" :: Now "+noOfPanipuri+" Packets of Panipuri are currently available in stock.");
		}
		else if(itemSelectedByCustomer=="Masala" && customerOrderQuantity <= noOfMasala) {
			noOfMasala=noOfMasala - customerOrderQuantity;
			System.out.println("Customer Ordered "+customerOrderQuantity+" packets of "+itemSelectedByCustomer+" :: Now "+noOfMasala+" Packets of Masala are currently available in stock.");
		}
			
	}
	void outOfStockInventory(){
		if(noOfMaggie==0)
			System.out.println("Maggie is out of Stock.");
		if(noOfDosa==0)
			System.out.println("Dosa is out of Stock.");
		if(noOfOilPackets==0)
			System.out.println("Oil is out of Stock.");
		if(noOfPanipuri==0)
			System.out.println("Panipuri is out of Stock.");
		if(noOfMasala==0)
			System.out.println("Masala is out of Stock.");
	}
	public static void main(String[] args){
		Shop shop = new Shop();
		shop.availableStock("Maggie",34);
		shop.availableStock("Dosa",-1);
		shop.availableStock("Oil",39);
		shop.availableStock("PaniPuri",10);
		shop.availableStock("Masala",15);
		shop.outOfStockInventory();
	}
}	