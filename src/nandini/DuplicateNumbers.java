package nandini;

public class DuplicateNumbers {
	
	void findDuplicateNo(int[] inputArr) {
		for(int i=0; i< inputArr.length;i++) {
			for(int j = i+1; j < inputArr.length; j++) {
				if(inputArr[i] == inputArr[j] && i!=j)
		        	System.out.println(inputArr[j] + " ");
			}
		}	
	}
	public static void main(String args[]) {
		DuplicateNumbers duplicatenumbers = new DuplicateNumbers();
		int[] arr = {1,3,4,4,5,6};
		duplicatenumbers.findDuplicateNo(arr);	
	}
}
