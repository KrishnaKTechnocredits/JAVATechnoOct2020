/*Find how many trees you can see
input1 = {3,5,5,7,9,13,11,12}  - o/p = 5
input2 = {11,5,13,12,16,15} - o/p = 3*/

package vishakha.codingexam5;

public class Program1 {
	
	int count = 1;
	
	void findNoOfTreesSeen(int[] inputArr){
		int max = inputArr[0];
		for(int index=1; index<inputArr.length; index++){
			if(inputArr[index] > max){
				max = inputArr[index];
				count++;
			}
		}
		System.out.println("There are total "+count+ " trees that can be seen");
	}

	public static void main(String[] args) {
		int[] arr1 = {3,5,5,7,9,13,11,12};
		int[] arr2 = {11,5,13,12,16,15};
		new Program1().findNoOfTreesSeen(arr1);
		new Program1().findNoOfTreesSeen(arr2);
	}
}
