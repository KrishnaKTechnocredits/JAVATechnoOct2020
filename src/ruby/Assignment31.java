package ruby;

/*Assignment 31 :  2nd Dec 2020 */

public class Assignment31 {
/*Program 1: Convert UpperCase into a LowerCase using ASCII 
		Given String = "TechnoCreditS"
		Expected String = "technocredits"*/
	
	void convertCase(String word) {
		String changeCase = "";
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			int num = ch;
			if (num >= 65 && num <= 90) {
				num = num + 32;
				ch = (char) num;
			}
			changeCase = changeCase + ch;
		}
		System.out.println(changeCase);
	}
/*Program 2:Do Sum of all numbers and Convert Uppercase into lowercase, lowercase into uppercase using ASCII.
		Given String = "Te1ch8n9oC6reDi5TS1"
		Expected String = "30tECHNOcREdIts"*/
	
	void sumOfNumAndConvertCase(String word) {
		String str1 = "";
		String str2 = "";
		int sum = 0;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			int num = ch;
			if (num >= 48 && num <= 57) {
				char temp = (char) num;
				int n = Integer.parseInt(String.valueOf(temp));
				sum += n;
			} else if (num >= 65 && num <= 90) {
				num = num + 32;
				ch = (char) num;
				str2 += ch;
			} else if (num >= 97 && num <= 122) {
				num = num - 32;
				ch = (char) num;
				str2 += ch;
			}
		}
		str1 = Integer.toString(sum);
		System.out.println(str1 + str2);
	}
	
	public static void main(String[] args) {
		Assignment31 assign = new Assignment31();
		assign.convertCase("TechnoCreditS");
		assign.sumOfNumAndConvertCase("Te1ch8n9oC6reDi5TS1");
	}
}
