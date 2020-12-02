package rohit;
//swap 2 String with using 3rd variable
public class Swapstringwithvar {
	void swapping(String string1, String string2) {
		System.out.println("Before swapping string1: " + string1 + ", string2: " + string2);
		String temp = string1;
		string1 = string2;
		string2 = temp;
		System.out.println("After swapping string1: " + string1 + ", string2: " + string2);
	}

	public static void main(String[] args) {
		Swapstringwithvar swapstringwithvar = new Swapstringwithvar();
		swapstringwithvar.swapping("Rohit", "Rai");
	}
}
