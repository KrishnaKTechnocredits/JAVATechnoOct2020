
/*Program 1:  Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 but exactly one number is missing, you need to write a Java program to find that missing number in an array.

*/
package Himali_Assignment30;

public class Program1 {
	void missingNumber(int[] numArray) {
		for(int i=0;i<=numArray.length;i++) {
			if(i+1!=numArray[i])
			{
				System.out.println("Missing number is: " +(i+1));
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,2,3,4,6,7,8,9,10};
		Program1 program1=new Program1();
		program1.missingNumber(array);
		

	}

}
