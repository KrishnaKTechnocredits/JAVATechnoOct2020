package sadhana;

class PrimeNumbers {
	int i, j, isPrime, n;

	void printData() {
		for (i = 2; i <= 100; i++) {
			isPrime = 0;
			for (j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					isPrime = 1;
					break;
				}
			}
			if (isPrime == 0)
				System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		PrimeNumbers primeNumbers = new PrimeNumbers();
		System.out.println("Prime Numbers Between 1 to 100 : ");
		primeNumbers.printData();
	}
}
