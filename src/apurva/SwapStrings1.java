package apurva;

//swap 2 strings without using 3rd variable.
public class SwapStrings1 {
	void swapString(String str1, String str2) {
		System.out.println("String Before Swapping str1: " + str1 + ", str2: " + str2);
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("String After Swapping str1: " + str1 + ", str2: " + str2);
	}

	public static void main(String[] args) {
		SwapStrings1 swapstrings1 = new SwapStrings1();
		swapstrings1.swapString("Credits", "Techno");
	}
}