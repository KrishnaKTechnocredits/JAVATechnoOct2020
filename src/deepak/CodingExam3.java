package deepak;

public class CodingExam3 {
	
	void findDuplicates(int[] arr) {
		
		for(int index=0; index<arr.length; index++) {
			
			for(int j=index+1; j<arr.length;j++) {
			
			if(arr[index]==arr[j]) {
				
				System.out.println(arr[index]);
			}
		}
		
		}
	}

	public static void main(String[] args) {
		
		int[] arr = {10,12,55,32,17,12,32};
	
		CodingExam3 codingExam3 = new CodingExam3();
		codingExam3.findDuplicates(arr);
	
	}

}
