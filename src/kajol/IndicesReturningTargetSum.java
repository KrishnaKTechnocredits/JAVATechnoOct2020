/*Exam - 5 : 
Program 2: 
interface Manager{
	int[] findTargetIndex(int[] arr,int target);
}

class TestClass{
        // write your code here
	public static void main(){
		Manager manager = new TestClass();
		int[] arr = {10,3,5,2,9,7,8};
		int target = 9;
		int[] arr1 = manager.findTargetIndex(arr,target);
		System.out.println("first index -> " + arr1[0]); // 3
		System.out.println("second index -> " + arr1[1]); // 5
	}
}

output : 3 & 5*/

package kajol;

import java.util.Arrays;
//Changing Class Name in given problem statement for my understanding in listofPrograms in My local System.
public class IndicesReturningTargetSum implements Manager {
	@Override
	public int[] findTargetIndex(int[] arr,int target) {
		System.out.println("Given Array is: "+Arrays.toString(arr));
		System.out.println("Targer Sum is: "+target);
		System.out.println("Below are the array indices whose corressponding elements are returning sum equal to "+target);
		int indices[]=new int[2];
		for(int index=0;index<arr.length;index++)
			for(int innerindex=index+1;innerindex<arr.length;innerindex++)
				if(arr[index]+arr[innerindex]==target) {
					indices[0]= index;
					indices[1]=innerindex;
				}		
		return indices;
	}
	
	public static void main(String args[]){
		Manager manager = new IndicesReturningTargetSum();
		int[] arr = {10,3,5,2,9,7,8};
		int target = 9;
		int[] arr1 = manager.findTargetIndex(arr,target);
		System.out.println("first index -> " + arr1[0]); // 3
		System.out.println("second index -> " + arr1[1]); // 5
	}

}
