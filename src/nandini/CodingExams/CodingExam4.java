package nandini.CodingExams;
//Program 1: WAP to Find Common Element Between Two Arrays

public class CodingExam4 {

	void findDuplicateNumber(int[] input1,int[] input2) {
		int count =0;
		for(int i=0; i<input1.length; i++) {
			for(int j=0; j<input2.length; j++) {
				if(input1[i] == input2[j]) 
					count++;
			}
			if (count > 1)
				System.out.println(input1[i]);
		}
	}
	
	public static void main(String args[]) {
	 CodingExam4 codingexam4 = new CodingExam4();
	 int array1 [] = {1, 2, 5, 5, 8, 9, 7, 10};
	 int array2 [] = {1, 0, 6, 15, 6, 4, 7, 0};
	 codingexam4.findDuplicateNumber(array1, array2);
		
	}
}
