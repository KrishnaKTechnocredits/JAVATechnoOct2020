package apurva;

public class PrimeNumbers {
	void prime(int start, int end) {
		int count = 0, sum = 0, avg = 0;
		String primeNumbers = " ";
		for (int index = start; index <= end; index++) {
			boolean flag = true;
			for (int j = start; j <= Math.sqrt(index); j++) {
				if (index % j == 0)
					flag = false;
			}
			if (flag) {
				primeNumbers = primeNumbers + index + " ";
			} 
			if (flag && start != 0 && start != 1) {
				count++;
				sum = sum + index;
				avg  = sum / count;
			}
		}
		System.out.println("Prime Numbers From 2 to 100: " + primeNumbers);
		System.out.println("Total count is: "+ count);
		System.out.println("Sum of Prime Number: " + sum);
		System.out.println("Avrage of Prime Number: " + avg);
	}

	public static void main(String[] args) {
		PrimeNumbers primenumbers = new PrimeNumbers();
		primenumbers.prime(2, 100);
	}
}
