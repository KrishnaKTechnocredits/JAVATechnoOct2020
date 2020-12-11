package raghvendra.StringAssignments;
import java.util.Arrays;
/*Program : 1 
Program : 2 
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}
 */
import java.util.Scanner;
public class ReverseStringArray {
	void reverseStringName(String[] st) {
		System.out.println("Revserse String is:");
		for(int index=st.length-1;index>=0;index--) {
			System.out.print(" "+st[index]);
		}
	}
	public static void main(String[] args) {
		ReverseStringArray reverseString=new ReverseStringArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String length:");
		int length=sc.nextInt();
		String[] st=new String[length];
		System.out.println("Enter words you want to get reversed:");
		for(int index=0;index<length;index++) {
			st[index]=sc.next();
		}
		reverseString.reverseStringName(st);
	}
}
