package raghvendra.Exam;
/*Program 1: WAP to Find Common Element Between Two Arrays

input: 

int array1 [] = [1, 2, 5, 5, 8, 9, 7, 10]
int array2 [] = [1, 0, 6, 15, 6, 4, 7, 0]

output: 1 7 */
public class CommonElementsInArray {
	void findCommonElementsArray(int[] arr, int[] arr2) {
		System.out.println("Common elements in both Array Are ");
		for(int index=0;index<arr.length;index++) {
			for(int inner=0;inner<arr2.length;inner++) {
				if(arr[index]==arr2[inner])
					System.out.print(arr[index]+" ");
			}
		}
	}

	public static void main(String[] args) {
		CommonElementsInArray commonElementsInArray=new CommonElementsInArray();
		int arr [] = {1, 2, 5, 5, 8, 9, 7, 10};
		int arr2 [] = {1, 0, 6, 15, 6, 4, 7, 0};
		commonElementsInArray.findCommonElementsArray(arr, arr2);
	}

}
