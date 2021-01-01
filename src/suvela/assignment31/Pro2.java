/*Do Sum of all numbers and Convert Uppercase into lowercase, lowercase into uppercase using ASCII.
Given String = "Te1ch8n9oC6reDi5TS1"
Expected String = "30tECHNOcREdIts
*/
package suvela.assignment31;

public class Pro2 {
	void ascii(String word) {
		System.out.println("Given word:"+word);
		int sum = 0;
		String ans = "";
		String s="";
		char temp = 0;
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (ch >= 48 && ch <= 57)
				sum +=Integer.parseInt(String.valueOf(ch));
			else if (ch >= 65 && ch <= 90) {
				temp = (char) (ch + 32);
				ans += temp;
			} else if (ch >= 97 && ch <= 122) {
				temp = (char) (ch - 32);
				ans += temp;
			}
		}
		s=String.valueOf(sum)+ans;
		System.out.println("Output:"+s);
	}

	public static void main(String[] args) {
		String word = "Te1ch8n9oC6reDi5TS1";
		Pro2 pro=new Pro2();
		pro.ascii(word);
	}

}