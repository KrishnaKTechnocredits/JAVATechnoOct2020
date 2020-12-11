package ruby;

/*Assignment - 37 : 10th Dec'2020 
Print Fibonacci series for first 10 numbers.
output : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34*/

public class Assignment37 {
	void fibonacciSeries(int n) {
		int temp1 = 0, temp2 = 1, sum = 0;
		System.out.print(temp1 + ", " + temp2);
		for (int i = 0; i < n; i++) {
			sum = temp1 + temp2;
			temp1 = temp2;
			temp2 = sum;
			System.out.print(", " + sum);
		}
	}

	public static void main(String[] args) {
		Assignment37 assign = new Assignment37();
		assign.fibonacciSeries(12);
	}
}