package nitin;
import java.util.Arrays;
/*Assignment - 29 : 26th Nov'2020 - Find second maximum from array without sorting the array. */
public class SecondMaxInArray{
	public void findSecondMaxInArray(int[] arr){
		System.out.println("Input Array --> "+Arrays.toString(arr));
		int max =0;
		int secondMax=0;
		for(int index=0;index<arr.length;index++){
			if(arr[index]>max) {
				secondMax=max;
				max=arr[index];
			}
			else if(arr[index]>secondMax && arr[index]!=max)
				secondMax=arr[index];
		}	
		System.out.println("Second Maximum number in the input array is --> "+secondMax);
	}
	public static void main(String[] args){
		SecondMaxInArray secondMaxInArray = new SecondMaxInArray();
		int[] input={4,8,9,78,17,56,84,52,43,74};
		secondMaxInArray.findSecondMaxInArray(input);
	}
}