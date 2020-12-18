package ritika.Assignments;

/*Assignment - 38 : 11th Dec'2020
Verify number is in Fibonacci series or not.
*/
public class Asgmt_38 {

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
			System.out.println("Given number " + number + " is present in the Fibonacci series");
		else
			System.out.println("Given number " + number + " is Not present in the Fibonacci series");
	}

	public static void main(String[] args) {
		Asgmt_38.verifyNumberInFibonacciSeries(555);
		Asgmt_38.verifyNumberInFibonacciSeries(987);
	}
}
