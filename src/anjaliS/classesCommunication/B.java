package anjaliS.classesCommunication;

public class B{
    void m2(){
    System.out.println("m2 of B");
     m3();
   }
    static void m3(){
    System.out.println("m3 of B");
    C c = new C();
    c.m4();
   }
}
  
