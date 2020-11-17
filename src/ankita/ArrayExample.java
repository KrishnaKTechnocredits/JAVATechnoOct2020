/*
 * write a single program having different methods. 
	a) To find Min number from given array
	b) To find Max number from given array
	c) To find Avg of all numbers from give array
	d) To display all numbers [0 to length]
	e) To display all numbers [length to 0]
	g) Method to find average of min and max number from array.
 */

package ankita;

public class ArrayExample {
	
	int findMinNumber(int[] num) {
		int min=num[0];
		for(int index=1;index<num.length;index++) {
			if(num[index]<min)
				min=num[index];
		}
		return min;
	}
	int findMaxNumber(int[] num) {
		int max=num[0];
		for(int index=1;index<num.length;index++) {
			if(num[index]>max)
				max=num[index];
		}
		return max;
	}
	double findAvgNumber(int[] num) {
		int sum=0;
		for(int index=0;index<num.length;index++) {
			sum = sum + num[index];
		}
		return sum/num.length;
	}
	void displayArrayForward(int[] num) {
		System.out.print("Forward Array : ");
		for(int index=0;index<num.length;index++) {
			System.out.print(" " +num[index]);
		}
	}
	void displayArrayReverse(int[] num) {
		System.out.print("\nReverse Array : ");
		for(int index=num.length-1;index>=0;index--) {
			System.out.print(" " +num[index]);
		}
	}
	double findAvgOfMinMax(int[]num) {
		return (findMinNumber(num)+findMaxNumber(num))/2;
	}
	public static void main(String[] args) {
		ArrayExample arrayExample = new ArrayExample();
		int[] arr = new int[] {5,4,3,2,1};
		arrayExample.displayArrayForward(arr);
		arrayExample.displayArrayReverse(arr);
		System.out.println("\nAverage of array :" + arrayExample.findAvgNumber(arr));
		System.out.println("Minimum of array :" + arrayExample.findMinNumber(arr));
		System.out.println("Maximum of array :" + arrayExample.findMaxNumber(arr));		
		System.out.println("Average of minimum and maximum:" + arrayExample.findAvgOfMinMax(arr));
	}
}