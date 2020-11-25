package raghvendra.StringAssignments;

import java.util.Arrays;

/*find the triplet having maximum sum.
[10,12,8,20,18,22,15,13,17,45,12,22]
output : maximum sum triplet 20,18,22 --> 60*/
public class TripletMaxSum {
	void findMaxTripletSum(int[] arr) {
		int maxSum=0;
		int maxIndex=0;
		int sum;
		int count=0;
		int inner;
		int end=0;
		int length=arr.length/3;
		int maxLength=arr.length%3;
		if(arr.length%3>0)
			length=length+1;
		System.out.println("Maximum Triplet in Array "+Arrays.toString(arr)+" with length "+arr.length+" are");
		for(int index=0;index<length;index++) {
			sum=0;
			if(maxLength>0 && index==length-1)
				end=maxLength;
			else
				end=3;
			for(inner=count;inner<count+end;inner++) {
				sum=sum+arr[inner];
			}
			count+=end;
			if(sum>maxSum) {
				maxSum=sum;
				maxIndex=inner;
			}
		}
		for(int j=maxIndex-end;j<maxIndex;j++) {
		System.out.println(arr[j]+" ");
		}
		System.out.println("-----------------------------------------------------------------------");
}

	public static void main(String[] args) {
		TripletMaxSum tripletMaxSum=new TripletMaxSum();
		int[] arr= {10,12,8,20,18,22,15,13,17,45,12,22};
		tripletMaxSum.findMaxTripletSum(arr);
		int[] arr1= {50,60,70,20,18,22,15,13,17,45,12,22};
		tripletMaxSum.findMaxTripletSum(arr1);
		int[] arr2= {50,0,0,20,18,12,15,13,17,5,2,22,92,8};
		tripletMaxSum.findMaxTripletSum(arr2);
	}
}
