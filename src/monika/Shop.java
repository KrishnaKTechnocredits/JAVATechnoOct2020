package monika;
class Shop{

   int maggieStock=50;
   int dosaStock=43;
   int pouchesStock=30;
   int panipuriStock=43;
   int masalaStock=74;
   
   
   
   void customerBoughtItems(int maggieCount, int dosaCount, int pouchesCount ,int panipuriCount, int masalaCount){
       if (maggieStock !=0 && maggieCount<= maggieStock)
	       maggieStock=maggieStock-maggieCount;
		   else if (maggieStock<=maggieCount)
		    System.out.println("Maggie Available :" +maggieStock);
		   else
		    System.out.println("Maggie running out of stock");
			
		if (dosaStock !=0 && dosaCount<= dosaStock)
	       dosaStock=dosaStock-dosaCount;
		   else if (dosaStock<=dosaCount)
		    System.out.println("Dosa Available :" +dosaStock);
		   else
		    System.out.println("Dosa running out of stock");	
			
		if (pouchesStock!=0 && pouchesCount<= pouchesStock)
	       pouchesStock=pouchesStock-pouchesCount;
		   else if (pouchesStock<=pouchesCount)
		    System.out.println("Pouches Available :" +pouchesStock);
		   else
		    System.out.println("Pouches running out of stock");
			
		if (panipuriStock !=0 && panipuriCount<= panipuriStock)
	       panipuriStock=panipuriStock-panipuriCount;
		   else if (panipuriStock<=panipuriCount)
		    System.out.println("Panipuri Available :" +panipuriStock);
		   else
		    System.out.println("Panipuri running out of stock");
			
		if (masalaStock !=0 && masalaCount<= masalaStock)
	       masalaStock=masalaStock-masalaCount;
		   else if (masalaStock<=masalaCount)
		    System.out.println("Masala Available :" +masalaStock);
		   else
		    System.out.println("Masala running out of stock");
   }

        void showOutOfStockItem() {
		   System.out.println("--Out of stock--");
		   
		   if(maggieStock<=0)
			System.out.println("Maggie Out of stock");
		if(dosaStock<=0)
			System.out.println("Dosa Out of stock");
		if(pouchesStock<=0)
			System.out.println("Pouches Out of stock");
		if(panipuriStock<=0)
			System.out.println("Panipuri Out of stock");
		if(masalaStock<=0)
			System.out.println("Masala Out of stock");
	}
	
	void showInStockItem(){
		   System.out.println("--In stock--");
		   
		   if(maggieStock>0)
			System.out.println("Maggie in stock");
		if(dosaStock>0)
			System.out.println("Dosa in stock");
		if(pouchesStock>0)
			System.out.println("Pouches in stock");
		if(panipuriStock>0)
			System.out.println("Panipuri in stock");
		if(masalaStock>0)
			System.out.println("Masala in stock");
	}
	
	public static void main(String[] args) {
	 Shop shop = new Shop();
	 shop.customerBoughtItems(45,43,60,74,50);
	 shop.showOutOfStockItem();
	 shop.showInStockItem();
	 
	 }
	 
}
   
	
	
		
		

			
 
  
  









