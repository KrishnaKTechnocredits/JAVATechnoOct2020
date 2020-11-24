/*Program : 2 
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}*/

package vishakha;

import java.util.Scanner;

public class ReverseArray {

	void reverseArray(String[] strArray){
		String[] strRevArray = new String[strArray.length];
		for(int index = strArray.length-1, j=0; index>=0; index--,j++){
			strRevArray[j] = strArray[index];
		}
		for(int innerIndex = 0; innerIndex<strRevArray.length; innerIndex++){
			System.out.print(strRevArray[innerIndex]+ " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("How many words you want ? ");
		int arrLength = sc.nextInt();
		String[] strArray = new String [arrLength];
		for(int index=0; index<arrLength; index++){
			System.out.println("Enter " +(index+1)+ " word");
			strArray[index] = sc.next();
		}
		new ReverseArray().reverseArray(strArray);
	}

}
