package mrunal;
/*	 Assignment 31 :  2nd Dec 2020

Program 2:
i) Do Sum of all numbers and 
ii)Convert Uppercase into lowercase,& lowercase into uppercase using ASCII.
Given String = "Te1ch8n9oC6reDi5TS1"
Expected String = "30tECHNOcREdIts"
*/
public class program2 {
	
		int sum = 0;
		String temp = "";
		char ch1;

		int sumFromAllNumbers(String name) {
			for (int i = 0; i < name.length(); i++) {
				char ch = name.charAt(i);
				if (Character.isDigit(ch)) {
					sum += Character.getNumericValue(ch);
				}
			}
			return sum;
		}

		String ConvertingUpperToLowerUsingASCII(String name) {
			for (int i = 0; i < name.length(); i++) {
				char ch = name.charAt(i);
				int num = ch;
				if (num >= 65 && num <= 90) {
					ch1 = (char) (ch + 32);
					temp += ch1;
				}
				if (num >= 97 && num <= 122) {
					ch1 = (char) (ch - 32);
					temp += ch1;
				}
			}
			return temp;
		}

		public static void main(String[] args) {
			program2 program2 = new program2();
			String input = "Te1ch8n9oC6reDi5TS1";
			
			System.out.println("input String is :" + input);
			
			System.out.println(""
					+ "expected string is :" + program2.sumFromAllNumbers(input) + ""
					+ program2.ConvertingUpperToLowerUsingASCII(input));
		}
	}
