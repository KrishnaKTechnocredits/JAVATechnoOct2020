package yogita;

class Loop {

    void evenOdd(int start, int end){
	  for (int i = start;i<=end;i++){
	    if (i % 2==0)
	     System.out.println(" "+i);	
	   }
	}
	
	void divisibleFive(int start, int end){
	  for (int i = start;i<=end;i++){
        if (i % 5==0)
	     System.out.println(" "+i);
      }
	}
	
	void divisibleThreeFive(int start, int end){
	  for (int i = start;i<=end;i++){
	    if (i % 3==0 && i % 5==0)
	      System.out.println(" "+i);
	  }
	}
	
	void divisibleSevenThirteen(int start, int end){
	  for (int i = start;i<=end;i++){
	    if (i % 7==0)
	      System.out.println(+i+ " Number is Divisible by 7");
        else if(i % 13 ==0)
  	       System.out.println(+i+ " Number is Divisible by 14");
      }
	}
	
 public static void main(String [] args){

    Loop loop = new Loop();
	System.out.println("Even Numbers are");
    loop.evenOdd(10,15);
    System.out.println("Numbers Divisible By 5 are:");
    loop.divisibleFive(10,30);
	System.out.println("Number Divisible By 3 And 5 are:");
	loop.divisibleThreeFive(5,18);
	System.out.println("Numbers Divisible By 7 And 13 are:");
	loop.divisibleSevenThirteen(5,40);
	
	}
}