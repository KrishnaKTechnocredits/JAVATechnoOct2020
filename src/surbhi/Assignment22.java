package surbhi;
/*
 * Print all prime numbers between 2 to 100
 */

public class Assignment22 {

	void printPrimeNumbers(int start, int end) {
		System.out.println("Prime numbers bw " + start + " and " + end);
		for (int innerIndex = start; innerIndex <= end; innerIndex++) {
			boolean flag = true;
			for (int Index = 2; Index <= Math.ceil(Math.sqrt(innerIndex)); Index++) {
				if (innerIndex % Index == 0)
					flag = false;
			}
			if (flag)
				System.out.print(innerIndex + " ");
		}
	}

	public static void main(String[] args) {
		Assignment22 assignment22 = new Assignment22();
		assignment22.printPrimeNumbers(2, 100);
	}

}
