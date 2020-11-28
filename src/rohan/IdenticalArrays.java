package rohan;

/*
 * Program 1: WAP to Find Common Element Between Two Arrays

input: 

int array1 [] = [1, 2, 5, 5, 8, 9, 7, 10]
int array2 [] = [1, 0, 6, 15, 6, 4, 7, 0]

output: 1 7
 */

public class IdenticalArrays {
	
	public static void main(String[] args) {
		IdenticalArrays identicalArrays = new IdenticalArrays();
		int[] numArr1 = {1, 2, 5, 5, 8, 9, 7, 10,21,13};
		int[] numArr2 = {1, 0, 6, 15, 6, 4, 7, 0,21,3};
		identicalArrays.findIdenticalElements(numArr1,numArr2);
	}
	
	void findIdenticalElements(int[] numArr1,int[] numArr2) {
		String str="";
		if(numArr1.length == numArr2.length) {
			for(int index=0;index<numArr1.length;index++) {
				if(numArr1[index] == numArr2[index])
					str += " "+numArr1[index];
			}
			System.out.println("Output --> "+str);
		}
		else
			System.out.println("Arrays are not identical");
	}
}
