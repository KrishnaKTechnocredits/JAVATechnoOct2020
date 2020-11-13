package deepak;

public class Shop {
	
	int maggiePackets;
	int dosaPackets;
	int oilPackets;
	int panipuriPackets;
	int masalaPackets;
	
	void initialStocksQty(int initialMaggieQty, int initialDosaQty, int initialOilQty, int initialPanipuriQty, int initialMasalaQty ) {
		
		this.maggiePackets = initialMaggieQty;
		this.dosaPackets = initialDosaQty;
		this.oilPackets = initialOilQty;
		this.panipuriPackets = initialPanipuriQty;
		this.masalaPackets = initialMasalaQty;
		
	}
	
	void outOfStock() {
		
		if(maggiePackets == 0) {
			
			System.out.println("Maggie Packets are currently unavailable");
		}
		if(dosaPackets == 0) {
			
			System.out.println("Dosa Packets are currently unavailable");
		}
		if(oilPackets == 0) {
			
			System.out.println("Oil Packets are currently unavailable");
		}
		if(panipuriPackets == 0) {
			
			System.out.println("Panipuri Packets are currently unavailable");
		}
		if(masalaPackets == 0) {
			
			System.out.println("Masala Packets are currently unavailable");
		}
		
	}
	void availableInStock() {
		
		if(maggiePackets != 0) {
			System.out.println(maggiePackets + " Maggie Packets are currently in stock");	
		}
		if(dosaPackets != 0) {
			System.out.println(dosaPackets + " Dosa Packets are currently in stock");
		}
		if(oilPackets != 0) {
			System.out.println(oilPackets + " Oil Packets are currently in stock");
		}
		if(panipuriPackets != 0) {
			System.out.println(panipuriPackets + " Panipuri Packets are currently in stock");
		}
		if(masalaPackets != 0) {
			System.out.println(masalaPackets + " Masala Packets are currently in stock");
		}
		
	}
	void addToCart(int addMaggiePackets, int addDosaPackets, int addOilPackets, int addPaniuriPackets, int addMasalaPackets ) {
		
		if(addMaggiePackets <= maggiePackets && addMaggiePackets > 0 ) {
			
			System.out.println(addMaggiePackets + " Maggie Packets Successfully Added To Cart");
			maggiePackets = maggiePackets - addMaggiePackets;
		}
		if(addDosaPackets <= dosaPackets && addDosaPackets > 0) {
			System.out.println(addDosaPackets + " Dosa Packets Successfully Added To Cart");
			dosaPackets = dosaPackets - addDosaPackets;
		}
		if(addOilPackets <= oilPackets && addOilPackets > 0) {
			System.out.println(addOilPackets + " Oil Packets Successfully Added To Cart");
			oilPackets = oilPackets - addOilPackets;
		}
		if(addPaniuriPackets <= panipuriPackets && addPaniuriPackets > 0) {
			System.out.println(addPaniuriPackets + " Panipuri Packets Successfully Added To Cart");
			panipuriPackets = panipuriPackets - addPaniuriPackets;
		}
		if(addMasalaPackets <= masalaPackets && addMasalaPackets > 0) {
			System.out.println(addMasalaPackets + " Masala Packets Successfully Added To Cart");
			masalaPackets = masalaPackets - addMasalaPackets;
		}
		
	}
	
	public static void main(String[] args) {
		
		Shop shop = new Shop();
		
		System.out.println("Checking Initial Stocks");
		shop.initialStocksQty(50, 43, 39, 43, 73);
		shop.availableInStock();
		shop.outOfStock();
		
		System.out.println("--Adding few items into the cart---");
		shop.addToCart(2, 3, 39, 43, 73);
		shop.availableInStock();
		shop.outOfStock();
	
		System.out.println("--Again adding few items into a cart which are ruuning out of stock--");
		shop.addToCart(2, 1, 1, 1, 1);
		shop.availableInStock();
		shop.outOfStock();
	}

}
