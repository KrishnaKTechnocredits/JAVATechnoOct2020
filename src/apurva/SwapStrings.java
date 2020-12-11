package apurva;

//swap 2 strings with using 3rd variable.
public class SwapStrings {
	void swapString(String str1, String str2) {
		System.out.println("String Before Swapping str1: " + str1 + ", str2: " + str2);
		String temp = str1;
		str1 = str2;
		str2 = temp;
		System.out.println("String After Swapping str1: " + str1 + ", str2: " + str2);
	}

	public static void main(String[] args) {
		SwapStrings swapstrings = new SwapStrings();
		swapstrings.swapString("Techno", "Credits");
	}
}