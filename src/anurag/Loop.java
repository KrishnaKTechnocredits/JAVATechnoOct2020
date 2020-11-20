package anurag;

public class Loop {

	void even(int start, int end) {
		System.out.print("Even numbers from range " + start + " -> " + end + " are : ");
		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				System.out.print(" " + i);
			}

		}
		System.out.println();

	}

	void divisibleBy5(int start, int end) {
		System.out.print("Numbers divisible by 5 from range " + start + " -> " + end + " are : ");
		for (int i = start; i <= end; i++) {
			if (i % 5 == 0) {
				System.out.print(" " + i);
			}
		}

		System.out.println();
	}

	void divisibleBy5And3(int start, int end) {
		System.out.print("Numbers divisible by 5 and 3 from range " + start + " -> " + end + " are : ");
		for (int i = start; i <= end; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.print(" " + i);
			}
		}
		System.out.println();
	}

	void divisibleBy7or13(int start, int end) {
		System.out.println("Numbers divisible by 7 or 13 from range " + start + " -> " + end + " are : ");
		for (int i = start; i <= end; i++) {
			if (i % 7 == 0)
				System.out.println(i + " is divisible by 7 ");

			else if (i % 13 == 0)
				System.out.println(i + " is divisible by 13 ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Loop loop = new Loop();
		loop.even(10, 15);
		loop.divisibleBy5(10, 30);
		loop.divisibleBy5And3(5, 18);
		loop.divisibleBy7or13(5, 40);

	}
}
