package anjaliS;

import java.util.Scanner;

public class PrimeNumbersAvgSum {
	void PrimeAvgSum(int start, int end) {
		int sum = 0, avg = 0, count = 0;
		for (int index = start; index <= end; index++) {
			boolean flag = false;
			for (int j = 2; j <= index / 2; j++) {
				if (index % j == 0)
					flag = true;
			}
			if (!flag) {
				System.out.print(index + " ");
				count++;
				sum += count;
				avg = sum / count;
			}
		}
		System.out.println("\nCount of prime numbers: " + count);
		System.out.println("Sum of prime numbers:" + sum);
		System.out.println("Average of prime numbers: " + avg);

	}

	public static void main(String args[]) {
		PrimeNumbersAvgSum primenumbersavgSum = new PrimeNumbersAvgSum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start range");
		int start = sc.nextInt();
		System.out.println("Enter End range");
		int end = sc.nextInt();
		System.out.println("Prime numbers are:");
		primenumbersavgSum.PrimeAvgSum(start, end);

	}
}
