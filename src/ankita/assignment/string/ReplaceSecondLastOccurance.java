/*Assignment - 47 : 27th Dec'2020

Replace second last occurance of "Hi" with your name.
String msg = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output : Hi globant Hello Hi Hi globant Maulik Hello Hello globant Hi Techno Credits Techno
*/
package ankita.assignment.string;

public class ReplaceSecondLastOccurance {
	void replaceScndOccurance(String msg) {
		System.out.println("Input : " + msg);

		int index1 = msg.lastIndexOf("Hi");
		String str1 = msg.substring(0, index1);

		int index2 = str1.lastIndexOf("Hi");
		String str2 = str1.substring(index2);

		System.out.println("Output: " +msg.substring(0, index2) + str2.replace("Hi", "Ankita") + msg.substring(index1));
	}

	public static void main(String[] args) {
		new ReplaceSecondLastOccurance()
				.replaceScndOccurance("Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno");
	}
}