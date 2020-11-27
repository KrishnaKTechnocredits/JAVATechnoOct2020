package vaibhav;

/*Program 2: WAP to find two String are idential or not

input 1: 
String s1 = "technoCredits";
String s2 = "teChnoCreditS";

output 1: both string are not idential

input 2:
String s1 = "pune";
String s2 = "pune";

output 2: both string are idential
*/

public class StringContentMatch {
	
	public static void stringMatch(String s1, String s2) {
		boolean flag =false;
		if (s1.length()!=s2.length())
			System.out.println("String length is not same so they are not identical");
		else {
			for (int i = 0 ; i < s1.length() ;i++ ) {
				if(s1.charAt(i) != s2.charAt(i)) {
					flag =true;
					break;
				}
			}
			if (!flag)
				System.out.println("Strings are identical");
			else if (flag)
				System.out.println("Strings are not identical");
		}	
	}

	public static void main(String[] args) {
		
		String s1 = "pune";
		String s2 = "pune";
		StringContentMatch.stringMatch(s1,s2);		
		
		}

}
