package rohan;

/*
 * Find second maximum from array without sorting the array(using sorting).
 */

public class SecondMaxArray {
	
	public static void main(String[] args) {
		SecondMaxArray secondMaxArray = new SecondMaxArray();
		int[] numArr = {10,12,8,20,18,22,15,13,17};
		secondMaxArray.findSecondMax(numArr);
	}
	
	void findSecondMax(int[] numArr) {
		int max=numArr[0],smax=numArr[1];
		for(int index=2;index<numArr.length;index++) {
			if(numArr[index]>max) {
				smax = max;
				max=numArr[index];
			}
			else if(numArr[index]>smax)
				smax = numArr[index];
		}
		System.out.println("Second max from Array: "+smax);
	}
}
