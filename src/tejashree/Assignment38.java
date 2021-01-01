package tejashree;

public class Assignment38 {

	void fibonacciSeries(int number) {
	
		int number1 = 0, number2 = 1, nextNum = 0;
		while (nextNum < number) {
			nextNum = number1 + number2;
			number1 = number2;
			number2 = nextNum;
		}
		if (number==nextNum) 
				System.out.println(number + " is Fibonacci Series Number");
			 else 
				System.out.println(number + " is not Fibonacci Series Number");
	}

	public static void main(String[] args) {
		new Assignment38().fibonacciSeries(55);
		new Assignment38().fibonacciSeries(85);
		new Assignment38().fibonacciSeries(33);
		new Assignment38().fibonacciSeries(8);



	}
}
