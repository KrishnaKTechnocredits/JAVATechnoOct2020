package apurva;

class NumberPrint {
	void evenNum(int start, int end) {
		for (int index = start; index <= end; index++) {
			if (index % 2 == 0) {
				System.out.println("Even numbers are: " + index);
			}
		}
	}

	void divNum1(int start, int end) {
		for (int index = start; index <= end; index++) {
			if (index % 5 == 0) {
				System.out.println("Divisible by 5 numbers are: " + index);
			}
		}
	}

	void divNum2(int start, int end) {
		for (int index = start; index <= end; index++) {
			if (index % 5 == 0 && index % 3 == 0) {
				System.out.println("Divisible by 5 & 3 numbers are: " + index);
			}
		}
	}

	void divNum3(int start, int end) {
		for (int index = start; index <= end; index++) {
			if (index % 7 == 0) 
				System.out.println(index + " is divisible by 7 ");
			else if	(index % 13 == 0)
				System.out.println(index + " is divisible by 13");
			}
	}

	public static void main(String[] args) {
		NumberPrint numberprint = new NumberPrint();
		numberprint.evenNum(10, 15);
		numberprint.divNum1(10, 30);
		numberprint.divNum2(5, 18);
		numberprint.divNum3(5, 40);
	}
}