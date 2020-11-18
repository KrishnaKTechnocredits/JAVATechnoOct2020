package suvela;

public class ReverseString {
	void stringreverse(String input) {
		String reverse="";
		for(int index=input.length()-1;index>=0;index--) {
			reverse = reverse + input.charAt(index);
		}
		System.out.println(reverse);
	}
	public static void main(String[] args) {
		String input= "This is technocredits";
		ReverseString reverse=new ReverseString();
		reverse.stringreverse(input);
	}

}
