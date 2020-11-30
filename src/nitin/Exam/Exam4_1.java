package nitin.Exam;
import java.util.Arrays;
/* Exam 4 - Program 1: WAP to Find Common Element Between Two Arrays
input: 
int array1 [] = [1, 2, 5, 5, 8, 9, 7, 10]
int array2 [] = [1, 0, 6, 15, 6, 4, 7, 0]
output: 1 7*/
public class Exam4_1 {
	void findCommonElement(int[] arr1,int arr2[]) {
		System.out.println("Input Array 1 -->"+Arrays.toString(arr1));
		System.out.println("Input Array 2 -->"+Arrays.toString(arr2));
		System.out.print("Common Element Between Two Arrays --> ");
		for(int index=0;index<arr1.length;index++) {
			int num=0;
			int temp=arr1[index];
			for(int inner=0;inner<arr2.length;inner++) {
				int temp1=arr2[inner];
				if(temp==temp1) {
					num=temp;
					System.out.print(" "+num);
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] array1= {1, 2, 5, 5, 8, 9, 7, 10};
		int[] array2= {1, 0, 6, 15, 6, 4, 7, 0};
		new Exam4_1().findCommonElement(array1, array2);
	}
}
