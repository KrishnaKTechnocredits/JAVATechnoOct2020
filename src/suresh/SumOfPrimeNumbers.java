package suresh;

public class SumOfPrimeNumbers {
	void printsum() {
		int n = 0;
		int status = 1;
		int num = 2;
		int sum = 0;
		for (int i = 1; i <= 100;) {
			for (int j = 2; j <= num / 2; j++) {
				if (num % j == 0) {
					status = 0;
					break;
				}
			}
			if (status != 0 && num <= 100) {
				// System.out.println((num));

				sum = sum + num;
				System.out.println(sum);
				i++;
			}

			status = 1;
			num++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfPrimeNumbers sumofprimenumbers = new SumOfPrimeNumbers();
		sumofprimenumbers.printsum();
	}

}
