package raghvendra.NumberOperations;
/*Assignment - 37 : 10th Dec'2020 
Print Fibonacci series for first 10 numbers.

output : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34*/
public class FindFibonacci {
	void displayFibonacci() {
		int sum=0;
		int number1=0;
		int number2=1;
		int count=0;
		System.out.print("Fabonacci numbers: " +number1 +" "+number2+" ");
		while(count<11) {
			sum=number1+number2;
			System.out.print(sum+" ");
			number1=number2;
			number2=sum;
			sum=0;
			count++;
		}
	}
	public static void main(String[] args) {
		FindFibonacci fibonacci=new FindFibonacci();
		fibonacci.displayFibonacci();
	}
}
