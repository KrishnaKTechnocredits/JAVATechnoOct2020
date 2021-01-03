/*Assignment - 38 
Verify number is in Fibonacci series or not.*/

package shrutiS.assignment38;

public class NumberInFibonacci {

	void findNum(int num) {

		int i = 0, j = 1, add = 0;
		System.out.println("\nFibonacci series: ");
		System.out.print(i + "," + j);
		while (add < num) {
			add = i + j;
			System.out.print("," + add);
			i = j;
			j = add;
		}
		System.out.println(",- - -");
		if (add == num)
			System.out.println("Given number " + num + " is present in fibonacci series");
		else
			System.out.println("Given number " + num + " is not present in fibonacci series");
	}

	public static void main(String[] args) {
		NumberInFibonacci fibonacciNumber = new NumberInFibonacci();
		fibonacciNumber.findNum(5);
		fibonacciNumber.findNum(0);
		fibonacciNumber.findNum(15);
	}
}
