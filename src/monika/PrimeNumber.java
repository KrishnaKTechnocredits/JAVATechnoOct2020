package monika;
/*Assignment-22 : 18th Nov'2020 
Print all prime numbers between 2 to 100.

*/

public class PrimeNumber {

	void checkPrimeNumber(int startNumber, int endNumber) {
		System.out.println("Print all prime numbers between " + startNumber + " and " + endNumber + " is:");
		for (int i = startNumber; i <= endNumber; i++) {
			int number = i;
			if (number != 1 && number > 0) {
				boolean flag = true;
				for (int index = 2; index <= Math.sqrt(number); index++) {
					if (number % index == 0) {
						flag = false;
						break;
					}
				}
				if (flag)
					System.out.print(number + " ");
			}
		}
	}

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.checkPrimeNumber(2, 100);
	}
}