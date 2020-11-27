package prasad.Stringandarray;
/*Assignment - 28 : 25th Nov'2020

find the triplet having maximum sum.
[10,12,8,20,18,22,15,13,17]
output : maximum sum triplet 20,18,22 --> 60*/

public class Printtripletwithmaxsum {
	
	void scanArray(int[]arr) {
		int maxSum=0;
		int maxIndex=0;
		for(int index=0;index<arr.length;index+=3) {
			int sum= arr[index]+arr[index+1]+arr[index+2];
			if(sum>maxSum) {
				maxSum=sum;
				maxIndex=index;
			}
		}
		System.out.println("Triplet with max sum-> "+ arr[maxIndex]+","+arr[maxIndex+1]+","+arr[maxIndex+2]+ " & max sum is " + maxSum);
		
	}
	
	public static void main(String[]arg) {
		Printtripletwithmaxsum printtripletwithmaxsum = new Printtripletwithmaxsum();
		int []input = {10,12,8,20,18,22,15,13,17};
		printtripletwithmaxsum.scanArray(input);
	}
}
