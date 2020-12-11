package rohan;

/*
 * Find second maximum from array without sorting the array(using nth max logic).
 */

public class SecondMaxArray2 {

	public static void main(String[] args) {
		SecondMaxArray2 secondMaxArray2 = new SecondMaxArray2();
		int[] numArr = {10,12,8,20,18,22,15,13,17,100};
		secondMaxArray2.findSecondMax2(numArr);
	}
	
	void findSecondMax2(int[] numArr) {
		for(int index=0;index<numArr.length;index++) {
			int count=0;
			for(int innerIndex=0;innerIndex<numArr.length;innerIndex++) {
				if(numArr[index]<numArr[innerIndex]) 
					count++;
				if(count>1)
					break;
			}
			if(count==1) {
				System.out.println("Second max of Array: "+numArr[index]);
				break;
			}
		}
	}
}
