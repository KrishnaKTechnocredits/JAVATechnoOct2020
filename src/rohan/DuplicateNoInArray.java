package rohan;

/*
 * Program 2:  Find duplicate number on Integer array in Java? [I know you have done this before, 
 * practice it one more time please]
Hint: There is exactly one number is repeated in the array. You need to write a program to
find that duplicate number. For example, if an array with length 6 contains numbers {0, 3,
1, 2, 3}, then duplicated number is 3.
 * 
 */

public class DuplicateNoInArray {
	
	public static void main(String[] args) {
		DuplicateNoInArray duplicateNoInArray = new DuplicateNoInArray();
		int[] numArr = {0,8,2,4,3,5,5,6,7};
		duplicateNoInArray.findDuplicateNoInArray(numArr);
	}
	
	void findDuplicateNoInArray(int[] numArr){
		int dupNo=0;
		boolean flag =true;
		for(int index=0;index<numArr.length;index++) {
			for(int innerIndex=index+1;innerIndex<numArr.length;innerIndex++) {
				if(numArr[innerIndex]==numArr[index] && index != innerIndex) {
					dupNo = numArr[index];
					flag=false;
					break;
				}
			}
			if(!flag)
				break;
		}
		System.out.println("Duplicate Number is: "+dupNo);
	}

}
