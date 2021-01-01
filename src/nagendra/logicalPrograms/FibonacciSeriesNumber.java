package nagendra.logicalPrograms;

/*
Assignment - 38 : 11th Dec'2020 
Verify number is in Fibonacci series or not.
*/
public class FibonacciSeriesNumber {

	boolean isFibonacciSeriesNumber(int number) {
		int firstNumber = 0;
		int secondNumber = 0;
		int fibonacciNumber = 0;
		boolean flag=false;
		for (int i = 0; i <= number+1; i++) {
			if (i < 2) {
				firstNumber = i;
				secondNumber = fibonacciNumber;
				fibonacciNumber = firstNumber + secondNumber;
			} else {
				firstNumber = secondNumber;
				secondNumber = fibonacciNumber;
				fibonacciNumber = firstNumber + secondNumber;
			}
			if(fibonacciNumber==number)
				flag=true;
		}
		return flag;
	}

	public static void main(String[] args) {
		
		FibonacciSeriesNumber series = new FibonacciSeriesNumber();
		int number = 33;
		boolean flag=series.isFibonacciSeriesNumber(number);
		System.out.println("is Number "+number+ " part of Fibonacii Series: "+flag);
	}
}
