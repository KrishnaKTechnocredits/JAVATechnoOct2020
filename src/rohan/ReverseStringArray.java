package rohan;

/*Program : 2 
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"} */

public class ReverseStringArray {
	
	public void arrayReverse(String[] strArray) {
		String[] reverseArray = new String[strArray.length];
		for(int index=strArray.length-1,innerIndex=0;index>=0;index--,innerIndex++) {
			reverseArray[innerIndex] = strArray[index];
		}
		System.out.println("------------Output----------");
		System.out.print("{");
		for(int index=0;index<reverseArray.length;index++) {
		System.out.print("'"+reverseArray[index]+"',");
		}
		System.out.print("}");
		
	}
	public static void main(String[] args) {
		ReverseStringArray reverseStringArray = new ReverseStringArray();
		String[] strArray =  {"Credits", "Techno","From","Diwali","Happy"};
		reverseStringArray.arrayReverse(strArray);
	}
}
