package anjaliS;

public class LowerCapitalCoversion {
	void Word(String word) {
		String str = "";
		System.out.println("Word is: " + word);
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (Character.isLowerCase(ch))
				str += Character.toUpperCase(ch);

			else if (Character.isUpperCase(ch))
				str += Character.toLowerCase(ch);
			else
				str += ch;
		}
		System.out.println("Word converted to: " + str);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LowerCapitalCoversion lowercapitalcoversion = new LowerCapitalCoversion();
		lowercapitalcoversion.Word("tE1GfrEsT");

	}

}
