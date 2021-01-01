package shrutiC;

public class ReverseNumber {

	void reverseNumber(int num) {

		System.out.println("Number : " + num);
		String string = Integer.toString(num);
		String reverseStr = "";
		if (string.length() > 1) {
			for (int i = string.length() - 1; i >= 0; i--) {
				reverseStr += string.charAt(i);
			}
		}
		int reverseNum = Integer.parseInt(reverseStr);
		System.out.println("Reversed num : " + reverseNum);
	}

	public static void main(String[] args) {
		ReverseNumber object = new ReverseNumber();
		object.reverseNumber(1234);
	}

}
