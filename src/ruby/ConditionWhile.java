package ruby;

public class ConditionWhile {
	void displayEvenNumber(int start, int end) {
		System.out.println("Even Number between " + start + " and " + end);
		int index = start;
		while (index < end) {
			if (index % 2 == 0)
				System.out.println(index);
			index++;
		}
	}

	void displayDivisible5(int start, int end) {
		System.out.println("Number divisible by 5 between " + start + " and " + end);
		int index = start;
		while (index < end) {
			if (index % 5 == 0)
				System.out.println(index);
			index++;
		}
	}

	void displayDivisible3And5(int start, int end) {
		System.out.println("Number divisible by 3 and 5 between " + start + " and " + end);
		int index = start;
		while (index < end) {
			if (index % 5 == 0 && index % 3 == 0)
				System.out.println("Divisible by 5 & 3, number: " + index);
			index++;
		}
	}

	void displayDivisible7or13(int start, int end) {
		System.out.println("Number divisible by 7 or 13 between " + start + " and " + end);
		int index = start;
		while (index < end) {
			if (index % 7 == 0)
				System.out.println(index + " is divisible by 7");
			else if (index % 13 == 0)
				System.out.println(index + " is divisible by 13");
			index++;
		}
	}

	public static void main(String[] a) {
		ConditionWhile conditionWhile = new ConditionWhile();
		conditionWhile.displayEvenNumber(10, 15);
		conditionWhile.displayDivisible5(10, 30);
		conditionWhile.displayDivisible3And5(5, 18);
		conditionWhile.displayDivisible7or13(5, 40);
	}
}
