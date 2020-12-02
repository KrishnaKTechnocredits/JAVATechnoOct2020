package yogita;

 public class Shop {

	static int initialMaggie = 50;
	static int initialDosa = 43; 
	static int initialPouches = 39; 
	static int initialPanipuri = 43;  
	static int initialMasala = 73;

	void customerPurchase(int purchaseMaggy, int purchaseDosa, int purchaseOilPouches, int purchasePanipuri, int purchaseMasala) {
		
	   System.out.println("Customer purchased :" +purchaseMaggy+ " Maggi packets, " +purchaseDosa+" Dosa Packets, " +purchaseOilPouches +" oil Packets, " +purchasePanipuri+ " Panipuri packets, " +purchaseMasala+ " Masala packets");
	
        if(purchaseMaggy <= initialMaggie) 
			initialMaggie = initialMaggie - purchaseMaggy;
        
        if(purchaseDosa <= initialDosa) 
			initialDosa = initialDosa - purchaseDosa;
	
        if(purchaseOilPouches <= initialPouches) 
      	   initialPouches = initialPouches - purchaseOilPouches;
	
        if(purchasePanipuri <= initialPanipuri) 
			initialPanipuri = initialPanipuri - purchasePanipuri;
	
        if(purchaseMasala <= initialMasala) 
			initialMasala = initialMasala - purchaseMasala;
     }
	
	void outOfStock() {
        if(initialMaggie <= 0) 
			System.out.println("Maggy product Out of stock");
		
        if(initialDosa <= 0) 
			System.out.println("Dosa product Out of stock");
		
        if(initialPouches <= 0) 
			System.out.println("Oil Pouches is Out of stock");
		
        if(initialPanipuri <= 0) 
			System.out.println("Panipury product is Out of stock");
		
        if(initialMasala <= 0 ) 
			System.out.println("Masala product is of stock");
	}

	void inStock() {
        if(initialMaggie > 0) 
			System.out.println(initialMaggie + " maggie packets are available" );
        
  		if(initialDosa > 0) 
			System.out.println(initialDosa + " dosa packets are available" );
  		
        if(initialPouches > 0) 
			System.out.println(initialPouches + " oil pouches are available" );

        if(initialPanipuri > 0) 
			System.out.println(initialPanipuri + " panipuri packet are available" );
		
        if(initialMasala > 0) 
			System.out.println(initialMasala + " masala packets are available" );
   }
	
public static void main(String[] args) {
		Shop shop = new Shop();
		System.out.println("---------------Product Purchased information--------");
		shop.customerPurchase(45,43,30,43,70);
		System.out.println("---------------------Out Of Stock Products ---------");
		shop.outOfStock();
		System.out.println("---------------Available Stock --------------------");
		shop.inStock();
	}
}