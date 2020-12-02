/*Assignment-22 : 18th Nov'2020 
Print all prime numbers between 2 to 100.*/
package shrutiS.assignment22;

public class PrimeNumbers {

	void findPrimeNumbers() {
		for (int index = 2; index <= 100; index++) {
			int count = 0;
			for (int innerIndex = 1; innerIndex <= index / 2; innerIndex++) {
				if (index % innerIndex == 0)
					count++;
			}
			if (count == 1)
				System.out.print(index + " ");
		}
	}

	public static void main(String[] args) {
		PrimeNumbers primeNumber = new PrimeNumbers();
		System.out.println("Prime numbers between 2 to 100");
		primeNumber.findPrimeNumbers();
	}

}
