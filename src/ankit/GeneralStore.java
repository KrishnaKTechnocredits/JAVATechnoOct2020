package ankit;

public class GeneralStore {

		int maggiePackets;
		int dosaPackets;
		int oilPackets;
		int panipuriPackets;
		int masalaPackets;
		/*
		 Parameterized the method as shopkeeper can update the items on the required times.
		 */
		void shopInitialStock(int maggiePackets, int dosaPackets, int oilPackets, int panipuriPackets, int masalaPackets) {
			this.maggiePackets=maggiePackets;
			this.dosaPackets=dosaPackets;
			this.oilPackets=oilPackets;
			this.panipuriPackets=panipuriPackets;
			this.masalaPackets=masalaPackets;			
		}
		/*
		 Here buyer will buy the specific product so we are using different variables for 
		 each product, as not same quantity will be bought by customer for each and every product.
		 */
		void customerShopping(int boughtMaggiePackets, int boughtDosaPackets, int boughtOilPackets, int boughtpanipuriPackets, int boughtMasalaPackets) {
			
			if(maggiePackets>0 && boughtMaggiePackets<=maggiePackets)
				maggiePackets = maggiePackets - boughtMaggiePackets;
			else 
				System.out.println("Maggie packets are running out quickly. Available stock is " +maggiePackets);
			
			if(dosaPackets>0 && boughtDosaPackets<=dosaPackets)	
				dosaPackets = dosaPackets - boughtDosaPackets;
			else
				System.out.println("Dosa packets are running out quickly. Available stock is " +dosaPackets);
			
			if(oilPackets>0 && boughtOilPackets<=oilPackets)		
				oilPackets = oilPackets -boughtOilPackets;
			else
				System.out.println("Oil packets are running out quickly. Available stock is " +oilPackets);
			
			if(panipuriPackets>0 && boughtpanipuriPackets<=panipuriPackets)	
				panipuriPackets = panipuriPackets - boughtpanipuriPackets;
			else
				System.out.println("Panipuri packets are running out quickly. Available stock is " +panipuriPackets);
			
			if(masalaPackets>0 && boughtMasalaPackets<=masalaPackets)	
				masalaPackets = masalaPackets - boughtMasalaPackets;
			else
				System.out.println("Masala packets are running out quickly. Available stock is " +masalaPackets);
		}
		/*
		 Method use to show which items are out of stock
		 */
		void displayOutOfStockData() {
			if(maggiePackets<=0)
				System.out.println("Maggie Packets are out of stock");
			if(dosaPackets<=0)
				System.out.println("Dosa Packets are out of stock");
			if(oilPackets<=0)
				System.out.println("Oil Packets are out of stock");
			if(panipuriPackets<=0)
				System.out.println("Panipuri Packets are out of stock");
			if(masalaPackets<=0)
				System.out.println("Maggie Packets are out of stock");
		}
		/*
		 Method use to show which items are available in stock.
		 */
		void displayAvailableItems() {
			if(maggiePackets>0)
				System.out.println(maggiePackets+" maggie packets available");
			if(dosaPackets>0)
				System.out.println(dosaPackets+" dosa packets available");
			if(oilPackets>0)
				System.out.println(oilPackets+" pouches available");
			if(panipuriPackets>0)
				System.out.println(panipuriPackets+" panipuri packets available");
			if(masalaPackets>0)
				System.out.println(masalaPackets+" masala packets available");
		}
	public static void main(String[] args) {
		GeneralStore genralStore = new GeneralStore();
		genralStore.shopInitialStock(50, 43, 39, 43, 73);
		genralStore.customerShopping(50, 5, 40, 45, 33);
		genralStore.displayOutOfStockData();
		genralStore.displayAvailableItems();

	}

}
