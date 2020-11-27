/* Exam 4 : Program 1: WAP to Find Common Element Between Two Arrays

input: 

int array1 [] = [1, 2, 5, 5, 8, 9, 7, 10]
int array2 [] = [1, 0, 6, 15, 6, 4, 7, 0]

output: 1 7
*/

package mrunal;

public class program1 {

	void getIdenticalNumbers(int array1 []  , int array2 [] ) {
		for(int index1=0; index1<array1.length; index1++) {
			int num=0 ; 
			int num1=array1[index1];
			for(int index2=0 ; index2<array2.length ; index2++) {
				int num2=array2[index2];
				if(num1==num2) {
					num=num1;
					System.out.println("Identical elements are :" + num);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1 [] = {1, 2, 5, 5, 8, 9, 7, 10};
		int array2 [] = {1, 0, 6, 15, 6, 4, 7, 0};

		program1 Program1 = new program1();
		Program1.getIdenticalNumbers(array1, array2);

	}

}