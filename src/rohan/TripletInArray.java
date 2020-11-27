package rohan;

/*
 find the triplet having maximum sum.
[10,12,8,20,18,22,15,13,17]
output : maximum sum triplet 20,18,22 --> 60
 */

public class TripletInArray {
	public static void main(String[] args) {
		TripletInArray tripletInArray = new TripletInArray();
		int[] numArr = {10,12,8,20,18,22,15,13,17,14,25,60};
		tripletInArray.tripletSumCount(numArr);
	}
	
	void tripletSumCount(int[] numArr) {
		int sum=0;
		String tmpStr="";
		int tmpSum=0;
		String str="";
		if(numArr.length%3 == 0) {
			for(int index=0;index<numArr.length;) {
				sum=0;
				tmpStr="";
				for(int innerIndex=index;innerIndex<(index+3);innerIndex++) {
					sum += numArr[innerIndex];
					tmpStr += " "+String.valueOf(numArr[innerIndex]);
				}
				if(sum>tmpSum) {
					tmpSum = sum;
					str = tmpStr;
				}
				index = index+3;
			}
			System.out.println(str+" --> "+tmpSum);
		}
	}
}
