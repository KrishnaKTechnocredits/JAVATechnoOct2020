package tejashree;

public class Assignment31_Program1 {

	public void convertCaseUsingAscii(String str) {
		String temp = "";
		char ch = str.charAt(0);
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			int ans = ch;
			if (ans >= 65 && ans <= 90) {
				char ch1 = (char) (ch + 32);
				temp += ch1;
			}if(ans>=97 && ans<=122) {
				temp+=ch;
			}
		}
		System.out.print("Converted string is: "+temp);
	}

	public static void main(String[] a) {
		String str="TechnoCreditS";
		System.out.println("Given string is: "+str);
		new Assignment31_Program1().convertCaseUsingAscii(str);
	}

}
