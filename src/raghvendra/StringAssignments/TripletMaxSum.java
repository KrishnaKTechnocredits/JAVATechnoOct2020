package raghvendra.StringAssignments;
import java.util.Arrays;
/*find the triplet having maximum sum.
[10,12,8,20,18,22,15,13,17,45,12,22]
output : maximum sum triplet 20,18,22 --> 60*/
public class TripletMaxSum {
	void findMaxTriplet(int[] arr) {
		int sum=0;
		int maxSum=0;
		int maxIndex=0;
		if(arr.length%3==0) {
			for(int index=0;index<arr.length;index+=3) {
				sum=arr[index]+arr[index+1]+arr[index+2];
				if(sum>maxSum) {
					maxSum=sum;
					maxIndex=index;
			     }
			}
				System.out.println("Max Triplet in Array:"+arr[maxIndex]+" "+arr[maxIndex+1]+" "+arr[maxIndex+2]);
		}
		else
			System.out.println("Array has "+arr.length+" characters not suitable for Triplet");
	}
	public static void main(String[] args) {
		TripletMaxSum tripletMaxSum= new TripletMaxSum();
		int[] arr= {10,12,8,20,18,22,15,13,17};
		tripletMaxSum.findMaxTriplet(arr);
		int[] arr1= {10,12,8,20,18,22,15,13,17,55};
		tripletMaxSum.findMaxTriplet(arr1);
	}
}
