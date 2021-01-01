package prasad.Stringandarray;
/* Assignment - 26: 23rd Nov'2020  
convert all capital letters to small and small to capitial.

String msg = "tE1GfrEsT";
output : Te1gFReSt

Hint : isUpperCase(), isLowerCase(), toUpperCase(), toLowerCase()*/
public class Convertcharcasing {
	String temp;
	char tempch;
	String chrCasing(String word) {
		for(int index=0;index<word.length();index++) {
			char ch= word.charAt(index);
			if(Character.isLetter(ch)) {
				if(Character.isLowerCase(ch)) {
					tempch=Character.toUpperCase(ch);
					temp=temp+tempch;
					tempch='\u0000';
				}
				else if(Character.isUpperCase(ch)) {
					tempch=Character.toLowerCase(ch);
					temp=temp+tempch;
					tempch='\u0000';
				}
			}
			else {
				temp=temp+ch;
			}
		}
		
		return temp;
	}
	
	public static void main(String[]arg) {
		Convertcharcasing convertcharcasing = new Convertcharcasing();
		String word = "tE1GfrEsT";
		String casingConverted= convertcharcasing.chrCasing(word);
		System.out.println("Original string:- " + word);
		System.out.println("String after character case conversion:- "+casingConverted.substring(4));	
	}

}
