package sadhana;

/*Assignment - 47 :

Replace second last occurance of "Hi" with your name.
String msg = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output : Hi globant Hello Hi Hi globant Maulik Hello Hello globant Hi Techno Credits Techno   */

public class Replace_SecondLastOccurance_47 {

	void printData(String inputStr) {
		int lastIndex = inputStr.lastIndexOf("Hi");
		String subStr = inputStr.substring(0, lastIndex);
		int strIndex = subStr.lastIndexOf("Hi");
		String subStr1 = subStr.substring(strIndex);
		System.out.println(
				inputStr.substring(0, strIndex) + subStr1.replace("Hi", "Sadhana") + inputStr.substring(lastIndex));
	}

	public static void main(String[] args) {
		new Replace_SecondLastOccurance_47()
				.printData("Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno");
	}

}
