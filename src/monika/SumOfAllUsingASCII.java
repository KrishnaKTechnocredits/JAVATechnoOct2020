package monika;

 /*Assignment 31 :  

 
Program 2:
Do Sum of all numbers and Convert Uppercase into lowercase, lowercase into uppercase using ASCII.
Given String = "Te1ch8n9oC6reDi5TS1"
Expected String = "30tECHNOcREdIts"

*/

public class SumOfAllUsingASCII {

	public void print(String str) {
		String temp = "";
		int sum = 0;
		int i = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				i = Character.getNumericValue(ch);
				sum += i;
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
		System.out.print("Expected String: "+sum + temp);
	}

	public static void main(String args[]) {
		String str="Te1ch8n9oC6reDi5TS1";
		System.out.println("Given String : "+str);
		SumOfAllUsingASCII sumofallusingASCII =	new SumOfAllUsingASCII();
		sumofallusingASCII.print(str);
	}
}
