
// Print all prime numbers between 2 to 100

package yogita;

public class PrimeNumbers {

	void findPrime(int start, int end) {

		System.out.println("Prime Numbers from " + start + " to " + end);

		for (int index = start; index <= end; index++) {
			int num = index;
			boolean flag = false;
			for (int j = 2; j <= num / 2; j++) {
				if (num % j == 0)
					flag = true;
			}
			if (!flag) {
				System.out.print(index + " ");
			}
		}

	}

	public static void main(String[] args) {
		PrimeNumbers prime = new PrimeNumbers();
		prime.findPrime(2, 100);

	}
}