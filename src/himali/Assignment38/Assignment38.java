/*
 * Assignment - 38 : 11th Dec'2020 
Verify number is in Fibonacci series or not.

 */

package himali.Assignment38;

public class Assignment38 {
	static void verifyNumberInFibonacciSeries(int number) {
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1 + " " + num2 + " ");
		int sum = 0;
		boolean flag = false;
		int count = 0;
		while (sum <= number) {
			if (sum == number) {
				flag = true;
				break;
			} else {
				sum = num1 + num2;
				System.out.print(sum + " ");
				num1 = num2;
				num2 = sum;
				count++;
			}
		}
		System.out.println();
		if (flag)
			System.out.println("Given number " + number + " is present in Fibonacci series");
		else
			System.out.println("Given number " + number + " is Not present in Fibonacci series");
	}

	public static void main(String[] args) {
		Assignment38.verifyNumberInFibonacciSeries(1);
		Assignment38.verifyNumberInFibonacciSeries(8);
	}

	

}
