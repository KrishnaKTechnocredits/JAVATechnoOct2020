package ritika.Assignments;

/*Assignment - 37 : 10th Dec'2020
Print Fibonacci series for first 10 numbers.

output : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
*/
public class Asgmt_37 {

	static void printFibonacciSeries(int length) {
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1 + ", " + num2 + ", ");
		for (int i = 3; i <= length; i++) {
			int sum = num1 + num2;
			System.out.print(sum + ", ");
			num1 = num2;
			num2 = sum;
		}
	}

	public static void main(String[] args) {
		Asgmt_37.printFibonacciSeries(10);
	}
}
