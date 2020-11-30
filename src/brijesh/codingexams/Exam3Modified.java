package brijesh.codingexams;

import java.util.Arrays;

/*
Exam3: find duplicate from given array.
input : int[] arr = {10,12,55,32,17,12,32};
output : 12
         32

String[] names = {"Techno", "Credits","Techno","Hi","Hello","Hi"};
output : Techno
         Hi
*/

public class Exam3Modified {
	
	void findDuplicatesFromString(String[] strArray) {
		System.out.println("Duplicate Strings: ");
		for(int index=0; index<strArray.length; index++) {
			for(int innerIndex=index; innerIndex<strArray.length;innerIndex++) {
				if(strArray[index].equals(strArray[innerIndex])) {
					if(index<innerIndex)
					{
						System.out.println(strArray[index]);
						break;
					}else if(index>innerIndex)
						break;
				}	
			}
		}
	}
	
	void findDuplicatesFromNumber(int[] numArray) {
		System.out.println("Duplicate Numbers: ");
		for(int index=0; index<numArray.length; index++) {
			for(int innerIndex=0; innerIndex<numArray.length;innerIndex++) {
				if(numArray[index]==numArray[innerIndex]) {
					if(index<innerIndex)
					{
						System.out.println(numArray[index]);
						break;
					}else if(index>innerIndex)
						break;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] numbers= {10,12,55,32,17,12,32,12,12};
		String[] strings= {"Techno", "Credits","Techno","Hi","Hello","Hi"};
		Exam3Modified exam3Modified = new Exam3Modified();
		System.out.println("Given Number Array: "+Arrays.toString(numbers));
		exam3Modified.findDuplicatesFromNumber(numbers);
		System.out.println("Given Integer Array: "+Arrays.toString(strings));
		exam3Modified.findDuplicatesFromString(strings);

	}

}
