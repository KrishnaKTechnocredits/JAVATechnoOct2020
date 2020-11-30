package raghvendra.Exam;
/*Program 2: WAP to find two String are identical or not

input 1: 
String s1 = "technoCredits";
String s2 = "teChnoCreditS";

output 1: both string are not identical

input 2:
String s1 = "pune";
String s2 = "pune";

output 2: both string are identical*/
public class FindIdenticalString {
	void DisplayIdenticalString(String s1, String s2) {
		boolean flag=false;
		if(s1.length()==s2.length()) {
			for(int index=0;index<s1.length();index++) {
				if(s1.charAt(index)!=s2.charAt(index))
					flag=true;
			}
			if(!flag)
				System.out.println("Strings are identical");
			else
				System.out.println("Strings are not identical");
			}
		else
			System.out.println("Strings are not identical");
	}
	public static void main(String[] args) {
		FindIdenticalString findIdenticalString=new FindIdenticalString();
		String s1 = "technoCredits";
		String s2 = "teChnoCreditS";
		findIdenticalString.DisplayIdenticalString(s1, s2);
		String s3 = "pune";
		String s4 = "pune";
		findIdenticalString.DisplayIdenticalString(s3, s4);
	}
}
