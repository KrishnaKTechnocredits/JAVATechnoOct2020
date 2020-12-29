/*Assignment - 47 : 27th Dec'2020

Replace second last occurance of "Hi" with your name.
String msg = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output : Hi globant Hello Hi Hi globant Maulik Hello Hello globant Hi Techno Credits Techno*/

package himali.Assignment47;

public class Assignment47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String msg ="Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		
		int lastIndex=msg.lastIndexOf("Hi");
		System.out.println(lastIndex);
		String subMsg=msg.substring(0,lastIndex);
		System.out.println(subMsg);
		
		int secondLastIndex=subMsg.lastIndexOf("Hi");
		String output = msg.substring(0,secondLastIndex)+"Himali"+msg.substring(secondLastIndex+2,msg.length());
		System.out.println(output);
	}

}
