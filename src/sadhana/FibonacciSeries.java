package sadhana;

class FibonacciSeries {

	void printData(int n) {
		int num1 = 0, num2 = 1;

		System.out.print(num1 + "," + num2 + ",");
		for (int i = 2; i <= n; i++) {
			int num3 = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
		}
	}

	public static void main(String[] args) {
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		// Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number ");
		// int sc = scanner.nextInt();
		fibonacciSeries.printData(9);
	}
}
