package poojap;

public class Shop {
	
	int qMaggie;
	int qDosa ;
	int qPouches; 
	int qPanipuri;  
	int qMasala;

	void setInitial( int orderMaggy, int orderDosa, int orderPouches, int orderPanipuri, int orderMasala) {
	
		qMaggie = orderMaggy;
		qDosa = orderDosa;
		qPouches = orderPouches;
		qPanipuri = orderPanipuri;
		qMasala = orderMasala;
		
	 System.out.println("Customer purchased :" +qMaggie+ " Maggi packets " +qDosa+" Dosa Packets " +qPouches+" oil Packets " +qPanipuri+ " Panipuri packets " +qMasala+ " Masala packets");

	}
		void customerPurchase(int orderMaggy, int orderDosa, int orderPouches, int orderPanipuri, int orderMasala) {
			
	       System.out.println("Customer purchased :" +orderMaggy+ " Maggi packets " +orderDosa+" Dosa Packets " +orderPouches+" oil Packets " +orderPanipuri+ " Panipuri packets " +orderMasala+ " Masala packets");


		if(qMaggie >=orderMaggy) 
			qMaggie = qMaggie - orderMaggy;
		    System.out.println("Maggie:Running Out of stock");
		
		if(qDosa >=orderDosa)
		   qDosa = qDosa - orderDosa;
	   	   System.out.println("Dosa:Running Out of stock");
    

		if(qPouches >= orderPouches) 
		   qPouches = qPouches - orderPouches;
	   	   System.out.println("oil:Running Out of stock");

	   
		if(qPanipuri>= orderPanipuri) 
		   qPanipuri = qPanipuri - orderPanipuri;
	   	   System.out.println("Panipuri:Running Out of stock");


		if(qMasala >=orderMasala)
		  qMasala = qMasala - orderMasala;
	  	  System.out.println("Masala:Running Out of stock");

	}
	void outOfStock() {

        boolean flag = false;
		if(qMaggie==0) {
			System.out.println("Maggy is Out of stock");
		    flag = true;
		}

		if(qDosa== 0) {
			System.out.println("Dosa is Out of stock");
			 flag = true;
		}
		

		if(qPouches == 0) {
			System.out.println("Oil Pouches is Out of stock");
			 flag = true;
        }
		

		if(qPanipuri==0) {
			System.out.println("Panipury is Out of stock");
			  flag = true;

		}

		if(qMasala ==0 ) {
			System.out.println("Masala is of stock");
			  flag = true;
	   }
		if(!flag)
			System.out.println(" All Items Are Available");
    }

	void inStock() {

		if(qMaggie != 0) 
		{
			System.out.println(qMaggie + " packets of maggy are available" );
		}
  		if(qDosa!=0) 
		{
			System.out.println(qDosa + " packets of dosa are available" );
		}
        if(qPouches != 0) 
		{
			System.out.println(qPouches + " packets of oil are available" );
	    }

         if(qPanipuri != 0) 
		 {
			System.out.println(qPanipuri + " packets of panipuri are available" );
		 }
         if(qMasala !=0) 
		 {
			System.out.println(qMasala + " packets of masala are available" );
	     }
	}
	
public static void main(String[] args) {
		Shop shop = new Shop();
		shop.setInitial(50,43,40,46,33);
		System.out.println("----Customer's Order ---- ");
		shop.customerPurchase(35,30,40,10,25);
		System.out.println("---- Out Of Stock Items ----");
		shop.outOfStock();
		System.out.println("----Available Stock Items----");
        shop.inStock();
	}
}

