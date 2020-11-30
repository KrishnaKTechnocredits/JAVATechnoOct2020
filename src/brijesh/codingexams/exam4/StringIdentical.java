package brijesh.codingexams.exam4;

/*
Program 2: WAP to find two String are identical or not

input 1: 
String s1 = "technoCredits";
String s2 = "teChnoCreditS";

output 1: both string are not identical

input 2:
String s1 = "pune";
String s2 = "pune";

output 2: both string are identical
*/

public class StringIdentical {
	
	void stringIdentical(String string1, String string2) {
		System.out.println("Input String1: "+string1);
		System.out.println("Input String2: "+string2);
		boolean flag=true;
		if(string1.length() == string2.length()) {
			for(int index=0; index<string1.length();index++) {
				if(string1.charAt(index)!=string2.charAt(index)) {
					System.out.println("both string are not identical");
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.println("both string are identical");
		} else
			System.out.println("both string are not identical");
		System.out.println("****************************************************************");
	}

	public static void main(String[] args) {
		StringIdentical identical= new StringIdentical();
		identical.stringIdentical("technoCredits", "teChnoCreditS");
		identical.stringIdentical("pune", "pune");
	}
}
