package nitin;
/* Assignment - 26: 23rd Nov'2020 - Convert all capital letters to small and small to capitial.
String msg = "tE1GfrEsT";
output : Te1gFReSt
Hint : isUpperCase(), isLowerCase(), toUpperCase(), toLowerCase()*/
public class StringConversion {
	void caseConversionOfString(String word) {
		System.out.println("Given String is ::"+word);
		System.out.print("String Coversion from Lower to Upper case and viceversa :: ");
		for(int index=0;index<word.length();index++) {
			char ch= word.charAt(index);
			if(Character.isUpperCase(ch))
				ch=Character.toLowerCase(ch);
			else if(Character.isLowerCase(ch)) {
				ch=Character.toUpperCase(ch);
			}
			System.out.print(ch);
		}
	}
	public static void main(String[] args) {
		new StringConversion().caseConversionOfString("tE1GfrEsT");
	}
}
