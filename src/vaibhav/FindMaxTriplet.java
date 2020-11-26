package vaibhav;

/*find the triplet having maximum sum.
[10,12,8,20,18,22,15,13,17]
output : maximum sum triplet 20,18,22 --> 60*/

public class FindMaxTriplet {
	
	public static void getTriplet(int [] givenArray) {
		int maxSum=0;
		int maxIndex = 0 ;
		for (int index = 0 ; index < givenArray.length;index += 3 ) {
			int sum = 0 ;
			sum += givenArray[index]+givenArray[index+1]+givenArray[index+2];
			if (sum > maxSum) {
				maxSum = sum;
				maxIndex=index;
			}
		}	
		System.out.println("Maximum triplets are "+givenArray[maxIndex]+","+givenArray[maxIndex+1]+","+givenArray[maxIndex+2]+" With Sum "+maxSum);
	}

	public static void main(String[] args) {
		int [] givenArray = {10,12,8,20,18,22,15,13,17};
		FindMaxTriplet.getTriplet(givenArray);
	}

}
