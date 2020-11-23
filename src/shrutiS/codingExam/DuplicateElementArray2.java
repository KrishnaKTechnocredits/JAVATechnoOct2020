/*Exam3: find duplicate from given array.
input : int[] arr = {10,12,55,32,17,12,32};
output : 12
         32

String[] names = {"Techno", "Credits","Techno","Hi","Hello","Hi"};
output : Techno
         Hi*/
package shrutiS.codingExam;

public class DuplicateElementArray2 {
	
	void duplicateElementInt(int[] input) {
		for(int index=0; index<input.length; index++) {
			for(int innerIndex=index+1; innerIndex< input.length; innerIndex++) {
				if(input[index]==input[innerIndex])
					System.out.println(input[index]+" is Duplicate");
			}
		}
	}
	void duplicateElementString(String[] input) {
		for(int index=0; index<input.length; index++) {
			for(int innerIndex=index+1; innerIndex< input.length; innerIndex++) {
				if(input[index]==input[innerIndex])
					System.out.println(input[index]+" is Duplicate");
			}
		}
	}

	public static void main(String[] args) {
		DuplicateElementArray2 duplicateElement = new DuplicateElementArray2();
		int[] input1 = {10,12,55,32,17,12,32};
		String[] input2 = {"Techno", "Credits","Techno","Hi","Hello","Hi"};
		duplicateElement.duplicateElementInt(input1);
		duplicateElement.duplicateElementString(input2);
	}
}
