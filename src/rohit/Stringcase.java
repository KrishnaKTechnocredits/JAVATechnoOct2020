package rohit;

/*convert all capital letters to small and small to capitial.

String msg = "tE1GfrEsT";
output : Te1gFReSt

Hint : isUpperCase(), isLowerCase(), toUpperCase(), toLowerCase()

Note : Should be completed by 24th Nov EOD*/
public class Stringcase {

	void convertcase(String str) {
		System.out.println("Input : " + str);
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i)))
				temp = temp + Character.toLowerCase(str.charAt(i));
			else if (Character.isLowerCase(str.charAt(i)))
				temp = temp + Character.toUpperCase(str.charAt(i));
			else
				temp = temp + str.charAt(i);
		}
		System.out.println("Output : " + temp);
	}

	public static void main(String[] args) {
		new Stringcase().convertcase("tE1GfrEsT");
	}
}