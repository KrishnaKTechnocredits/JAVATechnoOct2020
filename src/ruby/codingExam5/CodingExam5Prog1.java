package ruby.codingExam5;

public class CodingExam5Prog1 {
	
	void numVisible(int[] input) {
		int max=0, count=0;
		for(int index=0; index<input.length;index++) {
			if(input[index]>max) {
				max=input[index];
				count++;
			}
		}System.out.println("Visible items to the person "+count);
	}
	

	public static void main(String[] args) {
		CodingExam5Prog1 exam = new CodingExam5Prog1();
		int[] input= {3,5,5,7,9,13,11,12};
		exam.numVisible(input);	
		int[] input1= {11,15,13,12,16,15};
		exam.numVisible(input1);
	}
}
