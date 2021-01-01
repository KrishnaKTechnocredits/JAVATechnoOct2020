package anjaliS;

public class ReverseNumber {
	void displayReverseNum(int num) {
		int reverse = 0, remainder = 0;
		while (num != 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		System.out.println("Reverse number is : " + reverse);
	}

	public static void main(String[] args) {
		ReverseNumber reversenumber = new ReverseNumber();
		reversenumber.displayReverseNum(1234);

	}

}
