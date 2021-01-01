/*find the triplet having maximum sum.
[10,12,8,20,18,22,15,13,17]
output : maximum sum triplet 20,18,22 --> 60 */

package deepak.assignment28;

public class TripletHavingMaxSum {
	
	void calTripletMaxSum(int[] input) {
		
		int sum = 0; 
		int maxSum=0;
		int maxIndex=0;
		
		for(int i=0; i<input.length; i+=3) {
			
			sum = input[i] + input[i+1] + input[i+2];
			
			//System.out.println(sum);
			
			if(sum > maxSum) {
				
				maxSum = sum;
				maxIndex=i;
			}	
		}
		
		System.out.println("Maximum Sum of Triplet :"+ input[maxIndex]+ " "+ input[maxIndex+1]+ " "+ input[maxIndex+2]+" And the sum is: "+ maxSum);
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10,12,8,20,18,22,15,13,17};
		
		TripletHavingMaxSum tripletHavingMaxSum = new TripletHavingMaxSum();
		
		tripletHavingMaxSum.calTripletMaxSum(arr);
	}

}
