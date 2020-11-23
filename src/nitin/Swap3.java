package nitin;
/* Assignment-20 : Program 3 - Swap 2 String with using 3rd variable */
public class Swap3 {
	public void swapStringUsingVariable(String word1, String word2) {
		System.out.println("Before Swap FirstName & LastName --> "+word1+" "+word2);
		String temp = word1;
		word1=word2;
		word2=temp;
		System.out.println("After Swap LastName & FirstName --> "+word1+" "+word2);
	}
	public static void main(String[] args) {
		new Swap3().swapStringUsingVariable("Nitin", "Jain");
	}
}
