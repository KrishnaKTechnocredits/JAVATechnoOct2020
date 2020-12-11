package rohan;

/*
Program 2:
Do Sum of all numbers and Convert Uppercase into lowercase, lowercase into uppercase using ASCII.
Given String = "Te1ch8n9oC6reDi5TS1"
Expected String = "30tECHNOcREdIts"
 */

public class SumOfNumbersInString {

	public static void main(String[] args) {
		SumOfNumbersInString sumOfNumbersInString = new SumOfNumbersInString();
		String s = "Te1ch8n9oC6reDi5TS1";
		System.out.println("Original String: "+s);
		sumOfNumbersInString.findSumFromString(s);
	}
	
	void findSumFromString(String s) {
		int sum=0,ascii=0,num=0;
		String tmpStr = "";
		char ch ='0';
		for(int index=0;index<s.length();index++) {
			ascii = s.charAt(index);
			if(ascii>=48 && ascii <= 57)
				sum += (ascii - ch);
			else if(ascii>=65 && ascii<=90) {
					ascii+=32;
					tmpStr += (char)ascii; 
				}
			else if(ascii>=97 && ascii<=122){
					ascii-=32;
					tmpStr += (char)ascii;
			}
			else
				tmpStr += s.charAt(index);
		}
		System.out.println("Converted String: "+sum+tmpStr);
	}
}
