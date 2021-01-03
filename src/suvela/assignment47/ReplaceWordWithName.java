/*Assignment - 47 : 27th Dec'2020

Replace second last occurance of "Hi" with your name.
String msg = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output : Hi globant Hello Hi Hi globant Maulik Hello Hello globant Hi Techno Credits Techno */
package suvela.assignment47;

public class ReplaceWordWithName {
	public void replace(String str) {
		int i = str.lastIndexOf("Hi");
		String temp = str.substring(0, i);
		
		int index = temp.lastIndexOf("Hi");
		String s = temp.substring(index);
		
		System.out.println(str.substring(0, index) + s.replace("Hi", "Suvela") + str.substring(i));
	}

	public static void main(String[] args) {
		String msg = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		new ReplaceWordWithName().replace(msg);

	}

}
/*System.out.println(str.substring(i));>> Hi Techno Credits Techno
 * System.out.println(str.substring(0,index));>> Hi globant Hello Hi Hi globant
 * System.out.println(s);>> Hi Hello Hello globant 
 * 
 *  */
