package nitin;
/* Assignment - 37 : 10th Dec'2020 - Print Fibonacci series for first 10 numbers.
output : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34*/
public class FibonacciSeries {
	public void printFibonacciSeries(int number) {
		int num =0;
		int num1=1;
		int nextNum=0;
		System.out.println("Fibonacci series for first "+number+" numbers --> ");
		System.out.print(num+", "+num1);
		for(int index=2;index<number;index++) {
			nextNum=num+num1;
			num=num1;
			num1=nextNum;
			System.out.print(", "+nextNum);
		}
	}
	public static void main(String[] args) {
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		fibonacciSeries.printFibonacciSeries(10);
	}
}
