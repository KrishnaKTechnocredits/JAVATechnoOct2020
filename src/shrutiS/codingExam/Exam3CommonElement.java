/*Program 1: WAP to Find Common Element Between Two Arrays

input: 

int array1 [] = [1, 2, 5, 5, 8, 9, 7, 10]
int array2 [] = [1, 0, 6, 15, 6, 4, 7, 0]

output: 1 7*/

package shrutiS.codingExam;

public class Exam3CommonElement {
	
	void getArrayInput(int[] arr1, int[] arr2) {
		System.out.print("Int array1 [] = ");
		for(int index=0; index<arr1.length; index++) {
			System.out.print(arr1[index]+" ");
		}
		System.out.print("\nInt array2 [] = ");
		for(int innerIndex=0; innerIndex<arr2.length; innerIndex++) {
			System.out.print(arr2[innerIndex]+" ");
		}
	}

	void findCommonElement(int[] arr1, int[] arr2) {
		System.out.print("\nIdentical Elements are : ");
		for (int index = 0; index < arr1.length; index++) {
			for (int innerIndex = 0; innerIndex < arr2.length; innerIndex++) {
				if (arr1[index] == arr2[innerIndex]) {
					System.out.print(+arr1[index]+" ");
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Exam3CommonElement commonElement = new Exam3CommonElement();
		int array1[] = { 1, 2, 5, 5, 8, 9, 7, 10 };
		int array2[] = { 1, 0, 6, 15, 6, 4, 7, 0 };
		commonElement.getArrayInput(array1, array2);
		commonElement.findCommonElement(array1, array2);
	}
}
