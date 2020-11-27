package milind;

public class CheckArrayIdentical {
	
	void arrayIdentical(int[] arrayOne, int[] arrayTwo) {
		int count =0;
		if(arrayOne.length == arrayTwo.length) {
			for(int index = 0; index < arrayOne.length; index++) {
				if(arrayOne[index] == arrayTwo[index]) {
					count++;
				}else {
					break;
				}
			}
		}
		if(count == arrayOne.length) {
			System.out.println("Array is identical");
		}else {
			System.out.println("Array is not identical");
		}
	}
	
	public static void main(String[] args) {
		int[] arrayOne = {10,12,55,32,17};
		int[] arrayTwo = {10,12,55,32,17};
		CheckArrayIdentical checkArrayIdentical = new CheckArrayIdentical();
		checkArrayIdentical.arrayIdentical(arrayOne, arrayTwo);
	}
}
