/*Assignment_23 : 20th Nov'2020

1) Find count of prime numbers between 2-100.
2) find sum of all prime numbers between 2-100.
3) find average of all prime numbers between 2-100.*/

package shrutiS.assignment23;

public class PrimeNoCalculation {
	float sum;
	int finalCount;

	int findCountOfPrimeNo() {
		for (int index = 2; index <= 100; index++) {
			int count = 0;
			for (int innerIndex = 1; innerIndex <= index / 2; innerIndex++) {
				if (index % innerIndex == 0)
					count++;
			}
			if (count == 1) {
				finalCount++;
				System.out.print(index + " ");
			}
		}
		System.out.println("\nTotal Count of prime numbers between 2-100 : " + finalCount);
		return finalCount;
	}

	float findSumOfPrimeNo() {
		for (int index = 2; index <= 100; index++) {
			int count = 0;
			for (int innerIndex = 1; innerIndex <= index / 2; innerIndex++) {
				if (index % innerIndex == 0)
					count++;
			}
			if (count == 1)
				sum = sum + index;
		}
		System.out.println("Total sum of all prime numbers between 2-100 : " + sum);
		return sum;
	}

	void findAverageOfPrimeNo(float sum, int totalCount) {
		System.out.println("Average of all prime numbers between 2-100 : " + (sum / totalCount));
	}

	public static void main(String[] args) {
		PrimeNoCalculation primeNo = new PrimeNoCalculation();
		int totalCount = primeNo.findCountOfPrimeNo();
		float sum = primeNo.findSumOfPrimeNo();
		primeNo.findAverageOfPrimeNo(sum, totalCount);
	}
}
