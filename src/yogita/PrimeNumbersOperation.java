/* Assignment_23 : 20th Nov'2020

1) Find count of prime numbers between 2-100.
2) find sum of all prime numbers between 2-100.
3) find average of all prime numbers between 2-100.

*/

package yogita;

public class PrimeNumbersOperation {
	void findPrimeCntSumAvg() {

		int cnt = 0;
		int sum = 0;
		float avg = 0;
		for (int index = 2; index <=100; index++) {
			int num = index;
			boolean flag = false;
			for (int j = 2; j <= num / 2; j++) {
				if (num % j == 0) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.print(index + " ");
				cnt++;
				sum += cnt;
				avg = sum / cnt;
			}
		}
		System.out.println("\nCount of prime Numbers from 2 to 100 is: " +cnt);
		System.out.println("Sum of prime Numbers from 2 to 100 is: " +sum);
		System.out.println("Average of prime Numbers from 2 to 100 is: " +avg);
	}

	public static void main(String[] args) {
		PrimeNumbersOperation prime = new PrimeNumbersOperation();
		System.out.println("-----Prime Numbers from 2 to 100-----");
		prime.findPrimeCntSumAvg();
	}
}
