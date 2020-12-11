package anjaliP;

public class SwapString_Asgn20_Prog1 {
	void swapStrings(String string1, String string2) {
		System.out.println("Before swapping string1: "+string1+", string2: "+string2);
		String temp =string1;
		string1=string2;
		string2=temp;
		System.out.println("After swapping string1: "+string1+", string2: "+string2);
	}
	
	public static void main(String[] args) {
		new SwapString_Asgn20_Prog1().swapStrings("Morning", "Good");
	}
}
