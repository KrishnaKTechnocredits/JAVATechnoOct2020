package brijesh.assignment47;

/*
Replace second last occurance of "Hi" with your name.
String msg = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output : Hi globant Hello Hi Hi globant Maulik Hello Hello globant Hi Techno Credits Techno 
*/

public class ReplaceSecondLastOccurance {

	void replaceSecondLastOccurance(String input) {
		int index1= input.lastIndexOf("Hi");
		String subString1 = input.substring(0,index1);
		int index2 = subString1.lastIndexOf("Hi");
		String subString2 = subString1.substring(index2);
		System.out.println(input.substring(0,index2)+subString2.replace("Hi", "Brijesh")+input.substring(index1));
	}
	
	public static void main(String[] args) {
		new ReplaceSecondLastOccurance().replaceSecondLastOccurance("Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno");
	}
}
