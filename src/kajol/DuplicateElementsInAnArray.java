package kajol;

public class DuplicateElementsInAnArray {
	
	void findDuplicateIntegerElements(int[] inputArray){
		for(int index=0;index<inputArray.length;index++) {
			for (int innerIndex=index+1;innerIndex<inputArray.length;innerIndex++) {
					if (inputArray[index]==inputArray[innerIndex] )
						System.out.println(+inputArray[index]+" is duplicate.");
			}
		}				
	}
	
	void findDuplicateStringElements(String [] inputArray){
		for(int index=0;index<inputArray.length;index++) {
			for (int innerIndex=index+1;innerIndex<inputArray.length;innerIndex++) {
					if (inputArray[index].equals(inputArray[innerIndex]))
						System.out.println(inputArray[index]+" is duplicate.");
			}
		}	
	}
	
	public static void main(String[] args) {
		int inputArray[]= {10,12,55,32,17,12,32};
		new DuplicateElementsInAnArray().findDuplicateIntegerElements(inputArray);
		System.out.println();
		String stringArray[]= {"Techno", "Credits","Techno","Hi","Hello","Hi"};
		new DuplicateElementsInAnArray().findDuplicateStringElements(stringArray);
	}
}
