package mrunal;
/*------Assignment19 ----prog1-----
 * to print Reverse a given String.
	input : This is technocredits
	output : stiderconhcet si sihT  */

public class program1 
{
	static void reverseWord(String word)
	{
		for(int index =word.length()-1; index >=0 ;index--)
	    System.out.print(word.charAt(index));
	}

	public static void main(String[] args) 
{
	String s = ("This is technocredits");
	System.out.println("--input string is -- " + s);
	System.out.println("--Reverse of String is --");
	program1.reverseWord(s);
}
	
}