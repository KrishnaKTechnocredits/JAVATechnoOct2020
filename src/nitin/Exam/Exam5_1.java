package nitin.Exam;
import java.util.Arrays;
/* Program 1 - WAP to find the count of visible trees from the height of trees standing in a sequence
Input 1 - 3,5,5,7,9,13,11,12
Input 2 - 11,5,13,12,16,15 
Output - 5 & 3 */
public class Exam5_1 {
	void findNumber(int[] arr) {
		int max =0,count=0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index]>max) {
				max=arr[index];
				count++;
			}
		}
		System.out.println("Output - "+count);
	}
	public static void main(String[] args) {
		int input[]={3,5,5,7,9,13,11,12};
		int input1[]= {11,5,13,12,16,15};
		System.out.println("Input 1 --> "+Arrays.toString(input));
		System.out.println("Input 2 --> "+Arrays.toString(input1));
		new Exam5_1().findNumber(input);
		new Exam5_1().findNumber(input1);
	}
}
