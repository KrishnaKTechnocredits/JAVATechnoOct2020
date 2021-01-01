package anjaliP;

public class SwapString_Asgn20_Pog2 {
	void swapStrings(String s1, String s2) {
		System.out.println("Before swapping : string1= "+s1+", string2= "+s2);
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("After swapping : string1= "+s1+", string2= "+s2);
	}
	
	public static void main(String[] args) {
		new SwapString_Asgn20_Pog2().swapStrings("Good","Life");
	}
}
