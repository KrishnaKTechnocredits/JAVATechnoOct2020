
package monika;
/*Program 2: WAP to find two String are identical or not

input 1: 
String s1 = "technoCredits";
String s2 = "teChnoCreditS";

output 1: both string are not identical

input 2:
String s1 = "pune";
String s2 = "pune";

output 2: both string are identical

*/

public class IdenticalElement {

	void displayIdenticalString1(String s1 , String s2 ) {
		System.out.println("Comparing "+s1+ " with " +s2);
		if (s1.compareTo(s2) == 0)
			System.out.println("Both strings are idential");
		else
			System.out.println("Both strings are not identical");
	}

	public static void main(String[] args) {
		
		//String s1 = "technoCredits";
		//String s2= "teChnoCreditS";
		String s1 = "Pune";
		String s2= "Pune";
		

		IdenticalElement identicalelement  = new IdenticalElement();
		identicalelement.displayIdenticalString1(s1, s2);
		

	}
}