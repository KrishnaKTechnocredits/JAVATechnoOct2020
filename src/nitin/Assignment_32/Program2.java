package nitin.Assignment_32;
import java.util.Arrays;
/* Assignment 32: 3rd Dec'2020 - Program 2: print Hi when you find 3 consecutive numbers.
1,2,3,5,8,9,11,12,13,14,15,18,19,20
output :1,2,3 -> Hi
11,12,13 -> Hi
12,13,14 -> Hi
13,14,15 -> Hi
18,19,20 -> Hi*/
public class Program2 {
	public void printOnConsecutiveNo(int[] arr) {
		System.out.println("Input Array -->"+Arrays.toString(arr));
		//int count=0;
		for(int index=0;index<arr.length-2;index++) {
			if(arr[index]+1 == arr[index+1] && arr[index]+2 == arr[index+2]) 
				System.out.println("Output : "+arr[index]+","+arr[index+1]+","+arr[index+2]+" -> Hi");
		}
	}
	public static void main(String[] args) {
		Program2 program2= new Program2();
		int[] input= {1,2,3,5,8,9,11,12,13,14,15,18,19,20};
		program2.printOnConsecutiveNo(input);
	}
}
