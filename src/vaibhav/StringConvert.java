package vaibhav;

/*convert all capital letters to small and small to capitial.

String msg = "tE1GfrEsT";
output : Te1gFReSt*/


public class StringConvert {
	public static void caseConversion(String str) {
		String temp="";
		for (int i = 0 ; i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isLowerCase(ch)) {
				temp += Character.toUpperCase(ch);
			}
			else if(Character.isUpperCase(ch)) {
				temp += Character.toLowerCase(ch);
			}
			else if(Character.isDigit(ch)) {
				temp += ch;
			}
		}
		System.out.println("final String after conversion "+temp);
	}
	public static void main(String[] args) {
		String given = "tE1GfrEsT";//after conversion Te1gFReSt
		StringConvert.caseConversion(given);
	}
}
