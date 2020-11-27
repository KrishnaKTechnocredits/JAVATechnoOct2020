package rohan;

/*write a single program having different methods.

a) To find Min number from given array
b) To find Max number from given array
c) To find Avg of all numbers from give array
d) To display all numbers [0 to length]
e) To display all numbers [length to 0]
g) Method to find average of min and max number from array.*/

public class ArrayAssignment {

	int maxOfArray(int[] arr) {
		int ans = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(ans < arr[i])
				ans = arr[i];
		}
		return ans;
	}
	
	int minOfArray(int[] arr) {
		int ans = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(ans > arr[i])
				ans = arr[i];
		}
		return ans;
	}
	
	float averageOfArray(int[] arr) {
		int avg = 0;
		for(int i=0;i<arr.length;i++) {
			avg += arr[i];
		}
		return avg/arr.length;
	}
	
	void displayAsc(int[] arr) {
		System.out.println("Display in Ascending order of index");
		for(int i=0;i<arr.length;i++) {
			System.out.println("element["+i+"]: "+arr[i]);
		}
	}
	
	void displayDesc(int[] arr) {
		System.out.println("Display in Descending order of index");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println("element["+i+"]: "+arr[i]);
		}
	}
	
	public static void main(String[] a) {
		int[] num = {10,20,5,30,7};		
		ArrayAssignment arrayAssignment = new ArrayAssignment();
		int max = arrayAssignment.maxOfArray(num);
		System.out.println("Maximum no from array is: "+max);
		int min = arrayAssignment.minOfArray(num);
		System.out.println("Minumum no from array is: "+min);
		float avg = arrayAssignment.averageOfArray(num);
		System.out.println("Average of array element is: "+avg);
		arrayAssignment.displayAsc(num);
		arrayAssignment.displayDesc(num);
		float avgMinMax = (max+min)/2f;
		System.out.println("average of Minimum and Maximum nos from array is: "+avgMinMax);
	}
}
