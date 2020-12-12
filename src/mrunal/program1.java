
	package mrunal;
/* Assignment 31 :  2nd Dec 2020
	Program 1: 
	Convert UpperCase into a LowerCase using ASCII 
	Given String = "TechnoCreditS"
	Expected String = "technocredits"
	 
	*/

public class program1 {
	
	void convertUpperToLower(String name) {
			String temp = "";
			char ch1;
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
			System.out.println("\n" + "Converting UPPER to LOWER using ASCII is :" +"\n" +  temp);
		}

		public static void main(String[] args) {
			String input = "TECHNOcreditsTECHNO";
			System.out.println("String is:" + input);
			new program1().convertUpperToLower(input);
		}
	}