/*Program 1: 
Convert UpperCase into a LowerCase using ASCII 
Given String = "TechnoCreditS"
Expected String ="technocredits" */

package poojap;

public class Assignment31 {
	void convertUppercaseToLowercase(String string) {
		String temp = " ";
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			int ans = ch;
			if (ans >= 65 && ans <= 90) {
				char ch1 = (char) (ch + 32);
				temp = temp + ch1;
			}
			if (ans >= 97 && ans <= 122) {
				temp = temp + ch;
			}
		}
		System.out.println("String is :" + temp);
	}

	public static void main(String[] args) {
		Assignment31 assignment31 = new Assignment31();
		String string = "TechnoCreditS";
		System.out.println("Given String Is : " + string);
		assignment31.convertUppercaseToLowercase(string);
	}
}
