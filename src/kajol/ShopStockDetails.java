package kajol;

public class ShopStockDetails {
	static int intialStockOfMaggie=50;
	static int intialStockODosa=43;
	static int intialStockOfPouches=39;
	static int intialStockOfPanipuri=43;
	static int intialStockOfMasala=73;
	
	void itemsToBePurchased(int purchasedMaggie,int purchasedDosa,int purchasedPouches,int purchasedPanipuri,int purchasedMasala) {
		System.out.println("Items Purchased....");
		if(purchasedMaggie>intialStockOfMaggie) 
			System.out.println("Available Stock for Maggie is "+intialStockOfMaggie+" packets and You have requested for "+purchasedMaggie+" packets.Quantity Running Out of Available Stock");
		else{
			System.out.println("Maggie Purchased : "+purchasedMaggie);
			intialStockOfMaggie=intialStockOfMaggie-purchasedMaggie;
		}
		if(purchasedDosa>intialStockODosa) 
			System.out.println("Available Stock for Dosa is "+intialStockODosa+" packets and You have requested for "+purchasedDosa+" packets.Quantity Running Out of Available Stock");
		else {
			System.out.println("Dosa Purchased : "+purchasedDosa);
			intialStockODosa=intialStockODosa-purchasedDosa;
		}
		
		if(purchasedPouches>intialStockOfPouches) 
			System.out.println("Available Stock for Pouches is "+intialStockOfPouches+" packets and You have requested for "+purchasedPouches+"  packets.Quantity Running Out of Available Stock");
		else {
			System.out.println("Pouches Purchased : "+purchasedPouches);
			intialStockOfPouches=intialStockOfPouches-purchasedPouches;
		}
			
		if(purchasedPanipuri>intialStockOfPanipuri) 
			System.out.println("Available Stock for Panipuri Packets is "+intialStockOfPanipuri+" packets and You have requested for "+purchasedPanipuri+"  packets.Quantity Running Out of Available Stock");
		else {
			System.out.println("Panipuri Purchased : "+purchasedPanipuri);
			intialStockOfPanipuri=intialStockOfPanipuri-purchasedPanipuri;
		}
		
		if(purchasedMasala>intialStockOfMasala) 
			System.out.println("Available Stock for Masala Packets is "+intialStockOfMasala+" packets and You have requested for "+purchasedMasala+"  packets.Quantity Running Out of Available Stock");
		else {
			System.out.println("Masala Purchased : "+intialStockOfMasala);
			intialStockOfMasala=intialStockOfMasala-purchasedMasala;
		}
		System.out.println(); 
	}
	
	void displayitemsOutOfStock() {
		System.out.println("Items Outof Stock.....");
		if(intialStockOfMaggie==0)
			System.out.println("Maggie Packets");
		if(intialStockODosa==0)
			System.out.println("Dosa Packets");
		if(intialStockOfPouches==0)
			System.out.println("Pouches");
		if(intialStockOfPanipuri==0)
			System.out.println("PaniPuri Packets");
		if(intialStockOfMasala==0)
			System.out.println("Masala Packet");
		System.out.println();
	}
	
	void displayitemsAvailableInStock() {
		System.out.println("Items Available in Stock....");
		if(intialStockOfMaggie>0)
			System.out.println("Maggie Packets : "+intialStockOfMaggie);
		if(intialStockODosa>0)
			System.out.println("Dosa Packets : "+intialStockODosa);
		if(intialStockOfPouches>0)
			System.out.println("Pouches : "+intialStockOfPouches);
		if(intialStockOfPanipuri>0)
			System.out.println("PaniPuri Packets : "+intialStockOfPanipuri);
		if(intialStockOfMasala>0)
			System.out.println("Masala Packets : "+intialStockOfMasala);
		System.out.println();
	}

	public static void main(String[] args) {
		ShopStockDetails shopStockDetails=new ShopStockDetails();
		shopStockDetails.displayitemsAvailableInStock();
		shopStockDetails.itemsToBePurchased(23,45,39,43,70);
		shopStockDetails.displayitemsAvailableInStock();
		shopStockDetails.displayitemsOutOfStock();	
		
	}
}