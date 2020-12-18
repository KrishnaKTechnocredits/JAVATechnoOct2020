/*Program 2:  Find duplicate number on Integer array in Java? 

Hint: There is exactly one number is repeated in the array. You need to write a program to
find that duplicate number. For example, if an array with length 5 contains numbers {0, 3,
1, 2, 3}, then duplicated number is 3.*/

package kajol;

public class DuplicateNumberInAnArray {
	
	void findDuplicateNumber(int[] inputArray){
		int duplicate=inputArray[0];
		for(int index=0;index<inputArray.length;index++) {
			for (int innerIndex=0;innerIndex<inputArray.length;innerIndex++) {
					if (inputArray[index]==inputArray[innerIndex] && index<innerIndex) {
						if(duplicate!=inputArray[index]) {
							duplicate=inputArray[index];
							System.out.println(+duplicate+" is duplicate.");
						}
						break;
					}					
			}
		}				
	}
	
	public static void main(String[] args) {
		int inputArray[]= {10,12,32,55,32,17,12,32,32};
		new DuplicateNumberInAnArray().findDuplicateNumber(inputArray);
	}
}
	
