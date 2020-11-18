package anjaliS;

public class Shop{
    int maggiepackets;
    int dosapackets;
    int masalapackets;
    int oilpackets ;
    int panipuripackets;

    void setstock(int maggieQty,int dosaQty,int oilQty,int masalaQty,int panipuriQty){
       maggiepackets = maggieQty;
       dosapackets = dosaQty;
       masalapackets = masalaQty;
       oilpackets = oilQty ;
       panipuripackets = panipuriQty;
    }
    
    void customerOrder(int maggieQty,int dosaQty,int oilQty,int masalaQty,int panipuriQty){
      System.out.println("CustomerOrder is " +maggieQty+ " maggiepackets " +dosaQty+ " dosapackets " +oilQty+ " oilpackets " +masalaQty+  " masalapackets "  +panipuriQty+ " panipuripackets" );
      
     if(maggiepackets>=maggieQty)
     maggiepackets = maggiepackets-maggieQty;
     System.out.println("Maggie packets running out of stock");   

     if(dosapackets>=dosaQty)
     dosapackets = dosapackets-dosaQty;
     System.out.println("Dosa packets running out of stock");
    
     if(oilpackets>=oilQty)
     oilpackets = oilpackets-oilQty;
     System.out.println("Oil packets running out of stock");

     if(masalapackets>=masalaQty)
     masalapackets = masalapackets-masalaQty;
     System.out.println("Masala packets running out of stock");

    if(panipuripackets>=panipuriQty)
    panipuripackets = panipuripackets-panipuriQty;
    System.out.println("Panipuri packets running out of stock");

 }
   void outOfStock(){
    if(maggiepackets==0)
    System.out.println("Maggie packets are out of stock");
   
    if(dosapackets==0)
    System.out.println("Dosa packets are out of stock");
    
    if(masalapackets==0)
    System.out.println("Masala packets out of stock");
  
   if(oilpackets==0)
   System.out.println("Oil packets are out of stock");
  
   if(panipuripackets==0)
   System.out.println("Panipuri packets are out of stock");
  }

  void availableStock(){
    if(maggiepackets!=0)
    System.out.println(maggiepackets+ " Maggie packets are available in stock");
   
    if(dosapackets!=0)
    System.out.println(dosapackets+ " Dosa packets are available in stock");
    
    if(masalapackets!=0)
    System.out.println(masalapackets+ " Masala packets are available in stock");
  
   if(oilpackets!=0)
   System.out.println(oilpackets+ " Oil packets are available in stock");
  
   if(panipuripackets!=0)
   System.out.println(panipuripackets+ " Panipuri packets are available in stock");
  }
   public static void main(String[] args){
      Shop shop = new Shop();
      shop.setstock(50,43,39,43,73);
      System.out.println("customers order");
      shop.customerOrder(50,22,39,21,72);
      System.out.println("Out of stock items");
      shop.outOfStock();
      System.out.println("Available stock items");
      shop.availableStock();
   }   
      
}