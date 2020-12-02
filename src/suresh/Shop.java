package suresh;

public class Shop {
	
	String customername;
	//Integer items;
	Integer Maggie = 50; 
	Integer Dosa = 43;
	Integer pouches =39;
	Integer panipuri = 43;
	Integer Masalas =73;
	
	void customer(String customername){
		this.customername = customername;
	}
	
	void quantity(Integer Maggie,Integer Dosa,Integer pouches,Integer panipuri,Integer Masalas){
		
		this.Maggie = Maggie;
		this.Dosa = Dosa;
		this.pouches = pouches;
		this.panipuri = panipuri;
		this.Masalas = Masalas;
		System.out.println("<--------> Order Details <-------->");
		System.out.println("Ordered Quantity- Maggie: " + Maggie);
		System.out.println("Ordered Quantity- Dosa: " + Dosa);
		System.out.println("Ordered Quantity- pouches: " + pouches);
		System.out.println("Ordered Quantity- panipuri: " + panipuri);
		System.out.println("Ordered Quantity- Masalas: " + Masalas);
	}
	void OutOfStock(){
		if(Maggie>50) {
		System.out.println("  Maggie Out of Stock"); 	}
		if(Dosa>44) 
		{	System.out.println("  Dosa Out of Stock"); 	}
		if(pouches>40) 
		{	System.out.println("  pouches Out of Stock"); 	}
		if(panipuri>44) 
		{	System.out.println("  panipuri Out of Stock"); 	}
		if(Masalas>74) 
		{	System.out.println("  Masalas Out of Stock"); 	}
	}
	void AvailbleStock(){
		System.out.println("<--------> Customer Details <-------->");
		System.out.println(" Customer Name: " + customername);
		
		System.out.println("<--------> Available Item Details <-------->");
		System.out.println(" Available Items: Maggie - " + Maggie);
		System.out.println(" Available Items: Dosa - " + Dosa);
		
		System.out.println(" Available Items: pouches - " + pouches);
		System.out.println(" Available Items: panipuri - " + panipuri);
		System.out.println(" Available Items: Masalas - " + Masalas);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop shop = new Shop();
		shop.customer("Suresh");
		shop.AvailbleStock();
		shop.quantity(51,44,32,35,50);
		shop.OutOfStock();
	}

}
