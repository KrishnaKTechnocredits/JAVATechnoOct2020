/*program 2 : sum of all numbers in a give string 
input: te123ch9kj8 
output : 123 + 9 + 8 = 140 */

package deepak.assignment24;

public class Program_2 {
	
	void sumOfAllNumbers(String input) {
		String s = "";
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (Character.isDigit(ch)) {
				s = s + ch;

			} else if (s.isEmpty()) {
				continue;

			} else {
				sum = sum + Integer.parseInt(s);
				s = "";
			}

		}
		int sum1 = Integer.parseInt(s);
		int result = sum + sum1;
		System.out.println("total " + result);

	}
	public static void main(String[] args) {
		
		Program_2 program2 = new Program_2();
		
		String str="te123ch9kj8";
		
		program2.sumOfAllNumbers(str);
	}

}
