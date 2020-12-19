/*Assignment - 37 : 10th Dec'2020 
Print Fibonacci series for first 10 numbers.

output : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34*/

package kajol;
public class PrintFibonacciSeries {
	
	void fibonacciSeries(int number) {
		System.out.println("Fibonacci Sereis for First "+number+" numbers:");
		int number1=0,number2=1;
		int succeedingNumber=0;
		System.out.print(number1+","+number2);
		for(int index=2;index<number;index++) {
			succeedingNumber=number1+number2;
			System.out.print(","+succeedingNumber);
			number1=number2;
			number2=succeedingNumber;			
		}
	}
	
	public static void main(String[] args) {
		new PrintFibonacciSeries().fibonacciSeries(10);
	}

}
