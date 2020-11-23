package prem;

import java.util.Arrays;

public class ArrayReverse {
	
	public String[] reverseArray(String[] strArray) {
		String[] reverse=new String[strArray.length];
		for(int index=strArray.length-1; index>=0; index--)
			reverse[strArray.length-1-index]=strArray[index];
		return reverse;
	}

	public static void main(String[] args) {
		String[] strArray= {"Paris","Newyork", "Mumbai"};
		System.out.println("String Array: "+Arrays.toString(strArray));
		ArrayReverse arrayReverse = new ArrayReverse();
		System.out.println("Reverse of String Array: "+Arrays.toString(arrayReverse.reverseArray(strArray)));
	}
}

