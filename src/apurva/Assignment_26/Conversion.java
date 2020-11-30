package apurva.Assignment_26;

/*convert all capital letters to small and small to capitial.

String msg = "tE1GfrEsT";
output : Te1gFReSt

Hint : isUpperCase(), isLowerCase(), toUpperCase(), toLowerCase()*/
public class Conversion {
	void capitalSmall(String input) {
		String temp = " ";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLowerCase(ch))
				temp = temp + Character.toUpperCase(ch);
			else
				temp = temp + Character.toLowerCase(ch);
		}
		System.out.println("String Input: " + input);
		System.out.println("String Input: " + temp);
	}

	public static void main(String[] args) {
		new Conversion().capitalSmall("tE1GfrEsT");
	}
}