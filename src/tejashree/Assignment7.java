package tejashree;

public class Assignment7 {
	void printEvenNumbers(int startIndex, int endIndex) {
		System.out.println("Even no.s in a given range are as below:");
		for (int i = startIndex; i <= endIndex; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	void printNumbersDivByFive(int startIndex, int endIndex) {
		System.out.println("No.s divisible by 5 in a given range are as below:");
		for (int i = startIndex; i <= endIndex; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}
	}

	void printNumbersDivFiveThree(int startIndex, int endIndex) {
		System.out.println("No.s divisible by 3 and 5 in a given range are as below:");
		for (int i = startIndex; i <= endIndex; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}
	}

	void printNumbersSevenThirteen(int startIndex, int endIndex) {
		for (int i = startIndex; i <= endIndex; i++) {
			if (i % 7 == 0) {
				System.out.println(i + " is divisible by 7");
			} else if (i % 13 == 0) {
				System.out.println(i + " is divisible by 13");
			}

		}
	}

	public static void main(String[] args) {
		Assignment7 assignment7 = new Assignment7();
		assignment7.printEvenNumbers(10, 14);
		System.out.println("----------------------------------");
		assignment7.printNumbersDivByFive(10, 30);
		System.out.println("----------------------------------");
		assignment7.printNumbersDivFiveThree(5, 18);
		System.out.println("----------------------------------");
		assignment7.printNumbersSevenThirteen(5, 40);
	}
}