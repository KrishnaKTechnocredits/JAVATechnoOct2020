package ritika.Assignments;
/*Assignment - 47 : 27th Dec'2020

Replace second last occurance of "Hi" with your name.
String msg = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output : Hi globant Hello Hi Hi globant Maulik Hello Hello globant Hi Techno Credits Techno
*/
public class Asgmt_47 {

	static String replaceAWordFfromStringWithYourName(String input, String wordToReplace) {
	
		String inputArr[] = input.split(" ");
		int count=0;
		for (int index = inputArr.length-1; index>=0; index--) {
			if(inputArr[index].equals(wordToReplace)) {
				count++;
				if(count==2)
					inputArr[index] = "Ritika";
			}	
		}
		System.out.println("Replaced String is:");
		String output = "";
		for(String str: inputArr) {
			output = output + " " + str;
		}
		output=output.trim();
		return output;
	}
	
	public static void main(String[] args) {
		String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		System.out.println("Input string is:");
		System.out.println(input);
		System.out.println(replaceAWordFfromStringWithYourName(input, "Hi")); 
	}
}
