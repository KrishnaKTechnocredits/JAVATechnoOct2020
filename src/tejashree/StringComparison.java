/*Program 2: WAP to find two String are idential or not

		input 1: 
		String s1 = "technoCredits";
		String s2 = "teChnoCreditS";

		output 1: both string are not idential
		
		input 2:
		String s1 = "pune";
		String s2 = "pune";

		output 2: both string are identical*/
package tejashree;

public class StringComparison {

	public void compareStrings(String s1,String s2) {
		boolean flag=true;
		if(s1.length()==s1.length()) {
		for(int index=0;index<s1.length();index++) {
			if(!(s1.charAt(index)==s2.charAt(index))) {
				flag=false;
			}
		}
	}else
		flag=false;
		if(flag) {
			System.out.println("Strings are identical");
		}else
			System.out.println("Strings are not identical");
	}
	public static void main(String[] args) {
		/*String s1 = "technoCredits";
		String s2 = "teChnoCreditS";
		System.out.println(s1);
		System.out.println(s2);*/
		
		String s1 = "pune";
		String s2 = "pune";
		System.out.println(s1);
		System.out.println(s2);
		
		new StringComparison().compareStrings(s1, s2);
	}
}
