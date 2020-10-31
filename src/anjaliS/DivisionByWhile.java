package anjaliS;

public class DivisionByWhile{
	   void even(int start,int end)
	   {
	     System.out.println("Even numbers are ");
	     while(start<=end)
	     {
	      if(start%2==0)
	      System.out.println(start);
	      start++;
	     }
	  }
	    void divisibleBy5(int start,int end){
	     System.out.println("Divisible by 5, numbers are:");
	     while(start<=end)
	    {
	     if(start%5==0)
	      System.out.println(start);
	      start++;
	    } 
	  }
	    void divisibleBy3and5(int start,int end){
	     System.out.println("Divisible by 5 & 3, numbers are:");
	     while(start<=end)
	   {
	    if(start%5==0 && start%3==0)
	     System.out.println(start);
	     start++;
	   }
	 }
	   void divisibleBy13or7(int start,int end){
	    System.out.println("Divisible by 7 or 13, numbers are");
	    while(start<=end)
	   {
	    if(start%7==0 )
	     System.out.println(start +" is divisible by 7");
	     
	    if(start%13==0)
	     System.out.println(start +" is divisible by 13");
	     start++;
	   }
	 } 
	   public static void main(String[] args){
	      DivisionByWhile div = new DivisionByWhile();
	      div.even(10,15);
	      div.divisibleBy5(10,30);
	      div.divisibleBy3and5(5,18);
	      div.divisibleBy13or7(5,40);
	           
	   }
	   
	 }
