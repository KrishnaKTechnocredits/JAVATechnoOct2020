package nitin.Collections.Assignment_47;
/* Assignment - 47 : 27th Dec'2020 - Replace second last occurance of "Hi" with your name.
String msg = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output : Hi globant Hello Hi Hi globant Maulik Hello Hello globant Hi Techno Credits Techno */
public class ReplaceWord {
	public void replaceWordInString(String str ) {
		int index1=str.lastIndexOf("Hi");
		String subString1=str.substring(0,index1);
		int index2=subString1.lastIndexOf("Hi");
		String subString2=subString1.substring(index2);
		System.out.println(str.substring(0,index2)+subString2.replace("Hi", "Nitin")+str.substring(index1));
	}
	public static void main(String[] args) {
		new ReplaceWord().replaceWordInString("Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno\"");
	}
}
