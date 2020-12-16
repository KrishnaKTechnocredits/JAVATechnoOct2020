package monika;

/*Assignment - 38 
Verify number is in Fibonacci series or not.
*/
public class VefrifyFibSer {

	static void verifyNumberInFibonacciSeries(int number) {
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1 + " " + num2 + " ");
		int sum = 0;
		boolean flag = false;
		int length = 0;
		while (sum <= number) {
			if (sum == number) {
				flag = true;
				break;
			} else {
				sum = num1 + num2;
				System.out.print(sum + " ");
				num1 = num2;
				num2 = sum;
				length++;
			}
		}
		System.out.println();
		if (flag)
			System.out.println("Given number " + number + " is present in Fibonacci series");
		else
			System.out.println("Given number " + number + " is Not present in Fibonacci series");
	}

	public static void main(String[] args) {
		VefrifyFibSer.verifyNumberInFibonacciSeries(6);
		VefrifyFibSer.verifyNumberInFibonacciSeries(8);
	}
}