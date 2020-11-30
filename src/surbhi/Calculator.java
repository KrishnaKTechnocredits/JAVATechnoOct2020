package surbhi;
class Calculator {

	int ans;

	void add(int a, int b) {
		ans = a + b;
		System.out.println("sum is " + ans);
	}

	void substraction(int a, int b) {
		ans = a - b;
		System.out.println("Sub is " + ans);
	}

	void mulitipication(int a, int b) {

		ans = a * b;
		System.out.println("multi is " + ans);
	}

	void divison(int a, int b) {
		ans = a / b;
		System.out.println("div is " + ans);

	}

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.add(10,2);
		c1.substraction(10,2);
		c1.mulitipication(10,20);
		c1.divison(10,30);

	}
}