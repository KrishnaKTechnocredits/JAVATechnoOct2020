//Program 1: WAP to Find Common Element Between Two Arrays
//input:int array1 [] = [1, 2, 5, 5, 8, 9, 7, 10]
//int array2 [] = [1, 0, 6, 15, 6, 4, 7, 0]
//output: 1 7

package priya;

public class Program1Exam4 {
	void commonElementOfArray(int[] arr1,int[] arr2) {
		for(int index=0;index<arr1.length;index++) {
			for (int i= index+1;i<arr2.length;i++) {
				if(arr1[index]==arr2[i])
					System.out.print(" " +arr1[i]);
				}
			}	
	}
	public static void main(String[] args) {
		Program1Exam4 program1exam4 = new Program1Exam4();
		int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
		int[] array2= {1, 0, 6, 15, 6, 4, 7, 0};
		System.out.print("Common elements in two arrays are:");
		program1exam4.commonElementOfArray(array1,array2);
	}
}
