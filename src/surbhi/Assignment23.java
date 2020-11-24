package surbhi;
public class Assignment23 {

	static boolean checkPrime(int numberToCheck) {
		if (numberToCheck == 1) {
			return false;
		}
		for (int i = 2; i * i <= numberToCheck; i++) {
			if (numberToCheck % i == 0) {
				return false;
			}
		}
		return true;
	}
	static int primeSum(int l, int r) {
		int sum = 0;
		for (int i = r; i >= l; i--) {

			boolean isPrime = checkPrime(i);
			if (isPrime) {

				sum = sum + i;
			}
		}
		return sum;
	}

	static double avgPrimeSum(int l, int r) {
		int sum = 0;
		double totalPrimeNumbers = 0;
		for (int i = r; i >= l; i--) {

			boolean isPrime = checkPrime(i);
			if (isPrime) {

				sum = sum + i;
				totalPrimeNumbers++;
			}
		}
		return (double) sum / totalPrimeNumbers;

	}

	public static void main(String[] args) {
		Assignment23 assignment23 = new Assignment23();
		System.out.println(assignment23.primeSum(2, 100));
		System.out.println(assignment23.avgPrimeSum(2, 200));
	}
}
