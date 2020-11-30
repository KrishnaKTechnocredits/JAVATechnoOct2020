package ruby;
/*Program 1: WAP to Find Common Element Between Two Arrays

input: 

int array1 [] = [1, 2, 5, 5, 8, 9, 7, 10]
int array2 [] = [1, 0, 6, 15, 6, 4, 7, 0]

output: 1 7*/

public class Exam4Program1 {
	void findCommonElements(int[] array1, int[] array2) {
		boolean flag = false;
		for (int i = 0; i < array1.length; i++) {
			if (array1.length == array2.length) {
				flag = true;
			if (array1[i] == array2[i]) {
					System.out.print(array1[i]+" ");
				}
			}
		}if (!flag) {
			System.out.println("Array length is not same");
		}
	}

	public static void main(String[] args) {
		Exam4Program1 exam = new Exam4Program1();
		int array1[] = { 1, 2, 5, 5, 8, 9, 7, 10 };
		int array2[] = { 1, 0, 6, 15, 6, 4, 7, 0 };
		exam.findCommonElements(array1, array2);
	}

}
