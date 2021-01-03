/*Assignment - 47 : 

Replace second last occurance of "Hi" with your name.
String msg = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output : Hi globant Hello Hi Hi globant Maulik Hello Hello globant Hi Techno Credits Techno

*/

package kajol.String.Array.Programs;

public class ReplaceSecondLastOccurence {
	
	void replaceSecondLastOccurence(String input) {
		int lastIndex=input.lastIndexOf("Hi");//
		String s1=input.substring(0, lastIndex);//s1=Hi globant Hello Hi Hi globant Hi Hello Hello globant
		int secondLastIndex=s1.lastIndexOf("Hi");
		String s2=s1.substring(secondLastIndex);//s2: Hi Hello Hello globant
		String s3=s2.replaceAll("Hi", "Kajol");//s3: Kajol Hello Hello globant
		System.out.println("Output: "+input.substring(0, secondLastIndex)+s3+input.substring(lastIndex));	
	}
	
	public static void main(String[] args) {
		String msg = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		System.out.println("Given String is: "+msg);
		new ReplaceSecondLastOccurence().replaceSecondLastOccurence(msg);
	}

}
