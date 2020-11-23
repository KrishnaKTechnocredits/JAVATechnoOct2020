package milind;

import java.util.Arrays;

public class ReverseArray {
	
	void reverseArray(String[] arrayInput){
		String[] temp = new String[arrayInput.length];
		for(int index = arrayInput.length-1; index >= 0; index--) {
				temp[arrayInput.length-1-index] =  arrayInput[index];
		}
		System.out.println("Reverse array : " + Arrays.toString(temp));
	}
	
	public static void main(String[] args) {
		 String[] stringArray = {"Credits", "Techno","From","Diwali","Happy"};
		 ReverseArray reverseArray = new ReverseArray();
		 reverseArray.reverseArray(stringArray);
	}

}
