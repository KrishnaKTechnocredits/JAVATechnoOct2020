package tejashree;

public class Assignment31_Program2 {

	public void print(String str) {
		String temp = "";
		int sum = 0;
		int n = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				n = Character.getNumericValue(ch);
				sum += n;
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
		System.out.print("Expected answer is: "+sum + temp);
	}

	public static void main(String a[]) {
		String str="Te1ch8n9oC6reDi5TS1";
		System.out.println("Given String is: "+str);
		new Assignment31_Program2().print(str);
	}
}
