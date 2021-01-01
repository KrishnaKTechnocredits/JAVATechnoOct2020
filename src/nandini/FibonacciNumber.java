package nandini;

public class FibonacciNumber {

	void numberIsFibonacci(int num) {
		int a = 0;
        int b = 1;
        if (num==a || num==b) ;
        int c = a+b;
        while(c<num)
        {
           c = a+b;
           a = b;
           b = c;
        }
        if(num == c)
        	System.out.println(num + " is a Fibonacci Number");
        	
        else
        	System.out.println(num + " is not Fibonacci Number");
	}
	public static void main(String args[]) {
		FibonacciNumber fibonacciNum = new FibonacciNumber();
		fibonacciNum.numberIsFibonacci(45);
	}
}
