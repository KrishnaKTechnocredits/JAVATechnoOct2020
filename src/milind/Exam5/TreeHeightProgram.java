package milind.Exam5;

public class TreeHeightProgram {
	
	int isTreeVisible(int[] arrayInput) {
		int count = 1;
		int greaterNumberFromArray = arrayInput[0];
		for(int index = 1; index < arrayInput.length; index++) {
			if(arrayInput[index] > greaterNumberFromArray) {
				greaterNumberFromArray = arrayInput[index];
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] array = {3, 5, 5, 7, 9, 13, 11, 12};
		int[] array2 = {11,5,13,12,16,15};
		TreeHeightProgram treeHeightProgram = new TreeHeightProgram();
		System.out.println(treeHeightProgram.isTreeVisible(array));
		System.out.println(treeHeightProgram.isTreeVisible(array2));
	}
}
