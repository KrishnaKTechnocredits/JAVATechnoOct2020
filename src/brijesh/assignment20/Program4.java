package brijesh.assignment20;

/*
swap 2 String without using 3rd variable
Hint : use SubString method of String class
 */

public class Program4 {

	public void swapStrings(String string1, String string2) {
		System.out.println("Before swapping string1: "+string1+", string2: "+string2);
		string1=string1+string2;
		string2=string1.substring(0,string1.length()-string2.length());
		string1=string1.substring(string2.length());
		System.out.println("After swapping string1: "+string1+", string2: "+string2);
	}
	
	public static void main(String[] args) {
		new Program4().swapStrings("brijesh", "gajera");
	}
}
