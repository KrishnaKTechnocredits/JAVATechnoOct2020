package milind;

public class CommonElementBetArray {
	
	void commonElement(int[] arr1, int[] arr2) {
		for(int index = 0; index < arr1.length; index++) {
			boolean flag = false;
			for(int innerIndex = 0; innerIndex < arr2.length; innerIndex++) {
				if(arr1[index] == arr2[innerIndex]) {
					flag = true;
					break;
				}
			}
			if(flag) {
				System.out.print(arr1[index] + ", ");
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10, 0, 1};
		int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};
		CommonElementBetArray commonElementBetArray = new CommonElementBetArray();
		commonElementBetArray.commonElement(array1, array2);
	}

}
