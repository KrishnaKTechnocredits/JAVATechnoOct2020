/*
  1.Swap 2 String with using 3rd variable
  2.Swap 2 String without using 3rd variable
*/

package yogita;

class SwapString {

	void withThirdVariable(String str1, String str2) {
		System.out.println("Before swapping:\nFirst String=" + str1 + " " + "\nSecond String=" + str2);

		String temp = str1;
		str1 = str2;
		str2 = temp;
		System.out.println("After swapping with Third variable: \nFirst String=" + str1 + " " + "\nSecond String=" + str2);

	}

	void withoutThirdVariable(String str1, String str2) {
		System.out.println("\nBefore swapping:\nFirst String=" + str1 + " " + "\nSecond String=" + str2);

		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("After swapping without Third variable: \nFirst String=" + str1 + " " + "\nSecond String=" + str2);

	}

	public static void main(String[] args) {
		SwapString swap = new SwapString();
		swap.withThirdVariable("Yogita", "Pooja");
		swap.withoutThirdVariable("Shivani", "Madhuri");
	}
}