package suvela;

public class Asgmt18_2 {
	String word="";
	String order(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				word = word + input.charAt(i);
			}
		}
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch))
				word = word + input.charAt(i);
		}
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isLowerCase(ch))
				word = word + input.charAt(i);
		}
		return word;
	}
	
	public static void main(String[] args) {
		String input = "hmPZ23i9Ws";
		Asgmt18_2 assign = new Asgmt18_2();
		String word= assign.order(input);
		System.out.println(word);
	}

}
