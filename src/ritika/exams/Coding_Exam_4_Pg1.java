package ritika.exams;

/*Program 1: WAP to Find Common Element Between Two Arrays

input:
int array1 [] = [1, 2, 5, 5, 8, 9, 7, 10]
int array2 [] = [1, 0, 6, 15, 6, 4, 7, 0]

output: 1 7
*/
public class Coding_Exam_4_Pg1 {

	static void findCommonElementsBetweenArrays(int[] array1, int[] array2) {
		String commonElements = "";
		System.out.println("Common elements:");
		for (int index = 0; index < array1.length; index++) {
			for (int ii=0; ii<array2.length; ii++) {
				if (array1[index] == array2[ii]) {
					commonElements +=array1[index] + " ";
					break;
					}	
				}
			}
			System.out.print(commonElements);
		} 
	
	public static void main(String[] args) {
		int array1[] = { 1, 2, 5, 5, 8, 9, 7, 10 };
		int array2[] = { 1, 0, 6, 15, 6, 4, 7, 0 };
		Coding_Exam_4_Pg1.findCommonElementsBetweenArrays(array1, array2);
	}
}
