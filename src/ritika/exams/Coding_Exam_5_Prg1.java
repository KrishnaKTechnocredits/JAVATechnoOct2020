package ritika.exams;
/* Coding Exam - 5:
Program 1: 
print number of visible Trees from given array containing length of trees
int input1 [] = {3, 5, 5, 7, 9, 13, 11, 12};
int input2 [] = {11, 5, 13, 12, 16, 15};
output: 5 and 3
*/
public class Coding_Exam_5_Prg1 {
	
	static void printVisibleTreesCount(int[] input) {
		int maxNum = 0;
		int count = 0;
		for (int i=0;i<input.length;i++) {
			if (input[i]>maxNum) {
				maxNum = input[i];
				count++;
			}
		}
		System.out.println("Number of Visible Trees from given input is: " +count);
	}

	public static void main(String[] args) {
		int input1 [] = {3, 5, 5, 7, 9, 13, 11, 12};
		int input2 [] = {11, 5, 13, 12, 16, 15};
		Coding_Exam_5_Prg1.printVisibleTreesCount(input1);
		Coding_Exam_5_Prg1.printVisibleTreesCount(input2);
	}
}
