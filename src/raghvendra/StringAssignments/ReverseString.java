package raghvendra.StringAssignments;
/*Program : 1 
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT */
import java.util.Scanner;
public class ReverseString {
	void reverseStringName(String st) {
		String reverse="";
		for(int index=st.length()-1;index>=0;index--) {
			reverse+=st.charAt(index);
		}
		System.out.println("Revserse String is: "+reverse);
	}
	public static void main(String[] args) {
		ReverseString reverseString=new ReverseString();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String st=sc.nextLine();
		reverseString.reverseStringName(st);
	}
}
