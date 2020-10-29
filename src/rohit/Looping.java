package rohit;

class Looping {

	void even(int start, int end) {
		System.out.println("Even numners: ");

		for (int index = start; index <= end; index++) {
			if (index % 2 == 0) {
				System.out.println(index);
			}
		}
	}

	void divisible(int start, int end) {
		System.out.println("Numbers divisible by 5: ");
		for (int index = start; index <= end; index++) {
			if (index % 5 == 0) {
				System.out.println(index);
			}
		}
	}

	void divisibleby(int start, int end) {
		System.out.println("Numbers divisible by 3 and 5: ");
		for (int index = start; index <= end; index++) {
			if (index % 3 == 0 && index % 5 == 0) {
				System.out.println(index);
			}
		}
	}

	void divisibleby1(int start, int end) {
		System.out.println("Numbers divisible by 7 and 13: ");
		for (int index = start; index <= end; index++) {
			if (index % 7 == 0 || index % 13 == 0) {
				System.out.println(index);
			}
		}
	}

	public static void main(String[] args) {
		Looping loop = new Looping();
		loop.even(10, 15);
		loop.divisible(10, 30);
		loop.divisibleby(5, 18);
		loop.divisibleby1(5, 40);
	}

}
