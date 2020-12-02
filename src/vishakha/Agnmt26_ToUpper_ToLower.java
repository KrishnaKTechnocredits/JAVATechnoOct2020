/* Assignment - 26: 23rd Nov'2020  
convert all capital letters to small and small to capitial.

String msg = "tE1GfrEsT";
output : Te1gFReSt

Hint : isUpperCase(), isLowerCase(), toUpperCase(), toLowerCase()*/

package vishakha;

public class Agnmt26_ToUpper_ToLower {

	void convertLetters(String str){
		for(int i=0; i<str.length();i++){
			char ch = str.charAt(i);
			if(Character.isLetter(ch)){
				if(Character.isUpperCase(ch))
					ch = Character.toLowerCase(ch);
				else
					ch = Character.toUpperCase(ch);
			}
			System.out.print(ch);
		}
	}

	public static void main(String[] args) {
		String str = "tE1GfrEsT";
		System.out.println(str);
		new Agnmt26_ToUpper_ToLower().convertLetters(str);
	}
}
