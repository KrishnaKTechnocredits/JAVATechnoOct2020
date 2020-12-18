/*Assignment 31 :  2nd Dec 2020
Program 2:
Do Sum of all numbers and Convert Uppercase into lowercase, lowercase into uppercase using ASCII.
Given String = "Te1ch8n9oC6reDi5TS1"
Expected String = "30tECHNOcREdIts"*/

package shrutiS.assignment31;

public class AsciiLogic {
	
	void ConvertStringUsingAscii(String input) {
		String temp = "";
		int sum =0;
		for(int index=0; index< input.length(); index++) {
			char ch = input.charAt(index);	
			if(ch>=48 && ch<=57) {
				sum+=Integer.parseInt(String.valueOf(ch));
			}else if (ch >= 65 && ch <= 90) {
				temp += (char)(ch + 32);
			}else if (ch >= 97 && ch <= 122){
				temp+= (char)(ch-32);
			}
			//below else is required when there is any special Character in provided input string
			else
				temp+=ch;
		}
		System.out.println("Output = "+(sum+temp));	
	}
	
	public static void main(String[] args) {
		AsciiLogic asciiLogic = new AsciiLogic();
		String input = "Te1ch8n9oC6reDi5TS1";
		System.out.println("Input  = " + input);
		asciiLogic.ConvertStringUsingAscii(input);
	}
}

