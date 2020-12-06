package milind;

public class DuplicateNumberFromArray {
	
	void duplicateNumber(int[] input){
		for(int index = 0; index < input.length; index++) {
			boolean flag = false;
			for(int innerIndex = index+1; innerIndex < input.length; innerIndex++) {
				if(input[index] == input[innerIndex]) {
					flag = true;
				}
			}
			if(flag) {
				System.out.println("Duplicate number : " + input[index]);
			}
		}
	}
	
	public static void main(String[] args) {
		 int[] array = {0, 1, 2, 3, 9, 33, 44, 55, 33, 66, 1};
		 DuplicateNumberFromArray duplicateNumberFromArray = new DuplicateNumberFromArray();
		 duplicateNumberFromArray.duplicateNumber(array);
	}
}
