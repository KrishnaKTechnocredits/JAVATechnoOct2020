package nandini;

public class Shop {
	
	 int stockOfMaggie= 50;
	 int stockofDosa = 43;
     int stockofOilPouches = 39;
	 int stockofPanipuri = 43;
	 int stockofMasalas  =73;
	
	//Method to pass the no' of Items purchased by a Customer
	void itemsPurchasedbyCustomer(int maggiePackets,int dosaPackets, int oilPouches, int panipuriPackets,int masalaPouches){
		
		 stockOfMaggie = stockOfMaggie - maggiePackets;
		 stockofDosa = stockofDosa - dosaPackets;
		 stockofOilPouches =  stockofOilPouches - oilPouches;
		 stockofPanipuri = stockofPanipuri - panipuriPackets;
		 stockofMasalas =  stockofMasalas - masalaPouches;		  
	}
	
	//Method to display List of Items which are out of Stock
	void itemsOutofStock() {
		
		System.out.println("--List of Items Not in Stock--");
		
		if(stockOfMaggie == 0)
		     System.out.println("Maggie is Out of Stock");
		   
		if(stockofDosa == 0)
		     System.out.println("Dosa is Out of Stock");
		
		if(stockofOilPouches == 0)
		     System.out.println("Oil Pouches are Out of Stock");
		
		if(stockofPanipuri == 0)
		     System.out.println("Panipuri Packets are Out of Stock");
		
		if(stockofMasalas == 0)
		     System.out.println("Masala Pouches are Out of Stock");
	}
	
	//Method to display the Items those are Still Available in Stock.
	void itemsAvailableInStock() {
		
		System.out.println("--List of Available Items in Stock--");
		
		if(stockOfMaggie > 0)
		     System.out.println("Available Stock of Maggie is: " + stockOfMaggie);
		   
		if(stockofDosa > 0)
		     System.out.println("Available Stock of Dosa is: " + stockofDosa);
		
		if(stockofOilPouches > 0)
		     System.out.println("Available Stock of Oil Pouches are: " + stockofOilPouches);
		
		if(stockofPanipuri > 0)
		     System.out.println("Available Stock of Panipuri Packets are: " + stockofPanipuri);
		
		if(stockofMasalas > 0)
		     System.out.println("Available Stock of Masala Pouches are: " + stockofMasalas);
	}
	
	public static void main(String args[]) {
		Shop shop = new Shop();
		shop.itemsPurchasedbyCustomer(50,10,35,43,60);
		shop.itemsOutofStock();
		System.out.println("------------------------------");
		shop.itemsAvailableInStock();
	}
}
