package nitin;
import java.util.Arrays;
/* Program 1:  Find the missing number in integer array of 1 to 10? */
public class FindMissingNoInArray {
	public void FindMissingNumberInArray(int[] arr) {
		System.out.println("Input Array --> "+Arrays.toString(arr));
		int n=arr.length+1;
		int expectedSum=n*(n+1)/2;
		int actualSum=0;
		for(int index=0;index<arr.length;index++) {
			actualSum+=arr[index];
		}
		System.out.println("Missing Number is "+(expectedSum - actualSum));
	}
	public static void main(String[] args) {
		FindMissingNoInArray findMissingNoInArray=new FindMissingNoInArray();
		int[] input= {1,2,3,5,6,7,8,9,10};
		findMissingNoInArray.FindMissingNumberInArray(input);
	}
}
