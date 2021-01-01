/*
 * Assignment - 37 : 10th Dec'2020 
Print Fibonacci series for first 10 numbers.

output : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
 */

package Assignment37;

public class Assignment37 {

	void febonacii(int seriesCount) {
		int num1 = 0;
		int num2 = 1;
		int count = 0;
		

		while (count < seriesCount) {
			System.out.print(num1+ " ");
			
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			count++;

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment37 assignement37 = new Assignment37();
		int series = 10;
		assignement37.febonacii(series);

	}

}
