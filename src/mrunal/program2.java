/* Exam 4 : Program 2 : Program 2: WAP to find two String are identical or not

input 1: 
String s1 = "technoCredits";
String s2 = "teChnoCreditS";

output 1: both string are not identical

input 2:
String s1 = "pune";
String s2 = "pune";

output 2: both string are identical
*/

package mrunal;

public class program2 {
	
	void displayIdenticalString1(String s1 , String s2 ) {
		System.out.println("Comparing "+s1+ " with " +s2);
		if (s1.compareTo(s2) == 0)
			System.out.println("***Both strings are idential***");
		else
			System.out.println("***Both strings are not identical***");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "technoCredits";
		String s2= "teChnoCreditS";
		String s3 = "pune";
		String s4 = "pune";
		
		program2 Program2 = new program2();
		Program2.displayIdenticalString1(s1, s2);
		Program2.displayIdenticalString1(s3, s4);

	}
}
