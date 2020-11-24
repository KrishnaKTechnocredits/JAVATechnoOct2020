package anurag;

//Assignment 20

//swap 2 strings with using 3rd variable

public class SwapTwoStringUsingThirdVariable {
	
	void display(String s1, String s2) {
		String s3 = s1;
		s1 = s2;
		s2 = s3;
		System.out.println("Swapped values of s1 and s2 are " + s1 + " and " + s2);
	}

	public static void main(String[] args) {
		System.out.println("Initial values of s1 and s2 are Anurag and Kishan respectively");
		SwapTwoStringUsingThirdVariable swaptwostringusingthirdvariable = new SwapTwoStringUsingThirdVariable();
		swaptwostringusingthirdvariable.display("Anurag", "Kishan");
	}

}
