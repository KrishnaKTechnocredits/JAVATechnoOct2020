
package monika;
import java.util.Scanner;

/*
 * Assignment - 26: 23rd Nov'2020  
convert all capital letters to small and small to capitial.
String msg = "tE1GfrEsT";
output : Te1gFReSt
Hint : isUpperCase(), isLowerCase(), toUpperCase(), toLowerCase()
 */
public class LetterCaseChange {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.next();
		boolean flag = true;
		for(int index=0;index<s.length();index++) {
			if(!Character.isLetter(s.charAt(index))) {
				System.out.println("Entered String is invalid");
				flag = false;
				break;
			}
		}
		if(flag==true)
			changeLetterCase(s);
		sc.close();
	}

	static void changeLetterCase(String s) {
		String tempStr="";
		for(int index=0;index<s.length();index++) {
			char ch = s.charAt(index);
			if(Character.isUpperCase(ch))
				tempStr += Character.toLowerCase(ch);
			if(Character.isLowerCase(ch))
				tempStr += Character.toUpperCase(ch);
		}
		System.out.println("Output --> "+tempStr);
	}
}
