package poojap;

public class PrimeNumberr {

	void findPrimeNumber(int start, int end) {

		System.out.println("Prime Numbers from " + start + " to " + end);

		for (int i = start; i <= end; i++) {
			int num = i;
			boolean flag = true;
			for (int j = 2; j <= num / 2; j++) {
				if (num % j == 0)
					flag = false;
			}
			if (!flag) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		PrimeNumberr prime = new PrimeNumberr();
		prime.findPrimeNumber(2, 100);

	}
}
