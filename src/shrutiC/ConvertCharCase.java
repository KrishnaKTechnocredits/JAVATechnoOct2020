package shrutiC;

/*
 * Assignment - 26: 23rd Nov'2020  
	convert all capital letters to small and small to capitial.

	String msg = "tE1GfrEsT";
	output : Te1gFReSt

	Hint : isUpperCase(), isLowerCase(), toUpperCase(), toLowerCase()
*/

public class ConvertCharCase {

	void convertCase(String string) {

		String convertedString = "";

		for (int index = 0; index < string.length(); index++) {
			char ch = string.charAt(index);
			if (Character.isUpperCase(ch))
				convertedString += Character.toLowerCase(ch);
			else if (Character.isLowerCase(ch))
				convertedString += Character.toUpperCase(ch);
			else
				convertedString += ch;
		}
		System.out.println("Output - " + convertedString);
	}

	public static void main(String[] args) {

		ConvertCharCase object = new ConvertCharCase();
		String input = "tE1GfrEsT";
		System.out.println("Convert all capital letters to small and small to capitial from given String:-");
		System.out.println("Input - " + input);

		object.convertCase(input);
	}

}
