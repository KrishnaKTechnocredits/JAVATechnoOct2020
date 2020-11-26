package surbhi;
public class Assignment26 {

	void swapCase(String str1) {
		
		String updatedString = "";
		for (int i = 0; i < str1.length(); i++) {
			if (Character.isLowerCase(str1.charAt(i))) {
				updatedString += Character.toUpperCase(str1.charAt(i));
			} else if (Character.isUpperCase(str1.charAt(i))) {

				updatedString += Character.toLowerCase(str1.charAt(i));
			} else
				updatedString += str1.charAt(i);
		}
		System.out.println("String after case conversion : " + updatedString);
	}

	public static void main(String[] args) {
		new Assignment26().swapCase("tE1GfrEsT");
	}
}