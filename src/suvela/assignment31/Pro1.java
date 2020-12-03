
/*Convert UpperCase into a LowerCase using ASCII 
Given String = "TechnoCreditS"
Expected String = "technocredits"
*/package suvela.assignment31;

public class Pro1 {
	void getUppertoLower(String word) {
		System.out.println("Given string:"+word);
		int temp = 0;
		String ans = "";
		char ch1 = 0;
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (ch > 65 && ch <= 90) {
				temp = ch + 32;
				ch1 = (char) temp;
				ans += ch1;
			} else if (ch > 97 && ch <= 122)
				ans += ch;
		}
		System.out.println("Output:"+ans);
	}

	public static void main(String[] args) {
		String word = "TechnoCreditS";
		Pro1 pro = new Pro1();
		pro.getUppertoLower(word);
	}

}
