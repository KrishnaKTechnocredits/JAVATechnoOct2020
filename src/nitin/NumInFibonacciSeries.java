package nitin;
/* Assignment - 38 : 11th Dec'2020 - Verify number is in Fibonacci series or not.*/
public class NumInFibonacciSeries {
	public void isNumInFibonacciSeries(int number) {
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		fibonacciSeries.printFibonacciSeries(number);
		System.out.println();
		System.out.print("Input Number --> ");
		int num=0,num1=1,nextNum=0;
		if(number==num || number==num1)
			System.out.println(number+" - This number is in Fibonacci series.");
		while(nextNum<number) {
			nextNum=num+num1;
			num=num1;
			num1=nextNum;
		}
		if(number==nextNum)
			System.out.println(number+" - This number is in Fibonacci series.");
		else
			System.out.println(number+" - This number is not in Fibonacci series.");
	}
	public static void main(String[] args) {
		new NumInFibonacciSeries().isNumInFibonacciSeries(10);
	}
}
