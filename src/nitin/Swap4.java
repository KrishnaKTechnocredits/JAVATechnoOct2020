package nitin;
/* Assignment-20 : Program 3 - Swap 2 String without using 3rd variable */
public class Swap4 {
	public void swapStringNotUsingVariable(String word1, String word2) {
		System.out.println("Before Swap FirstName & LastName --> "+word1+" "+word2);
		word1 = word1+word2;
		word2=word1.substring(0,word1.length()-word2.length());
		word1=word1.substring(word2.length());
		System.out.println("After Swap LastName & FirstName --> "+word1+" "+word2);
	}
	public static void main(String[] args) {
		new Swap4().swapStringNotUsingVariable("Nitin", "Jain");
	}
}
