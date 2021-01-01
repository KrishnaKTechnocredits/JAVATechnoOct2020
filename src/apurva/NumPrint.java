package apurva;

class NumPrint {
	void eveNum(int start, int end) {
		int index = start;
		while (index <= end) {
			if (index % 2 == 0)
				System.out.println("Even numbers are: " + index);
			index++;
		}
	}

	void divNum1(int start, int end) {
		int index = start;
		while (index <= end) {
			if (index % 5 == 0)
				System.out.println("Divisible by 5 numbers are: " + index);
			index++;
		}
	}

	void divNum2(int start, int end) {
		int index = start;
		while (index <= end) {
			if (index % 5 == 0 && index % 3 == 0)
				System.out.println("Divisible by 5 & 3 numbers are: " + index);
			index++;
		}
	}

	void divNum3(int start, int end) {
		int index = start;
		while (index <= end) {
			if (index % 7 == 0)
				System.out.println(index + " is divisible by 7 ");
			else if (index % 13 == 0)
				System.out.println(index + " is divisible by 13");
			index++;
		}
	}

	public static void main(String[] args) {
		NumPrint numberprint = new NumPrint();
		numberprint.eveNum(10, 15);
		numberprint.divNum1(10, 30);
		numberprint.divNum2(5, 18);
		numberprint.divNum3(5, 40);

	}
}
