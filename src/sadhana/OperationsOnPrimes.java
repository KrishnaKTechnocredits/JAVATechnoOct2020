package sadhana;
/*Assignment_23 : 20th Nov'2020

1) Find count of prime numbers between 2-100.
2) find sum of all prime numbers between 2-100.
3) find average of all prime numbers between 2-100.
 */
public class OperationsOnPrimes {

	void printData(int num1, int num2) {
		int count = 0, sum = 0;
		float avg = 0f;
		if (num1 > num2 || num1 == num2)
			System.out.println("Please enter exact range");
		else {
			for (int index = num1; index <= num2; index++) {
				boolean flag = true;
				for (int innerIndex = 2; innerIndex < index; innerIndex++) {
					if (index % innerIndex == 0) {
						flag = false;
						break;
					}
				}
				if (flag) {
					count++;
					System.out.print(" " + index);
					sum = sum + index;
				}
			}
			avg = sum / count;
			System.out.println();
			System.out.println("Count of prime numbers between " + num1 + " & " + num2 + ": " + count);
			System.out.println("Average of Prime Numbers between 2 -200 : " + avg);
			System.out.println("Sum of Prime Numbers between 2-200 : " + sum);
		}
	}

	public static void main(String[] args) {
		OperationsOnPrimes operationsOnPrimes = new OperationsOnPrimes();
		operationsOnPrimes.printData(2, 200);
	}
}
