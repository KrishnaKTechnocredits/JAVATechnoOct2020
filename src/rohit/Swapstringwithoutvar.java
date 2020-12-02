package rohit;
//swap 2 String with using 3rd variable
public class Swapstringwithoutvar {
	void swapping(String s1, String s2) {
		System.out.println("Before swapping : string1= " + s1 + ", string2= " + s2);
		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("After swapping : string1= " + s1 + ", string2= " + s2);
	}

	public static void main(String[] args) {
		Swapstringwithoutvar swapstringwithoutvar = new Swapstringwithoutvar();
		swapstringwithoutvar.swapping("Rohit", "Rai");
	}
}
