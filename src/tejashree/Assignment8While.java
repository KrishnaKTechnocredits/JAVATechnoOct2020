package tejashree;

public class Assignment8While {

	void printEven(int start, int end) {
		int index = start;
		System.out.println("Even no.s in a given range are as below:");
		while (index <= end) {
			if (index % 2 == 0) {
				System.out.println(index);
			}
			index++;
		}System.out.println();
	}

	void printDivisibleByFive(int start, int end) {
		int index = start;
		System.out.println("No.s divisible by 5 in a given range are as below:");
		while (index <= end) {
			if (index % 5 == 0) {
				System.out.println(index);
			}
			index++;
		}System.out.println();
	}

	void printDivisibleByFiveThree(int start, int end) {
		int index = start;
		System.out.println("No.s divisible by 5 and 3 in a given range are as below:");
		while (index <= end) {
			if (index % 5 == 0 && index % 3 == 0) {
				System.out.println(index);
			}
			index++;
		}
		System.out.println();
	}

	void printDivisibleBySevenThirteen(int start, int end) {
		int index = start;
		System.out.println("No.s divisible by 7 and 13 in a given range are as below:");

		while (index <= end) {
			if (index % 7 == 0) {
				System.out.println(index + " is divisible by 7");
			} else if (index % 13 == 0) {
				System.out.println(index + " is divisible by 13");
			}
			index++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment8While assignmentWhile8 = new Assignment8While();
		assignmentWhile8.printEven(10, 15);
		assignmentWhile8.printDivisibleByFive(10, 30);
		assignmentWhile8.printDivisibleByFiveThree(5, 18);
		assignmentWhile8.printDivisibleBySevenThirteen(5, 40);

	}

}
