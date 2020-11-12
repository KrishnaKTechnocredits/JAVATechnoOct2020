package yogita;

class WhileLoop {

    void evenOdd(int start, int end){
	   while(start<=end){
	      if (start % 2==0)
	         System.out.println(" "+start);	
		 start++;
	   }
	}
	 void divisibleFive(int start, int end){
	    while(start<=end){
           if (start % 5==0)
	         System.out.println(" "+start);
		  start++;
      }
	}
	
	 void divisibleThreeFive(int start, int end){
	    while(start<=end){
	       if (start % 3==0 && start % 5==0)
	         System.out.println(" "+start);
		  start++;
	  }
	}
	
	void divisibleSevenThirteen(int start, int end){
	    while (start<=end){
	       if (start % 7==0)
	         System.out.println(+start+ " Number is Divisible by 7");
           else if(start % 13 ==0)
  	         System.out.println(+start+ " Number is Divisible by 14");
		 start++;
      }
	}
	
 public static void main(String [] args){

    WhileLoop whileloop = new WhileLoop();
	System.out.println("Even Numbers are");
    whileloop.evenOdd(10,15);
    System.out.println("Numbers Divisible By 5 are:");
    whileloop.divisibleFive(10,30);
	System.out.println("Number Divisible By 3 And 5 are:");
	whileloop.divisibleThreeFive(5,18);
	System.out.println("Numbers Divisible By 7 And 13 are:");
	whileloop.divisibleSevenThirteen(5,40);
	
	}
}