package rohan;
/*
 * Program 1:  Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 but 
exactly one number is missing, you need to write a Java program to find that missing number 
in an array.
 */

public class MissingNoFromArray {
	
	public static void main(String[] args) {
		MissingNoFromArray missingNoFromArray = new MissingNoFromArray();
		int[] numArr = {1,2,3,5,6,7,9,10,11,12,13,17,18};
		missingNoFromArray.findMissingNo(numArr);
	}
	
	void findMissingNo(int[] numArr) {
		int cnt=0;
		String s = "";
		for(int index=0;index<numArr.length;index++) {
			cnt++;
			if(cnt!=numArr[index]) {
				s += " "+cnt;
				index--;
			}
		}
		System.out.println("Missing numbers :"+s);
	}

}
