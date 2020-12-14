package priyanka.Exam;

public class ExamProgram5_1 {

	void findTrees(int [] arr) {
		
		int count =0;
		int max = 0;
		for(int index = 0; index<arr.length; index++) {
			if(arr[index] > max) {
				max = arr[index];
				count ++;	
			}
		}
		System.out.println("The Visible Trees are : " +count);	
	}
	public static void main(String [] args) {
		ExamProgram5_1 examProgram5_1 = new ExamProgram5_1();
		int arr1 [] = {3, 5, 5, 7, 9, 13, 11, 12};
		int arr2 [] = {11, 5, 13, 12, 16, 15};
		examProgram5_1.findTrees(arr1);
		examProgram5_1.findTrees(arr2);	
	}	
}
