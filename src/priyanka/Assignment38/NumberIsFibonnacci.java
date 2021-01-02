package priyanka.Assignment38;

/*
Verify number is in Fibonacci series or not. 
*/

public class NumberIsFibonnacci {

	void fibonacciSeries(int number) {

		int number1 = 0, number2 = 1, nextNum = 0;
		while (nextNum < number) {
			nextNum = number1 + number2;
			number1 = number2;
			number2 = nextNum;
		}
		if (number == nextNum)
			System.out.println(number + " is Fibonacci Series Number");
		else
			System.out.println(number + " is not Fibonacci Series Number");
	}

	public static void main(String[] args) {
		new NumberIsFibonnacci().fibonacciSeries(34);
		new NumberIsFibonnacci().fibonacciSeries(23);
		new NumberIsFibonnacci().fibonacciSeries(33);
		new NumberIsFibonnacci().fibonacciSeries(8);

	}
}
