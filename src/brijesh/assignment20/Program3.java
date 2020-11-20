package brijesh.assignment20;

public class Program3 {

	public void swapStrings(String string1, String string2) {
		System.out.println("Before swapping string1: "+string1+", string2: "+string2);
		String temp =string1;
		string1=string2;
		string2=temp;
		System.out.println("After swapping string1: "+string1+", string2: "+string2);
	}
	
	public static void main(String[] args) {
		new Program3().swapStrings("brijesh", "gajera");
	}
}
