package darshana;

public class Shop {
public static int Maggi=50;  
public static int Dosa=43;  
public static int pouches=39;  
public static int panipuri=43;  
public static int masala=73;  
public void Shopping(int Maggicnt, int Dosacnt, int pouchescnt, int panipuricnt, int masalacnt ){  
Maggi=Maggi-Maggicnt;  

 Dosa=Dosa-Dosacnt;  
 pouches=pouches-pouchescnt;  
 panipuri=panipuri-panipuricnt;  
 masala=masala-masalacnt;  
 // System.out.println("Maggi "+Maggi+" Dosa "+Dosa+ " pouches "+pouches+ " panipuri "+panipuri+ " masala "+masala);  
}
    public void nostock(int Maggittl, int Dosattl, int pouchesttl, int panipurittl, int masalattl){  
        if(Maggittl <=0 ){  

    System.out.println("Maggi is out of stock ");  
}  
if(Dosattl <=0 ){  

    System.out.println("Dosa are out of stock ");  
}  
 if(pouchesttl <=0 ){  

    System.out.println("Pouches are out of stock ");  
}  
 if(panipurittl <=0 ){  

    System.out.println("Panipuri is out of stock ");  
}  
 if(masalattl <=0 ){  

    System.out.println("Masala are out of stock ");  
}  
 }  

 public void instock(int Maggiqty ,int Dosaqty ,int pouchesqty ,int panipuriqty, int masalaqty){  

           if(Maggiqty >0 ){  

    System.out.println("Maggi remaining is "+Maggiqty);  
}  
 if(Dosaqty >0 ){  

    System.out.println("Dosa remaining is "+Dosaqty);  
}  
 if(pouchesqty >0 ){  

    System.out.println("Pouches in stock "+pouchesqty);  
}  
 if(panipuriqty >0 ){  

    System.out.println("Panipuri remaining is "+panipuriqty);  
}  
 if(masalaqty >0 ){  

    System.out.println("Masala remaining is "+masalaqty);  
}  
 }  

public static void main(String args[]) {  
   Shop s = new Shop();  
   //s.Shopping(10, 15, 20, 10, 50);  
   s.Shopping(10, 30, 40, 20, 80);   
   s.nostock(Maggi,Dosa,pouches,panipuri, masala);  
    s.instock(Maggi,Dosa,pouches,panipuri, masala);  
}   
}