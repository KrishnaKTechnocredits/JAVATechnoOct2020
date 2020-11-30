
/* Assignment - 26: 23rd Nov'2020  
convert all capital letters to small and small to capital.

String msg = "tE1GfrEsT";
output : Te1gFReSt

Hint : isUpperCase(), isLowerCase(), toUpperCase(), toLowerCase()*/
package suvela;

public class Assign26 {
	void convert(String msg) {
		String word = "";
		System.out.println("Input:"+msg);
		for (int index = 0; index < msg.length(); index++) {
			char ch = msg.charAt(index);
			if (Character.isLowerCase(ch))
				word += Character.toUpperCase(ch);
			else if (Character.isUpperCase(ch))
				word += Character.toLowerCase(ch);
			else
				word += ch;
		}
		System.out.println("Output:" +word);

	}

	public static void main(String[] args) {
		String msg = "tE1GfrEsT";
		Assign26 assign = new Assign26();
		assign.convert(msg);

	}

}
