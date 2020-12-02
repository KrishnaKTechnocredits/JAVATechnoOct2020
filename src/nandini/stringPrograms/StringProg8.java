package nandini.stringPrograms;

public class StringProg8 {
	
	void sumOfNoAndConverstion(String input) {
		String temp = "";
		int sum = 0;
		int num = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				num = Character.getNumericValue(ch);
				sum += num;
			} else {
				int ans = ch;
				if (ans >= 65 && ans <= 90) {
					char ch1 = (char) (ch + 32);
					temp += ch1;
				}
				if (ans >= 97 && ans <= 122) {
					char ch2 = (char) (ch - 32);
					temp += ch2;
				}
			}
		}
		System.out.print("Answer is: "+sum + temp);
	}
	public static void main(String args[]) {
		 String str = "Te1ch8n9oC6reDi5TS1";
		 new StringProg8().sumOfNoAndConverstion(str);
	}
}
