/*Exam3: find duplicate from given array.
input : int[] arr = {10,12,55,32,17,12,32};
output : 12
         32

String[] names = {"Techno", "Credits","Techno","Hi","Hello","Hi"};
output : Techno
         Hi*/
package shrutiS.codingExam;

public class DuplicateElementArray3 {
	
	void duplicateElementInt(int[] input) {
		for(int index=0; index<input.length; index++) {
			for(int innerIndex=0; innerIndex< input.length; innerIndex++) {
				if(input[index]==input[innerIndex]) {
					if(index<innerIndex) {
						System.out.println(input[index]+" is Duplicate");
						break;
					}else if(innerIndex<index)
						break;
				}
			}
		}
	}
	void duplicateElementString(String[] input) {
		for(int index=0; index<input.length; index++) {
			for(int innerIndex=0; innerIndex< input.length; innerIndex++) {
				if(input[index]==input[innerIndex])
					if(index<innerIndex) {
						System.out.println(input[index]+" is Duplicate");
						break;
					}else if(innerIndex<index)
						break;
			}
		}
	}

	public static void main(String[] args) {
		DuplicateElementArray3 duplicateElement = new DuplicateElementArray3();
		int[] input1 = {32,10,12,55,32,17,12,32};
		String[] input2 = {"Techno", "Credits","Techno","Hi","Hello","Hi","Techno"};
		duplicateElement.duplicateElementInt(input1);
		duplicateElement.duplicateElementString(input2);
	}
}
