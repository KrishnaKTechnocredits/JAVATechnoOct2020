/*Assignment-19 : 

Program : 2 
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}*/

package kajol.String.Array.Programs;

import java.util.Arrays;

public class ReverseArray {
	String[] reverseArray(String[] inputArray) {
		String[] reverseArray= new String[inputArray.length];
		int reverseIndex=0;
		for(int index=inputArray.length-1;index>=0;index--) {
			reverseArray[reverseIndex]=inputArray[index];
			reverseIndex++;
		}
		return reverseArray;
	}
	
	public static void main(String[] args) {
		String[] inputArray= {"Credits", "Techno","From","Diwali","Happy"};
		ReverseArray reverseArray= new ReverseArray();
		System.out.println("Reverse Array:"+Arrays.toString(reverseArray.reverseArray((inputArray))));
	}
}	
	