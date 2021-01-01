//Assignment - 38 : 11th Dec'2020 
//Verify number is in Fibonacci series or not.

package priya;

public class VerifyFibonacciSeries {

	void isFibonacciNumber(int num) {
		int num1 = 0, num2 = 1, sum = 0, cnt = 0;
		boolean flag = false;
		while (cnt <= num) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			cnt++;
			if (sum == num) {
				flag = true;
				break;
			}
		}
		if (flag)
			System.out.println(num + " is Fibonacci Series Number");
		else
			System.out.println(num + " is not Fibonacci Series Number");
	}

	public static void main(String[] args) {
		VerifyFibonacciSeries verifyfibonaccinumber = new VerifyFibonacciSeries();
		verifyfibonaccinumber.isFibonacciNumber(55);
		verifyfibonaccinumber.isFibonacciNumber(10);
		verifyfibonaccinumber.isFibonacciNumber(4);
		verifyfibonaccinumber.isFibonacciNumber(25);
	}
}
