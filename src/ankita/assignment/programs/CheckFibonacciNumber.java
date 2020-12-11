/*Assignment - 38 : 11th Dec'2020
Verify number is in Fibonacci series or not.*/

package ankita.assignment.programs;

public class CheckFibonacciNumber {
	void isFibonacciNumber(int number) {
		int n1 = 0, n2 = 1, sum = 0, cnt = 0;
		boolean flag = false;
		while (cnt <= number) {
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
			cnt++;
			if (sum == number) {
				flag = true;
				break;
			}
		}
		if (flag)
			System.out.println(number + " is Fibonacci Series Number");
		else
			System.out.println(number + " is not Fibonacci Series Number");
	}

	public static void main(String[] args) {
		CheckFibonacciNumber checkFibonacciNumber = new CheckFibonacciNumber();
		checkFibonacciNumber.isFibonacciNumber(55);
		checkFibonacciNumber.isFibonacciNumber(10);
		checkFibonacciNumber.isFibonacciNumber(8);
		checkFibonacciNumber.isFibonacciNumber(35);
	}
}
