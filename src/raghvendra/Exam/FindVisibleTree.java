package raghvendra.Exam;

import java.util.Arrays;

//Find Visible tree from Array
public class FindVisibleTree {
	void DisplayCountOfTreeVisible(int[] arr) {
		int count=0;
		int[] firstarr= {0};
		for(int index=0;index<arr.length;index++) {
			if(firstarr[0]<arr[index]) {
				firstarr[0]=arr[index];
				count++;
			}
		}
		System.out.println("Number of Visible tree in Array:"+Arrays.toString(arr)+" are "+count);
	}
	public static void main(String[] args) {
		FindVisibleTree findVisibleTree=new FindVisibleTree();
		int[] arr= {3,5,5,7,9,13,11,12};
		findVisibleTree.DisplayCountOfTreeVisible(arr);
		int[] arr1= {11,5,13,12,16,5};
		findVisibleTree.DisplayCountOfTreeVisible(arr1);
	}

}
