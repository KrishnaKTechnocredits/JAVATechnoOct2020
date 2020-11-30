package shrutiC;

public class OperationOnPrimeNumbers {

	int primeNumSum;
	int totalNumOfPrimeNos;

	void finSumOfPrimeNumbers(int startNum, int endNum) {
		int sum = 0;
		for (int number = startNum; number <= endNum; number++) {
			// Check if prime
			if (isPrimeNumber(number)) {
				sum += number;
			}
		}
		primeNumSum = sum;
		System.out.println("Sum of prime numbers is - " + sum);
	}

	void countPrimeNumbers(int startNum, int endNum) {
		int counter = 0;
		for (int number = startNum; number <= endNum; number++) {
			// Check if prime
			if (isPrimeNumber(number)) {
				counter++;
			}
		}
		totalNumOfPrimeNos = counter;
		System.out.println("Total prime numbers between " + startNum + " to " + endNum + " are - " + counter);
	}

	void findAvgOfPrimeNos() {
		double average = (double) primeNumSum / totalNumOfPrimeNos;
		System.out.println("Average of prime numbers is - " + average);
	}

	void displayPrimeNumbers(int startNum, int endNum) {

		String primenumbers = "";
		System.out.println("Prime numbers between " + startNum + " and " + endNum + " are :-");
		System.out.print("");

		for (int number = startNum; number <= endNum; number++) {
			// Check if prime
			if (isPrimeNumber(number)) {
				primenumbers = primenumbers + number + " ";
			}
		}
		System.out.println(primenumbers);
	}

	boolean isPrimeNumber(int number) {
		for (int j = 2; j < number; j++) {
			if (number % j == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		OperationOnPrimeNumbers object = new OperationOnPrimeNumbers();
		int startNum = 2;
		int endNum = 100;

		object.displayPrimeNumbers(startNum, endNum);
		System.out.println("------------------------------------------------------------");

		object.finSumOfPrimeNumbers(startNum, endNum);
		System.out.println("------------------------------------------------------------");

		object.countPrimeNumbers(startNum, endNum);
		System.out.println("------------------------------------------------------------");

		object.findAvgOfPrimeNos();
	}

}
