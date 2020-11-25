package prem;

public class ArrangeString {
	
	public void arrangeString(String string) {
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
		new ArrangeString().arrangeString("hmPZ23i9WsH$^*JGBjhhjs87uyuis78&");

	}

}

	

