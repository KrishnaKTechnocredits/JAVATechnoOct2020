package milind;

public class Shop {
	
	static int stocksOfMaggie = 50;
	static int stocksOfDosa = 43; 
	static int stocksOfPouches = 39; 
	static int stocksOfPanipuri = 43;  
	static int stocksOfMasala = 73;
	
	void customerOrder(int orderOfMaggy, int orderOfDosa, int orderOfPouches, int orderOfPanipuri, int orderOfMasala) {
		
		if(orderOfMaggy <= stocksOfMaggie) {
			stocksOfMaggie = stocksOfMaggie - orderOfMaggy;
		} else {
			System.out.println("Maggy packets are running out of stock");
		}
		
		if(orderOfDosa <= stocksOfDosa) {
			stocksOfDosa = stocksOfDosa - orderOfDosa;
		} else {
			System.out.println("Dosa packets are running out of stock");
		}
		
		if(orderOfPouches <= stocksOfPouches) {
			stocksOfPouches = stocksOfPouches - orderOfPouches;
		} else {
			System.out.println("Oil Pouches are running out of stock");
		}
		
		if(orderOfPanipuri <= stocksOfPanipuri) {
			stocksOfPanipuri = stocksOfPanipuri - orderOfPanipuri;
		} else {
			System.out.println("Panipuri packets are running out of stock");
		}
		
		if(orderOfMasala <= stocksOfMasala) {
			stocksOfMasala = stocksOfMasala - orderOfMasala;
		} else {
			System.out.println("Masala packets are running out of stock");
		}
	}
	
	void outOfStockItem() {
		
		if(stocksOfMaggie <= 0) {
			System.out.println("Maggy : Out of stock");
		}
		
		if(stocksOfDosa <= 0) {
			System.out.println("Dosa : Out of stock");
		}
		
		if(stocksOfPouches <= 0) {
			System.out.println("Oil Pouches : Out of stock");
		}
		
		if(stocksOfPanipuri <= 0) {
			System.out.println("Panipury : Out of stock");
		}
		
		if(stocksOfMasala <= 0 ) {
			System.out.println("Masala : Out of stock");
		}
	}
	
	void availableItem() {
		
		if(stocksOfMaggie > 1) {
			System.out.println(stocksOfMaggie + " packets of maggy are available" );
		} else if(stocksOfMaggie == 1) {
			System.out.println("Only " + stocksOfMaggie + " packet of maggy is available");
		}
		
		if(stocksOfDosa > 1) {
			System.out.println(stocksOfDosa + " packets of maggy are available" );
		} else if(stocksOfDosa == 1) {
			System.out.println("Only " + stocksOfDosa + " packet of maggy is available");
		}
		
		if(stocksOfPouches > 1) {
			System.out.println(stocksOfPouches + " packets of maggy are available" );
		} else if(stocksOfPouches == 1) {
			System.out.println("Only " + stocksOfPouches + " packet of maggy is available");
		}
		
		if(stocksOfPanipuri > 1) {
			System.out.println(stocksOfPanipuri + " packets of maggy are available" );
		} else if(stocksOfPanipuri == 1) {
			System.out.println("Only " + stocksOfPanipuri + " packet of maggy is available");
		}
		
		if(stocksOfMasala > 1) {
			System.out.println(stocksOfMasala + " packets of maggy are available" );
		} else if(stocksOfMaggie == 1) {
			System.out.println("Only " + stocksOfMasala + " packet of maggy is available");
		}
	}
	
	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.customerOrder(49,4,3,4,7);
		shop.outOfStockItem();
		shop.availableItem();
	}
}
