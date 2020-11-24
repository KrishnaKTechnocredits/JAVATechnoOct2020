package ritika.Assignments;

public class Asgmt_22 {

	void checkPrimeNumber(int startNumber, int endNumber) {
		System.out.println("List of all prime numbers between " + startNumber + " and " + endNumber + " is:");
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
		Asgmt_22 primeNumber = new Asgmt_22();
		primeNumber.checkPrimeNumber(2, 100);
	}
}
