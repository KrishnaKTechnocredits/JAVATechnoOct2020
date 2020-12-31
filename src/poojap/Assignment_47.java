/*Assignment - 47 : 27th Dec'2020
Replace second last occurance of "Hi" with your name.
String msg = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output : Hi globant Hello Hi Hi globant Maulik Hello Hello globant Hi Techno Credits Techno */

package poojap;

public class Assignment_47 {

	static void replaceWord(String str, String replaceword) {
		String[] input = str.split(" ");
		int cnt = 0;
		for (int i = input.length - 1; i >= 0; i--) {
			if (input[i].equals(replaceword)) {
				cnt++;
				if (cnt == 2) {
					input[i] = "Pooja";
				}
			}
		}
		System.out.println("Replace String Is : ");
		String temp = " ";
		for (String string : input) {
			temp = temp + " " + string;
		}
		temp = temp.trim();
		System.out.println(temp);
	}

	public static void main(String[] args) {

		String string = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		System.out.println("Input String Is :\n" + string);
		replaceWord(string, "Hi");
	}
}
