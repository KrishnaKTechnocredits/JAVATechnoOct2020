package rohan;

public class DuplicateInArray {

	void checkForDuplicatesInArray(String[] strArray) {
		System.out.println("------Output-------");
		for(int index=0;index<strArray.length;index++) {
			int cnt=0;
			for(int innerIndex=index+1;innerIndex<strArray.length;innerIndex++) {
				if(strArray[index].equalsIgnoreCase(strArray[innerIndex]))
					System.out.println(strArray[index]);
			}
		}
	}
	
	void checkForDuplicatesInArray(int[] intArray) {
		System.out.println("------Output-------");
		for(int index=0;index<intArray.length;index++) {
			int cnt=0;
			for(int innerIndex=index+1;innerIndex<intArray.length;innerIndex++) {
				if(intArray[index]==intArray[innerIndex])
					System.out.println(intArray[index]);
			}
		}
	}
	
	public static void main(String[] args) {
		DuplicateInArray duplicateInArray = new DuplicateInArray();
		String[] strArray =  {"Techno", "Credits","Techno","Hi","Hello","Hi"};
		int[] intArray = {10,12,55,32,17,12,32};
		duplicateInArray.checkForDuplicatesInArray(intArray);
		duplicateInArray.checkForDuplicatesInArray(strArray);
	}
		
}
