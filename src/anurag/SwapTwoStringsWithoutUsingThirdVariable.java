package anurag;

//Assignment 20

//swap 2 strings without using 3rd variable

public class SwapTwoStringsWithoutUsingThirdVariable {
	void display(String s1, String s2) {
		s1 = s1 + s2;
		s2 = s1.substring(0, 6);
		s1 = s1 + s2;
		s1 = s1.substring(6, 12);
		System.out.println("Swapped values of s1 and s2 are " + s1 + " and " + s2);
	}

	public static void main(String[] args) {
		System.out.println("Initial values of s1 and s2 are Anurag and Kishan respectively");
		SwapTwoStringsWithoutUsingThirdVariable swaptwostringswithoutusingthirdvariable = new SwapTwoStringsWithoutUsingThirdVariable();
		swaptwostringswithoutusingthirdvariable.display("Anuarg", "Kishan");

	}

}
