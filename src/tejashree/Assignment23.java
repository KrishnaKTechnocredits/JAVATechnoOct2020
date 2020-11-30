package tejashree;

public class Assignment23 {

	public static void main(String a[]) {
		new Assignment23().findSumAndAvgOfPrimeNos();

	}

	public void findSumAndAvgOfPrimeNos() {
		double sum = 0.0;
		int cnt = 0;
		double avg = 0.0;
		System.out.println("Prime no.s between 2 to 100 are:");
		for (int i = 2; i <= 100; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				cnt++;
				System.out.print(i + " ");
				sum = sum + i;
				avg = sum / cnt;
			}

		}
		System.out.println();
		System.out.println("Total prime no.s are: " + cnt);
		System.out.println("sum of all prime no.s between 2 to 100 are:" + sum);
		System.out.print("average of all prime no.s between 2 to 100 are:" + avg);

	}
}
