package brijesh.codingexams;

/*
Exam3: find duplicate from given array.
input : int[] arr = {10,12,55,32,17,12,32};
output : 12
         32

String[] names = {"Techno", "Credits","Techno","Hi","Hello","Hi"};
output : Techno
         Hi
*/

public class Exam3 {

	void findDuplicatesString(String[] strArray) {
		System.out.println("Duplicate Strings: ");
		for(int index=0; index<strArray.length; index++) {
			String string=strArray[index];
			int counter=0;
			for(int innerIndex=index; innerIndex<strArray.length;innerIndex++) {
				if(string.equals(strArray[innerIndex]) && index != innerIndex) {
					counter++;	
					strArray[innerIndex]="";
				}	
			}
			if(counter>0 && strArray[index]!="")
				System.out.println(string);
		}
	}
	
	void findDuplicatesNumber(int[] numArray) {
		System.out.println("Duplicate Numbers: ");
		for(int index=0; index<numArray.length; index++) {
			int number=numArray[index];
			int counter=0;
			for(int innerIndex=0; innerIndex<numArray.length;innerIndex++) {
				if(number==numArray[innerIndex] && index != innerIndex) {
					counter++;
					numArray[innerIndex]=-1;
				}
			}
			if(counter>0 && numArray[index]!=-1)
				System.out.println(number);
		}
	}
	
	public static void main(String[] args) {
		int[] numbers= {10,12,55,32,17,12,32,12,12};
		String[] strings= {"Techno", "Credits","Techno","Hi","Hello","Hi"};
		Exam3 exam3 = new Exam3();
		exam3.findDuplicatesNumber(numbers);
		exam3.findDuplicatesString(strings);
	}
}
