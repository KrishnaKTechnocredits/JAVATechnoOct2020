package brijesh.assignment18;

/*
	Program : 2 
	String input = "hmPZ23i9Ws"
	output = "239PZWhmis";
*/

public class ArrangeCharacters {
	
	public void arrangeCharacters(String string) {
		System.out.println("Given String: "+string);
		String digit="",capital="", small="", special="";
		for(int index=0; index < string.length(); index++) {
			char character = string.charAt(index);
			if(Character.isUpperCase(character))
				capital+=character;
			else if(Character.isLowerCase(character))
				small+=character;
			else if(Character.isDigit(character))
				digit+=character;
			else
				special+=character;	
		}
		System.out.println("Updated String: "+digit+capital+small+special);
	}

	public static void main(String[] args) {
		new ArrangeCharacters().arrangeCharacters("hmPZ23i9WsH$^*JGBjhhjs87uyuis78&");

	}

}
