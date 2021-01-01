/*
 * Coding Exam
 * Program1: Find the number of trees seen according to their height 
 */

package deepak.codingExam5;

public class Program1 {
	
	void processData(int[] input) {
		
		int temp=0, count=0;
		
		
		for(int i=0; i<input.length; i++) {
			
			if(input[i] > temp) {
				temp = input[i];
				count++;
			}
		}
		
		System.out.println("Number of trees seen :"+ count);
	}
	
	public static void main(String[] args) {
		
		int arr1[] = {3, 5, 5, 7, 9, 13, 11, 12};
		int arr2[] = {11, 5, 13, 12, 16, 15};
		
		Program1 refVar = new Program1();
		refVar.processData(arr1);
		refVar.processData(arr2);
	}

}
