//Exam3: find duplicate from given array.
//input : int[] arr = {10,12,55,32,17,12,32};
//output : 12
//         32
         
         
package priya;

public class Program1Exam3 {

	void duplicateArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for (int j= i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					System.out.println("Duplicate numbers are: " +arr[j]);
				}
			}	
	}
	public static void main(String[] args) {
		Program1Exam3 program1exam3 = new Program1Exam3();
		int[] array = {10,12,55,32,17,12,32};
		program1exam3.duplicateArray(array);
	}
}
