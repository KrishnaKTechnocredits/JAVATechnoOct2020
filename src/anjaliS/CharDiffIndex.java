package anjaliS;

public class CharDiffIndex {
	public void charSorting(String array) {
		String digit = "", capital = "", small = "", special = "";
		for (int index = 0; index < array.length(); index++) {
			char ch = array.charAt(index);
			if (Character.isUpperCase(ch))
				capital+= ch;
			else if (Character.isLowerCase(ch))
				small = small + ch;
			else if (Character.isDigit(ch))
				digit+=  ch;
			else
				special+= ch;
		}
		System.out.println("String changed to " + digit + capital + small + special);
	}

	public static void main(String[] args) {
		CharDiffIndex chardiffindex = new CharDiffIndex();
		String str = ("hmPZ23i9Ws");
		System.out.println("Actual String is " + str);
		chardiffindex.charSorting(str);
	}
}
