package ankita.assignment.scenarioBasedProgram;

public class Shop {

	int maggieInStock=50;
	int dosaInStock=43;
	int pouchesInStock=39;
	int panipuriInStock=43;
	int masalaInStock=73;
	
	void boughtItems(int maggieCnt, int dosaCnt, int pouchesCnt, int panipuriCnt, int masalaCnt) {
		if(maggieInStock != 0 && maggieCnt <= maggieInStock )
			maggieInStock = maggieInStock - maggieCnt;
		else if(maggieInStock < maggieCnt)
			System.out.println("Not sufficient stock. Maggie Available :" + maggieInStock );
		else 	
			System.out.println("Maggie running out of stock");
		
		if(dosaInStock != 0 && dosaCnt <= dosaInStock )
			dosaInStock = dosaInStock - dosaCnt;
		else if(dosaInStock < dosaCnt)
			System.out.println("Not sufficient stock. Dosa Available :" + dosaInStock);
		else 	
			System.out.println("dosa running out of stock");
		
		if(pouchesInStock != 0 && pouchesCnt <= pouchesInStock )
			pouchesInStock = pouchesInStock - pouchesCnt;
		else if(pouchesInStock < pouchesCnt)
			System.out.println("Not sufficient stock. pouches Available :" + pouchesInStock);
		else 	
			System.out.println(" pouches running out of stock");
		
		if(panipuriInStock != 0 && panipuriCnt <= panipuriInStock )
			panipuriInStock = panipuriInStock - panipuriCnt;
		else if(panipuriInStock < panipuriCnt)
			System.out.println("Not sufficient stock. panipuri Available :" + panipuriInStock);
		else 	
			System.out.println("panipuri running out of stock");
		
		if(masalaInStock != 0 && masalaCnt <= masalaInStock )
			masalaInStock = masalaInStock - masalaCnt;
		else if(masalaInStock < masalaCnt)
			System.out.println("Not sufficient stock. Masala Available :" + masalaInStock);
		else 	
			System.out.println("masala running out of stock");
	}
	void findOutOfStockItems() {
		boolean OutOfStockItemsflag = false;
		System.out.println("\n----------Items running out of stock ----------");
		if(maggieInStock == 0) {
			System.out.println("Maggie Out of stock");
			OutOfStockItemsflag = true;
		}
		if(dosaInStock == 0) {
			System.out.println("Dosa Out of stock");
			OutOfStockItemsflag = true;
		}
		if(pouchesInStock == 0) {
			System.out.println("Pouches Out of stock");
			OutOfStockItemsflag = true;
		}
		if(panipuriInStock == 0) {
			System.out.println("Panipuri Out of stock");
			OutOfStockItemsflag = true;
		}
		if(masalaInStock == 0) {
			System.out.println("Masala Out of stock");
			OutOfStockItemsflag = true;
		}
		if(!OutOfStockItemsflag)
			System.out.println("All items are available");
	}
	void findAvailableInStockItems() {
		System.out.println("\n----------Items Availability ----------");
		if(maggieInStock > 0)
			System.out.println("Maggie " + maggieInStock + " Available");
		if(dosaInStock > 0)
			System.out.println("Dosa " + dosaInStock + " Available");
		if(pouchesInStock >0)
			System.out.println("Pouches " + pouchesInStock + " Available");
		if(panipuriInStock > 0)
			System.out.println("panipuri " + panipuriInStock + " Available");
		if(masalaInStock > 0)
			System.out.println("Masala " + masalaInStock + " Available");
	}
	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.boughtItems(60,25,23,45,5);
		shop.findOutOfStockItems();
		shop.findAvailableInStockItems();
	}
}
