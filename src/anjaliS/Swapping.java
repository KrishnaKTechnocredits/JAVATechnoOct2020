package anjaliS;

public class Swapping {
	void swapWithThirdVariable(String str1, String str2) {

		System.out.println("String1 before swapping is " + str1 + " and String2 before swapping is " + str2);
		String temp = str1;
		str1 = str2;
		str2 = temp;

		System.out.println("String1 after swapping is " + str1 + " and String2 after swapping is " + str2);
	}

	void swapWithoutThirdVariable(String str1, String str2) {

		System.out.println("String1 before swapping is " + str1 + " and String2 before swapping is " + str2);
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("String1 after swapping is " + str1 + " and String2 after swapping is " + str2);
	}

	void swapIntegerWithThirdVariable(int value1, int value2) {
		System.out.println("Value1 before swapping is " + value1 + " and Value2 before swapping is " + value2);
		int temp = value1;
		value1 = value2;
		value2 = temp;
		System.out.println("Value1 after swapping is " + value1 + " and Value2 after swapping is " + value2);
	}

	void swapIntegerWithoutThirdVariable(int value1, int value2) {
		System.out.println("Value1 before swapping is " + value1 + " and Value2 before swapping is " + value2);
		value1 = value1 + value2;
		value2 = value1 - value2;
		value1 = value1 - value2;
		System.out.println("Value1 after swapping is " + value1 + " and Value2 after swapping is " + value2);
	}

	public static void main(String args[]) {
		Swapping swapping = new Swapping();
		swapping.swapWithThirdVariable("Anjali", "Shweta");
		swapping.swapWithoutThirdVariable("Dewesh", "Nirmala");
		swapping.swapIntegerWithThirdVariable(4, 5);
		swapping.swapIntegerWithoutThirdVariable(5, 3);
	}

}
