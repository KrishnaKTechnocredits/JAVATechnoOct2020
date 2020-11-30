/*Program 1: WAP to Find Common Element Between Two Arrays

input: 

int array1 [] = [1, 2, 5, 5, 8, 9, 7, 10]
int array2 [] = [1, 0, 6, 15, 6, 4, 7, 0]

 * */
package suvela.exams;

public class Exam4_1 {
	void findCommonElement(int[] arr1, int[] arr2) {
		
		for(int i=0;i<arr1.length;i++) {
			int number=0;
			int num=arr1[i];
			for(int j=0;j<arr2.length;j++) {
				int num2=arr2[j];
				if(num==num2) {
					number=num;
					System.out.print("Common elements are:"+number + ",");
				}
			}
			
		}
	}
	public static void main(String[] args) {
		int array1[]= {1, 2, 5, 5, 8, 9, 7, 10};
		int array2[]= {1, 0, 6, 15, 6, 4, 7, 0};
		new Exam4_1().findCommonElement(array1, array2);
	}

}
