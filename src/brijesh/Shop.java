package brijesh;

public class Shop {
	static int maggieStock=50;
	static int dosaStock=43;
	static int pouchesStock=39;
	static int paniPuriStock=43;
	static int masalaStock=73;
	
	void customerBoughtItems(int maggieCount, int dosaCount, int pouchesCount, int paniPuriCount, int masalaCount) {
		if(maggieStock>0 && maggieCount<=maggieStock)
			maggieStock-=maggieCount;
		else
			System.out.println("Maggie running out of stocks. Available packets: "+maggieStock);
		if(dosaStock>0 && dosaCount<=dosaStock)
			dosaStock-=dosaCount;
		else
			System.out.println("Dosa running out of stocks. Available packets: "+dosaStock);
		if(pouchesStock>0 && pouchesCount<=pouchesStock)
			pouchesStock-=pouchesCount;
		else
			System.out.println("Pouches running out of stocks. Available packets: "+pouchesStock);
		if(paniPuriStock>0 && paniPuriCount<=paniPuriStock)
			paniPuriStock-=paniPuriCount;
		else
			System.out.println("PaniPuri running out of stocks. Available packets: "+paniPuriStock);
		if(masalaStock>0 && masalaCount<=masalaStock)
			masalaStock-=masalaCount;
		else
			System.out.println("Masala running out of stocks. Available packets: "+masalaStock);
	}
	
	void displayOutOfStockItems() {
		System.out.println("*****************Items running out of stock*************");
		if(maggieStock<=0)
			System.out.println("Maggie Out of stock");
		if(dosaStock<=0)
			System.out.println("Dosa Out of stock");
		if(pouchesStock<=0)
			System.out.println("Pouches Out of stock");
		if(paniPuriStock<=0)
			System.out.println("Panipuri Out of stock");
		if(masalaStock<=0)
			System.out.println("Masala Out of stock");
	}
	
	void displayInStockItems() {
		System.out.println("*****************Items available in stock*************");
		if(maggieStock>0)
			System.out.println(maggieStock+" maggie packets available");
		if(dosaStock>0)
			System.out.println(dosaStock+" dosa packets available");
		if(pouchesStock>0)
			System.out.println(pouchesStock+" pouches available");
		if(paniPuriStock>0)
			System.out.println(paniPuriStock+" panipuri packets available");
		if(masalaStock>0)
			System.out.println(masalaStock+" masala packets available");
	}
	
	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.customerBoughtItems(10, 43, 2, 44, 80);
		shop.displayOutOfStockItems();
		shop.displayInStockItems();
	}
}

