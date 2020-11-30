package apurva.CodingExam;

/*WAP to Find Common Element Between Two Arrays

input: 

int array1 [] = [1, 2, 5, 5, 8, 9, 7, 10]
int array2 [] = [1, 0, 6, 15, 6, 4, 7, 0]

output: 1 7*/
public class Program_1 {
	void commonElement(int[] array1, int[] array2) {
		for (int index = 0; index < array1.length; index++) {
			int num = 0;
			int num1 = array1[index];
			for (int j = 0; j < array2.length; j++) {
				if (array1[index] == array2[j]) {
					int num2 = array2[j];
					if (num1 == num2) {
						num = num1;
						System.out.print("Output: "+num + " ");
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] input1 = { 1, 2, 5, 5, 8, 9, 7, 10 };
		int[] input2 = { 1, 0, 6, 15, 6, 4, 7, 0 };
		new Program_1().commonElement(input1, input2);
	}
}