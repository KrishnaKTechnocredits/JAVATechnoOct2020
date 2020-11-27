/*
  1.Swap 2 numbers with using 3rd variable
  2.Swap 2 numbers without using 3rd variable
*/

package yogita;

class Swapping {

	void withThirdVariable(int num1, int num2) {
		System.out.println("Before swapping: num1=" + num1 + " " + "num2=" + num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After swapping with Third variable:num1=" + num1 + " " + "num2=" + num2);

	}

	void withoutThirdVariable(int num1, int num2) {
		System.out.println("Before swapping: num1=" + num1 + " " + "num2=" + num2);

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After swapping with Third variable:num1=" + num1 + " " + "num2=" + num2);
	}

	public static void main(String[] args) {
		Swapping swap = new Swapping();
		swap.withThirdVariable(20, 30);
		swap.withoutThirdVariable(50, 60);
	}
}