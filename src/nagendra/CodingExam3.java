package nagendra;

public class CodingExam3 {

	void geDuplicateArray(int[] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = i+1; j < input.length; j++ ) {
				if (input[i] == input[j] ) 
					System.out.println("--> " + input[j]);

				}
			}
		}
	
	public static void main(String[] args) {
		CodingExam3 exam = new CodingExam3();
		int[] arr = { 10, 12, 55, 32, 17, 12, 32 };
		exam.geDuplicateArray(arr);
	}

}
