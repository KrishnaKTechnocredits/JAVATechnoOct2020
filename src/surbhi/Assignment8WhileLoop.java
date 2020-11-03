package surbhi;
public class Assignment8WhileLoop {

	void printEven(int start, int end) {
		int index = start;
		System.out.println("Even no.s in a given range are as below:");
		while (index <= end) {
			if (index % 2 == 0) {
				System.out.println(index);
			}
			index++;
		}
		System.out.println("***");
	}

	void printDivisibleByFive(int start, int end) {
		int index = start;

		System.out.println("No.s divisible by 5 in a given range are as below:");
		while (index <= end) {
			if (index % 5 == 0) {
				System.out.println(index);
			}
			index++;
		}
		System.out.println("----");
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
		System.out.println("####");
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

		Assignment8WhileLoop assignmentWhile = new Assignment8WhileLoop();
		assignmentWhile.printEven(10, 15);
		assignmentWhile.printDivisibleByFive(10, 30);
		assignmentWhile.printDivisibleByFiveThree(5, 18);
		assignmentWhile.printDivisibleBySevenThirteen(5, 40);

	}

}
