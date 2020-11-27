package nitin;
/* Assignment 18 - Program : 2 
String input = "hmPZ23i9Ws"
output = "239PZWhmis" */

public class ArrangeChar {
	public void arrangeCharacters(String arr) {
		String digit="",capital="",small="",special="";
		for(int index=0;index<arr.length();index++) {
			char ch=arr.charAt(index);
			if(Character.isUpperCase(ch)) 
				capital+=ch;
			else if(Character.isLowerCase(ch))
				small+=ch;
			else if(Character.isDigit(ch))
				digit+=ch;
			else
				special+=ch;
		}
		System.out.println("Output String : "+digit+capital+small+special);
	}
	public static void main(String[] args) {
		String word= ("hmPZ23i9Ws");
		System.out.println("Input String : "+word);
		new ArrangeChar().arrangeCharacters(word);
	}
}
