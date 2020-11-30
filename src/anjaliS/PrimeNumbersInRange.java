package anjaliS;

import java.util.Scanner;

public class PrimeNumbersInRange {
	void displayPrime(int start, int end) {
		for (int index = start; index <= end; index++) {
			boolean flag = false;
			for (int j = 2; j <= index / 2; j++) {
				if (index % j == 0)
					flag = true;
			}
			if (!flag) {
				System.out.print(index + " ");
			}
		}
	}
       public static void main(String args[]) {
		PrimeNumbersInRange primenumbersinrange = new PrimeNumbersInRange();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start range");
		int start = sc.nextInt();
		System.out.println("Enter End range");
		int end = sc.nextInt();
		System.out.println("Prime numbers are:");
		primenumbersinrange.displayPrime(start, end);

	}
}
