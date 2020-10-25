class Example4
{
 int x = 10;
 
 
 void m1()
 {
	 x= x + 2;
  System.out.println("Value of x is : " +x);
  
 }
 
  public static void main(String [] arr)
  {
    Example4 e2 =new Example4();
	e2.m1();
    e2.m1();
	System.out.println(e2.x);
	
	
	
   }
  
}