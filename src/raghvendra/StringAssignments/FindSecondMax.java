package raghvendra.StringAssignments;
import java.util.Arrays;
//Find second maximum from array without sorting the array
public class FindSecondMax {
	void findSecondMaxInArray(int[] arr) {
		int max=arr[0];
		int secondMax=arr[1];
		int maxIndex[]=new int[arr.length];
		for(int index=2;index<arr.length;index++) {
			if(arr[index]>max) {
				secondMax=max;
				max=arr[index];
			}
			else if(arr[index]>secondMax) {
				secondMax=arr[index];
			}
		}
		System.out.println("First Max in Array "+Arrays.toString(arr)+" is "+max);
		System.out.println("Second Max in Array "+Arrays.toString(arr)+" is "+secondMax);
	}

	public static void main(String[] args) {
		FindSecondMax findSecondMax=new FindSecondMax();
		int[] arr= {10,0,60,30,2,90,100,140};
		findSecondMax.findSecondMaxInArray(arr);
		int[] arr1= {-1,-9,0,8,-3,0,0};
		findSecondMax.findSecondMaxInArray(arr1);
	}
}
