package priyanka;

public class Shop {
	
	static int stockOfMaggie=50;
	static int stockOfDosa=43;
	static int stockOfOil=39;
	static int stockOfPaniPuri=43;
	static int stockOfMasala=73;
	
	void outOfStock() {
		System.out.println("**** Out Of Stock Details****");
		
		if(stockOfMaggie==0)
			System.out.println("Maggie is running out of stock");
		if(stockOfDosa==0)
			System.out.println("Dosa is running out of stock");
		if(stockOfOil==0)
			System.out.println("Oil is running out of stock");
		if(stockOfPaniPuri==0)
			System.out.println("PaniPuri is running out of stock");
		if(stockOfMasala==0)
			System.out.println("Masala is running out of stock");
			
	}
	void itemInStock() {
	
		System.out.println("****Stock Details****");
		
		if(stockOfMaggie!=0) {
			System.out.println(stockOfMaggie+" Maggie available in stock");	
		}
		
		if(stockOfDosa!=0) {
			System.out.println(stockOfDosa+" Dosa available in stock");	
		}
		
		if(stockOfOil!=0) {
			System.out.println(stockOfOil+" Oil Pouches available in stock");	
		}
		
		if(stockOfPaniPuri!=0) {
			System.out.println(stockOfPaniPuri+" Panipuri available in stock");	
		}
		
		if(stockOfMasala!=0) {
			System.out.println(stockOfMasala+" Masala available in stock");	
		}
		
	}
	void customerOrder(int maggieQuantity,int dosaQuantity, int oilQuantity,int paniPuriQuantity, int masalaQuantity) {
	
		if(stockOfMaggie>=maggieQuantity)
			stockOfMaggie=stockOfMaggie-maggieQuantity;
		else {	
			System.out.println("Customer require "+maggieQuantity+" Maggie but "+stockOfMaggie+" available in stock");
		}
		
		if(stockOfDosa>= dosaQuantity)
			stockOfDosa=stockOfDosa-dosaQuantity;
		else {	
			System.out.println("Customer require "+dosaQuantity+" Dosa but "+stockOfDosa+" available in stock");
		}
		if(stockOfOil>=oilQuantity)
			stockOfOil=stockOfOil-oilQuantity;
		else {	
			System.out.println("Customer require "+oilQuantity+" Oil Pouch but "+stockOfOil+" available in stock");
		}
		if(stockOfPaniPuri>=paniPuriQuantity)
			stockOfPaniPuri=stockOfPaniPuri-paniPuriQuantity;
		else {	
			System.out.println("Customer require "+paniPuriQuantity+" Panipuri but "+stockOfPaniPuri+" available in stock");
		}
		if(stockOfMasala>=masalaQuantity)
			stockOfMasala=stockOfMasala-masalaQuantity;
		else {	
			System.out.println("Customer require "+masalaQuantity+" Masala but "+stockOfMasala+" available in stock");
		}
		
	}
public static void main(String[] arg) {
	Shop shop=new Shop();
	shop.customerOrder(50,10,5,90,2);
	shop.itemInStock();
	shop.outOfStock();	
}
}

