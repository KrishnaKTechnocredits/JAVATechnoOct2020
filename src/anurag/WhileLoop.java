package anurag;

public class WhileLoop {

	void even(int start, int end) {
		int i = start;
		System.out.print("Even numbers from range " + start + " -> " + end + " are : ");
		while (i <= end) {

			if (i % 2 == 0) {
				System.out.print(" " + i);
			}

			i++;
		}
		System.out.println();
	}

	void divisibleBy5(int start, int end) {
		int i = start;
		System.out.print("Numbers divisible by 5 from range " + start + " -> " + end + " are : ");
		while (i <= end) {
			if (i % 5 == 0) {
				System.out.print(" " + i);
			}
			i++;
		}

		System.out.println();
	}

	void divisibleBy5And3(int start, int end) {
		int i = start;
		System.out.print("Numbers divisible by 5 and 3 from range " + start + " -> " + end + " are : ");
		while (i <= end) {
			if (i % 5 == 0 && i % 3 == 0)
				System.out.print(" " + i);

			i++;

		}

		System.out.println();

	}

	void divisibleBy7or13(int start, int end) {
		int i = start;
		System.out.println("Numbers divisible by 7 or 13 from range " + start + " -> " + end + " are : ");
		while (i <= end) {
			if (i % 7 == 0)
				System.out.println(i + " is divisible by 7 ");

			else if (i % 13 == 0)
				System.out.println(i + " is divisible by 13 ");

			i++;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		WhileLoop whileloop = new WhileLoop();
		whileloop.even(10, 15);
		whileloop.divisibleBy5(10, 30);
		whileloop.divisibleBy5And3(5, 18);
		whileloop.divisibleBy7or13(5, 40);

	}

}
