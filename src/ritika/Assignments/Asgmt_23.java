package ritika.Assignments;

/* Assignment_23 : 20th Nov'2020

1) Find count of prime numbers between 2-100.
2) find sum of all prime numbers between 2-100.
3) find average of all prime numbers between 2-100.
*/
public class Asgmt_23 {
	int countOfAllPrimeNumbers = 0;
	int sumOfAllPrimeNumbers = 0;
	int avgOfAllPrimeNumbers = 0;

	void primeNumberOperations(int startNumber, int endNumber) {
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
				if (flag) {
					System.out.print(number + " ");
					countOfAllPrimeNumbers++;
					sumOfAllPrimeNumbers += number;
				}
			}
		}
		System.out.println();
		System.out.println("===============================================================");
		System.out.println("Count of all Prime Numbers between " + startNumber + " and " + endNumber + " is: "
				+ countOfAllPrimeNumbers);
		System.out.println("Sum of all Prime Numbers between " + startNumber + " and " + endNumber + " is: "
				+ sumOfAllPrimeNumbers);
		avgOfAllPrimeNumbers = sumOfAllPrimeNumbers / countOfAllPrimeNumbers;
		System.out.println("Average of all Prime Numbers between " + startNumber + " and " + endNumber + " is: "
				+ avgOfAllPrimeNumbers);
	}

	public static void main(String[] args) {
		Asgmt_23 primeNumber = new Asgmt_23();
		primeNumber.primeNumberOperations(2, 100);
	}
}
