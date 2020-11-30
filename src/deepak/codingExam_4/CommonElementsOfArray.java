/*Program 1: WAP to Find Common Element Between Two Arrays
input: 
int array1 [] = [1, 2, 5, 5, 8, 9, 7, 10]
int array2 [] = [1, 0, 6, 15, 6, 4, 7, 0]
output: 1 7 */

package deepak.codingExam_4;

public class CommonElementsOfArray {
	
	void findCommonElements(int[] arr1, int[] arr2) {
		
		for(int i=0; i<arr1.length; i++) {
			
			for(int j=0; j<arr2.length; j++) {
				
				if(arr1[i]==arr2[j])
					System.out.print(" "+ arr1[i]);
			}
		}
		
	}

	public static void main(String[] args) {
		
		
		int array1 [] = {1, 2, 5, 5, 8, 9, 7, 10};
		int array2 [] = {1, 0, 6, 15, 6, 4, 7, 0};

		CommonElementsOfArray commonElementsOfArray = new CommonElementsOfArray();
		commonElementsOfArray.findCommonElements(array1, array2);
	}
}
