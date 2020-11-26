package sadhana;
/*
Assignment - 26: 23rd Nov'2020  
convert all capital letters to small and small to capitial.

String msg = "tE1GfrEsT";
output : Te1gFReSt

Hint : isUpperCase(), isLowerCase(), toUpperCase(), toLowerCase()

Note : Should be completed by 24th Nov EOD 
------------------------------------------*/

public class UpperLowerCase {
	
	void printData(String strng) {
		String msg = "";
		System.out.println("Input:" + strng);
		for (int index = 0; index < strng.length(); index++) {
			char ch = strng.charAt(index);
			if (Character.isLowerCase(ch))
				msg += Character.toUpperCase(ch);
			else if (Character.isUpperCase(ch))
				msg += Character.toLowerCase(ch);
			else
				msg += ch;
		}
		System.out.println("Output:" + msg);
	}
	
	public static void main(String[] args) {
		UpperLowerCase upperLowerCase = new UpperLowerCase();
		upperLowerCase.printData("tE1GfrEsT");
	}
}
